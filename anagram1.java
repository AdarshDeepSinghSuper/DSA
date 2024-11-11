public class anagram1 {
    public static int sum(String s,int i,int j){
        {
            int sum = 0;
            for(int a=i;a<=j;a++)
            {
                sum = sum+(s.charAt(a));
            }
            return sum;
        }
    public static void Anagram(String s1, String s2)
    {
        int m = s1.length();
        int n = s2.length();
        int sum = sum(s2,0,n-1);
        // for(int i=0;i<n;i++)
        // {
        //     int s = (s2.charAt(i));
        //     sum = sum + s ;
        // }

        System.out.println(sum);
        int i = 0;//starting index
        int j = 0;//ending index
        int matchSum = 0;
        while(j<n)
        {
            matchSum = matchSum + (s1.charAt(j));
            if((j-i+1)<n)
            {
                j++;
                continue;
            }
            // if(matchSum==sum)
            // {
            //     System.out.println("Pattern matched : at"+i+" to "+j);
            //     // for(int p=0;p<=j;p++)
            //     // {
            //     //     System.out.print(s1.charAt(p));
            //     // }
            // }
            else if((j-i+1)==n)
            {
                if(matchSum==sum)
            {
                System.out.println("Pattern matched : at"+i+" to "+j);
                // for(int p=0;p<=j;p++)
            }
            }
        }
        // System.out.println(sum);
}
