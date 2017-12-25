import java.util.Scanner;

public class J1 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int count[]=new int[52];
        String st=sc.nextLine();
        int l=st.length();
        for (int i=0;i<l;i++){
            int va=st.charAt(i)-'a';
            if (va>=0&&va<26){
                count[va]++;
            }
            else {
                va=st.charAt(i)-'A';
                if (va>=0&&va<26){
                    count[26+va]++;
                }
            }
        }
        for (int i=0;i<52;i++){
            if (count[i]>0){
                if (i<26){
                    System.out.println((char)(97+i)+":"+count[i]);
                }
                else {
                    System.out.println((char)(65+i-26)+":"+count[i]);
                }
            }
        }
    }
}
