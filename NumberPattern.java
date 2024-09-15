import java.util.Scanner;
class NumberPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
       //Taking Scanner input
        System.out.print("Enter the no. of lines : ");
        int n = sc.nextInt();
        
        //Calling the static method
       System.out.println("Simple number Patterns : ");
        simpleNumbers(n); 
    }

    
    //Simple number Pattern
    public static void simpleNumbers(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){

                System.out.print(j);
            }
            System.out.println();
        }
    }
}    