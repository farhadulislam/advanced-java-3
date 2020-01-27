package demonstration1;

public class Outer {



    public static void main (String [] args){

         class Inner {

            private int id;

            public int getId() {
                return id;
            }
        }

        Inner inner = new Inner();

    }
}
