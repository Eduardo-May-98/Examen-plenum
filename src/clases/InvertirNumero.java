package clases;
import java.util.Scanner;

//Eduardo Rafael May Sanchez
/*
Dado un entero con signo de 32 bits X, regresar ese entero 
con los dígitos al revés. En caso de que el valor resultante 
exceda el rango de valores de un entero con signo de 
32 bits [-231, 231 - 1], regresar cero.
*/
public class InvertirNumero {
    int numero = 0; 
    int resto = 0; 
    long invertido = 0;
   
    //Constructor nulo
    InvertirNumero(){}
    
    public long numeroInvertido(){
        Scanner sc = new Scanner(System.in);
        System.out.println("*************Enteros al derecho y al revés*************");
        try{
            System.out.println("Digite un número");
            numero = sc.nextInt();
            
            while(numero!=0){
                resto = numero%10;
                invertido = invertido * 10 + resto;
                numero /=10;    
            }
            
            return invertido;
            
        }catch(Exception e){
            invertido = 0;
            System.err.println("El numero introducido ha sobrepasado la capacidad de un numero de 32 bits");
            return invertido;
        } 
    }

    public static void main(String[] args) {
       
        InvertirNumero obj =  new InvertirNumero();
        System.out.println(obj.numeroInvertido());  
    }
}
