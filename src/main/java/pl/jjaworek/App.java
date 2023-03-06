package pl.jjaworek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Jacek", "Gacek", "Agnieszka");

        Greeter greeter = new Greeter();
        greeter.greet("Jacek");

        List<String> ladies = new ArrayList<String>();

        for (String name: names){
            if (name.endsWith("a")){
                ladies.add(name);
            }
        }

        for (String ladyName: ladies){
            greeter.greet(ladyName);
        }

        names.stream()
                .filter(name -> name.endsWith("a"))
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(greeter::greet);
    }
}
