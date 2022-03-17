package ArraysAndStrings;
import java.util.*;

public class StringAssignment {

    public static boolean shuffled(String s1,String s2,String s3)
    {

        //interleaved string length must be equal to the sum of both strings
        if(s1.length()+s2.length()!=s3.length()) return false;
        char[] sChar1=s1.toCharArray(),sChar2=s2.toCharArray(),sChar3=s3.toCharArray();

        boolean [][]t=new boolean[sChar1.length+1][sChar2.length+1];

        for(int i=0;i<t.length;i++)
        {
            for(int j=0;j<t[i].length;j++)
            {
                int idx=i+j-1;
                if(idx==-1)
                {
                    t[i][j]=true;
                }else if(j==0){
                    if(sChar3[idx]==sChar1[i-1]) t[i][j]=t[i-1][j];
                }else if(j==0){
                    if(sChar3[idx]==sChar2[j-1]) t[i][j]=t[i][j-1];
                }else{
                    t[i][j]=(sChar1[i-1]==sChar3[idx]? t[i-1][j]:false) || (sChar2[j-1]==sChar3[idx] ? t[i][j-1]:false);
                }
            }
        }

        return t[t.length-1][t[0].length-1];
    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String shuffledString=sc.nextLine();

        boolean ans=shuffled(s1,s2,shuffledString);
        System.out.println(ans);
    }
}
