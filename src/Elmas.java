import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz: ");
        int n = input.nextInt();

        for (int i=1; i<=n; i++) { //basamak sayısı algoritması
            for (int k=1; k <= (n-i); k++ ) { //yıldız öncesi bırakılacak boşluk algoritması
                System.out.print(" ");
            }
            for (int j=1; j <= (2*i)-1; j++) { //yıldızları koyma algoritması
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k = n; k >= 0; k--){
            for(int j = 0; j < (n - k); j++){
                System.out.print(" ");
            }
            for( int i = 0 ; i < (k * 2) - 1; i++){
                System.out.print("*");
            }
            System.out.println();
        }

        }

    }

/*
*     *         1   4   1
*    ***        2   3   3
*   *****       3   2   5
*  *******      4   1   7
* *********     5   0   9
*  *******      6   1   7
*   *****       7   2   5
*    ***        8   3   3
*     *         9   4   1
 */