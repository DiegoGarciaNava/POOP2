/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop2;

/**
 *
 * @author Diegi
 */
public class POOP2 {    
    /**
     * @param args the command line arguments
     */
    
    //psvm tab  
    public static void main(String[] args) {
        //sout tab
        System.out.println("HOLA MUNDO");
        int a=10, b=5;
        //If tab
        if (a<b) {
            System.out.println("a es menor que b");
        }else if (a==b){System.out.println("a y b son iguales");}
        else{System.out.println("b es menor que a");
        System.out.println(b+" es menor que "+a);}
        /*if (menor(a,b)) {
            
        }*/
        char vocal = 'a';
        
        switch (vocal) {
            case 'a' -> System.out.println("Es una 'a'");
            case 'e' -> System.out.println("Es una 'e'");
            case 'i' -> System.out.println("Es una 'i'");
            case 'o' -> System.out.println("Es una 'o'");
            case 'u' -> System.out.println("Es una 'u'");
            default -> System.out.println("No es una vocal");
        }
        int n=0;
        while (n<10) {
            System.out.println("Contando hacia arriba: "+n);
            n++;
        }
        System.out.println("El valor de n fuera del while :"+ n);
        while (n>0) {
            System.out.println("Contando hacia abajo "+n);
            n--;
        }
        System.out.println("Valor final de n fuera del while: "+n);
        //dowhile tab
        do {            
            System.out.println("Contando hacia abajo "+n);
            n--;
        } while (n>0);
        System.out.println("Valor final de n fuera del do while: "+n);
        //for tab fori tab
        for (int i = 0; i < 10; i++) {
            System.out.println("Contando hacia arriba: "+i);
        }
        for (int i = 10; i > 0; i--) {
           System.out.println("Contando hacia abajo "+i); 
        }
        int miArreglo[]={1,2,3,4,5};
        int numElementos= miArreglo.length;
        System.out.println("MiArreglo tiene "+numElementos+" elementos");
        int[] miArreglo2 = new int [10];
        for (int i = 0; i < 10; i++) {
            System.out.println("elemento: "+miArreglo2[i]);
        }
        for (int i = 0; i < 10; i++) {
           miArreglo2[i]=i*10; 
        } 
        int[] miArreglo3 = new int [10];
        for (int i = 0; i < miArreglo3.length; i++) {
            miArreglo3[i]= (i+150/2);
            
        }
        for (int i : miArreglo3) {
            System.out.println("Valor del arreglo "+ i);
            
        
          
        }
       
    }
    
}


/*Primer reporte: Como funcionan las abreviaturas
  Segundo reporte: Bloque if
  Tercer reporte: Bloque switch
  Cuarto reporte: While - Do while 
  Quinto reporte: For
  Sexto reporte: For con arreglos
*/

