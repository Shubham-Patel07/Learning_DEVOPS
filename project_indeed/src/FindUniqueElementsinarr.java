import java.util.Scanner;

public class FindUniqueElementsinarr {


    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n=sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println(findUniqueDeliveryId(array));
    }

    public static int findUniqueDeliveryId(int[] array) {
        int uniqueDeliveryId = 0;

        for(int i = 0; i < array.length; i++) {
            uniqueDeliveryId ^= array[i];
        }

        return uniqueDeliveryId;
    }


}
