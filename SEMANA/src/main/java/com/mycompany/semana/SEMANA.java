package com.mycompany.semana;

//LIBRERIAS
import java.util.Scanner; //libreria para leer las variables para poder ingresar los numeros

//CUERPO PROGRAMAR
public class SEMANA {

    public static void main(String[]args) 
   { 
        
        //Variable Sacanner
        Scanner scan= new Scanner(System.in);
        
        //DECLARACION DE VARIABLES
        int dia=0;
        int n1=0;
        int n2=0;
        int resul=0;
 
        //ASIGNACION DE VARIABLES 
        System.out.println("INGRESE NUMERO DEL DIA DE LA SEMANA");
        dia=scan.nextInt();
        
        //CONDICION "SI" 
        if(dia==1)
        {
            System.out.println("Lunes: Realizar la Suma");
            System.out.println("INGRESE NUMERO 1");
            n1=scan.nextInt();
            System.out.println("INGRESE NUMERO 2");
            n2=scan.nextInt();
            
            resul=n1+n2;
            System.out.println("SUMA ES: " + resul);       
                    
        }
        else if (dia==2)
        {
            System.out.println("Martes: Realizar la Resta");
            System.out.println("INGRESE NUMERO 1");
            n1=scan.nextInt();
            System.out.println("INGRESE NUMERO 2");
            n2=scan.nextInt();
            
            resul=n1-n2;
            System.out.println("RESTA ES: " + resul); 
        }
        else if (dia==3)
        {
            System.out.println("Miercoles: Realizar la Multiplicacion");
            System.out.println("INGRESE NUMERO 1");
            n1=scan.nextInt();
            System.out.println("INGRESE NUMERO 2");
            n2=scan.nextInt();
            
            resul=n1*n2;
            System.out.println("MULTIPLICACION ES: " + resul);
        }
        else if (dia==4)
        {
            System.out.println("Jueves: Realizar la Division");
            System.out.println("INGRESE NUMERO 1");
            n1=scan.nextInt();
            System.out.println("INGRESE NUMERO 2");
            n2=scan.nextInt();
            
            resul=n1*n2;
            System.out.println("DIVISION ES: " + resul);
        }
        else if (dia==5)
        {
            System.out.println("Jueves: Realizar la Suma y Resta");
            System.out.println("INGRESE NUMERO 1");
            n1=scan.nextInt();
            System.out.println("INGRESE NUMERO 2");
            n2=scan.nextInt();
            
            resul=n1+n2;
            System.out.println("SUMA ES: " + resul);
            resul=n1-n2;
            System.out.println("RESTA ES: " + resul);       
        }
        else if (dia==6)
        {
            System.out.println("Sabado: Realizar la Multiplicacion y Division");
            System.out.println("INGRESE NUMERO 1");
            n1=scan.nextInt();
            System.out.println("INGRESE NUMERO 2");
            n2=scan.nextInt();
            
            resul=n1*n2;
            System.out.println("MULTIPLICACION ES: " + resul);
            resul=n1/n2;
            System.out.println("DIVISION ES: " + resul);
        }
        else if (dia==7 )
        {
            System.out.println("Domingo: SUMA, RESTA, MULTIPLICACION Y DIVISION");
            System.out.println("INGRESE NUMERO 1");
            n1=scan.nextInt();
            System.out.println("INGRESE NUMERO 2");
            n2=scan.nextInt();
            
            resul=n1+n2;
            System.out.println("SUMA ES: " + resul);
            resul=n1-n2;
            System.out.println("RESTA ES: " + resul);
            resul=n1*n2;
            System.out.println("MULTIPLICACION ES: " + resul);
            resul=n1/n2;
            System.out.println("DIVISION ES: " + resul);     
        }
        else 
        {
            System.out.println("No existe datos del dia");
        }
    }
}