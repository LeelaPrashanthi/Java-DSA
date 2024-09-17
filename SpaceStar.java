import java.util.Scanner;
public class SpaceStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The advance star patterns are : ");
        //Taking input
        System.out.println("Enter the number of lines to print");
        int n = sc.nextInt();


        //Calling methods
        System.out.println("Simple space and star pattern : ");
        starPattern(n);
    }
     //Simple star pattern along with the spaces
        public static void starPattern(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        
    }
}