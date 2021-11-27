/*
1- 20

Suma de los cotos de la biblioteca
Costo mayor
Costo menor
costro promedio
costo total de los productos (libros)

*/


import java.util.*;
import javax.swing.*;
import java.lang.Math;


public class Proveedores{
    private String nombre_cliente; 
   
    private String producto[] = new String[10];
    private int costo[] = new int[10];
    private int producto_existente[] = new int[10];

    private Scanner entrada;

    public class Unlibro extends Libros{
        int CostoLibro;
        
        public Unlibro(){
            
        }
    
        
        public Unlibro(String nombre, String autor, String isbn, String genero,
        int ejemplares, int CostoLibro){
            

            super(nombre, autor, isbn, genero, ejemplares);
            this.CostoLibro = CostoLibro;
    
        }
        public int getCostoLibro(){
            return CostoLibro;
        }
    
        public void setCostoLibro(int CostoLibro){
            this.CostoLibro = CostoLibro;
        }
    
        
        public void mostrarUnlibro(){
            System.out.println("El nombre del Libro es: " + getNombre() +"\n"
                                + "Su autor(a) es: " + getAutor() +"\n"
                                + "Su ISBN: " + getIsbn() +"\n"
                                + "Pertenece al (los) genero(s) de: " + getGenero() +"\n"
                                + "Numero de ejemplares actuales en biblioteca: " + getEjemplares() + "\n"
                                + "Su sexo es: " + getSexo() +"\n"
                                + "Su Costo es de: MXN" + CostoLibro  +"\n");
        }
    }


    public void MenuProvedores(){
        
        String text;
        //try catch para el manejo de errores
        // un ciclo do while para repetir las opciones
        text = JOptionPane.showInputDialog("Seleccione la funcion deseada: "
                                            + "\n 1.- Suma total de costos"
                                            + "\n 2.- Costo Mayor"
                                            + "\n 3.- Costo Menor"
                                            + "\n 4.- Costo Promedio"
                                            + "\n 5.- Costo Total del Producto");
        
                                               
        char Opcion;
        

        switch (Opcion) {
            
            case 1:
                SumaTotal();
                break;
            case 2:
                CostoMayor();
                break;
            case 3:
                CostoMenor();
                break;
            case 4:
                CostoPromedio();
                break;
                
            case 5:
                CostoTotal();
                break;
        
            default:
                System.out.println(" gracias :3");
                break;
         
               }      

    }
public void SumaTotal(){
    
        int i=5;
        int j=0;
 
        Scanner leer = new Scanner(System.in);
        System.out.println("cantidad de libros");
        i=leer.nextInt();
 
        System.out.println("el presio de los libros");
        j=leer.nextInt();
 
        for (i=i; i<=j; i++){
 
            int r=i*j;
            System.out.println(i+"*"+j+"="+r);

        }
    }


 
public void CostoMayor(){
    Scanner sc = new Scanner(System.in);
	int maximo= 5;
	int num;
	int mayor;
	int cont;
 
    System.out.println("libros para llevar5 ");
    maximo = sc.nextInt();
 
    for(cont = 0;cont < maximo;cont++ ){
        System.out.println("Inserte el costo del libro ");
        num = sc.nextInt();
 
    }
 
}

public void CostoMenor(){
    int min, max;

Scanner s = new Scanner(System.in);
System.out.print("libro ");
int val = s.nextInt();
min = max = val;

while (val != 0) {
  System.out.print("precio: ");
  val = s.nextInt();
  if (val < min) {
      min = val;
  }
  if (val > max) {
     max = val;
  }
};
System.out.println("Min: " + min);
}

public void CostoPromedio(){
    double n1, n2, n3, n4, n5, promedio;        
    Scanner obj = new Scanner(System.in);

    System.out.print("Valor 1:\t");
    n1 = obj.nextDouble();      

    System.out.print("Valor 2:\t");
    n2 = obj.nextDouble();

    System.out.print("Valor 3:\t");
    n3 = obj.nextDouble();

    System.out.print("Valor 4:\t");
    n4 = obj.nextDouble();      

    System.out.print("Valor 5:\t");
    n5 = obj.nextDouble();

    promedio = ((n1+n2+n3+n4+n5)/5);

    System.out.println("Promedio:\t"+promedio);
}
 
public void CostoTotal(){
    Scanner sc = new Scanner(System.in);
    double precioUnidad, cantidad, iva, precioSinIva, totalIva;

    System.out.print("Introduzca precio por unidad del producto: ");                                          
    precioUnidad = sc.nextDouble();

    System.out.print("Introduzca número de productos vendidos: ");
    cantidad = sc.nextDouble();

    System.out.print("Introduzca %IVA: ");
    iva = sc.nextDouble();

    precioSinIva = precioUnidad * cantidad;
    totalIva = precioSinIva * iva / 100;

    System.out.println("Precio de venta -> " + (precioSinIva + totalIva));        
}
}                            










    






    


  