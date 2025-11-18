// 1. Accept N numbers from user and return frequency of even numbers.
/*
    Input : N :             6
            Elements :      85  66  3   80  93  88

    Output : 3
*/

import java.util.*;

class Logic
{
    int CountEven(int Arr[], int iLength)
    {
        int iCnt = 0, iFrequency = 0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if((Arr[iCnt] % 2) == 0)
            {
                iFrequency++;
            }
        }

        return iFrequency;
    }
}

class program22_1
{
    public static void main(String A[])
    {
        int iSize = 0, iRet = 0, iCnt = 0;

        Scanner sobj = new Scanner(System.in);
    
        System.out.print("Enter number of elements : ");
        iSize = sobj.nextInt();

        int p[] = new int[iSize];

        System.out.println("Enter " + iSize + " elements : \n");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println("Enter element " + (iCnt + 1) + " : ");
            p[iCnt] = sobj.nextInt();
        }

        Logic lobj = new Logic();
        iRet = lobj.CountEven(p, iSize);

        System.out.println("Result is : " + iRet);

        sobj.close();

        sobj = null;
        lobj = null;

        System.gc();

    }
}