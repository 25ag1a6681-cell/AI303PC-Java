import java.util.Scanner;
import java.util.Arrays;
class SumOfTwo {
    public static void main(String...args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++) num[i]=sn.nextInt();
        int ta=sn.nextInt();
        int[] result=findTwoSum(num,ta);
        System.out.println(Arrays.toString(result));
        sn.close();
    }
    public static int[] findTwoSum(int[] nums,int target){
        int[] arr={-1,-1};
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return arr;
    }
}
