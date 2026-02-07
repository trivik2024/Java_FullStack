//example of for loop
public class loopsFor {
//using break to quit after 5 iterations
    public static void main(String[] args) {
        int ctr=1;
        for ( ;ctr<=5;ctr++){
            if(ctr==5){System.out.println("\terminating at 5th") ;break;}
            else{
                System.out.print("\nIteration number"+ctr);
            }
        }

    }
}
