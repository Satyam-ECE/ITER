import java.util.Scanner;
public class a5q2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n=sc.nextInt();
        int m,c=0;
        for(int i=1;i<=n;i++){
            System.out.println("Enter marks:");
            m=sc.nextInt();
            if(m>40)
                c++;
        }
        System.out.println(c+" students passed the exam");
    }
}
