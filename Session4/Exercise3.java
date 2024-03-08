import java.util.LinkedList;
import java.util.Scanner;
public class Exercise3{
    LinkedList<String> links = new LinkedList<>();

    public LinkedList<String> addValues(){
        links.add("Link1");
        links.add("Link2");
        links.add("Link3");
        links.add("Link4");
        links.add("Link5");
        return links;
    }

    public boolean searchValue(){
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        System.out.println("Ingrese el valor que desea buscar");
        String value = sc.nextLine();
        found = links.contains(value);
        return found;
    }

}