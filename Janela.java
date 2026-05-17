public class Colleague {
    private String campo1;
    private String campo2;
    private Mediator mediador;
    private String nome;

    public Colleague(String nome, Mediator mediador) {
        this.nome = nome;
        this.mediador = mediador;
    }

    public void clicarBotao() {
        System.out.println("\nBotão da " + nome + " pressionado!");
        mediador.notificarBotaoPressionado(this);
    }

    public void setTexto(String c1, String c2) {
        this.campo1 = c1;
        this.campo2 = c2;
    }

    public String getCampo1() { return campo1; }
    public String getCampo2() { return campo2; }

    public void exibir() {
        System.out.println(nome + " -> Campo1: " + campo1 + " | Campo2: " + campo2);
    }
}