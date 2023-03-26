import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("The given decimal num is even : " + solver(num));
    }

    static boolean solver(int num){
        int c = num & 1;
        if (c == 1){
            return false;
        }
        return true;
    }
}
