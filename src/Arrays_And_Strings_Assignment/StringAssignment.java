package ArraysAndStrings;
import java.util.*;

public class StringAssignment {

    public static boolean shuffled(String s1,String s2,String s3)
    {

        if(s1.length()+s2.length()!=s3.length()) return false;
        char[] sc1=s1.toCharArray(),sc2=s2.toCharArray(),sc3=s3.toCharArray();

        boolean [][]t=new boolean[sc1.length+1][sc2.length+1];

        for(int i=0;i<t.length;i++)
        {
            for(int j=0;j<t[i].length;j++)
            {
                int idx=i+j-1;
                if(idx==-1)
                {
                    t[i][j]=true;
                }else if(i==0){
                    if(sc3[idx]==sc2[j-1])t[i][j]=t[i][j-1];
                }else if(j==0){
                    if(sc3[idx]==sc1[i-1])t[i][j]=t[i-1][j];
                }else{
                    t[i][j]=(sc1[i-1]==sc3[idx]? t[i-1][j]:false) || (sc2[j-1]==sc3[idx] ? t[i][j-1]:false);
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
