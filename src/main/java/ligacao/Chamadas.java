package ligacao;

import agendamentoContatos.Agendamento;
import agendamentoContatos.Contatos;

import java.util.Scanner;

public class Chamadas extends Agendamento {

    public String realizarChamada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero para realizar a chamada:");
        String discarNumero = scanner.next();
        boolean encontrado = false;
        for (Contatos ligar : Setcontatos) {
            if (ligar.getNumTelefone().equalsIgnoreCase(discarNumero)) {
                encontrado = true;
                for (int i = 0; i <= 5; i++) {
                    System.out.println("Ligando para " + ligar.getNome() + " ...");
                }
                return discarNumero;
                }
            }
        if (!encontrado){
            System.out.println("Ligando para: " + discarNumero + "...");
        }
        return discarNumero;
    }
}