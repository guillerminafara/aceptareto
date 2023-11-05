import java.util.*;
public class pieza {
    public static void main(String[] args) {
        int caso=0;
        Scanner sc =new Scanner(System.in);
        caso=sc.nextInt();
        while(caso!=0){
            int dato=0;
            
            int casos=0;
            casos=caso-1;
            int numeros[]=new int[caso];
            
            //pedir datos
            
            for (int i = 0; i < numeros.length-1; i++) {
                numeros[i]=sc.nextInt();
            }
            int contador=0;
            Arrays.sort(numeros);
            //comprobar
            boolean pieza=false;
            for (int i = 0; i < caso;i++) {
                if(numeros[i]!=i&&contador<1){
                    System.out.println(i);
                    contador++;
                    pieza=true;
                }
            }
            if(pieza==false){
                System.out.println(caso);
            }
            caso=sc.nextInt();
        }
    }
}
