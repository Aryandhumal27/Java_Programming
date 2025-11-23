// 4. Accept number from user and display below pattern.

/*
    Input : 4
    Output :    #   1   *   #   2   *   #   3   *   #   4   *
                1   2   3   4   5   6   7   8   9   10  11  12
*/

import java.util.Scanner;

class Pattern
{
    void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("#\t"+iCnt+"\t"+"*\t");
        }

        System.out.println();
    }
}
class program26_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the number of elements : ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);

        sobj.close();
    }
}