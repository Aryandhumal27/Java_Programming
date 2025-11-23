// 1. Accept number of rows and number of columns from user and display below pattern.
/*
    Input : iRow = 4       iCol = 4

    Output :    A   B   C   D
                A   B   C   D
                A   B   C   D
                A   B   C   D
*/
import java.util.*;

class Pattern
{
    void Display(int iRow, int iCol)
    {
        int i = 0; 
        char j = '\0';

        for(i = 1; i <= iRow; i++)
        {
            for(j = 65; j < (65+iCol); j++)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}

class program28_1
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