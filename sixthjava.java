import java.util.*;
class sixthjava{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        int [][] arr= new int[3][];
        int [][] arr1= new int[3][];
        int [][] result=new int[arr.length][];
        System.out.println("Enter the elements of First matrix:");
        for(int i=0;i<3;i++){
            System.out.println("Enter the Elements in row Size:");
            int size =  sc.nextInt();
            arr[i] = new int[size];
            for(int j=0;j<size;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of Second matrix:");
        for(int i=0;i<3;i++){
            System.out.println("Enter the Elements in rows Size:");
            int siz =  sc.nextInt();
            arr1[i] = new int[siz];
            for(int j=0;j<siz;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            int size = Math.min(arr[i].length, arr1[i].length); 
            result[i] = new int[size];
            for (int j = 0; j < size; j++) {
                result[i][j] = arr[i][j] + arr1[i][j];
            }
        }
        for(int [] p: result){
            System.out.println(Arrays.toString(p));
        }
        for(int [] k: result){
            for(int s: k){
                System.out.println(s);
    }}
    }}