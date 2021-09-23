package exe3;

public class Carta {
    private int num;
    private String naipe;
    
    public Carta(int num, String naipe) throws Exception{
        setNumero(num);
        setNaipe(naipe);
    }
    
    public void setNumero(int num) throws Exception{
        if(num < 0){
            throw new Exception("Número da carta não pode ser negativo");
        }
        if(num > 13){
            throw new Exception("Número da carta só pode ir até o 13");
        }
        this.num = num;
    }
    
    public void setNaipe(String naipe) throws Exception{
        if(naipe == "Espadas" || naipe == "Paus" || naipe == "Copas" || naipe == "Ouros"){
            this.naipe = naipe;
        }else{
            throw new Exception("Só é possivel criar cartas de naipes compativeis!");
        }
    }

    public int getNum() {
        return num;
    }

    public String getNaipe() {
        return naipe;
    }
    
}
