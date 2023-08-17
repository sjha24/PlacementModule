public class Q32 {
    public static void main(String[] args) {
        int n = 5;
        int pat = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1;j<=pat; j++){
                if(j % 2 != 0){
                    System.out.print(i+"\t");
                }else{
                    System.out.print("*"+"\t");
                }
            }
            pat+=2;
            System.out.println();
        }
        pat -=3;
        for(int i = n-1; i>=1; i--){
            for(int j = 1;j<pat; j++){
                if(j % 2 != 0){
                    System.out.print(i+"\t");
                }else{
                    System.out.print("*"+"\t");
                }
            }
            pat-=2;
            System.out.println();
        }
    }
}
