public class TestaConta {
    public static void main(String[] args) {

        System.out.println("---Conta Bancaria---\n");
        Conta c1 = new Conta("João", 12345, "001", 1000.0, "08/04/2025");

        System.out.println(c1.recuperaDadosParaImpressao());

        // depósito
        c1.deposita(500.0);
        System.out.println("\nApós depósito de 500.0:");
        System.out.println(c1.recuperaDadosParaImpressao());

        // saque
        c1.saca(200.0);
        System.out.println("Após saque de 200.0:");
        System.out.println(c1.recuperaDadosParaImpressao());

        // Calcular rendimento
        System.out.println("Rendimento de 10% sobre o saldo: " + c1.calculaRendimento());

        Conta c2 = new Conta("Danilo", 12345, "001", 1000.0, "08/04/2025");
        Conta c3 = new Conta("Danilo", 12345, "001", 1000.0, "08/04/2025");

        System.out.println("\n---------c2 é igual a c3 ?-----------");
        if (c2 == c3) {
            System.out.println("Contas iguais");
        } else {
            System.out.println("Conta diferentes");
        }


    }
}
