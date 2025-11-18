// 1. Accept N numbers from user and return the largest number
/*
    Input :     N :         6
                Elements :  85  66  3   66  93  88
            
    Output :    93
*/

import java.util.*;

class Logic
{
    int Maximum(int Arr[], int iLength)
    {
        int iCnt = 0, iMax = 0;

        for(iCnt = 0, iMax = Arr[0]; iCnt < iLength; iCnt++)
        {
            if(Arr[iCnt] > iMax)
            {
                iMax = Arr[iCnt];
            }
        }
        return iMax;
    }
}

class program24_1 
{
    public static void main(String A[])
    {
        int iCnt = 0, iSize = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        int p[] = new int[iSize];

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println("Enter element " + (iCnt + 1));
            p[iCnt] = sobj.nextInt();
        }

        Logic lobj = new Logic();
        iRet = lobj.Maximum(p, iSize);

        System.out.println("Maximum element is : " + iRet);

        sobj.close();

        sobj = null;
        lobj = null;

        System.gc();
    }

    
}
