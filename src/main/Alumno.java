/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Oscar
 */
public class Alumno implements Comparable<Alumno>{

    int dni;
    String name;
    
    public Alumno(int dni, String name)
    {
        this.dni    = dni;
        this.name   = name;
    }
    
    @Override
    public int compareTo(Alumno o)
    {
        return (this.dni - o.dni); 
    }
    
    @Override
    public String toString()
    {
        return dni + ": " + name;
    }
}
