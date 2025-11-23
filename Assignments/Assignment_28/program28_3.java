// 3. Accept number of rows and number of columns from user and display below pattern.
/*
    Input : iRow = 3      iCol = 5

    Output :    A   A   A   A   A
                B   B   B   B   B
                C   C   C   C   C
*/
import java.util.*;

class Pattern
{
    void Display(int iRow, int iCol)
    {
        char i = '\0'; 
        int j = 0;

        for(i = 65; i < (65+iRow); i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(i+"\t");
            }

            System.out.println();
        }
    }
}

class program28_3
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