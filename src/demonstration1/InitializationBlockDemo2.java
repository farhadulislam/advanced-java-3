package demonstration1;

public class InitializationBlockDemo2 {

    private boolean sysOn = initializeInstanceVar();

    {
        int id = 0;
    }


    public static void main(String[] args) {

        System.out.println("Initialization block demo 2");
    }

    protected boolean initializeInstanceVar() {
            return true;

    }

}

