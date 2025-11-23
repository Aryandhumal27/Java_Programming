// 4. Accept number of rows and number of columns from user and display below pattern.
/*
    Input : iRow = 4       iCol = 4

    Output :    1   2   3   4 
                2   3   4   5
                3   4   5   6
                4   5   6   7
*/
import java.util.*;

class Pattern
{
    void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = i; j <= (iCol+i-1); j++)
            {
                System.out.print(j+"\t");
            }

            System.out.println();
        }
    }
}

class program29_5
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