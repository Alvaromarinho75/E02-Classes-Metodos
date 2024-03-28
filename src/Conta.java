public class Conta {

    Cliente cliente = new Cliente();
    double saldo;
    int numero;
    double limite;
    String agencia;


    boolean depositar(double valor) {
        if(valor > 0.0) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }


    boolean sacar(double valor) {
        if(valor > 0.0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }


    boolean transferir(Conta contaDestino, double valor) {
        boolean saqueRealizado = this.sacar(valor);
        if(saqueRealizado) {
            boolean depositoRealizado = contaDestino.depositar(valor);
            return depositoRealizado;
        } else {
            return false;
        }
    }

    void imprimir(){
        System.out.println("Nome: " + this.cliente.nome);
        System.out.println("Cpf: " + this.cliente.cpf);
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
        System.out.println("Endereço: " + this.cliente.endereco);
        System.out.println("Agencia: " + this.agencia);
    }
}
