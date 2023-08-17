public class Q12 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
           for(int s = 1; s<=n-i; s++){
               System.out.print("   ");
            }
            for(int k = 1; k<i*2; k++){
                if(k%2!=0){
                    System.out.print(" * ");
                }else{
                    System.out.print(" ! ");
                }
            }
            System.out.println();
        }
    
    }
}
