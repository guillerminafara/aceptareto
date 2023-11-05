import java.util.Scanner;
public class contandoArena{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in=0;
        String uno="1";
        in=sc.nextInt();
        while(in!=0){
            for (int i = 0; i < in; i++) {
                System.out.print(uno);
            }
            System.out.println();
            in=sc.nextInt();
        }
    }
}