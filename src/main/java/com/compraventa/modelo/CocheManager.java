package com.compraventa.modelo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que maneja una lista de coches creando un XML o cargando los objetos desde ese mismo XML
 * @author Ana Vazquez
 * @version 18/10/24
 */
public class CocheManager {
    private static final String FILE_PATH = "concesionario.xml";

    /**
     * Metodo que guarda una lista de coches en un archivo XML
     * @param listaCoches lista de objetos Coche
     */
    public void guardarCoches(ArrayList <Coche> listaCoches) {
        try {
            JAXBContext context = JAXBContext.newInstance(Concesionario.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(new Concesionario(listaCoches), new File(FILE_PATH));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método que carga desde un archivo xml una lista de objetos coche
     * @return ArrayList de coches
     */
    public List<Coche> cargarCoches() {

        File file = new File(FILE_PATH);
        // Verificar si el archivo existe antes de intentar cargarlo
        if (!file.exists()) {
            System.out.println("El archivo no existe. Se retornará una lista vacía.");
            return new ArrayList<>(); // Retornar una lista vacía si el archivo no existe
        }

        try {

            JAXBContext context = JAXBContext.newInstance(Concesionario.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Concesionario wrapper = (Concesionario) unmarshaller.unmarshal(new File(FILE_PATH));
            return wrapper.getListaCoches();
        } catch (JAXBException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
