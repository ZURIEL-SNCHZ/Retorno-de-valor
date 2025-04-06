/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora1;

/**
 *
 * @author evely
 */
import javax.swing.JOptionPane;
public class Calculadora1 {

    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero1"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero2"));
        
        Operaciones op=new Operaciones();
        int suma=op.sumar(n1,n2);
        int resta=op.restar(n1,n2);
        int multiplicacion=op.multiplicar(n1,n2);
        int division=op.dividir(n1,n2);
        op.mostrarResultados(suma,resta,multiplicacion,division);
        
        op.mostrarResultados(op.sumar(n1,n2),op.restar(n1,n2),op.multiplicar(n1,n2),op.dividir(n1,n2));
    }
}