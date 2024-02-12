package kiralynok;

public class Tabla {
    private char [][] T;
    private char UresCella;

    public Tabla(char UresCella) {
        T = new char[8][8];
        this.UresCella = UresCella;
        
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T.length; j++) {
                T[i][j]=UresCella;
            }
            
        }
    }
    
    
}
