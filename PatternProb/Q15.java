public class Q15 {
    public static void main(String[] args) {
        int n = 5;
    //    upperPat(n);
        otherMethod(n);
    }
    public static void upperPat(int n){
        int spaces = 0;
        for(int i = n ; i>0; i--){
            for(int s = 1; s<=spaces;s++){
                System.out.print("\t");
            }
    
            for(int s = i; s>0; s--){
                System.out.print("*"+"\t");
            }
            spaces+=2;
            System.out.println();
        }
        lowerPat(n,spaces);
    }
    public static void lowerPat(int n,int spaces){
        for(int i = 1 ; i<n; i++){
            for(int s = spaces-4; s>0;s--){
                System.out.print("\t");
            }
            for(int s = 0; s<=i; s++){
                System.out.print("*"+"\t");
            }
            spaces-=2;
            System.out.println();
        }
    }
    public static void otherMethod(int n){
        int space = 0,star = n;
        for(int i = 1; i<=n*2-1; i++){
            int currentSpace = 1;
            while(currentSpace<=space){
                System.out.print("  ");
                currentSpace++;
            }
            int currentStar = 1;
            while(currentStar<=star){
                System.out.print("* ");
                currentStar++;
            }
            if(i<n){
                space+=2;
                star--;
            }else{
                space-=2;
                star++;
            }
            System.out.println();
        }
    }
}
