import java.util.*;

class fourthjava {
    public static void main(String...args){
        int [][] arr={{1,2,3,4},{5,6,7,8}};
        int [][] arr1={{1,2,3,4},{5,6,7,8}};
        int [][] result=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                result[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        System.out.println(Arrays.toString(result));
        for(int [] k: result){
            for(int s: k){
                System.out.println(s);
    }}
    }}