import java.util.*;
public class sietepicos {
    public static void main(String[] args) {
        int numero=0;
        Scanner sc =new Scanner(System.in);
        numero = sc.nextInt();
        while(numero!=0){
        int altura[]=new int[numero];
            for (int i = 0; i < altura.length; i++) {
                altura[i]=sc.nextInt();
            }
            int picos=0;
            for (int i = 0; i < altura.length; i++) {
                 int val_anterior=altura[(i-1+altura.length)%altura.length];
                 int val_actual=altura[i];
                 int val_despues=altura[(i+1)%altura.length];
                 if(val_actual>val_despues&&val_actual>val_anterior){
                    picos++;
                 }
            }
            System.out.println(picos);
            numero=sc.nextInt();
           
        }
    }
}
