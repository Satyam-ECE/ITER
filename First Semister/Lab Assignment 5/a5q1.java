import java.util.Scanner;
public class a5q1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N");
        int N=sc.nextInt();
        for(int i=0;i<=N;i++){
            System.out.println(i+"\t\t"+(int)Math.pow(2,i));
        }


    }
}
