// 2.Accept N numbers from user and return difference between frequency of even number and odd numbers.
/*
    Input : N :             7
            Elements :      85  66  3   80  93  88  90

    Output : 1(4 - 3)
*/

import java.util.*;

class Logic
{
    int Frequency(int Arr[], int iLength)
    {
        int iCnt = 0, iEvenFrequency = 0, iOddFrequency = 0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if((Arr[iCnt] % 2) == 0)
            {
                iEvenFrequency++;
            }
            else
            {
                iOddFrequency++;
            }
        }

        return (iEvenFrequency - iOddFrequency);
    }
}

class program22_2
{
    public static void main(String A[])
    {
        int iSize = 0, iRet = 0, iCnt = 0;

        Scanner sobj = new Scanner(System.in);
    
        System.out.print("Enter number of elements : ");
        iSize = sobj.nextInt();

        int p[] = new int[iSize];

        System.out.print("Enter " + iSize + " elements : \n");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println("Enter element " + (iCnt + 1) + " : ");
            p[iCnt] = sobj.nextInt();
        }

        Logic lobj = new Logic();
        iRet = lobj.Frequency(p, iSize);

        System.out.println("Result is : " + iRet);

        sobj.close();

        sobj = null;
        lobj = null;

        System.gc();

    }
}