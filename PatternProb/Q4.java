public class Q4 {
    public static void main(String[] args) {
        int n = 5;
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
}
