public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página na internet...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    // Método principal para testar a implementação
    public static void main(String[] args) {
        Iphone meuIPhone = new Iphone();
        
        // Testando os métodos do Reprodutor Musical
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica();
        
        // Testando os métodos do Aparelho Telefônico
        meuIPhone.ligar();
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();
        
        // Testando os métodos do Navegador na Internet
        meuIPhone.exibirPagina();
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
