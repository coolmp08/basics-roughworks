import com.devSense.trials.Address;
import com.devSense.trials.Employee;
import com.devSense.trials.EmployeeRec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        List<String> myL = Arrays.asList("Manas", "Jaee", "Era", "Arya");
        Stream<String> myList = myL.stream();
//        System.out.println(myList.iterator().next().equals("Arya"));
        myList.forEach(m->System.out.print(m + "\t "));
        System.out.println(" ");

        Stream<String> myS = myL.stream();
        myS.forEach(m -> System.out.print(m.charAt(2) + "\t "));

        System.out.println(" ");
        Stream<String> gen = Stream.generate(() -> "item").limit(10);
        gen.forEach(s -> System.out.print(s + "\t "));

        System.out.println("\n");
        Stream<String> nameString = Stream.of("Jaee", "Era", "Arya", "Manas");
        System.out.println(nameString.count());
        System.out.println(Stream.of("Jaee", "Era", "Arya", "Manas").filter(n -> n.startsWith("A")).count());

        List<Integer> numS =  Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum = numS.stream().mapToInt(n->n).sum();
        System.out.println("Sum of number is :" + sum);

        List<Integer> numS1 =  Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sumOfSq = numS1.stream().mapToInt(n -> n*n).sum();
        System.out.println("Sum of square of numbers : " + sumOfSq);

        Supplier<Double> randomVal = () -> Math.random();

        System.out.println("Randome Value from supplier is :" + randomVal.get());

       /* Observable
                .just('R', 'x', 'J', 'a', 'v', 'a')
                .subscribe(
                        System.out::print,
                        System.err::println,
                        System.out::println
                );*/

        List<String> skillset = new ArrayList<>();
        skillset.add("Java");
        skillset.add("Python");
        skillset.add("GCP");

        List<String> skillset1 = new ArrayList<>();
        skillset1.add("Java");
        skillset1.add("Python");
        skillset1.add("GCP-AWS");

        List<String> skillset2 = new ArrayList<>();
        skillset2.add("a");
        Address address = new Address("Pune","79/B","",416308);

        Employee employee = new Employee(1, "Manas",skillset2);
        employee.setAddress(address);
        EmployeeRec employeeRec = new EmployeeRec(1, "Manas",skillset);
        EmployeeRec employeeRec1 = new EmployeeRec(1,"Manas",skillset1);

        System.out.println("Are records equal "+employeeRec.equals(employeeRec1));
        System.out.println("----");
        System.out.println("Employees address is " + employee.getAddress());
        System.out.println("----");
        System.out.println("Street2 is :" + employee.getAddress().getAddressLine2().toUpperCase());
        System.out.println("----");
        System.out.println("State is :" + employee.getAddress().getState().toLowerCase());


        
    }
}