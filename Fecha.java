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

public class Fecha
{
    private int dia;
    private int mes;
    private int anio;

    Fecha(int dia, int mes, int anio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getDia()
    {
    // retorna el valor de la variable dia
    return dia;
    }
    public void setDia( int dia)
    {
    // asigna el valor del parametro a la variable dia
    this .dia = dia;
    }
    public int getMes()
    {
    return mes;
    }
    public void setMes( int mes)
    {
    this .mes = mes;
    }
    public int getAnio()
    {
    return anio;
    }
    public void setAnio( int anio)
    {
    this .anio = anio;
    }
}

