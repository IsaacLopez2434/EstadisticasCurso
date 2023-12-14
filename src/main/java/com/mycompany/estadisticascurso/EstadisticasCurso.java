/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estadisticascurso;

import java.util.Scanner;

/**
 *
 * @author labctr
 */
public class EstadisticasCurso {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

        // Obtener datos del curso y cantidad de estudiantes desde el usuario
        System.out.println("Ingrese el nombre del curso:");
        String nombreCurso = scanner.nextLine();

        System.out.println("Ingrese el número de estudiantes:");
        int cantidadEstudiantes = scanner.nextInt();

        // Crear objeto Curso
        Curso curso = new Curso(nombreCurso, cantidadEstudiantes);

        // Crear estudiantes y agregarlos al curso
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("\nIngrese el semestre del estudiante " + (i + 1) + ":");
            int semestre = scanner.nextInt();

            System.out.println("Ingrese la nota del estudiante " + (i + 1) + ":");
            float nota = scanner.nextFloat();

            // Verificar si la nota es válida (entre 0 y 20)
            if (nota < 0 || nota > 20) {
                System.out.println("Nota no válida");
                scanner.close();
                return;
            }

            curso.crearEstudiante(nota, semestre);
        }

        // Calcular estadísticas del curso
        curso.calcularEstadisticas();

        // Mostrar estadísticas del curso
        curso.mostrarDatos();

        scanner.close();
    }
}

