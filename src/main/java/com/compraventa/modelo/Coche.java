package com.compraventa.modelo;

import javax.xml.bind.annotation.*;

/**
 * Clase que representa un coche, con sus propiedades: marca, modelo, matricula, anio y fecha de venta
 * @author Ana Vazquez
 * @version 18/10/24
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "marca", "modelo", "matricula", "anio", "fechaVenta" })
public class Coche {

    // Atributos
    @XmlElement(name = "marca")
    private String marca;
    @XmlElement(name = "modelo")
    private String modelo;
    @XmlElement(name = "matricula")
    private String matricula;
    @XmlElement(name = "anio")
    private int anio;
    @XmlElement(name = "fechaVenta")
    private String fechaVenta;

    // Constructores
    public Coche() {
    }

    public Coche(String marca, String modelo, String matricula, int año, String fechaVenta) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.anio = año;
        this.fechaVenta = fechaVenta;
    }

    // Getters and setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\nModelo: " + modelo +
                "\nMatricula: " + matricula + "\nAño: " + anio +
                "\n Fecha de venta: " + fechaVenta +"\n";
    }
}
