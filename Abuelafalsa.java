import java.util.*;
public class Abuelafalsa{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int in=0,casos=0;
        String nietofinal="";
        casos=sc.nextInt();
        
        boolean test=false;
        for (int i = 0; i < casos; i++) {
            nietofinal=sc.next();
            int nietos=sc.nextInt();
            String nombres="";
            int ultimo=nietos;
            for (int j = 0; j < nietos; j++) {
                nombres=sc.next();
                
                System.out.println(j);
                if(nombres.equals(nietofinal)&&j<=ultimo){
                    System.out.println("SI");
                }
            }
           
               
            
            
            
            
            
            
            
        }

    }
}
        
        
         
  