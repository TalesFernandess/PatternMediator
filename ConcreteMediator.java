public class ConcreteMediator implements Mediator {
    private Janela j1;
    private Janela j2;

    @Override
    public void registrarJanelas(Janela j1, Janela j2) {
        this.j1 = j1;
        this.j2 = j2;
    }

    @Override
    public void notificarBotaoPressionado(Janela origem) {
        if (origem == j1) {
            // Copia de J1 para J2
            j2.setTexto(j1.getCampo1(), j1.getCampo2());
            System.out.println("Copiando dados da Janela 1 para a 2.");
        } else {
            // Copia de J2 para J1
            j1.setTexto(j2.getCampo1(), j2.getCampo2());
            System.out.println(" Copiando dados da Janela 2 para a 1.");
        }
    }
}