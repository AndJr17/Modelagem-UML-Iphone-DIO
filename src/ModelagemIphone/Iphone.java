package ModelagemIphone;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("A música tocou");
    }

    @Override
    public void pausar() {
        System.out.println("A música pausou");
    }

    @Override
    public void selecionarMusica(String musica) {
       System.out.println(musica + " foi selecinada");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibir página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
       System.out.println("Página atualizada");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }
    
}