public class Q10 {
    public static void main(String[] args) {
        int n = 5;
        int star = n*2-1;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                System.out.print("\t");
            }
        
            for(int k = 0; k<star; k++){
                System.out.print("*"+"\t");
            }
            star-=2;
            System.out.println();
            System.out.println();
        }
    }
}
