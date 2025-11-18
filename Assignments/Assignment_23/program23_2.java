// 2. Accept N numbers from user and accept one another number as NO, return index of first occurence of that NO.
/*
    Input : N :             6
            No :            66
            Elements :      85  66  3   66  93  88  

    Output : 1

    Input : N :             6
            No :            12
            Elements :      85  11  3   15  11  111 

    Output : -1
*/

import java.util.*;

class Logic
{
    int FirstOcc(int Arr[], int iLength, int iNo)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                break;
            }
        }
        if(iCnt == iLength)
        {
            return -1; 
        }

        return iCnt;
             
    }
}

class program23_2
{
    public static void main(String A[])
    {
        int iSize = 0, iCnt = 0, iValue = 0, iRet = 0;

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
        iRet = lobj.FirstOcc(p, iSize, iValue);

        if(iRet == -1)
        {
            System.out.println("There is no such number.");
        }
        else
        {
            System.out.println("First occurance of number is : " + iRet);
        }  


        sobj.close();

        sobj = null;
        lobj = null;

        System.gc();

    }
}