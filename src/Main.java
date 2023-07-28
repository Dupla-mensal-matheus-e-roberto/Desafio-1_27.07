import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();



        System.out.println("Quantas pessoas dejesa cadastrar?");

        int numPessoas = scanner.nextInt();

        for(int i = 0; i < numPessoas; i++){
            System.out.println("Digite o nome da pessoa: ");
            String nome = scanner.next();

            System.out.println("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();

            System.out.println("Quantos Enderecos essa pessoa tem?");
            int numEnderecos = scanner.nextInt();

            List<Endereco> enderecos = new ArrayList<>();

            for(int j = 0; j < numEnderecos; j++ ){
                System.out.println("Digite o nome da rua:");
                String rua = scanner.next();

                System.out.println("Digite o numero da rua:");
                int numero = scanner.nextInt();

                enderecos.add(new Endereco(rua, numero));

            }
            pessoas.add(new Pessoa(nome, idade, enderecos));

        }

        System.out.println("\nDigite o nome da pessoa");

        String nomedapessoa = scanner.next();

        pessoas.forEach(i -> {
            if (i.getNome().equals(nomedapessoa)) {
                System.out.println("\nNome: " + i.getNome() + "\nIdade: " + i.getIdade());

                for (Endereco j : i.getEnderecos()) {
                    System.out.println("Rua: " + j.getRua() + "\nNumero: " + j.getNumero());
                }
            }
        });


    }
}