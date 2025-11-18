// 4. Accept N numbers from user and return frequency of 11 form it.
/*
    Input : N :             6
            Elements :      85  66  3   15  93  88  

    Output : 0

    Input : N :             6
            Elements :      85  11  3   15  11  111 

    Output : 2
*/

import java.util.*;

class Logic
{
    int Frequency(int Arr[], int iLength)
    {
        int iCnt = 0, iFrequency = 0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Arr[iCnt] == 11)
            {
                iFrequency++;
            }
        }
        return iFrequency;
    }
}

class program22_4
{
    public static void main(String A[])
    {
        int iSize = 0, iCnt = 0, iRet = 0;

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

        System.out.println("Frequency of 11 is : " + iRet);

        sobj.close();

        sobj = null;
        lobj = null;

        System.gc();

    }
}