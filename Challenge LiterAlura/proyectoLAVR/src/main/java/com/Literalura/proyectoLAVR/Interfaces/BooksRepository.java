package com.Literalura.proyectoLAVR.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BooksRepository extends JpaRepository<Books, Long> {

    @Query("SELECT DISTINCT new com.desafio2.biblioteca.model.dto.BookDTO(b.title, a.name, l, b.downloadCount) " +
            "FROM Books b JOIN b.author_book a JOIN b.languages l")
    List<BookDTO> findBookDetails();

    @Query(
            value = """
                SELECT distinct bl.language, COUNT(bl.book_id) FROM Book_Languages bl GROUP BY bl.language
            """,
            nativeQuery = true
    )
    List<Object[]> findDistinctLanguages();

    @Query("""
    	    SELECT DISTINCT new com.desafio2.biblioteca.model.dto.BookDTO(b.title, a.name, l, b.downloadCount) 
    	    FROM Books b 
    	    JOIN b.author_book a 
    	    JOIN b.languages l 
    	    WHERE l = :language
    	""")
    List<BookDTO> findBooksByLanguage(String language);



}
