package ba.unsa.etf.rs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  int a,b,c;
        System.out.println("Unesi brojeve: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        int zbir=a+b+c;
        System.out.println("Zbir je " + zbir);
        System.out.println("Provjera!");
    }
}
