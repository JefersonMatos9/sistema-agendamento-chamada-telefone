package org.classePrincipal;

import agendamentoContatos.Agendamento;
import ligacao.Chamadas;

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
        agendamento.adicionarContato("Arlete","543156");
        agendamento.adicionarContato("Marleide","54315886");
        agendamento.adicionarContato("Gelcir","543154567");
        agendamento.adicionarContato("Dena","54315416");
        agendamento.adicionarContato("José","54315546");
        agendamento.adicionarContato("Biu","54315633");
        agendamento.adicionarContato("Adrian","54315216");

       //agendamento.removerContato("Josiane");

        agendamento.pesquisarContato("deco");
       // agendamento.listaContatos();

        //Instanciando o objeto chamadas.
        Chamadas chamadas = new Chamadas();

        //Transferindo os contatos da agenda para chamada.
        //chamadas.Setcontatos = agendamento.Setcontatos;

        //realizando uma ligação
        //chamadas.realizarChamada();

    }
}