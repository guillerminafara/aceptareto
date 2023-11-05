import java.util.*;
public class dientes {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int casos=0;
    casos=sc.nextInt();
    for(int j=0;j<casos;j++){
      int superior[]=new int[6];
      int inferior[]=new int[6];
      for (int i = 0; i < inferior.length; i++) {
        inferior[i]=sc.nextInt();
      }
        for (int i = 0; i < superior.length; i++) {
        superior[i]=sc.nextInt();
      }
      int suma = superior[0]+inferior[0];
      boolean verificador=true;
        for(int i=1;i<6;i++){
          if(superior[i]+inferior[i]!=suma){
            verificador=false;
          }
        }  
        if(verificador==true){
          System.out.println("SI");
        }else{
          System.out.println("NO");
        }
       
    }
    sc.close();
  }
}