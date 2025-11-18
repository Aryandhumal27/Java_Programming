// 4. Accept N numbers from user and accept Range, Display all elements from that range.
/*
    Input : N :             6
            Start :         60
            End :           90
            Elements :      85  66  3   76  93  88  

    Output : 85  66  76  88

    Input : N :             6
            Start :         30
            End :           50
            Elements :      85  66  3   76  93  88 

    Output : 
*/

import java.util.*;

class Logic
{
    void Range(int Arr[], int iLength, int iStart, int iEnd)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if((Arr[iCnt] >= iStart) && (Arr[iCnt] <= iEnd))
            {
                System.out.print(Arr[iCnt] + " ");
            }
        }     
    }
}

class program23_4
{
    public static void main(String A[])
    {
        int iSize = 0, iCnt = 0, iValue1 = 0, iValue2 = 0;

        Scanner sobj = new Scanner(System.in);
    
        System.out.print("Enter number of elements : ");
        iSize = sobj.nextInt();

        System.out.println("Enter the Starting point : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the Ending point : ");
        iValue2 = sobj.nextInt();

        int p[] = new int[iSize];

        System.out.print("Enter " + iSize + " elements : \n");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println("Enter element " + (iCnt + 1) + " : ");
            p[iCnt] = sobj.nextInt();
        }

        Logic lobj = new Logic();
        lobj.Range(p, iSize, iValue1, iValue2);

        sobj.close();

        sobj = null;
        lobj = null;

        System.gc();

    }
}