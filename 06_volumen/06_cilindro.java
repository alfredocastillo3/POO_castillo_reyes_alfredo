import  java.util.Scanner ;
import  java.lang.Math ; // libreria para funciones matematicas
público  de clase  areavolumencilindro {
    public  static  void  main ( String [] args ) {
        Escáner d =  nuevo  escáner ( System . In);
        radio doble , h, a, v;
        char o = ' s ' ;
        while (o == ' S '  || o ==  ' s ' ) {
                Sistema . fuera . println ( " Ingrese el radio del cilindro: " );
                radio = d . nextDouble ();
                Sistema . fuera . println ( " Ingrese la altura del cilindro: " );
                h = d . nextDouble ();
                a = ( 2 * Math . PI ) * (radio * h) + ( 2 * Math . PI ) * Math . pow (radio, 2 );
                v = Matemáticas . PI * Matemáticas . pow (radio, 2 ) * h;
                Sistema . fuera . println ( " El area del cilindro es: " + a + " cm ^ 2 " );
                Sistema . fuera . println ( " El volumen del cilindro es: " + v + " cm ^ 3 " );
                prueba {
                    Hilo . dormir ( 5000 );
                } 
                catch ( InterruptedException e) {
                }
                Sistema . fuera . println ( "¿ Desea realizar otro calculo? S / N " );
                o = d . siguiente () . charAt ( 0 );
        }
    }
}