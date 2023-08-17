public class Q7 {
    public static void main(String[] args) {
        int n = 5;
        for(int r = 0; r<n; r++){
            for(int c = 0; c<n; c++){
                if(r == 0 || r == n-1 || c == 0 || c==n-1){
                   System.out.print("*"+"\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
