import java.util.*;
public class MatrizIdentidad{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  count=0;
        count=sc.nextInt();
        
        while(count!=0){
            boolean verificador=true;
            int numeros[][]=new int [count][count];
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros.length; j++) {
                    numeros[i][j]=sc.nextInt();
                    if (i==j){
                        //tener el mismo número de filas que de columnas y debe ser uno.
                        if(numeros[i][j]!=1){
                            verificador=false;
                        }
                    }else{
                        //asegurar que el array tenga cero
                        if(numeros[i][j]!=0){
                            verificador=false;
                        }
                    }
                }
            }
            //verificar respuesta
            if(verificador==false){
                    System.out.println("NO");
                }else{
                    System.out.println("SI");
            }    
            count=sc.nextInt();
        }
    }
}