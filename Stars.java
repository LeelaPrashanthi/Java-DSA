import java.util.Scanner;
class Stars{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("The Pattern Printing are : ");
       
       //Taking Scanner input
        System.out.print("Enter the no. of lines : ");
        int n = sc.nextInt();

        //Calling the static methods
        System.out.println("Simple star pattern : ");
        stars(n);
        System.out.println("Simple reverse star pattern");
        reverseStars(n);
        System.out.println("Simple number Patterns : ");
        simpleNumbers(n);
        System.out.println("Simple alphabet pattern : ");
        simpleAlpha(n);
        System.out.println("Simple odd number Pattern : ");
        simpleOdd(n);
        System.out.println("Number and alphabet patterns : ");
        numAlpha(n);
        System.out.println("Star plus patterns : ");
        starPlus(n);
        System.out.println("Star cross patterns : ");
        starCross(n);
        System.out.println("Continuos number triangle : ");
        continousNoTriangle(n);
        System.out.println("Zero and One triangle using extra variable : ");
        zeroOneTriangleE(n);
        System.out.println("Zero and one triangle : ");
        zeroOneTriangle(n);

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


    //Printing simple reverse star pattern
    public static void reverseStars(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
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
        
    //Simple odd number Pattern
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

    //Number and alphabet patterns
    public static void numAlpha(int n){
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print(ch);
                    ch++;
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }

    }

    //Star plus pattern
    public static void starPlus(int n){
        int b = ((n/2)+1);
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==b || i==b){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
                System.out.println();
            
        }
    }

    //Star cross patterns
    public static void starCross(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i==j)||(i+j==n+1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Continuos number triangle
    public static void continousNoTriangle(int n){
        int a=1;
        for(int i=1;i<=n;i++){
             for(int j=1;j<=i;j++)
                {
                 System.out.print(a);
                 a+=2;
                }
            System.out.println();
        }
    }

    //Zero and One triangle using extra variable
    public static void zeroOneTriangleE(int n){
        int a=1;
        for(int i=1;i<=n;i++){
            if(i%2==0) a=0;
            else a=1;
            for(int j=1;j<=i;j++){
                System.out.print(a);
                if(a==0) a=1;
                else a=0;
            }
            System.out.println();
            }
        }

        //Zero and one triangle
        public static void zeroOneTriangle(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    if((i+j)%2==0) System.out.print("1");
                    else System.out.print(0);

                }
                System.out.println();
            }
        }


    }

