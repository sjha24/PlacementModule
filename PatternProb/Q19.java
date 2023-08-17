public class Q19 {
    public static void main(String[] args) {
        int n =7;
        upperPart(n);
        lowerPart(n);
    }
    public static void upperPart(int n){
        int space = 0;
        int star = n/2;
        int count = 0;
        for(int i = n/2+1; i>=1; i--){
            for(int p = 1;p<=i; p++){
                System.out.print("*"+"\t");
            }
            if(i!=n){
                for(int j = space; j>=1; j--){
                    System.out.print("\t");
                }
            }
            int currStar = 1;
            while(currStar<=star){
                System.out.print("*"+"\t");
                currStar++;
            }
            count++;
            if(count>=2){
                star--;
            }
            if(space>=1){
                space+=2;
            }else{
                space++;
            }
            System.out.println();
        }
    }
    
    public static void lowerPart(int n){
        int space = n/2;
        int star = 2;
        for(int i = 2; i<=n/2+1; i++){
            for(int p = 2;p<=i+1; p++){
                System.out.print("*"+"\t");
            }
            int currSpace = 1;
            while(currSpace<=space){
                System.out.print("\t");
                currSpace++;
            }
            int currStar = 1;
            while(currStar<=star){
                System.out.print("*"+"\t");
                currStar++;
            }
            if(star<=2){
                star++;
            }else{
                star = n/2;
            }
            space-=2;
            System.out.println();
        }
    }
}
