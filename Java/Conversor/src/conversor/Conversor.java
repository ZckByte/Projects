package conversor;
import java.util.Arrays;
import java.util.Scanner;


public class Conversor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double parametro1;
        double resultado;
        String seguirDeseo;
        boolean seguir = true;
        boolean otraVez=true;
        while(seguir){
            while(otraVez){
                String[] unidades = {"Distancia", "Temperatura"};
                System.out.println("Que unidad deseas convertir: " + Arrays.toString(unidades));
                String unidad = sc.nextLine();
                if(unidad.equalsIgnoreCase("Distancia")){
                    String[] distancia = {"Metros","Kilometros", "Centimetros"};
                    System.out.println("Que unidad desea convertir: " + Arrays.toString(distancia));
                    String distanciac = sc.nextLine(); //unidad que se va a convertir
                    distanciac = distanciac.toLowerCase();
                    if(distanciac.equalsIgnoreCase("Metros")){
                        System.out.println("A: " + "[Kilometros, Centimetros]");
                    }else if(distanciac.equalsIgnoreCase("Kilometros")){
                        System.out.println("A: " + "[Metros, Centimetros]");
                    }else if(distanciac.equalsIgnoreCase("Centimetros")){
                        System.out.println("A: " + "[Metros, Kilometros]");
                    }
                    String convertDistancia = sc.nextLine(); // para saber cual se va a converir

                    switch(distanciac){
                        case "metros":
                            if(convertDistancia.equalsIgnoreCase("Centimetros")){
                                System.out.print("Metros: ");
                                parametro1=sc.nextDouble();
                                sc.nextLine();
                                resultado= parametro1*100;
                                System.out.println("La conversion de Metros a Centimetros de " + parametro1 + "M " + "es igual a: " + resultado + "cm");
                            }else if(convertDistancia.equalsIgnoreCase("Kilometros")){
                                System.out.print("Metros: ");
                                parametro1=sc.nextDouble();
                                sc.nextLine();
                                resultado= parametro1*0.001;
                                System.out.println("La conversion de Metros a Kilometros de " + parametro1 + "M " + "es igual a: " + resultado + "Km");
                            }
                            otraVez=false;
                            break;

                        case "centimetros":
                            if(convertDistancia.equalsIgnoreCase("Metros")){
                                System.out.print("Centimetros: ");
                                parametro1=sc.nextDouble();
                                sc.nextLine();
                                resultado= parametro1*0.01;
                                System.out.println("La conversion de Centimetros a Metros de " + parametro1 + "Cm " + "es igual a: " + resultado + "m");
                            }else if(convertDistancia.equalsIgnoreCase("Kilometros")){
                                System.out.print("Centimetros: ");
                                parametro1=sc.nextDouble();
                                sc.nextLine();
                                resultado= parametro1*0.00001;
                                System.out.println("La conversion de Centimetros a Kilometros de " + parametro1 + "Cm" + "es igual a: " + resultado + "Km");
                            }
                            otraVez=false;
                            break;
                        case "kilometros":
                            if(convertDistancia.equalsIgnoreCase("Metros")){
                                System.out.print("Kilometros: ");
                                parametro1=sc.nextDouble();
                                sc.nextLine();
                                resultado= parametro1*1000;
                                System.out.println("La conversion de Kilometros a Metros de " + parametro1 + "Km " + "es igual a: " + resultado + "m");
                            }else if(convertDistancia.equalsIgnoreCase("Centimetros")){
                                System.out.print("Kilometros: ");
                                parametro1=sc.nextDouble();
                                sc.nextLine();
                                resultado= parametro1*100000;
                                System.out.println("La conversion de Kilometros a Centimetros de " + parametro1 + "Km " + "es igual a: " + resultado + "Cm");
                            }
                            otraVez=false;
                            break;
                    }   
                }else if(unidad.equalsIgnoreCase("Temperatura")){
                    String[] temperaturaArray = {"Celsius", "Fahrenheit", "Kelvin"};
                    System.out.println("Que deseas convertir: " + Arrays.toString(temperaturaArray));
                    String convertirTemperatura = sc.nextLine();
                    convertirTemperatura = convertirTemperatura.toLowerCase();
                    if(convertirTemperatura.equalsIgnoreCase("Celsius")){
                        System.out.println("A: " + "[Fahrenheit, Kelvin]");
                    }else if(convertirTemperatura.equalsIgnoreCase("Fahrenheit")){
                        System.out.println("A: " + "[Celsius, Kelvin]");
                    }else if(convertirTemperatura.equalsIgnoreCase("Kelvin")){
                        System.out.println("A: " + "[Fahrenheit, Celsius]");
                    }
                    String aTemperatura = sc.nextLine();

                    switch(convertirTemperatura){
                        case "celsius":
                            if(aTemperatura.equalsIgnoreCase("Fahrenheit")){
                                System.out.print("Celsius a convertir: ");
                                parametro1 = sc.nextDouble();
                                sc.nextLine();
                                resultado=(1.8*parametro1) + 32;
                                System.out.println("El resultado es de: " + resultado + " Grados Fahrenheit");
                            }else if(aTemperatura.equalsIgnoreCase("Fahrenheit")){
                                System.out.print("Celsius a convertir: ");
                                parametro1 = sc.nextDouble();
                                sc.nextLine();
                                resultado=parametro1+273.15;
                                System.out.println("El resultado es de: " + resultado + " Grados Kelvin");
                            }
                            otraVez=false;
                            break;
                        case "fahrenheit":
                            if(aTemperatura.equalsIgnoreCase("Celsius")){
                                System.out.print("Fahrenheit a convertir: ");
                                parametro1 = sc.nextDouble();
                                sc.nextLine();
                                resultado=(parametro1 - 32)/1.8;
                                System.out.println("El resultado es de: " + resultado + " Grados Celsius");
                            }else if(aTemperatura.equalsIgnoreCase("Kelvin")){
                                System.out.print("Fahrenheit a convertir: ");
                                parametro1 = sc.nextDouble();
                                sc.nextLine();
                                resultado=(parametro1 - 32)/1.8 + 273.15;
                                System.out.println("El resultado es de: " + resultado + " Grados Kelvin");
                            }
                            otraVez=false;
                            break;
                        case "kelvin":
                            if(aTemperatura.equalsIgnoreCase("Celsius")){
                                System.out.print("Kelvin a convertir: ");
                                parametro1 = sc.nextDouble();
                                sc.nextLine();
                                resultado= parametro1 - 273.15;
                                System.out.println("El resultado es de: " + resultado + " Grados Celsius");
                            }else if(aTemperatura.equalsIgnoreCase("Fahrenheit")){
                                System.out.print("Kelvin a convertir: ");
                                parametro1 = sc.nextDouble();
                                sc.nextLine();
                                resultado=((parametro1 - 273.15) * 1.8) + 32;
                                System.out.println("El resultado es de: " + resultado + " Grados Fahrenheit");
                            }
                            otraVez=false;
                            break;
                        }
                    }
            }
            System.out.print("Desea ejecutar otra conversion? S= si, N = No: ");
                seguirDeseo = sc.nextLine();
                if(seguirDeseo.equalsIgnoreCase("S")){
                    otraVez=true;
                }else if(!seguirDeseo.equalsIgnoreCase("S")){
                    seguir=false;
                    otraVez=false;
                }
        }    
    }     
}

        
    