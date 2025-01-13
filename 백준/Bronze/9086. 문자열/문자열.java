
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String word[] = new String[n];
        
        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            word[i] = str.substring(0,1) + str.substring(str.length()-1, str.length());
        }
        scanner.close();
        for (int i = 0; i < n; i++) {
            System.out.println(word[i]);
        }
    }
}