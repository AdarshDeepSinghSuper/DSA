public class abhi{
    public static int maxProfit(int [] prices){
       int n = prices.length;
       int minPrice = prices[0];
       int maxProfit = 0;
       for(int i=1;i<n;i++){
        if(prices[i]<minPrice){
            minPrice = prices[i];
        }
        else{
            maxProfit = Math.max(maxProfit,prices[i]-minPrice);
        }
       }
       return maxProfit;
    }
    public static void main(String [] args){
        int [] arr = {3,2,6,5,0,3};
        int y = maxProfit(arr);
        System.out.println(y);
    }
}