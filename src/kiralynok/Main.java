
package kiralynok;

public class Main {
    
    public static void main(String[] args) {
        Tabla tabla = new Tabla('#');
        System.out.printf(tabla.Megjelenit());
        tabla.Elhelyez(8);
        System.out.println("--------------");
        System.out.printf(tabla.Megjelenit());
        System.out.println(tabla.UresOszlop(0));
        System.out.println(tabla.UresSor(0));
        System.out.println("Üres oszlopok száma:"+tabla.UresOszlopokSzama());
        System.out.println("Üres sorok száma:"+tabla.UresSorokSzama());
    }
    
}
