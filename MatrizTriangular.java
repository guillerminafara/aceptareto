import java.util.Scanner;
public class MatrizTriangular{
    public static void main(String args[]){
        int count=0;
        Scanner sc = new Scanner(System.in);
        count=sc.nextInt();
        while(count!=0){
            int suma=0;
            int suma1=0;
            int numeros[][]=new int [count][count];
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros.length; j++) {
                    numeros[i][j]=sc.nextInt();
                }
            }
            //triangular1
            int sumador=1;
            for (int i =0; i < numeros.length; i++) { 
                for (int  j=sumador ; j< numeros.length; j++) {
                    suma+=numeros[i][j];
                }
                sumador++;
            }
            //triangular2
            int restador=numeros.length-1;
            for (int i = numeros.length-1; i>0; i--) {
               for (int j = 0; j < restador; j++) {
                suma1+=numeros[i][j];
               }
              restador--;
            }
            if((suma==0)||(suma1==0)){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
            count=sc.nextInt();
        }
    }
}