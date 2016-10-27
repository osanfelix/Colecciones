/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Oscar
 * @param <Integer>
 * @param <T2>
 */
public class Almacen<T2> {
    // Almacena objetos (del mismo tipo) asociandolos con una 'id' numerica

    int id[];
    private T2[] elementos;
    
    public Almacen(T2[] elementos)
    {
        this.elementos = elementos;
        
        id = new int[elementos.length];
        for(int i = 0; i < id.length; i++)
            id[i] = i + 1;
    }

    Almacen(Almacen<String> libros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean changeId(T2 elemento, int newId)
    {
        for(int i = 0; i < elementos.length; i++)
        {
            if(elementos[i].equals(elemento))
            {
                id[i] = newId;
                return true;
            }       
        }
        return false;
    }
    
    public T2 getElement(int elemId)
    {
        for(int i = 0; i < id.length; i++)
        {
            if(elemId == id[i])
                return elementos[i];
        }
        return null;
    }
    
    public int getId(T2 elem)
    {
        for(int i = 0; i < id.length; i++)
        {
            if(elem.equals(elementos[i]))
                return id[i];
        }
        return -1;
    }
    
    
    @Override
    public String toString()
    {
        String out = "";
        for(int i = 0; i < id.length; i++)
            out += id[i] + "\t => " + elementos[i].toString() + "\n";
        return out;
    }     
}
