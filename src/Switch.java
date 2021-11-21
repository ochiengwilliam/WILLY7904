import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("input your value: ");
        int n = s.nextInt();

        switch (n % 2){
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
        }

    }
}
