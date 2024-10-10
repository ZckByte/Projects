package adivinanza;
import java.util.Random;
import java.util.Scanner;
public class Adivinanza {


    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        boolean jugarotrave = true;
            while(jugarotrave){
                int num = rd.nextInt(100) + 1;
                int intentos = 0;
                boolean adivinado = false;
            System.out.println("-----------Adivinanza-----------");
            while(!adivinado){
                System.out.println("Numero: ");
                int numero = sc.nextInt();
                sc.nextLine();
                intentos++;
                if(numero < num){
                    System.out.println("es mayor");
                }else if(numero > num){
                    System.out.println("es menor");
                }else if(numero==num){
                    adivinado = true;
                    System.out.println("!Felicidades!");
                    System.out.println("Numero de intentos: " + intentos);
                    System.out.print("Quiere seguir jugando, s == si, otra tecla == no: ");
                    String jugar = sc.nextLine();
                    if(!jugar.equalsIgnoreCase("S")){
                        jugarotrave = false;
                    }
                }
            }
            sc.close();
            System.out.println("!Gracias por jugar!");
        }
    }
    
}
