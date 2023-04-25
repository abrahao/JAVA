public class Usuario {
    public static void main(String[] args) {
        iPhone myMobile = new iPhone("14 - Pro");
        myMobile.adicionarNovaAba();
        myMobile.atender("987654321", false);
        myMobile.atualizarPagina();
        myMobile.exibirPagina("https://github.com");
        System.out.println("Modelo do Aparelho: " + myMobile.getModelo());
        myMobile.iniciarCorreioVoz();
        myMobile.ligar("987654321");
        myMobile.pausar();
        myMobile.selecionarMusica("the_scientist.mp3");
        myMobile.tocar();
    }
    
}
