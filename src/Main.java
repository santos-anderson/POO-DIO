
public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        System.out.println("------------------------------");
        System.out.println("Metodos Reprodutor Musical: ");
        System.out.println("------------------------------");
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica();
        System.out.println("------------------------------");
        System.out.println("Métodos Aparelho Telefônico:");
        System.out.println("------------------------------");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println("------------------------------");
        System.out.println("Métodos Navegador Internet:");
        System.out.println("------------------------------");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();


    }
}