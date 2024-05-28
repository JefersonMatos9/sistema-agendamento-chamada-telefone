package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Agendamento agendamento = new Agendamento();

        agendamento.adicionarContato("Deco","33926806");
        agendamento.adicionarContato("Lurdes","33925050");
        agendamento.adicionarContato("Josiane","33925854");
        agendamento.adicionarContato("Adriana","254541321");
        agendamento.adicionarContato("Bruno","54454484");
        
       //agendamento.removerContato("Josiane");

        //agendamento.pesquisarContato("Maria");
        agendamento.listaContatos();

    }
}