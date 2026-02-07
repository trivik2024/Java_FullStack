import java.util.Scanner;
public class ifcond {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner read=new Scanner(System.in);
        try {
            System.out.println("enter three numbers seperated by space");
            n1=read.nextInt();
            n2=read.nextInt();
            n3=read.nextInt();
            if(n1 > n2 && n2 > n3){System.err.println("Largest digit is :\t"+n1);}
            else if(n2 > n3 && n3 > n1){System.err.println("Largest digit is: \t"+n2);}
            else {System.err.println("Largest digit is :\t"+n3);}
            read.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
