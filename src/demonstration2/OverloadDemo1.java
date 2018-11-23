package demonstration2;

public class OverloadDemo1 {

  public static void main (String [] args){

      Box box1 = new Box(23);
      Box box2 = new Box (23, 1, 24);


      System.out.println(box1.volume());
      System.out.println(box2.volume());
  }


}
