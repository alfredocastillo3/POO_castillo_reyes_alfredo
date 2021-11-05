import java.util.Scanner;

public class hipotenusa{

    public static void main (String[] args){

        double cateto1, cateto2;

        Scanner sc=new Scanner(System.in);

        System.out.println("introduce el valor del cateto 1: ");

        cateto1=sc.nextDouble();


        System.out.println("introduce el valor del cateto 2: ");

        cateto2=sc.nextDouble();

        System.out.println("la hipotenusa es: " + Mat.sqrt(Mat.pow(cateto1, 2)+Mat.pow(cateto2, 2)));


        
         

    }
}