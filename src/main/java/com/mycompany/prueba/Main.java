/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba;

import java.util.Scanner;

/**
 *
 * @author nesas-13
 */
public class Main {
    
    public static void main(String [] args){
        
     //Ejercicio del factorial
        //obtener la entrada de los tipos primitivos 
        Scanner scan = new Scanner(System.in);        
       
        // pedir numero de entrada
        System.out.println("Ingresa un  numero :");
        int number = scan.nextInt();
        
        //Resultado
        System.out.printf("El factorial de %d es %.0f\n" , number, factorial(number));
        
        //Ejercicio triangulo
        //Ingresamos los valores a evaluar
        double x,y;
      
        Scanner val1 = new Scanner (System.in);
        System.out.println("Ingrese el valor para el lado A del triangulo: ");
        x = val1.nextDouble();
       
        Scanner val2 = new Scanner (System.in);
        System.out.println("Ingrese el valor para el lado B del triangulo: ");
        y = val2.nextDouble();
        
        hypotenuse(x , y);
        
        //Calcular caracteres repetidos
        char lyric ='o';
        int count=characterCounter("tu codigo esta muy malo: (",lyric);
        System.out.println("El caracter '" +lyric+"' se repite "+count+" veces");
        
     }
         
    public static double factorial(int num){
        //declaramos un auxiliar
        double auxiliar = 1;
        //capturamos el factorial
        for(int i = 2; i <= num; i++ ){
            //lo que tiene "auxiliar" por = "i"
            auxiliar *= i;    
    }
    
    return auxiliar;
        
    }
    
    public static void hypotenuse(double n1, double n2){
   
    //declaracion de variables lados y sumas
   double sidea,sideb, multiplier1,multiplier2 ;
   double total;   
   
   //Lados del triangulo
   sidea = n1; 
   sideb = n2; 
      
   multiplier1= sidea * sidea;
   multiplier2= sideb * sideb;   
   total = multiplier1 + multiplier2;
   
   //imprime los lados y el resultado
   System.out.println("La hipotenusa del triangulo con lado A :"+n1+"\nY con lado B : "+n2+"\n Es :"
           +Math.sqrt(total));
    }
        
    /*Scanner ingresar = new Scanner(System.in);
    
    String text;    
    int vocal = 0;
    int total;    
    System.out.println("Ingresa una palabra :");
    text = ingresar.nextLine();   
    
    //cuenta el número de caracteres de una cadena y devuelve el número        
        
    for(int i = 0; i < text.length(); i++ ){
    //filtramos las letras que queremos contar
    if ((text.charAt(i)=='a')||(text.charAt(i)=='A')||
         (text.charAt(i)=='e')||(text.charAt(i)=='E')||
         (text.charAt(i)=='i')||(text.charAt(i)=='I')||
         (text.charAt(i)=='o')||(text.charAt(i)=='O')||
         (text.charAt(i)=='u')||(text.charAt(i)=='U')){
            vocal++;
        }
    }
    total = vocal;

     System.out.println("La palabra :" +text+" tiene : "+ vocal+" vocales");
   } */
    
    //char el caracter que queremos saber cuantas veces se repite
    public static int characterCounter(String text,char character){
        int position = 0;
        int counter =0;
        //nos devuelve la posicion de  un caracter en la caneda ,si el caracter no existe nos devuelve -1 
        position=text.indexOf(character);
        while (position!=-1)
        {
            counter++;
            position=text.indexOf(character,position+1);
        }
        return counter;
    } 
             
}