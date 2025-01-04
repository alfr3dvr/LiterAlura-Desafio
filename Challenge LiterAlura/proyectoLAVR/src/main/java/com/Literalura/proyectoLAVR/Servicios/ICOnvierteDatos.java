package com.Literalura.proyectoLAVR.Servicios;

public interface ICOnvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
