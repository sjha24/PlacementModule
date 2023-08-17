public class Q18 {
    public static void main(String[] args) {
        int n = 7;
        int space = n/2;
        int star = 1;
        for(int i = 1; i<=n; i++){
            int currSpace = 0;
            while(currSpace<space){
                System.out.print("\t");
                currSpace++;
            }
            int currStar = 1;
            while(currStar<=star){
                System.out.print("*"+"\t");
                currStar++;
            }
            if(i<=n/2){
                space--;
                star+=2;
            }else{
                space++;
                star-=2;
            }
            System.out.println();
        }
    }
}
