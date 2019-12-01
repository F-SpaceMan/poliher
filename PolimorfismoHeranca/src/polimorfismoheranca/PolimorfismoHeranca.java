package polimorfismoheranca;
public class PolimorfismoHeranca {

    public static void main(String[] args) {
        Cachorro x = new Cachorro();
        x.emitirSom();
        x.reagir("Olá!"); //Abanar e Latir
        x.reagir("Corre!"); //Rosnar
        x.reagir(11, 45); //Abanar
        x.reagir(21 , 00); //Ignorar
        x.reagir(true); //Abanar
        x.reagir(2, 12.5f); //Latir
        x.reagir(17, 4.5f); //Rosnar
        
    }
}
