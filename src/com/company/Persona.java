package com.company;

public class Persona {

    private int edad;
    private Integer DNI;
    private String nombre;

    public Persona(int edad, Integer DNI, String nombre) {
        this.edad = edad;
        this.DNI = DNI;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString(){
        return "nombre: " + this.getNombre() + "edad: " + this.getEdad() + "DNI: " + this.getDNI();
    }

}
