import com.daimainardi.desafiodiobanco.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Daiane");
        Cliente cliente2 = new Cliente("Daniel");

        Conta contaCorrente = new ContaCorrente(1, 1, 100,cliente1);
        ContaPoupanca contaPoupanca = new ContaPoupanca(1, 2, 50,cliente1);
        ContaInterface conta = new ContaCorrente(1, 3, 150, cliente2);

        contaCorrente.depositar(150);
        contaPoupanca.depositar(50);
        conta.depositar(100);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
        conta.imprimirExtrato();

        Banco banco = new Banco();
        List<Conta> contaList = new ArrayList<>();

        contaList.add(new ContaCorrente(1,1, 100,cliente1));
        contaList.add(new ContaPoupanca(1,2, 50,cliente1));
        contaList.add(new ContaCorrente(1, 3,150, cliente2));
        banco.setContaList(contaList);

        banco.ordenaListaContas().forEach(System.out::println);



    }
}