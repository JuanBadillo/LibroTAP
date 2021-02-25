/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02;

/**
 *
 * @author juanm
 */
public abstract class FiguraGeometrica {
    public abstract double area();
    public String toString()
    {
    return "area = "+ area();
}
}
