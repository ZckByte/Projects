package calculadoraconsola;
import java.util.Arrays;
import java.util.Scanner;

public class CalculadoraConsola {
    public static void main(String[] args) {
        double num1;
        double num2;
        String[] operacion = {"+", "-", "*", "/"};
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        while(seguir){
            boolean seguir2 = true;
            while(seguir2){
                System.out.println("Que operacion deseas realizar? " + Arrays.toString(operacion));
                String ope = sc.next();
                if(Arrays.asList(operacion).contains(ope)){
                    System.out.println("Ingrese el primer numero:");
                    num1 = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Ingrese el segundo numero:");
                    num2 = sc.nextDouble();
                    sc.nextLine();
                    switch(ope){
                        case "+":
                            System.out.println("Resultado: ");
                            System.out.println(num1 + num2);
                            seguir2 = false;
                            break;
                        case "-":
                            System.out.println("Resultado: ");
                            System.out.println(num1 - num2);
                            seguir2 = false;
                            break;
                        case "*":
                            System.out.println("Resultado: ");
                            System.out.println(num1 * num2);
                            seguir2 = false;
                            break;
                        case "/":
                            if (num2 != 0) {
                                System.out.println("Resultado: " + (num1 / num2));
                            } else {
                                System.out.println("Error: División por cero.");
                            }
                            seguir2=false;
                            break;
                    }
                
                }
            }
        System.out.println("Quieres ejecutar otra operacion, S = si, otra tecla = no");
        String seguirr = sc.nextLine();
        if(seguirr.equals("S") || seguirr.equals("s")){
            seguir2=true;
        }else{
            seguir=false;
        }sc.close();

    }
        

    }
} 
