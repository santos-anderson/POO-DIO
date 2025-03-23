

public class Iphone implements ReprodutorMusical,AparelhoTelefonico,NavegadorInternet {

    @Override
    public void tocarMusica() {

        System.out.println("Tocando Musica!");

    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando Musica!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Musica!");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando!");
    }

    @Override
    public void atender() {
        System.out.println("Atender Ligação!");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz!");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina!");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba!");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina!");

    }
}
