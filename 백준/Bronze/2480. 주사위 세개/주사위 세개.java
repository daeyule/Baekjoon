import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int Max;

        if(a == b && a == c){
            System.out.println(10000 + (a * 1000));
        }
        if(a==b && b!=c)
            System.out.println(1000 + (a*100));
        if(a==c && a!=b)
            System.out.println(1000 + (a*100));
        if(b==c && b!=a)
            System.out.println(1000 + (b*100));

        if(a!=b && a!=c && b !=c){
            Max = a;
            if(b > Max)
                Max = b;
            if(c > Max)
                Max = c;

            System.out.println(Max * 100);
        }
    }
}
