import apps.AparelhoTelefonico;
import apps.NavegadorWeb;
import apps.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) throws Exception {
        NavegadorWeb navegadorWeb = new NavegadorWeb();
        navegadorWeb.adicionarNovaAba();
        navegadorWeb.exibirPagina();
        navegadorWeb.atualizarPagina();

        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();

        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.iniciarCorreioVoz();


    }
}
