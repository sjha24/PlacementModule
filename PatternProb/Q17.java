public class Q17 {
    public static void main(String[] args) {
        int n = 7;
       upperPart(n);
       lowerPart(n);
    }
    public static void upperPart(int n){
        int space = 1;
         for(int i = n/2; i>=1; i--){
            for(int star = 1; star<=i; star++){
                System.out.print("*"+"\t");
            }
            for(int s = 1; s<=space;s++){
                System.out.print("\t");
            }
            for(int star = i; star>=1; star--){
                System.out.print("*"+"\t");
            }
            space+=2;
            System.out.println();
        }
    }
    
    public static void lowerPart(int n){
        int space = n;
        for(int i = 0; i<=n/2; i++){
            for(int star = 0; star<i; star++){
                System.out.print("*"+"\t");
            }
            for(int s = space; s>=1;s--){
                System.out.print("\t");
            }
            for(int star = 0; star<i; star++){
                System.out.print("*"+"\t");
            }
            space-=2;
            System.out.println();
        }
    }
}