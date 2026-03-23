public class Main {
    public static void main(String[] args)
    {
       int[] arr = {2, 3, 4, 5, 1, 2,3,1,1,2};
       int ans=maximumSubArray(arr,14);
       System.out.println(ans);
    }
    public static int maximumSubArray(int[] arr, int k)
    {
        int maxLen=0;
        //maximum sub array with length <=k 
        for(int i=0;i<arr.length;i++)
        {  int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                    sum+=arr[j];
              if(sum>k) 
              {
                  break;
              }
                maxLen=Math.max(maxLen,j-i+1);
            }
        }
        return maxLen;
    }
}
