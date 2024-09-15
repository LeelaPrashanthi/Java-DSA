import java.util.Scanner;
class AlphabetPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
       //Taking Scanner input
        System.out.print("Enter the no. of lines : ");
        int n = sc.nextInt();
        
        //Calling the static method
          System.out.println("Simple alphabet pattern : ");
        simpleAlpha(n);
      
    }

    
     //Simple alphabet pattern
    public static void simpleAlpha(int n){
        char ch = 'A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
    


