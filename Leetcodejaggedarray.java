import java.util.*;
class jaggedarray{


    public static void main(String...args){
        int [][] jagged = new int[3][];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("Enter the Size:");
            int size =  sc.nextInt();
            jagged[i] = new int[size];
            for(int j=0;j<size;j++){
                jagged[i][j] = sc.nextInt();
            }
        }
        System.out.println("elements in jagged array");
        for(int [] k : jagged){
            for(int s:k){
                System.out.println(s+"");
            }
        }
    sc.close();
}
}
