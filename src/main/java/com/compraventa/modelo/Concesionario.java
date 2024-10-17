package com.compraventa.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un cocesionario, con una lista de coches
 * @author Ana Vazquez
 * @version 18/10/24
 */
@XmlRootElement(name = "concesionario")
@XmlAccessorType(XmlAccessType.FIELD)
public class Concesionario {

    // Atributos
    @XmlElement(name = "coche")
    private List<Coche> cocheLista = new ArrayList<>();

    // Constructores
    public Concesionario() {
    }

    public Concesionario(List<Coche> listaCoches) {
        this.cocheLista = listaCoches;
    }

    // Getters y setters
    public List<Coche> getListaCoches() {
        return cocheLista;
    }
    public void setListaCoches(List<Coche> listaCoches) {
        this.cocheLista = listaCoches;
    }
}
