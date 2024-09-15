import java.util.Scanner;
class SimpleStar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
       //Taking Scanner input
        System.out.print("Enter the no. of lines : ");
        int n = sc.nextInt();
        
        //Calling the static method
        System.out.println("Simple star pattern : ");
        stars(n);
        
    }


 //Printing simple star pattern
    public static void stars(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}    