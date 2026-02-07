
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class loopsWhile {
    public static void main(String[] args) {
        int guess = 143;
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in)); 
        try{
        while (true) { 
            System.err.println("Guess the number:\t ");
            
            if(Integer.parseInt(inp.readLine())==guess){System.err.println("Thats the right guess ,You are smart..");break;}
            else{System.err.println("Opps Better Luck next time ...");}
        }
        }catch(IOException ie){System.err.println(ie.getMessage());}
    }
}
