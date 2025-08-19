class exemplo_operadores{
        
    public static void main(String[] args) {

        int A;
        int B;

        int soma;
        int subtracao;
        int multiplicacao;
        double divisao;
        double resto_divisao;

        A = 32;
        B = 12;
    System.out.println("Resultado das Operacoes Aritimeticas");
        soma = A + B; 
    System.out.println("" + A + " + " + B + " = " + soma);

        subtracao = A - B;
    System.out.println("" + A + " - " + B + " = " + subtracao);

        multiplicacao = A * B;
    System.out.println("" + A + " * " + B + " = " + multiplicacao);
        
        divisao = (double) A / B;
    System.out.println("" + A + " / " + B + " = " + divisao);

        resto_divisao = A % B; //10 % 3 resultado vai ser 1
    System.out.println("" + A + " % " + B + " = " + resto_divisao);

    System.out.println("Resultado das operacoes Relacionais entre A e B ");
    System.out.println("A: " + A + "\nb: " + B);
    System.out.println("A < B: " + (A<B) );

    }
    
}