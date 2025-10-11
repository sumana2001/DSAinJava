package arrays;

public class MaxSubarray {
    public static int maxSubarraySumBrute(int[] arr, int n){
        int msum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                msum=Math.max(sum,msum);
            }
        }
        return msum;
    }
    public static int maxSubarraySumKadane(int[] arr, int n){
        int msum=Integer.MIN_VALUE;
        int sum=0;
        int start=0,sindex=0,eindex=0;
        for(int i=0;i<n;i++){
            if(sum<=0){
                sum=arr[i];
                start=i;
            } else {
                sum+=arr[i];
            }
            if(sum>msum){
                msum=sum;
                sindex=start;
                eindex=i;
            }
        }
        System.out.println("Indexes: "+sindex+" "+eindex);
        return msum;
    }
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarraySumBrute(arr, 9));
        System.out.println(maxSubarraySumKadane(arr, 9));
    }
}
