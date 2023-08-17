public class Q3 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = n; i>0; i--){
            System.out.println(" ");
            for(int j = 0; j<i; j++){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}
