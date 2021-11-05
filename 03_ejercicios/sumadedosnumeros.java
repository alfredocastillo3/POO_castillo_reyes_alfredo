import java.util.Scanner;

import java.util.Scanner;

class sumadedosnumeros{

    public static void  main(String[] arg){
    
        Scanner entrada = new Scanner(System.in);

        int num1, num2;
        int resultado;

        System.out.println("introduce el primer numero a sumar: ");

        num1 = entrada.nextInt();

        System.out.println("introduce el segundo numero a sumar: ");

        num2 = entrada.nextInt();

        resultado = num1 + num2;


        System.out.println("el resultado de la suma es: " + resultado);

    }
} 