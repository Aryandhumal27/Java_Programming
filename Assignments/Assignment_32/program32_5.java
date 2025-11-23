// 5. Accept number of rows and number of columns from and display below pattern.

/*
    Input : iRow = 5    iCol = 5

    Output :    1   2   3   4   5   
                1   2           5   
                1       3       5   
                1           4   5   
                1   2   3   4   5  
*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if((i == 1) || (i == iRow) || (i == j) || (j == 1) || (j == iCol))   
                {
                    System.out.print(j+"\t");
                }
                else
                {
                    System.out.print(" \t");
                }
            }

            System.out.println();
        }
    }
}

class program32_5
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