// 3. Accept N numbers from user and return the difference between largest and smallest number.
/*
    Input :     N :     6
                Elements :  85  66  3   66  93  88

    Output :    90(93 - 3)
*/

import java.util.*;

class Logic
{
    int Difference(int Arr[], int iLength)
    {
        int iCnt = 0, iMin = 0, iMax = 0;

        for(iCnt = 0, iMin = Arr[0], iMax = Arr[0]; iCnt < iLength; iCnt++)
        {
            if(Arr[iCnt] > iMax)
            {
                iMax = Arr[iCnt];
            }
            else if(Arr[iCnt] < iMin)
            {
                iMin = Arr[iCnt];
            }
        }

        return (iMax - iMin);
    }
}

class program24_3
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

        System.out.println("Difference between largest and smallest element is : " + iRet);

        sobj.close();

        sobj = null;
        lobj = null;

        System.gc();
    }    
}