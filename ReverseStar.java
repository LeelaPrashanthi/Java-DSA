import java.util.Scanner;
class ReverseStar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
       //Taking Scanner input
        System.out.print("Enter the no. of lines : ");
        int n = sc.nextInt();
        
        //Calling the static method
       System.out.println("Simple reverse star pattern");
        reverseStars(n);
        
    }


 //Printing reverse star pattern
    public static void reverseStars(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}    