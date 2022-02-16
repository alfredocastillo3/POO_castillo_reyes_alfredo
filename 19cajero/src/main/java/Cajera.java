/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alfredo
 */

public class Cajera {
    private String nombre;   
}

public void setNombre(String nombre){
this.nombre = nombre;
}

public void procesarCompra(Cliente cliente, long timeStamp){
 System.out.println("La cajera:" +this.nombre
         +"Comienza a procesar su compra señor cliete: " 
         +cliente.getNombre()+"/n En los tiempos: "
         +System.currentTimeMillis() - timeStamp)/1000 +"se ";
}
 
private void esperarXsegundos(int segundos ){
  try{
      Thread.sleep(segundos*1000);
}catch (InterruptedException)
}