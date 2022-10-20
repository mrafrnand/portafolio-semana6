package com.mycompany.portafolio_semana6;

import javax.swing.JOptionPane;

public class Banco_El_Cinquito {

    //Atributos
    public String Nombre;
    public int NumCed;
    public int NumCue;
    public int Saldo;
    public int intereses;
    public String Depositos;
    public String Retiros;
    public int clave;
    public int saldo2;
    public int saldo3;

    public void LeerAtributos() {
        Nombre = JOptionPane.showInputDialog("Escriba sus nombre:");
        NumCed = Integer.parseInt(JOptionPane.showInputDialog("Inserte su numero de cedula:"));
        NumCue = Integer.parseInt(JOptionPane.showInputDialog("Inserte su numero de cuenta:"));
        Saldo = Integer.parseInt(JOptionPane.showInputDialog("Inserte su Saldo total:"));
        intereses = Integer.parseInt(JOptionPane.showInputDialog("Inserte su Intereses:"));

    }

    public void MostrarAtributos() {
        JOptionPane.showInternalMessageDialog(null, "Nombre del Cliente:" + Nombre);
        JOptionPane.showInternalMessageDialog(null, "Cedula del Cliente:" + NumCed);
        JOptionPane.showInternalMessageDialog(null, "Numero de cuenta del Cliente:" + NumCue);
        JOptionPane.showInternalMessageDialog(null, "Total del saldo de la cuenta:" + Saldo);
        JOptionPane.showInternalMessageDialog(null, "Porcentaje de intereses:" + intereses);
    }

    public void Retirar() {
        clave = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su contraseña:"));
        if (clave == NumCed) {
            saldo2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el saldo a retirar:"));
            if (saldo2 >= Saldo && saldo2 > 0) {

            }

        } else {
            System.out.println("contraseña incorrecta, introduzca contraseña valida");
            
        }
    }
    public void Depositar() {
        clave = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su contraseña:"));
        if (clave == NumCed) {
            saldo3 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el saldo a depositar:"));
            System.out.println(saldo3+"colones fueron depositados");
            Saldo = Saldo + saldo3;
            System.out.println("Saldo actual:" + Saldo);
            

            } else {
            System.out.println("contraseña incorrecta, introduzca contraseña valida");
            
        }
        
    
}
            

}
