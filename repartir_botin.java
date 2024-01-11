import java.util.*;
public class AER238 {
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sobres =1;
        int ladrones =1;
        while(ladrones!=0 || sobres!=0 ){
            ArrayList<ArrayList<Integer>> reparto = new ArrayList<>();
            sobres = sc.nextInt();
            ladrones=sc.nextInt();
                
            for (int i = 0; i < ladrones; i++) {
                    ArrayList<Integer>Array = new ArrayList<>();
                    reparto.add(Array);
                }
                
                
                int i = 0;
                int cont=0;
                while (cont <sobres) {
                    int sobre = sc.nextInt();
                    
                    reparto.get(i).add(sobre);
                    
                    i++;
                    if(i == ladrones){
                        i=0;
                    }
                    
                    cont++;
                }
                
                for (int j = 0; j < ladrones; j++) {
                    StringBuilder n= new StringBuilder();
                    int suma = 0;   
                    for (Integer ladron : reparto.get(j)) {
                    suma += ladron;
                    
                    }
                    for (Integer ladron : reparto.get(j)) {
                        n.append(" "+ladron);
                    }
                    System.out.println(suma+":"+n.toString());
                    
                }
            if(ladrones!=0 && sobres!=0){    
            System.out.println("---");
            }
                
        }
             
            
            
    }
}