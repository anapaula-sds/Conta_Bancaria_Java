public class Conta {
    // Atributos
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataDeAbertura;

    // Construtor (opcional)
    public Conta(String titular, int numero, String agencia, double saldo, String dataDeAbertura) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataDeAbertura = dataDeAbertura;
    }

    // Métodos
    public void saca(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void deposita(double valor) {
        saldo += valor;
    }

    public double calculaRendimento() {
        return saldo * 0.1;
    }

    public String recuperaDadosParaImpressao() {
        return "Titular: " + this.titular + "\nNúmero: " + this.numero + "\nAgência: " + this.agencia
                + "\nSaldo: " + this.saldo + "\nData de Abertura: " + this.dataDeAbertura;
    }
}