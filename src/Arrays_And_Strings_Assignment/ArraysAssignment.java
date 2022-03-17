package ArraysAndStrings;
import java.util.Scanner;
import java.util.*;

public class ArraysAssignment {
    public static int  NumberOfSubarrays(int []arr)
    {
        if(arr.length==0) return 0;
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            int CurSum=0;
            for(int x=i+1;x<n;x++)
            {
                CurSum+=arr[x];
                if(CurSum<0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int sizeOfArray;
        Scanner sc=new Scanner(System.in);
        sizeOfArray= sc.nextInt();

        int []arr=new int[sizeOfArray];

        for(int i=0;i<sizeOfArray;i++)
        {
            arr[i]=sc.nextInt();
        }

//        for(int i=0;i<sizeOfArray;i++)
//        {
//            System.out.println(arr[i]);
//        }
            int ans=NumberOfSubarrays(arr);
        System.out.println(ans);

    }
}
