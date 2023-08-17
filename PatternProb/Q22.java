public class Q22 {
    public static void main(String[] args) {
        int n = 5;
        int space = 0;
        int star = n-1;
        int count = 0;
        for(int i = n; i>=1; i--){
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
}
