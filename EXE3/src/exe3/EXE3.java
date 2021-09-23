package exe3;

public class EXE3 {

    public static void main(String[] args) {
        Baralho b1 = new Baralho();
        try{
            b1.adicionarCarta(1, "Espadas");
            b1.adicionarCarta(2, "Ouros");
            b1.adicionarCarta(2, "Paus");
            b1.adicionarCarta(2, "Copas");
            System.out.println(b1.toString());
        }catch(Exception e){
            System.out.println("Erro: " +  e.getMessage());
        }
        
    }
    
}
