// 2. Accept N numbers from user and return the smallest number.
/*
    Input :     N :         6
                Elements :  85  66  3   77  93  88
                
    Output :    3   
*/

import java.util.Scanner;

class Logic
{
    int Minimum(int Arr[], int iLength)
    {
        int iCnt = 0, iMin = 0;

        for(iCnt = 0, iMin = Arr[0]; iCnt < iLength; iCnt++)
        {
            if(Arr[iCnt] < iMin)
            {
                iMin = Arr[iCnt];
            }
        }
        
        return iMin;
    }
}


class program24_2
{
    public static void main(String A[])
    {
        int iCnt = 0, iSize = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elemennts : ");
        iSize = sobj.nextInt();

        int p[] = new int[iSize];

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
           System.out.println("Enter element " + (iCnt + 1) + " : ");
           p[iCnt] = sobj.nextInt(); 
        }

        Logic lobj = new Logic();
        iRet = lobj.Minimum(p, iSize);

        System.out.println("Smallest element is : " + iRet);

        sobj.close();
        
        sobj = null;

        System.gc();

    }
}