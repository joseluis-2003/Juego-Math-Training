package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int record = 0;
        int puntuacion =0;

        System.out.println("Quieres jugar? (si o no)");
        String jugar = sc.next();
        switch (jugar) {
            case "si":
                System.out.println("Vamoooos a jugar!");
                cont++;

                while (cont > 0) {
                    System.out.println("Debes operar estos numeros");
                    int num1 = (int) (Math.random() * 100 + 1);
                    System.out.print(num1 + " ");

                    int operador = (int) (Math.random() * 2 + 1);
                    switch (operador) {
                        case 1:
                            System.out.print("+");
                            break;
                        case 2:
                            System.out.print("-");
                            break;
                        case 3:
                            System.out.print("*");
                            break;
                        case 4:
                            System.out.print("/");
                            break;
                    }
                    int num2 = (int) (Math.random() * 100 + 1);
                    System.out.println(" " + num2 + " =");
                    int intento = sc.nextInt();
                    switch (operador) {
                        case 1:
                            int sumando = num1 + num2;
                            if (sumando == intento) {
                                System.out.println("Correcto!");
                                cont++;
                                puntuacion++;
                            } else {
                                System.out.println("Incorrecto");
                                System.out.println("El resultado es: " + (num1 + num2));
                                System.out.println("El record de aciertos es: " + record);
                                record=0;
                                System.out.println("Quiere continuar? (1 para si, 2 para no)");
                                int continuar = sc.nextInt();
                                if (continuar==1){
                                    cont+=2;
                                }else if(continuar==2){
                                    cont--;
                                    System.out.println("Fin del juego");
                                }else{
                                    System.out.println("Error");
                                }

                                cont--;
                            }
                            break;
                        case 2:
                            System.out.println("El resultado es: " + (num1 - num2));
                            int restando = num1 - num2;
                            if (restando == intento) {
                                System.out.println("Correcto!");
                                cont++;
                                puntuacion++;
                            } else {
                                System.out.println("Incorrecto");
                                System.out.println("El resultado es: " + (num1 + num2));
                                System.out.println("El record de aciertos es: " + record);
                                record=0;
                                System.out.println("Quiere continuar? (1 para si, 2 para no)");
                                int continuar = sc.nextInt();
                                if (continuar==1){
                                    cont+=2;
                                }else if(continuar==2){
                                    cont--;
                                    System.out.println("Fin del juego");
                                }else{
                                    System.out.println("Error");
                                }

                                cont--;
                            }
                            break;
                        case 3:
                            System.out.println("El resultado es: " + (num1 * num2));
                            int multiplicando = num1 - num2;
                            if (multiplicando == intento) {
                                System.out.println("Correcto!");
                                cont++;
                                puntuacion++;
                            } else {
                                System.out.println("Incorrecto");
                                System.out.println("El resultado es: " + (num1 + num2));
                                System.out.println("El record de aciertos es: " + record);
                                if (puntuacion>record){
                                    puntuacion=record;
                                } else {
                                }
                                System.out.println("Quiere continuar? (1 para si, 2 para no)");
                                int continuar = sc.nextInt();
                                if (continuar==1){
                                    cont+=2;
                                }else if(continuar==2){
                                    cont--;
                                    System.out.println("Fin del juego");
                                }else{
                                    System.out.println("Error");
                                }

                                cont--;
                            }
                            break;
                        case 4:
                            System.out.println("El resultado es: " + (num1 / num2));
                            break;

                        default:
                            System.out.println("Operacion no disponible");
                            break;
                    }
                    cont--;

                }long startTime, endTime;
                startTime = System.nanoTime();





                break;
            case "no":
                System.out.println("Fin del juego");
                System.out.println("Tu record de aciertos es: " + record);
                break;

            default:
                System.out.println("Error. Inténtalo otra vez");
                break;
        }
    }
}
