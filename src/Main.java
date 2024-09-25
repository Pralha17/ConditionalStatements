import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter integer number:");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if(n%2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}