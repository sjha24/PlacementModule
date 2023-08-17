public class Q21 {
    public static void main(String[] args) {
        int n = 5;
        int space = n*2-3;
        int star = 1;
        for(int i = 1; i<=n; i++){
            for(int p = 1;p<=i; p++){
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
            if(star<=3){
                star++;
            }else{
                star = n-1;
            }
            space-=2;
            System.out.println();
        }
    }
}
