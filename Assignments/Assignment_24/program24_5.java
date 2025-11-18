// 5. Accept N numbers from user and display summation of digits of each number.
/*
    Input :     N :         6
                Elements :  8225    665     3       76      953     858
                
    Output :    17  17  3   13  17  21
*/

import java.util.Scanner;

class Logic
{
    void DigitsSum(int Arr[], int iLength)
    {
        int iCnt = 0, iDigit = 0, iDigitsSum = 0, iCurr = 0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            iDigitsSum = 0;
            iCurr = Arr[iCnt];

            while(Arr[iCnt] > 0)
            {
                iDigit = Arr[iCnt] % 10;
                iDigitsSum = iDigitsSum + iDigit;
                Arr[iCnt] = Arr[iCnt] / 10;
            }

            Arr[iCnt] = iCurr;

            System.out.print(iDigitsSum + " ");
        }
    }
}

class program24_5
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
        lobj.DigitsSum(p, iSize);

        sobj.close();

        sobj = null;

        System.gc();
    }
}