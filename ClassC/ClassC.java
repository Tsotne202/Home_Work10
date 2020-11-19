import java.util.*;
public class ClassC {
    Random rand = new Random();

    public void method1() {
        List<Integer> intNumb = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {
            intNumb.add(rand.nextInt(50));
        }
        System.out.println(intNumb);
    }

    public void method2() {
        List<Integer> intNumb = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {
            intNumb.add(rand.nextInt(50));
        }
        System.out.println("\nპირდაპირი რიცხვი " + intNumb);
        Collections.reverse(intNumb);
        System.out.println("შებრუნებული: " + intNumb);
    }

    public void method3() {
        List<Integer> intNumb = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {
            intNumb.add(rand.nextInt(70));
        }
        Collections.sort(intNumb);
        System.out.println("რიცხვები ზრდადობით: " + intNumb);
    }

}