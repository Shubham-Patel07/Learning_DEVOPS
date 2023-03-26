public class recurssion {
    public static void main(String[] args) {
        int ans = print(4);
        System.out.println(ans);
    }

    static int print(int n){

        if (n<2){
            return n;
        }
        return print(n-1) + print(n-2);
    }
}
