package com.archivos;

public class Main {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();

        // Crear una nueva persona
        Persona persona1 = new Persona(1, "Juan", 25);
        personaDAO.createPersona(persona1);

        // Leer todas las personas
        System.out.println("Personas:");
        for (Persona persona : personaDAO.readPersonas()) {
            System.out.println(persona);
        }

        // Actualizar una persona
        Persona persona2 = new Persona(1, "Juan", 26);
        personaDAO.updatePersona(persona2);

        // Leer todas las personas despues de la actualización
        System.out.println("\nPersonas después de la actualización:");
        for (Persona persona : personaDAO.readPersonas()) {
            System.out.println(persona);
        }

        // Eliminar una persona
        personaDAO.deletePersona(1);

        // Leer todas las personas después de la eliminción
        System.out.println("\nPersonas después de la eliminación:");
        for (Persona persona : personaDAO.readPersonas()) {
            System.out.println(persona);
        }
    }
}