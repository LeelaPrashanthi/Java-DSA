import java.util.Scanner;
public class AdvanceStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The advance star patterns are : ");
        //Taking input
        System.out.println("Enter the number of lines to print");
        int n = sc.nextInt();


        //Calling methods
        System.out.println("Simple space and star pattern : ");
        starPattern(n);
        System.out.println("Rhombus star pattern with space : ");
        rhombusStar(n);
        System.out.println("Alphabet patterns : ");
        aplhaPattern(n);
        System.out.println("Star pyramid pattern : ");
        starPyramid(n);
        

        System.out.println("Complex number pyramid pattern : ");
        complexnoPyramid(n);
        System.out.println("Complex alphabet pyramid : ");
        alphabetPyramid(n);
        System.out.println("Diamond star pattern : ");
        starDiamond(n);
        System.out.println("Star table : ");
        starTable(n);
        System.out.println("Number table : ");
        numberTable(n);


        System.out.println("NUMBER GRID PROBLEM : ");
        numGrid(n);
        System.out.println("Hollow Rectangle pattern : ");
        hollowRectangle(n, 5);
        System.out.println("Inverted Half pyramid : ");
        invertedHalfPyramid(n);
        System.out.println("Butterfly pattern : ");
        butterflyPattern(n);
        System.out.println("Hollow Rhombus : ");
        hollowRhombus(n);

        
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



    //Space+Rhombus star pattern
    public static void rhombusStar(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Alphabet patterns
    public static void aplhaPattern(int n){
        for(int i=1;i<=n;i++){
            char ch = 'A';
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }


    //Star pyramid pattern
    public static void starPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    

        //Complex number pyramid
        public static void complexnoPyramid(int n){
            for(int i=1;i<=n;i++){
                int c=i-1;
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print(k);
                }
                for(int l=1;l<=i-1;l++){
                    System.out.print(c);
                    c--;
                }
                System.out.println();
            }
        }


    //Complex alphabet pyramid
    public static void alphabetPyramid(int n){
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(ch);
                ch++;
            }
            ch-=2;
            for(int l=1;l<=i-1;l++){
                System.out.print(ch);
                --ch;
                
            }
            System.out.println();
        }
    }
        
    //Diamond star pattern
    public static void starDiamond(int n) {
    
        for (int i = 1; i <= n; i++) {  // Loop through each line
            // Print spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2*i)-1; k++) {
                System.out.print("*");
            }
           System.out.println();
        }
        for(int i=n;i>=1;i--){
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2*i)-1; k++) {
                System.out.print("*");
            }
           System.out.println();
        }
    }

    //Star table
    public static void starTable(int n){
        int nst=n ;
        int nsp=1;
    for(int i=1;i<=2*n+1;i++){
        System.out.print("*");
    }
    System.out.println();

    for(int j=1;j<=n;j++){
        for(int k=1;k<=nst;k++){
            System.out.print("*");
        }
        for(int k=1;k<=nsp;k++){
            System.out.print(" ");
        }
        for(int k=1;k<=nst;k++){
            System.out.print("*");
        }
        System.out.println();
        nst--;
        nsp+=2;
    }

}

 //Number table
 public static void numberTable(int n){
    int nst=n ;
    int nsp=1;
for(int i=1;i<=2*n+1;i++){
    System.out.print(i);
}
System.out.println();

for(int j=1;j<=n;j++){
    int ch=1;
    for(int k=1;k<=nst;k++){
        System.out.print(ch);
        ch++;
    }
    for(int l=1;l<=nsp;l++){
        System.out.print(" ");
        ch++;
    }
    for(int k=1;k<=nst;k++){
        System.out.print(ch);
        ch++;
    }
    System.out.println();
    nst--;
    nsp+=2;
}

}

//NUMBER GRID PROBLEM
    public static void numGrid(int n){
        int min=0;
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                int a=i;
                if(a>n) a=2*n-i;
                int b=j;
                if(b>n) b=2*n-j;
                if(a<b) min=a;
                else min=b;
                System.out.print(n+1-min);

            }
            System.out.println();
        }
    }


    //Hollow Rectangle pattern
    public static void hollowRectangle(int r,int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || i==r || j==1 || j== c){
                    System.out.print('*');
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    //Inverted Half pyramid
    public static void invertedHalfPyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    //Butterfly pattern 
    public static void butterflyPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }

            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }

            System.out.println();
        
        }
    }

    //Hollow Rhombus
    public static void hollowRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print('*');
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


}

