package BasicPrograms;

public class SolvInterview {
	
    public static void action1(int a) {

        System.out.println("action1");

    }

    public void action2() {

        System.out.println("action2");

    }

    public static void main(String[] args) {

        System.out.println("I am in main method of Java");

        action1(5);
        
SolvInterview a = new SolvInterview();
        a.action2();

    }

}


