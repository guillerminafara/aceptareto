import java.util.Scanner;
public class MatricesTriangulares {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int  count=0;
        count=sc.nextInt();
        while(count!=0){
            boolean verificador=false;
            int numeros[][]=new int[count][count];
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros.length; j++) {
                    numeros[i][j]=sc.nextInt();  
                   
                    if (numeros[0][j]==0){
                        for(int k=0;k<numeros.length;k++)
                        if(numeros[k][j]==0){
                        verificador=true;
                        }
                   }
                     
                }
            }
            
            System.out.println(verificador);









        }
        
    }
}
