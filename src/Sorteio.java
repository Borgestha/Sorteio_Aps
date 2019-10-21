
public class Sorteio {

    public static void main(String[] args) {
        ListaEncadeada a = new ListaEncadeada();
        a.addF("DIMITRI");
        a.addF("ANTONIETA");
        a.addF("THEODORO");
        a.addF("ENZO");
        a.addF("LUCAS");
        a.addF("MARCOS");
        a.addF("ARYA");
        a.addF("HELEN");
        a.addF("DOUGLAS");
        a.addF("DANIELE");

        ListaCircular b = new ListaCircular();
        b.adcF("PS4");
        b.adcF("INGRESSO");
        b.adcF("CAMISETA");
        b.adcF("JBL");
        b.adcF("XBOX ONE");
        b.adcF("COMPUTADOR");
        b.adcF("100 REAIS");
        b.adcF("500 REAIS");
        b.adcF("1000 REAIS");

        System.out.println(" PARABENS " + a.sorteio() + ", VOCÊ GANHOU " + b.sorteio());

    }
}
