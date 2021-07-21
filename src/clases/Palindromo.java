package clases;
import java.util.Scanner;
//Eduardo Rafel May Sanchez
/*
Hacer una función que indique si un número con signo X es palíndromo o no.
Un número es palíndromo si es exactamente igual, aunque se lea al derecho o 
al revés. Por ejemplo, 696 es palíndromo mientras que 3456 no lo es.
*/
public class Palindromo {
    int numero = 0; 
    int aux = 0;
    int resto = 0; 
    int  invertido = 0;
   
    //constructor nulo
    Palindromo(){}
    
    public int numeroInvertirdo(){
        
        System.out.println("*************Números palíndromos*************");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite un número");
        numero = sc.nextInt();
        aux = numero;
            
            while(aux!=0){
                resto = aux%10;
                invertido = invertido * 10 + resto;
                aux /=10;    
            }
            
       return invertido;
    }
    
    public static void main(String[] args) {
        boolean bandera = true;
        
        Palindromo obj = new Palindromo();
       
        if(obj.numeroInvertirdo() == obj.numero){
            System.out.println(bandera);
           
        }else{
            System.out.println(false);
        }
    }
}
