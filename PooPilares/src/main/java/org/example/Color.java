package org.example;

public enum Color {
    BRANCO ("0000", "Branco"),
    PRETO ("9999", "Preto"),
    CINZA ("8888", "Cinza");

    private String codigoCor;
    private String nome;

    private Color(String codigoCor, String nome){
        this.codigoCor = codigoCor;
        this.nome = nome;
    }

    public String getCodigoCor() {
        return codigoCor;
    }

    public String getNome() {
        return nome;
    }
}
