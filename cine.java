import java.util.Scanner;
public class cine {
    public static void main(String[] args) {
        int casos=0 ;
        Scanner sc=new Scanner (System.in);
        casos=sc.nextInt();
        for (int i = 0; i < casos; i++) {
                int fila=0;
                fila=sc.nextInt();
                int contimpar=0;
                int contpar=0;
                int numeros=0;
                boolean verificado=true;
            for (int j = 0; j < fila; j++) {
                numeros=sc.nextInt();
                if (numeros%2!=0&&contpar==0){
                    verificado=false;
                }
                if(numeros%2==0){
                    
                    contpar++;
                    if(contimpar>0){
                        verificado=false;
                    }
                }
                if(numeros%2!=0){
                    contimpar++;
                }
                
            }
            if(contpar==0){
                verificado=true;
            }
            if(verificado==true){
            System.out.println("SI "+contpar);
            }else{
                System.out.println("NO");
            }
                



        }
    }
}