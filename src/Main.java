

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        for (int i=0;i<n;i++){
            String st=sc.nextLine();
            String []dt=st.split(" ");
            int l=dt.length;
            int va[]=new int[l];
            for (int j=0;j<l;j++){
                if (dt[j].charAt(0)=='C'){
                    va[j]=0;
                }
                else if (dt[j].charAt(0)=='D'){
                    va[j]=13;
                }
                else if (dt[j].charAt(0)=='H'){
                    va[j]=26;
                }
                else if (dt[j].charAt(0)=='S'){
                    va[j]=39;
                }
                va[j]=va[j]+Integer.parseInt(dt[j].substring(1));
            }
            for (int j=0;j<l;j++){
                for (int k=j+1;k<l;k++){
                    if (va[j]<va[k]){
                        int tom=va[j];
                        va[j]=va[k];
                        va[k]=tom;
                        String tomst=dt[j];
                        dt[j]=dt[k];
                        dt[k]=tomst;
                    }
                }
                System.out.println(dt[j]+" ");
            }
            System.out.println();
        }
    }
}
