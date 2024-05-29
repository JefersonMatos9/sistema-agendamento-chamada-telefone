package org.example;

import java.util.*;

public class Agendamento {
    Set<Contatos> Setcontatos;

    //Construtor para inicializar Setcontatos como um TreeSet
    public Agendamento() {
        this.Setcontatos = new TreeSet<>();
    }

    //Adicionando contato a agenda.a
    public void adicionarContato(String nome, String numTelefone) {
        //Verifica se ja existe o numero a lista de contatos
        boolean numeroExistente = false;
        for (Contatos contato : Setcontatos) {
            if (contato.getNumTelefone().equalsIgnoreCase(numTelefone)) {
                numeroExistente = true;
                System.out.println("Número que você deseja salvar a lista com o nome " + nome + ",ja existe em outro contato.");
                break;
            }
        }
        //Adiciona o numero apenas se nao exister na lista de contatos
        if (!numeroExistente) {
            Contatos contato = new Contatos(nome, numTelefone);
            Setcontatos.add(contato);
        }
    }

    //Metodo para remover contato
    public void removerContato(String nome) {
        Iterator<Contatos> iterator = Setcontatos.iterator();
        while (iterator.hasNext()) {
            Contatos contatos = iterator.next();
            if (contatos.getNome().equalsIgnoreCase(nome)) {
                iterator.remove();
            }
        }
    }

    //Metodo para pesquisar contato
    public void pesquisarContato(String nome) {
        for (Contatos contato : Setcontatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Contato encontrado: " + contato.getNome() + ", " + contato.getNumTelefone());
                return;
            }
        }
        System.out.println("Contato não existe.");
    }

    // Metodo para mostrar a lista de contato
    public void listaContatos() {
        for (Contatos lista : Setcontatos) {
            System.out.println(lista.getNome() + "," + lista.getNumTelefone());
        }
    }
}
