// 5. Accept N numbers from user and display all such elements which are dividible by 3 and 5.
/*
    Input :     N :         6
                Elements :  85  66  3   55  93  88

    Output :    66  55  88
*/

import java.util.*;

class Logic
{
    void Display(int Arr[], int iLength)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if((Arr[iCnt] % 11) == 0)
            {
                System.out.print(Arr[iCnt] + " ");
            }
        }
    }
}

class program25_5
{
    public static void main(String A[])
    {
        int iCnt = 0, iSize = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        int p[] = new int[iSize];

        System.out.println("Enter " + iSize + " elements : ");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println("Enter element " + (iCnt + 1) + " : ");
            p[iCnt] = sobj.nextInt();
        }

        Logic lobj = new Logic();
        lobj.Display(p, iSize);

        sobj.close();

        sobj = null;

        System.gc();
    }
}