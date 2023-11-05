import java.util.*;
public class abadias{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num=0,mayor=0;
        num=sc.nextInt();
        while(num!=0){
            int alto[]=new int [num];
            
            for (int i = 0; i < alto.length; i++) {
                alto[i]=sc.nextInt(); 
            }
            int reversa[]=new int[alto.length];
            for(int i=alto.length-1,j=0;i>=0;i--,j++){
                reversa[j]=alto[i];
            }
            int cont=1;
            mayor=reversa[0];
            for (int i = 0; i < reversa.length; i++) {
                if(reversa[i]>mayor){
                    mayor=reversa[i];
                    cont++;
                }
            }
           System.out.println(cont);
            num=sc.nextInt(); 
        }
    }
}