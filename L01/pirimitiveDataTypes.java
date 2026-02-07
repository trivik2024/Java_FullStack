public class pirimitiveDataTypes {
    public static void main(String[] args) {
        int radius;
        float  pi= 3.147f;
        double area;
        try{
        System.out.print("enter the radius of circle");
        radius= ((int)System.in.read());
        area=2*pi*(radius*radius);
        System.out.println("Area of circle is:--"+area);
        }catch(Exception e){System.err.println("Mathematical Error");}
    }
}
