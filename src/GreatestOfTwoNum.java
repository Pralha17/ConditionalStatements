import java.util.Scanner;
public class GreatestOfTwoNum {
    public static void main(String[] args) {
        int n1,n2;
        System.out.print("Enter two integer numbers:");
        Scanner in = new Scanner(System.in);
        n1 = in.nextInt();
        n2 = in.nextInt();
        if(n1==n2)
            System.out.println(n1+" is greater than "+n2);
        else if(n1>n2)
            System.out.println(n1+" is greater than "+n2);
        else
            System.out.println(n2+" is greater than "+n1);
    }
}
