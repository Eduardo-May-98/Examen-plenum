package clases;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class SumaMaximaTriangulo{
    
     File archivo = null;
     FileReader fr = null;
     BufferedReader br = null;
     
     //constructor nulo
     SumaMaximaTriangulo(){}
    
    public void leerTriangulo(){
        System.out.println("*************Suma Maxima de un Triangulo*************");
        try{
         archivo = new File("src/Archivos/triangle.txt");
         fr = new FileReader(archivo);
         br =  new BufferedReader(fr);
         
         String linea;
         Integer filas = 0, columnas = 0;
         String [] partes;
         Integer[][] matriz;
         
         if((linea =br.readLine())!=null){
             partes = linea.split(" ");
             filas = Integer.valueOf(partes[0]);
             columnas = Integer.valueOf(partes[1]);
         }
         
         matriz = new Integer[filas][columnas];
         
         for(int i = 0; i<filas; i++){
             linea = br.readLine();
             partes = linea.split(" ");
             
             for(int j = 0; j<columnas; j++){
                matriz[i][j]=Integer.valueOf(partes[j]);
                
             } 
         }
          
     }catch(Exception e){
      
         e.printStackTrace();
         
     }finally{
        
            try{
                
                if(null != fr)
                    fr.close();
                
            }catch(Exception e2){
                e2.printStackTrace();
            }
    }
        
}
    
    //metodo para calcular la suma adyacente del triangulo
    int sumaTriangulo(int matriz[][], int n){
   
        for(int i=n-2;i>=0;i--){
        
            for(int j=0;j<=i;j++){
                
        if(matriz[i+1][j] > matriz[i+1][j+1])
          matriz[i][j] += matriz[i+1][j];
        else
          matriz[i][j] += matriz[i+1][j+1];
      }
    }
    return matriz[0][0];
  }
    
  
    public static void main(String[] args) {
       
       
     
   
        
    }
              
}

