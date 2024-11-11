public class anagram {
    public static int sum(String s,int i,int j){
    {
        int sum = 0;
        for(int a=i;a<=j;a++)
        {
            sum +=(s.charAt(a)-'a');
        }
        return sum;
    }
}
    public static void Anagram(String s1,String s2)
    {
        int n = s1.length();
        int m = s2.length();
        int si = 0;//statrting index
        int ei = 0;//ending index
        int s2Sum = sum(s2, 0, m);//sum of given sub array
        for(int i=0;i<=n-m;i++)
        {
            if((ei-si+1)<n)
            {
                ei++;
                continue;
            }
            int matchSum = sum(s1, si, ei);
            if(s2Sum == matchSum)
            {
                System.out.println("Anagram found at : "+ si+ " to "+ei);
            }
            si++;
            ei++;
        }
    }
    
    public static void main(String[] args) {
        String s1 = "abaababdccddabab";
        String s2 = "dabb";
        // int n = s2.length();
        // int s = sum(s2, 0, n-1);
        // System.out.println(s);
        Anagram(s1, s2);
    }
}
