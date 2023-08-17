public class Q25 {
    public static void main(String[] args) {
        int n = 5;
        int pat = 1;
        int k = 1;
        for(int i = 1; i<=n; i++){
            for(int s = 0; s<n-i; s++){
                System.out.print("\t");
            }
            for(int p = 1; p<=pat; p++){
                System.out.print(k+"\t");
                k++;
            }
            pat+=2;
            System.out.println();
        }
    }

}
