package com.company;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<Persona>();

      /*personas.add(new Persona(17,40017323,"francisco"));
      personas.add(new Persona(22,19017323,"marcos"));
      personas.add(new Persona(25,5017323,"javier"));
      personas.add(new Persona(23,30017323,"jose"));
      personas.add(new Persona(15,50017323,"carlos"));*/
        personas = Arrays.asList(new Persona(17,40017323,"francisco"),
                new Persona(22,19017323,"marcos"),new Persona(25,5017323,"javier"),
                new Persona(23,30017323,"jose"),new Persona(15,50017323,"carlos"));


        //personas mayores de 21
        System.out.println(String.format("Mayores a 21: %s", personas.stream()
                .filter(Persona -> Persona.getEdad() > 21)
                .collect(Collectors.toList())));

        //personas menores de 18

        System.out.println(String.format("Menores a 18: %s", personas.stream()
                .filter(Persona -> Persona.getEdad() < 18)
                .collect(Collectors.toList())));

        //personas mayores de 21 + dni > 20000

        System.out.println(String.format("Mayores a 21 con DNI mayor a 20000000: %s", personas.stream()
                .filter(Persona -> Persona.getEdad() > 21)
                .filter(Persona -> Persona.getDNI() > 20000000)
                .collect(Collectors.toList())));
    }

}



