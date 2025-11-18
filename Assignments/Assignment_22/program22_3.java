// 3. Accept N numbers from user check whether that numbers contain 11 in it or not.
/*
    Input : N :             6
            Elements :      85  66  11   80  93  88  

    Output : 11 is present

    Input : N :             6
            Elements :      85  66  3   80  93  88  

    Output : 11 is absent
*/

import java.util.*;

class Logic
{
    boolean Check11(int Arr[], int iLength)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Arr[iCnt] == 11)
            {
                return true;
            }
        }
        return false;
    }

}

class program22_3
{
    public static void main(String A[])
    {
        int iSize = 0, iCnt = 0;
        boolean bRet = false;

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
        bRet = lobj.Check11(p, iSize);

        if(bRet == true)
        {
            System.out.println("11 is present");
        }
        else
        {
            System.out.println("11 is absent");
        }

        sobj.close();

        sobj = null;
        lobj = null;

        System.gc();

    }
}