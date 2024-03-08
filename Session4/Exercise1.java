public class Exercise1 {

    int arraysize = 5;
    int[] arrayvalues = new int[arraysize];
    int[] arrayvalues2 = new int[5];
    int[] arrayvalues3 = { 1, 2, 3, 4, 5 };

    public int sumaArrayNumeros() {
       int result = 0;
       for (int i = 1; i <= arrayvalues3.length; i++){
         result += arrayvalues3[i];
       }
       return result;
    }
}