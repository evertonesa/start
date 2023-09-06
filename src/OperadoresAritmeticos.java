public class OperadoresAritmeticos {

    public static void main(String[] args) {

        /*int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A media e igual a " + m);*/

        /*int numero = 5;
        int valor = 5 + numero++;
        System.out.println(valor);
        System.out.println(numero);*/

        /*int x = 4;
        x += 2;
        System.out.println(x);*/

        /*float v = 8.5f;
        int ar = (int) Math.ceil(v);
        System.out.println(ar);*/

        /*double ale = Math.random();
        System.out.println(ale);*/

        double ale = Math.random();
        int n = (int) (5 + ale * (100-5)); //5 Limite inferior e o 100 Limite superior
        System.out.println(n);
    }
}
