import java.util.*;

public class nombre {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String nombre,apellido;
        System.out.print("Cual es tu nombre? ");
        nombre = sc.nextLine();
        System.out.print("Cual es tu apellido? ");
        apellido = sc.nextLine();
        sc.close();
        System.out.println("Tu nombre completo es: " + nombre + " " + apellido);
    } 

}
