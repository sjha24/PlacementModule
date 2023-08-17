public class Q28 {
    public static void main(String[] args) {
        int n = 5;
        int k = 1;
        for(int i = 1; i<n*2; i+=2){

            for(int s = 0; s<n-k; s++){
                System.out.print("\t");
            }
        
            for(int p = k; p<=i; p++){
                System.out.print(p+"\t");
            }

            for(int p2 = i-1;p2>=k; p2--){
                System.out.print(p2+"\t");
            }
            k++;
            System.out.println();
        }
    }
}
