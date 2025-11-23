// 3. Accept number of rows and number of columns from user and display below pattern.
/*
    Input : iRow = 4       iCol = 4

    Output :    2   4   6   8   10
                1   3   5   7   9
                2   4   6   8   10
                1   3   5   7   9
*/
import java.util.*;

class Pattern
{
    void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            if((i % 2) != 0)
            {
                for(j = 2; j <= (iCol*2); j=j+2)
                {
                    System.out.print(j+"\t");
                }

                System.out.println();
            }
            else
            {
                for(j = 1; j <= (iCol*2); j=j+2)
                {
                    System.out.print(j+"\t");
                }

                System.out.println();
            }
        }
    }
}

class program29_2
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