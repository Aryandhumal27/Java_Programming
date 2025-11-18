// 4. Accept N numbers from user and display all such numbers which contains 3 digits in it.
/*
    Input :     N :         6
                Elements :  8225    665     3     76    953     858
                
    Output :    665     953     858
*/

import java.util.Scanner;

class Logic
{
    void Digits(int Arr[], int iLength)
    {
        int iCnt = 0, iDigitFreq = 0, iCurr = 0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            iDigitFreq = 0;
            iCurr = Arr[iCnt];

            while(Arr[iCnt] > 0)
            {
                iDigitFreq++;
                Arr[iCnt] = Arr[iCnt] / 10;
            }

            Arr[iCnt] = iCurr;

            if(iDigitFreq == 3)
            {
                System.out.print(Arr[iCnt] + " ");
            }
        }
    }
}

class program24_4
{
    public static void main(String A[])
    {
        int iCnt = 0, iSize = 0;

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
        lobj.Digits(p, iSize);

        sobj.close();

        sobj = null;

        System.gc();
    }
}