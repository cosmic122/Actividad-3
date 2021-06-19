public class Card {

    //variables
    private final String palo;
    private final String color;
    private final String valor;

    //constructor
    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    //formato de retorno
    @Override
    public String toString() {
        return "Palo: " + palo + " | " + "Color: " + color + " | " + "Valor: " + valor;
    }
}