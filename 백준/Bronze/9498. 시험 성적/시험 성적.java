
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        if(90<=number&&number<=100)
            System.out.println("A");
        else if(80<=number&&number<90)
            System.out.println("B");
        else if(70<=number&&number<80)
            System.out.println("C");
        else if(60<=number&&number<70)
            System.out.println("D");
        else
            System.out.println("F");
        
        sc.close();
        
    }
}
