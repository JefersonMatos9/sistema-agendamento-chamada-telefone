package org.example;

public class Contatos implements Comparable<Contatos> {
    private String nome;
    private String numTelefone;

    public Contatos(String nome, String numTelefone) {
        this.nome = nome;
        this.numTelefone = numTelefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }

    @Override
    public int compareTo(Contatos outroContato) {
        return this.nome.compareTo(outroContato.getNome());
    }
}
