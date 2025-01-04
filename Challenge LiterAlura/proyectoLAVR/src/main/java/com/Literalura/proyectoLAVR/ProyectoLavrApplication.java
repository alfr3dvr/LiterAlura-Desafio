package com.Literalura.proyectoLAVR;

import com.Literalura.proyectoLAVR.MenuUsuario.MenuUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoLavrApplication implements CommandLineRunner {

	@Autowired
	private MenuUsuario menuUsuario;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoLavrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		menuUsuario.menuPrincipal();

}
