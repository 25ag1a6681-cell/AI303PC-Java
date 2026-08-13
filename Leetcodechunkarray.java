import java.util.Scanner;
import java.util.Arrays;
class chunk{
    public static void chunkarray(int [] nums,int siz){
        int flag = 0;
        int [][] chunk = new int[nums.length][siz];
        for(int i=0;i<nums.length;i+=siz){
            for(int j=0;j<siz;j++){
                   chunk[flag][j] = nums[i+j];
            }
            flag++;
        }
        System.out.println("Chunk array:");
        System.out.println(Arrays.deepToString(chunk));
          for(int[] k : chunk){
             for(int x=0;x<k.length;x++){
                System.out.println(k[x]);
             }
          } 
        }

    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the sub array size:");
        int size=sc.nextInt();
        chunkarray(arr,size);
        sc.close();
    }
}