import java.util.*;
public class adalab3april {
    public static int [] Search(String str,String pat)
    {
        int [] index = new int[2];
        int i=0;
        int j=0;
        int n = str.length();
        int m = pat.length();
        while(i<n && j<m)
        {
            if((str.charAt(i))==(pat.charAt(j)))
            {
                j++;
            }
            i++;
            if (j==m){
                index[0] = i-m;
                index[1] = i-1;
            }
        }
        return index ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("Enter a substring you want to search : ");
        String pat = sc.nextLine();
        int [] y = new int [2]; 
        y = Search(str,pat);
            System.out.println("Starts at :"+y[0]);
            System.out.println("ends at :"+y[1]);

    }
}
