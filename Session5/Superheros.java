import java.util.ArrayList;
import java.util.Scanner;

public class Superheros{
    ArrayList<Superhero> dc_superheros = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addSuperheros(){
      dc_superheros.add(new Superhero("Batman", 2, new String[] { "Be richest", "Intelligent" }, true, 1));
      dc_superheros.add(new Superhero("Superman", 2, new String[] { "Eyes laser", "Fly" }, true, 1));
    }

    //La funcion arrayList.size() genera el numero de elementos qu tiene el array
    public void showSuperheroesInformation(){
        for (int i = 0; i < dc_superheros.size(); i++){
            System.out.println(dc_superheros.get(i).superhero_name);
        }
    }
}