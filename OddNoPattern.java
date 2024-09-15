import java.util.Scanner;
class Stars{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
       //Taking Scanner input
        System.out.print("Enter the no. of lines : ");
        int n = sc.nextInt();
        
        //Calling the static method
                System.out.println("Simple odd number Pattern : ");
				        simpleOdd(n);
      
    }

  //Odd number Pattern    
  public static void simpleOdd(int n){
        for(int i=1;i<=n;i++){
        int a=1;
        for(int j=1;j<=i;j++){
            
            System.out.print(a);
            a=a+2;
        }
        System.out.println();
        }
    }
}

        
