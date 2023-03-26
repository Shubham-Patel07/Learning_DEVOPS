import java.util.Scanner;

public class Binary_Rec {
    public static void main(String[] args) {
        int n,target;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n=sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the target : ");
        target = sc.nextInt();
        System.out.println(search(array, target, 0, array.length - 1));
    }

    static int search(int array[], int target, int s, int e){
        if (s>e){
            return -1;
        }

        int mid = s + (e-s)/2;

        if (array[mid] == target){
            return mid;
        }
        if (array[mid] > target){
            return search(array, target, s, mid - 1);
        }
        return search(array, target, mid + 1, e);
    }
}
