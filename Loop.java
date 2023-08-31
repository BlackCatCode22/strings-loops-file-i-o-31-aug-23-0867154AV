import java.util.ArrayList;

public class Loop {
    // For Loop
    public static void main(String [] args) {
        String [] friends = {"Jim", "Angela", "Oscar", "Dwight"};
        for(int i = 0; i <= friends.length; i++){
            System.out.println( friends[i] );
        }
    //  For each Loop
        String[] cars = {"Honda Civic", "Honda CRX", "Honda Integra"};

        for (String car : cars) {
            System.out.println(car);
        }
    // Arrays
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add (1);
        numbers.add (2);
        numbers.add (3);

        for(int a : numbers) {
            System.out.println(a);
        }
        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
    }
}
