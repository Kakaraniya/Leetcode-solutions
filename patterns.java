import java.sql.SQLOutput;

public class patterns {
    public static void main(String[] args) {
        pattern9();
    }
    static void pattern1(){
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(){
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(){
        int n = 5;
        for(int i = 0; i<n; i++){
            for(int j = n-i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(){
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    static void pattern5(){
        int n = 5;
        for(int i = 1; i<=2*n; i++){
            int totalColInRow = i>n? 2*n-i:i;
            for(int j = 1; j<=totalColInRow; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(){
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int k = 1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(){
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int k = 1; k<=i; k++){
                System.out.print(" ");
            }
            for(int j = 5; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(){
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int k = 1; k<=n-i; k++){
                System.out.print(" ");
            }

            for(int j = 1; j<=i+i-1; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }

    static void pattern9(){
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int k = 1; k<=i; k++){
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i + 1) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
