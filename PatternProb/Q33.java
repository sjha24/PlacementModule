public class Q33 {
    public static void main(String[] args) {
        int n = 10;
        for(int i = n; i>=1; i--){
            for(int s = 1; s<i; s++){
                System.out.print("  ");
            }
            for(int p = i; p<n; p++){
                System.out.print(p+" ");
            }
            System.out.print("0 ");

            for(int p2 = n-1;p2>=i; p2--){
                System.out.print(p2+" ");
            }
            System.out.println();
        }
    }
}
