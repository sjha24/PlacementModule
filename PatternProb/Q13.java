public class Q13 {
    public static void main(String[] args) {
        int n = 5;
        int s = n;
        for(int i = 0; i<n*2-1; i++){
            if(i<=4){
               for(int j = 0; j<=i; j++){
                  System.out.print("*"+"\t");
               }
            }else{
                 for(int j = s-1; j>0; j--){
                   System.out.print("*"+"\t");
                }
                s--;
            }
            System.out.println();
            System.out.println();
        }
    }
}
