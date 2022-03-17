package Anagarms_Assignment;

import java.util.Scanner;
import  java.util.*;


public class Anagrams {

    public static boolean isAnagram(String s1,String s2)
    {
        Map<Character,Integer> map=new HashMap<>();
        //Map<Character,Integer>map2=new HashMap<>();

        if(s1.length()!=s2.length()) return false;
        //counting the frequency of chars in s1
        for(int i=0;i<s1.length();i++)
        {
            if(map.containsKey(s1.charAt(i)))
            {
                map.put(s1.charAt(i),map.get(s1.charAt(i))+1);
            }else
            {
                map.put(s1.charAt(i),1);
            }
        }

        //looping over the second string and decteasing the count

        for(int i=0;i<s2.length();i++)
        {
            if(map.containsKey(s2.charAt(i)))
            {
                //decreasing the count
                map.put(s2.charAt(i),map.get(s2.charAt(i))-1);
            }
        }
        //if teh value of any key in map is more than zero, then both strings are not anagrams

        for(Map.Entry<Character,Integer>e:map.entrySet())
        {
            if(e.getValue()>0) return false;
        }

        return true;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s1=sc.nextLine();
        String s2=sc.nextLine();

       boolean ans= isAnagram(s1,s2);
        System.out.println(ans);

    }
}
