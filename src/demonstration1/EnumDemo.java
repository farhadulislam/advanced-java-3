package demonstration1;

import com.sun.xml.internal.messaging.saaj.soap.ver1_1.SOAPPart1_1Impl;

enum Apples {

    App1, App2, App3
}
public class EnumDemo {

    public static void main(String... args) {

        Apples app = Apples.App1;

        System.out.println(app);



    }
}