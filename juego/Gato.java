import java.util.Scanner;

class Gato{
 public static void main(String []args){
  JuegoGame game = new JuegoGame();
  Scanner entrada = new Scanner(System.in);
  int coordenada[] = new int[2];
  boolean alternar = true;
  boolean salir = false;
  boolean ia = false;
  boolean coorVer = false;
  
  System.out.println("Bienvenido al juego del gato.\nEste juego fue creado por BlaN");
  do{
   System.out.print("\n\nPuedes jugar contra otra persona o contra la computadora.\nContra quien quieres jugar?\n(1 = contra otra persona | 2 = contra la computadora): ");
   if(entrada.nextInt() == 2){
    ia = true;
   }
   
   System.out.println("\nA JUGAR!");
   
   System.out.println("\nPrimero jugara el jugador X\n");
  
   do{
    System.out.println("\n"+game.mostrarTablero()+"\n");
    do{
     coorVer = false;
     if(alternar){
      System.out.print("[*] Jugador X, Escoge fila: ");
      coordenada[0] = entrada.nextInt();
      System.out.print("[*] Jugador X, Escoge columna: ");
      coordenada[1] = entrada.nextInt();
     }else if(!ia && !alternar){
      System.out.print("[*] Jugador O, Escoge fila: ");
      coordenada[0] = entrada.nextInt();
      System.out.print("[*] Jugador O, Escoge columna: ");
      coordenada[1] = entrada.nextInt();
     }else{
      coordenada = game.jugarIA();
      System.out.println("La computadora escogio:\nFila: "+coordenada[0]+"\nColumna: "+coordenada[1]);
     }
     if(coordenada[0] < 1 || coordenada[0] > 3 || coordenada[1] < 1 || coordenada[1] > 3){
      coorVer = true;
      System.out.println("\nSolo puedes introducir numeros del 1 al 3\n");
     }else if(!coorVer){
      if(game.comprobarLugarLimpio(coordenada)){
       System.out.println("\nEse lugar se encuentra ocupado ya.\n");
       coorVer = true;
      }
     }
    }while(coorVer);
    game.setCoordenada(coordenada, alternar);
    if(game.comprobarWin(alternar) || game.comprobarEmpate()){
     System.out.println("\n"+game.mostrarTablero());
     if(game.comprobarEmpate()){
      System.out.println("\n[->*] NO HAY GANADOR [*<-]");
     }else if(alternar){
      System.out.println("\n[->*] EL GANADOR ES EL JUGADOR X [*<-]");
     }else if(!alternar){
      System.out.println("\n[->*] EL GANADOR ES EL JUGADOR O [*<-]");
     }
     
     System.out.println("\nVolver al menu?");
     entrada.nextLine();
     if(entrada.nextLine().equalsIgnoreCase("si")){
      game = null;
      game = new JuegoGame();
      alternar = true;
      salir = false;
      break;
     }else{
      salir = true;
      break;
     }
    }else{
     if(alternar)
      alternar = false;
     else
      alternar = true;
    }
    
   }while(true);
  }while(!salir);
  
 }
}