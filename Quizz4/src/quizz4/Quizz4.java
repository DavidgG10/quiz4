/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizz4;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Quizz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        estudiante[] estudiantes= new estudiante [10];
        for (int i = 0; i <estudiantes.length; i++) {
          String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:"+ (i + 1) + ":"); 
          String curso = JOptionPane.showInputDialog("Ingrese el nombre del curso de " + nombre + ":");
          String profesor=JOptionPane.showInputDialog("Ingrese el Profesor que imparte el curso de"+ nombre + ":");
          double calificacion=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificacion del curso de"+ nombre + ":"));
          estudiantes[i]=new estudiante(nombre,curso,profesor,calificacion); 
            
        }
 
    } 
}
