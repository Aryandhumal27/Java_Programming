// 2. Accept number from user and display below pattern.

/*
    Input :     5
    output :    5   #   4   #   3   #   2   #   1   # 
                1   2   3   4   5   6   7   8   9   10
*/

import java.util.Scanner;

class Pattern
{
    void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.print(iCnt+"\t"+"#\t");
        }

        System.out.println();
    }
}
class program26_2
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