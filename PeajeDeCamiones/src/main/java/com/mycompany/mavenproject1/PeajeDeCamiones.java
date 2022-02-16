/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author alfredo
 */
public class PeajeDeCamiones {
     public static void main(String arg[]){
        PeajeDeCamiones P;
        P = new PeajeDeCamiones();
        
        P.Captura();
        P.Calculo();
        P.Imprime();
        
    }
    private int Ejes;
    private int Toneladas;
    private int PagoPorEje=50;
    private int PagoPorTonelada=25;
    private int PagoTotal;
     
    public int getEjes() {
        return Ejes;
    }
    public void setEje(int Ejes) {
        this.Ejes = Ejes;
    }
    public int getToneladas() {
        return Toneladas;
    }
    public void setToneladas(int Toneladas) {
        this.Toneladas = Toneladas;
    }
    public int getPagoPorEje() {
        return PagoPorEje;
    }
    public void setPagoPorEje(int PagoPorEje) {
        this.PagoPorEje = PagoPorEje;
    }
    public int getPagoPorTonelada() {
        return PagoPorTonelada;
    }
    public void setPagoPorTonelada(int PagoPorTonelada) {
        this.PagoPorTonelada = PagoPorTonelada;
    }
    public int getPagoTotal() {
        return PagoTotal;
    }
    public void setPagoTotal(int PagoTotal) {
        this.PagoTotal = PagoTotal;
    }
    public void Captura(){
    Ejes=Integer.parseInt(JOptionPane.showInputDialog("¿CUANTOS EJES TIENE EL CAMION?:"));
    Toneladas=Integer.parseInt(JOptionPane.showInputDialog("¿CUANTAS TONELADAS PESA?:"));
    }
    public void Calculo(){
    PagoTotal=(Ejes*PagoPorEje)+(Toneladas*PagoPorTonelada);    
    }
    public void Imprime(){
       JOptionPane.showMessageDialog(null,"***PEAJE DE CAMIONES***\n\n   EJES DEL CAMION: "+Ejes
               +"\n   PESO POR TONELADAS: "+Toneladas+"\n   PAGO TOTAL: "+PagoTotal); 
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


