import java.util.Scanner;

public class DrawDiagona {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hollow Square with Diagonals Side = ");
        int side = sc.nextInt();

        System.out.println("Hollow Square Star with Diagonals Pattern");

        for (int i = 1; i <= side; i++ )
        {
            for (int j = 1 ; j <= side; j++ )
            {
                if (i == 1 || i == side || i == j ||
                        j == 1 || j == side || j == side - i + 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    }
