package org.example;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{
    private Color color;

    Iphone(Color color){
        this.color = color;
    }

    public void tocar() {
        System.out.println("tocando musica!");
    }

    public void pausar() {
        System.out.println("pausando musica!");
    }
    public void selecionarMusica() {
        System.out.println("selecionando musica!");
    }

    public void telefonar() {
        System.out.println("telefonando!");
    }

    public void atender() {
        System.out.println("atendendo");
    }

    public void iniciarCorreiodeVoz() {
        System.out.println("iniciando correio de voz!");
    }

    public void exibirPagina() {
        System.out.println("exibindo pagina!");
    }

    public void adicionarAba() {
        System.out.println("adicionando aba!");
    }

    public void atualizarPagina() {
        System.out.println("atualizando página!");
    }

    public void dizerCor () {
        String nomeCor = color.getNome();
        System.out.println("IPHONE DA COR " + nomeCor);
    }
}
