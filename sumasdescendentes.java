import java.util.Scanner;
public class sumasdescendentes {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String numero="";
        numero=sc.nextLine();
        while (!numero.equals("0")){
            int suma=0;
            int cont=0;
            int longitud=numero.length();
            String cortado=numero;
            while(cont!=longitud){
            int numeros=0;
            numeros=Integer.parseInt(cortado);
            suma+=numeros;
            cont++;
            cortado=numero.substring(cont,longitud);
            }
            System.out.println(suma);
            numero=sc.nextLine();
        
        }
    }
}
