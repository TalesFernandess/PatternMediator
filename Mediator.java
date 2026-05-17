public interface Mediator {
    void registrarJanelas(Janela j1, Janela j2);
    void notificarBotaoPressionado(Janela origem);
}