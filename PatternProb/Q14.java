public class Q14 {
    public static void main(String[] args) {
        int n = 5;
        upperPat(n);
        lowerPat(n);
    }
    public static void upperPat(int n){
        int star = 1;
        for(int i = n; i>0; i--){
            for(int j = i-1; j>0; j--){
                System.out.print("\t");
            }
         
            for(int k = 0; k<star; k++){
                System.out.print("*"+"\t");
            }
            star++;
            System.out.println();
            System.out.println();
        }
    }
    public static void lowerPat(int n){
        int star = n-1;
        for(int i = 0; i<n-1; i++){
            for(int s = 0; s<=i; s++){
                System.out.print("\t");
            }
            for(int st = 0; st<star; st++){
                System.out.print("*"+"\t");
            }
            star--;
            System.out.println();
            System.out.println();
        }
    }
}
