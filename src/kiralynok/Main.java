
package kiralynok;

import java.nio.file.Files;

public class Main {
    
    public static void main(String[] args) {
        Feladat();
    }

    private static void Feladat() {
        Tabla tabla = new Tabla('#');
        System.out.println("4.feladat: Az üres tábla:");
        System.out.printf(tabla.Megjelenit());
        tabla.Elhelyez(8);
        System.out.println("--------------");
        System.out.println("6.feladat: A feltöltött tábla:");
        System.out.printf(tabla.Megjelenit());
        System.out.println(tabla.UresOszlop(0));
        System.out.println(tabla.UresSor(0));
        System.out.println("9.feladat: Üres oszlop és sorok száma:");
        System.out.println("Oszlopok:"+tabla.UresOszlopokSzama());
        System.out.println("Sorok:"+tabla.UresSorokSzama());
        
        
    }
    
}
