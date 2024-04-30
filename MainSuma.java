import java.util.Scanner;

class MainSuma{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        System.out.print("Dame un numero: ");
        int n1 = fn.nextInt();

        System.out.print("Dame otro numero: ");
        int n2 = fn.nextInt();

        Suma s1 = new Suma();

        s1.setN1(n1);
        s1.setN2(n2);


        s1.Sumar();

        System.out.println(s1.toString());

        

    }
}