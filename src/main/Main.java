package main;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner S = new Scanner(System.in);

        System.out.println("Indice de Masa Corporal");

        System.out.println("Ingrese peso en Kg:");
        int peso = S.nextInt();

        System.out.println("Ingrese Estatura (m):");
        double estatura = S.nextFloat();

        double imc;
        imc = (peso /( estatura * estatura));
        System.out.println(imc);

        System.out.println("");
        System.out.println("");

        if(imc < 18.5){

            System.out.println("Peso inferior al normal");
        }else if(imc >= 18.5 && imc <= 24.9){

            System.out.println("Peso Normal");
        }if(imc >= 25.0 && imc <= 29.9){

            System.out.println("Peso Superior al normal");
        }if(imc > 30.0){

            System.out.println(" Obesidad");
        }


    }

}
