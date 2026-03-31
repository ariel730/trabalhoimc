public class imc {

    public static void main(String[] args) {

        String nome = lerNome();
        char genero = lerGenero();
        double altura = lerAltura();
        double peso = lerPeso();

        double imc = calcularIMC(peso, altura);
        String classificacao = classificar(imc, genero);

        mostrar(nome, genero, imc, classificacao);
    }

    public static String lerNome() {
        return IO.readln("Nome: ");
    }

    public static char lerGenero() {
        return IO.readln("Gênero (M, F, N): ").charAt(0);
    }

    public static double lerAltura() {
        return Double.parseDouble(IO.readln("Altura: "));
    }

    public static double lerPeso() {
        return Double.parseDouble(IO.readln("Peso: "));
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificar(double imc, char genero) {

        switch (genero) {

            case 'M':
            case 'm':
                if (imc >= 40) return "Obesidade Mórbida";
                else if (imc >= 30) return "Obesidade Moderada";
                else if (imc >= 25) return "Obesidade Leve";
                else if (imc >= 20) return "Normal";
                else return "Abaixo do Normal";

            case 'F':
            case 'f':
            case 'N':
            case 'n':
                if (imc >= 39) return "Obesidade Mórbida";
                else if (imc >= 29) return "Obesidade Moderada";
                else if (imc >= 24) return "Obesidade Leve";
                else if (imc >= 19) return "Normal";
                else return "Abaixo do Normal";

            default:
                return "Gênero inválido!";
        }
    }

    public static void mostrar(String nome, char genero, double imc, String classificacao) {
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("IMC: " + String.format("%.2f", imc));
        System.out.println("Classificação: " + classificacao);
    }
}
