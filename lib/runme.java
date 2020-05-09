
public class runme {
  public static void main(String[] args){
    System.load("/home/pi/Dexter/BrickPi3/Software/C/swig_c/out/libbrickpi.so");
    BrickPi3 b = new BrickPi3();
    b.detect();
  }


}
