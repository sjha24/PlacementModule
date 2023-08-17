public class Q6 {
    public static void main(String[] args) {
        int n = 5;
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
    }
}
