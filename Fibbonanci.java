import java.util.Scanner;

/**
 *
 * @author Asisten
 */
public class Fibbonanci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("input : ");
        n=s.nextInt();
        int a=0;
        int b=1;
        int c=0;
        //System.out.print(n+" deret Fibonacci: " );
        for (int i=1;i<=n;i++){
            //System.out.print(a+" ");
            a=a+b;
            b=a-b;
            c=c+a;
        }
        System.out.print("jumlah Fibonacci: "+c);
    }
        
}
