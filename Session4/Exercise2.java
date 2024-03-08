import java.util.ArrayList;
public class Exercise2 {
    ArrayList<String> arrayListCadenas = new ArrayList<String>();


    public ArrayList<String> addArrayListCadenas() {
        arrayListCadenas.add("Hola");
        arrayListCadenas.add("Saludo1");
        arrayListCadenas.add("Saludo2");
        arrayListCadenas.add("Saludo3");
        arrayListCadenas.add("Saludo4");
        return arrayListCadenas;
    }

    public ArrayList<String> removeArrayListCadenas() {
        arrayListCadenas.remove("Hola");
        arrayListCadenas.remove(1);
        return arrayListCadenas;
    }

    public int getSize(){
       return arrayListCadenas.size();
    }
}