// 5. Accept the N numbers from user and accept one another number as No, return frequency of NO from it.
/*
    Input : N :             6
            No :            66
            Elements :      85  66  3   66  93  88  

    Output : 2

    Input : N :             6
            No :            12
            Elements :      85  11  3   15  11  111 

    Output : 0
*/

import java.util.*;

class Logic
{
    int Frequency(int Arr[], int iLength, int iNo)
    {
        int iCnt = 0, iFrequency = 0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                iFrequency++;
            }
        }

        return iFrequency;    
    }

}

class program22_5
{
    public static void main(String A[])
    {
        int iSize = 0, iCnt = 0, iRet = 0, iValue = 0;

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
        iRet = lobj.Frequency(p, iSize, iValue);

        System.out.println("Frequency of " + iValue + " is : " + iRet);

        sobj.close();

        sobj = null;
        lobj = null;

        System.gc();

    }
}