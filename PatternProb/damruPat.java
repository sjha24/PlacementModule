import java.util.Scanner;

public class damruPat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        uperPat(n);
    }
    public static void uperPat(int n){
        int star = n;
        for(int i = 0; i<n/2+1; i++){
            for(int s = 0; s<i; s++){
                System.out.print("\t");
            }
            for(int k = 0; k<star; k++){
                System.out.print("*"+"\t");
            }
            star-=2;
            System.out.println();
        }
        lowerPart(n);
    }
    public static void lowerPart(int n){
        int star = 3;
        for(int i = n/2; i>0; i--){
            for(int s = i-1; s>0; s--){
                System.out.print("\t");
            }
            for(int k = 0; k<star; k++){
                System.out.print("*"+"\t");
            }
            star+=2;
            System.out.println();
        }
    }
}
