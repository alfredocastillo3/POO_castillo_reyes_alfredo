package cuadrados;

import java.util.Scanner;

public class cuadrados{
    Scanner teclado = new Scanner(System.in);
    int n;
    public void entradato(){
        System.out.println("ingrese el lado del cuadrado");

        n = teclado.nextInt();


    }

    public void proceso(){
        if(n>=2 && n <= 40){
            for(int i=1; i <= n; i++){

                for(int j = 1; j <= n; j++){
                    System.out.println();

                }
                System.out.println("");

            }

        } else{
            System.out.println("ingrese un numero entre 2 hasta 40");


        }
    }


   public static void main(String[] args){

    cuadrados fc = new cuadrados();
    fc.entradato();
    fc.proceso();
   } 
}