// 3. Accept number of rows and number of columns from user and display below pattern.

/*
    Input : iRow = 5
            iCol = 5

    Output :    $   *   *   *   *
                #   $   *   *   *
                #   #   $   *   *
                #   #   #   $   *
                #   #   #   #   $
*/
import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        if(iRow != iCol)
        {
            System.out.println("Invalid Output");
            System.out.println("You have to give same number of rows and columns as input.");
            return;
        }

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i > j)
                {
                    System.out.print("#\t");
                }
                else if(i == j)
                {
                    System.out.print("$\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }

            System.out.println();
        }
    }
}

class program31_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);

        sobj.close();
    }
}