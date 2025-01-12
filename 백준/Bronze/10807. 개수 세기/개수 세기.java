import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int number = scanner.nextInt();
        int arr[] = new int[number];

        for(int i = 0; i < number; i++) {
            arr[i] = scanner.nextInt();
        }
        int b = scanner.nextInt();

        for(int j = 0; j < arr.length; j++) {
            if(b == arr[j]){
                count++;
            }
        }
        System.out.println(count);
    }
}