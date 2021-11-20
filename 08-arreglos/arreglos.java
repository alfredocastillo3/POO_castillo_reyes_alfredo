
import java.util.Scanner;

public class arreglos {

    Scanner entrada = new Scanner(System.in);

    char op;


    public void menu(){
        System.out.println("elija una opcion deseada: ");
        System.out.println("a.");
        System.out.println("b.- ");
        System.out.println("c.- ");
        System.out.println("d.- ");
        System.out.println("Cualquier otra opcion sale del programa");

        op = entrada.next().charAt(0);

        switch(op){
            case 'a':
                //implementar metodos independientes para cada opcion
                arreglos1();
                break;

            case 'b':
                arreglos2();
                break;

            case 'c':
            arreglos3();
            break;

            

            default: 
                System.out.println("Gracias por jugar");
        }
    
    }


        private void arreglos1() {
        /* 
        Elabore un programa que lea por el teclado 
        10 números enteros y los guarde en un Array, posteriormente que calcule y muestre el promedio de los 
        valores positivos y  de los negativos.*/
    
            Scanner sc = new Scanner(System.in);
            int i;
            int pos = 0, neg = 0; //contadores de los números positivos y negativos
            int[] numeros = new int[10]; //array que contendrá los números leídos por teclado
            double sumaPos = 0, sumaNeg = 0; //acumuladores para las sumas de positivos y negativos                   
            
            //lectura de datos y llenar el array
            System.out.println("Lectura de los elementos del array: ");
            for (i = 0; i < 10; i++) {
                System.out.print("numeros[" + i + "]= ");
                numeros[i]=sc.nextInt();
            }
    
            //recorrer el array para sumar por separado los números positivos 
             // y los negativos 
            for (i = 0; i < 10; i++) {
                if (numeros[i] > 0){ //sumar positivos
                    sumaPos += numeros[i];
                    pos++;
                } else if (numeros[i] < 0){ //sumar negativos
                    sumaNeg += numeros[i];
                    neg++;
                }
            }
    
            //Calcular y mostrar las medias
            if (pos != 0) {
                System.out.println("Media de los valores positivos: " + sumaPos / pos);                
            } else {
                System.out.println("No ha introducido numeros positivos");
            }
            if (neg != 0) {
                System.out.println("Media de los valores negativos: " + sumaNeg / neg);
            } else {
                System.out.println("No ha introducido numeros negativos");
            }
        
    }
    
   
    
             private void arreglos2(){
              
                Scanner sc = new Scanner(System.in);
                int i;
                int[] numeros = new int[10];
                double media = 0;

        //lectura de datos y llenar el array
                System.out.println("Lectura de los elementos del array: ");
                for (i = 0; i < 10; i++) {
                System.out.print("numeros[" + i + "]= ");
                numeros[i] = sc.nextInt();
                }
        
        //Recorrer el array y calcular la media
                 for (i = 0; i < 10; i++) {
                 if (i % 2 == 0){ //si la posición actual es par
                 media = media + numeros[i]; //se suma el valor de esa posición
                 }
           
             }
                 System.out.println("Media de los valores que se encuentran en posiciones pares: "+ media/5);              
             }
            


            private void arreglos3(){
                Scanner sc = new Scanner(System.in);
        int numAlum, i;
        double suma = 0, media;

        //Lectura del número de alumnos. Debe ser un valor positivo
        do {
            System.out.print("Número de alumnos de la clase: ");
            numAlum = sc.nextInt();
        } while (numAlum <= 0);

        //se crea un array llamado notas de numAlumn elementos de tipo double
        double[] notas = new double[numAlum]; 
        
        // Entrada de datos. Se lee la nota de cada alummo y se guarda
        // en cada elemento del array
        for (i = 0; i < notas.length; i++) {
            System.out.print("Alumno " + (i + 1) + " Nota final: ");
            notas[i] = sc.nextDouble();
        }

        // Sumar todas las notas
        for (i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }

        // Calcular la media
        media = suma / notas.length;

        // Mostrar la media
        System.out.printf("Nota media del curso: %.2f %n", media);

        // Mostrar los valores superiores a la media
        System.out.println("Listado de notas superiores a la media: ");
        for (i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno numero " + (i + 1)+ " Nota final: " + notas[i]);
            }
        }
    }
}
            
 