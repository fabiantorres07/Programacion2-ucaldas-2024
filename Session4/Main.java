public class Main {

    static Exercise1 instance_exercise1 = new Exercise1();
    static Exercise2 instance_exercise2 = new Exercise2();
    static Exercise3 instance_exercise3 = new Exercise3();
    static Exercise4 instance_joaquin = new Exercise4("Joaquín", "43223", "joaquin@gmail.com");
    static Exercise4 instance_jhon = new Exercise4("Jhon", "43223", "jhon@gmail.com");
    static Exercise4 instance_juan = new Exercise4("Juan", "43223", "juan@gmail.com");

    public static void main(String[] args) {
        // System.out.println(instance_exercise1.sumaArrayNumeros());
        // System.out.println(instance_exercise2.addArrayListCadenas());
        // System.out.println(instance_exercise2.removeArrayListCadenas());
        // System.out.println("Tamaño Arraylist " + instance_exercise2.getSize());
        // System.out.println(instance_exercise3.addValues());
        // System.out.println(instance_exercise3.searchValue());
        System.out.println(instance_joaquin.getUser_name());
        instance_joaquin.setUser_name("Yaneth");
        System.out.println(instance_joaquin.getUser_name());

    }
}