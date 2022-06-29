import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr [] = new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }  
            int sum =0;
            for(int j=0;j<n;j++){
                sum += arr[j];
            }
            int ans = sum % m;
            System.out.println("Case "+"#"+i+": "+ans);
            
            
        }
    }
}