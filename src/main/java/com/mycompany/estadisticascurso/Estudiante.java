/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estadisticascurso;

/**
 *
 * @author labctr
 */
public class Estudiante {
    //atributos
    private float nota;
    private int semestre;
    
    //metodos
    //creacion de objetos
    public Estudiante() {
        this.nota = 0;
        this.semestre = 0;
    }
    
    //establecimiento de valores
    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}

