/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estadisticascurso;

/**
 *
 * @author labctr
 */
public class Curso {
    //atributos
    private String nombre;
    private int cantidadEstudiantes;
    private Estudiante[] estudiantes;
    private double notaPromedio;
    private int pasados;
    private int reprobados;
    private int modaSemestre;
    private int contadorEstudiantes;
    private double sumaNotas;
    
    //metodos
    //creacion de objeto basado en objeto estudiantes llamado curso
    public Curso(String nombre, int cantidadEstudiantes) {
        this.nombre = nombre;
        this.cantidadEstudiantes = cantidadEstudiantes;
        this.estudiantes = new Estudiante[cantidadEstudiantes];
        this.notaPromedio = 0;
        this.pasados = 0;
        this.reprobados = 0;
        this.modaSemestre = 0;
        this.contadorEstudiantes = 0;
        this.sumaNotas = 0;
    }
    
    //crea objeto tipo estudiante
    public void crearEstudiante(float nota, int semestre) {
        Estudiante nuevoEstudiante = new Estudiante();
        nuevoEstudiante.setNota(nota);
        nuevoEstudiante.setSemestre(semestre);

        estudiantes[contadorEstudiantes] = nuevoEstudiante;
        contadorEstudiantes++;
    }
    
    //calculo de datos estadisticos
    public void calcularEstadisticas() {
        for (int i = 0; i < contadorEstudiantes; i++) {
            sumaNotas += estudiantes[i].getNota();
            if (estudiantes[i].getNota() >= 14) {
                pasados++;
            } else {
                reprobados++;
            }
        }
        if (contadorEstudiantes > 0) {
            notaPromedio = sumaNotas / contadorEstudiantes;
            calcularModa();
        }
    }
    //contador de la moda
    private void calcularModa() {
        int[] semestres = new int[contadorEstudiantes];
        for (int i = 0; i < contadorEstudiantes; i++) {
            semestres[i] = estudiantes[i].getSemestre();
        }

        int maxCount = 0;
        int moda = 0;

        for (int i = 0; i < semestres.length; ++i) {
            int count = 0;

            for (int j = 0; j < semestres.length; ++j) {
                if (semestres[j] == semestres[i]) {
                    ++count;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                moda = semestres[i];
            }
        }

        modaSemestre = moda;
    }
    
    //metodo impresor
    public void mostrarDatos() {
        System.out.println("\nEstadísticas del curso :" + nombre);
        System.out.println("Nota promedio del curso: " + notaPromedio);
        System.out.println("Estudiantes aprobados: " + pasados);
        System.out.println("Estudiantes reprobados: " + reprobados);
        System.out.println("Semestre más común: " + modaSemestre);
    }
}
