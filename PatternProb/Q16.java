public class Q16 {
    public static void main(String[] args) {
        int n = 5;
        upperPat(n);
        lowerPat(n);
    }
    public static void upperPat(int n){
        for(int i = n; i>0; i--){
            for(int sp = 1; sp<i; sp++){
                System.out.print("\t");
            }
            for(int st = 0; st<i; st++){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }

    }
    public static void lowerPat(int n){
         for(int i = 1; i<n; i++){
            for(int sp = 0; sp<i; sp++){
                System.out.print("\t");
            }
            for(int st = 0; st<=i; st++){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}
