public class Q27 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int s = 0; s<n-i; s++){
                System.out.print("\t");
            }
        
            for(int p = 1; p<=i; p++){
                System.out.print(p+"\t");
            }

            for(int p2 = i-1;p2>0; p2--){
                System.out.print(p2+"\t");
            }
            System.out.println();
        }
    }
}
