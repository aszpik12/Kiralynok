package kiralynok;

public class Tabla {

    private char[][] T;
    private char UresCella;
    private int sorok = 8;
    private int oszlopok = 8;

    public Tabla(char UresCella) {
        T = new char[8][8];
        this.UresCella = UresCella;

        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T.length; j++) {
                T[i][j] = UresCella;
            }
        }
    }

    public void Elhelyez(int N) {

        for (int i = 0; i < N;) {
            int random = Random(7, 0);
            int random2 = Random(7, 0);
            if (T[random][random2] == UresCella) {
                T[random][random2] = 'K';
                i++;
            }
        }
    }

    private int Random(int max, int min) {
        int random = (int) (Math.random() * (max - min) + min);
        return random;
    }

    public void Fajlbair() {

    }

    public String Megjelenit() {
        String megjel = "";
        for (int i = 0; i < sorok; i++) {
            for (int j = 0; j < oszlopok; j++) {
                megjel += T[i][j];
            }
            megjel += "\n";
        }

        return megjel;
    }

    public void Tabla() {

    }

    public String UresOszlop(int oszlop) {
        String kiir = "Nincs ebben az oszlopban egyetlen egy Királynő se!";
        if (oszlop > 7 || oszlop < 0) {
            kiir = "Nem megfelelő oszlop szám!\n";
        } else {
            for (int i = 0; i < sorok; i++) {
                if (T[i][oszlop] == 'K') {
                    kiir = "Van ebben az oszlopban legalább egy Királynő!";
                }
            }
        }
        return kiir;
    }

    public String UresSor(int sor) {
        String kiir = "Nincs ebben az sorban egyetlen egy Királynő se!";
        if (sor > 7 || sor < 0) {
            kiir = "Nem megfelelő sorszám!\n";
        } else {
            for (int i = 0; i < oszlopok; i++) {
                if (T[sor][i] == 'K') {
                    kiir = "Van ebben a sorban legalább egy Királynő!";
                }
            }
        }
        return kiir;
    }

    public int UresOszlopokSzama() {
        int uOszlopSz = 0;
        boolean ures = true;
        for (int i = 0; i < oszlopok; i++) {
            ures = true;
            for (int j = 0; j < sorok; j++) {
                if(T[j][i] == 'K'){
                    j=sorok;
                    ures = false;
                }
            
            }
            if(ures==true){
                uOszlopSz++;
            }
        }
        return uOszlopSz;
    }

    public int UresSorokSzama() {
        int uSorSz = 0;
        boolean ures = true;
        for (int i = 0; i < sorok; i++) {
            ures = true;
            for (int j = 0; j < oszlopok; j++) {
                if(T[i][j] == 'K'){
                    j=oszlopok;
                    ures = false;
                }
            
            }
            if(ures==true){
                uSorSz++;
            }
        }
        return uSorSz;
    }

}
