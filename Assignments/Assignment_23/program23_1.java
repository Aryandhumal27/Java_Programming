// 1. Accept N numbers from user and accept one another number as NO, Check whether NO is present or not.
/*
    Input : N :             6
            No :            66
            Elements :      85  66  3   66  93  88  

    Output : TRUE

    Input : N :             6
            No :            12
            Elements :      85  11  3   15  11  111 

    Output : FAlSE
*/

import java.util.*;

class Logic
{
    boolean Check(int Arr[], int iLength, int iNo)
    {
        int iCnt = 0;
        boolean bFlag = false;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                bFlag = true;
                break;
            }
        }

        return bFlag;    
    }
}

class program23_1
{
    public static void main(String A[])
    {
        int iSize = 0, iCnt = 0, iValue = 0;
        boolean  bRet = false;

        Scanner sobj = new Scanner(System.in);
    
        System.out.print("Enter number of elements : ");
        iSize = sobj.nextInt();

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        int p[] = new int[iSize];

        System.out.print("Enter " + iSize + " elements : \n");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println("Enter element " + (iCnt + 1) + " : ");
            p[iCnt] = sobj.nextInt();
        }

        Logic lobj = new Logic();
        bRet = lobj.Check(p, iSize, iValue);

        if(bRet == true)
        {
            System.out.println(iValue + " is present.");
        }
        else
        {
            System.out.println(iValue + " is absent.");
        }

        sobj.close();

        sobj = null;
        lobj = null;

        System.gc();

    }
}