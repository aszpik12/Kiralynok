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
    
    public void Elhelyez(int N){
        
        for (int i = 0; i < N;) {
        int random = Random(7, 0);
        int random2 = Random(7, 0);
            if(T[random][random2] == UresCella){
                T[random][random2] = 'K';
                i++;
            }
        }
    }

    private int Random(int max, int min) {
        int random = (int) (Math.random() * (max - min) + min);
        return random;
    }
    
    public void Fajlbair(){
        
    }
        
    public void Megjelenit(){
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T.length; j++) {
                System.out.print(T[i][j]);
            }
            System.out.println("");
        }
    }
        
    public void Tabla(){
        
    }
        
    public void UresOszlop(){
        
    }
    
    public void UresSor(){
        
    }
    
    
}
