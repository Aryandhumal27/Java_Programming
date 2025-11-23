// 1. Accept number from user and display below pattern

/*
    Input : 5
    Output : A  B   C   D   E
*/

import java.util.Scanner;

class Pattern
{
    void Display(int iNo)
    {
        char ch = '\0';

        for(ch = 65; ch < (65 + iNo); ch++)
        {
            System.out.print(ch+"\t");
        }

        System.out.println();
    }
}
class program26_1
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