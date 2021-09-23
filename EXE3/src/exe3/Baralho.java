package exe3;

public class Baralho {
    private final static int TOTCARTAS = 52;
    private Carta[] cartas;
    private int numCartas;
    private int copas;
    private int paus;
    private int ouros;
    private int espadas;
    
    public Baralho(){
        numCartas = 0;
        cartas = new Carta[this.TOTCARTAS];
    }
    
    public void adicionarCarta(int num, String naipe) throws Exception{
        if (numCartas >= TOTCARTAS){
            throw new Exception("Todas as cartas já informadas");
        }        
        for (int i = 0; i < numCartas; i++){
            if (cartas[i].getNum() == num && cartas[i].getNaipe().equals(naipe)){
                throw new Exception("Já possui uma carta com o mesmo numero e naipe");
            }
        }
        
        if (naipe == "Espadas"){
            if(espadas <= 13){
                this.espadas++;
            }else{
                throw new Exception("Todas as cartas do naipe já foram adicionadas");
            }
        }
        if (naipe == "Paus"){
            if(paus <= 13){
                this.paus++;
            }else{
                throw new Exception("Todas as cartas do naipe já foram adicionadas");
            }
        }
        if (naipe == "Copas"){
            if(copas <= 13){
                this.copas++;
            }else{
                throw new Exception("Todas as cartas do naipe já foram adicionadas");
            }
        }
        if (naipe == "ouros"){
            if(ouros <= 13){
                this.ouros++;
            }else{
                throw new Exception("Todas as cartas do naipe já foram adicionadas");
            }
        }
        
        this.cartas[numCartas] = new Carta(num, naipe);
        numCartas++;
    } 
    
    @Override
    public String toString(){
        String info = "";
        
        for (int i = 0; i < numCartas; i++){
            info += cartas[i].getNum() + " | " + cartas[i].getNaipe() + "\n";
        }
        return info;
    }
    
}
