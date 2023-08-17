public class Q5 {
    public static void main(String[] args) {
        int n = 5;
        int star = n;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                System.out.print("\t");
            }
         
            for(int k = star; k>0; k--){
                System.out.print("*"+"\t");
            }
            star--;
            System.out.println();
            System.out.println();
        }
    }
}
