// 1. Accept N numbers from user and return difference between summation of even elements and summation of odd elements.
/*
    Input :     N :         6
                Elements :  85  66  3   80  93  88

    Output :    53(234 - 181)
*/

import java.util.Scanner;

class Logic
{
    int Difference(int Arr[], int iLength)
    {
        int iCnt = 0, iEvenSum = 0, iOddSum = 0;
        
        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if((Arr[iCnt] % 2) == 0)
            {
                iEvenSum = iEvenSum + Arr[iCnt];
            }
            else
            {
                iOddSum = iOddSum + Arr[iCnt];
            }
        }

        return (iEvenSum - iOddSum);
    }
}

class program25_1
{
    public static void main(String A[])
    {
        int iCnt = 0, iSize = 0, iRet = 0;

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
        iRet = lobj.Difference(p, iSize);

        System.out.println("Result is : " + iRet);

        sobj.close();

        sobj = null;

        System.gc();
    }
}