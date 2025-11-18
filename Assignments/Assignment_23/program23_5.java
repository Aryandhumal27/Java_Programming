// 5. Accept N numbers from user and return product of all odd elements.
/*
    Input :     N :             6
                Elements :      15  66  3   70  10  88  

    Output :    45

    Input :     N :             6
                Elements :      44  66  72   70  10  88 

    Output :    0
*/

import java.util.*;

class Logic
{
    int Product(int Arr[], int iLength)
    {
        int iCnt = 0, iMul = 0, iIterate = 0;



        for(iCnt = 0, iMul = 1; iCnt < iLength; iCnt++)
        {
            if((Arr[iCnt] % 2) != 0)
            {
                iMul = iMul * Arr[iCnt];
                iIterate++;
            }
        }
        return (iIterate == 0) ? 0 : iMul;
    }
}

class program23_5
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
        iRet = lobj.Product(p, iSize);

        System.out.println("Product of all odd elements is : " + iRet);

        sobj.close();

        sobj = null;
        lobj = null;

        System.gc();

    }
}