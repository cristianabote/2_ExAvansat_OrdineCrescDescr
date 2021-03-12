package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Scrie un program care citeste de la tastatura 3 numere;va afisa daca numerele sunt in ordine crescatoare,
        // descrescatoare sau indecis

        Scanner scan=new Scanner(System.in);
        System.out.println("Introduceti numerele");
        int nr1= scan.nextInt();
        int nr2=scan.nextInt();
        int nr3=scan.nextInt();
        if(nr1<nr2)
            if(nr2<nr3)
                System.out.println("CRESCATOR: "+nr1+" "+nr2+" "+nr3);
            else
                System.out.println("Indecis: "+nr1+" "+nr2+" "+nr3);
        else
                if(nr2>nr3)
                    System.out.println("DESCRESCATOR: "+nr1+" "+nr2+" "+nr3);
                else
                    System.out.println("Indecis: "+nr1+" "+nr2+" "+nr3);

    }
}
