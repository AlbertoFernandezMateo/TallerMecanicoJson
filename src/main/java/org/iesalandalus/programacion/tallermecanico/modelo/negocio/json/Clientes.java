package org.iesalandalus.programacion.tallermecanico.modelo.negocio.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Cliente;

public class Clientes {
    private String FICHERO_CLIENTES;

    private static Cliente instancia;
    private static ObjectMapper mapper;

}
