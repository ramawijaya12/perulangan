
package PROGRAM;

import java.util.Scanner;


public class perulangan {
    public static void main(String[] args) {
    int pil;
    Scanner s= new Scanner (System.in);
    
    do{
        System.out.println("1. Input Data");
        System.out.println("2. Tampil Dta");
        System.out.println("3. Keluar");
        System.out.print("Pilih :"); pil=s.nextInt();
    }
    while(pil!=3);
    }
}
