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
public class TestEstatico {
    private int a = 0;
  public void unMetodo()
  {
  System. out .println("este es unMetodo()");
  }
  public static void main(String[] args)
  {
  TestEstatico t = new TestEstatico();
  System. out .println("a vale" + ta); // accedo a la variable a
  t.unMetodo(); // accedo al metodo unMetodo
  }
}
