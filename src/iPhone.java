public class iPhone {
    public static void main(String[] args) {
        ReprodutorMusical.selecionarMusica("Metallica - One");
        ReprodutorMusical.tocar();
        ReprodutorMusical.pausar();
        System.out.println("-----------------------");
        AparelhoTelefonico.fazerLigacao("+55 41 91234-5678");
        AparelhoTelefonico.atender();
        AparelhoTelefonico.iniciarCorreioVoz();
        System.out.println("-----------------------");
        NavegadorInternet.adicionarNovaAba();
        NavegadorInternet.exibirPagina("google.com");
        NavegadorInternet.atualizarPagina();
    }
}