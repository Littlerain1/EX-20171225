import java.util.Scanner;

public class J2 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]dt=new int[2][n];
        for (int i=0;i<n;i++){
            dt[0][i]=sc.nextInt();
            dt[1][i]=fun(dt[0][i]);
        }
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (dt[1][i]>dt[1][j]){
                    int tmp=dt[1][i];
                    dt[1][i]=dt[1][j];
                    dt[1][j]=tmp;
                    tmp=dt[0][i];
                    dt[0][i]=dt[0][j];
                    dt[0][j]=tmp;
                }
                else if (dt[1][i]==dt[1][j]){
                    if (dt[0][i]>dt[0][j]){

                    }
                }
            }
        }
        System.out.println(fun(n));
    }
    public static int fun(int n){
        int sum=0;
        while (n>0){
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
}
