import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();

        do{
            System.out.println("[Menu Principal]\n1 - Cadastrar\n2 - Listar Pessoas\n3 - Encontrar Pessoa\n4 - Sair");

            int opc = scanner.nextInt();

            switch(opc){
                case 1:
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
                    break;
                case 2:
                    pessoas.forEach(i -> {
                        System.out.println("\nNome:" + i.getNome() + "\nIdade: " + i.getIdade());

                        for (Endereco j : i.getEnderecos()) {
                            System.out.println("Rua: " + j.getRua() + "\nNumero: " + j.getNumero());
                        }
                        System.out.println("\n--- --- --- ---");
                    });
                    break;
                case 3:
                    System.out.println("\nDigite o nome da pessoa");

                    String nomedapessoa = scanner.next();

                    pessoas.forEach(i -> {
                        if (i.getNome().equals(nomedapessoa)) {
                            System.out.println("\nPessoa Encontrada!\n");
                            System.out.println("Nome: " + i.getNome() + "\nIdade: " + i.getIdade());

                            for (Endereco j : i.getEnderecos()) {
                                System.out.println("Rua: " + j.getRua() + "\nNumero: " + j.getNumero() + "\n");
                            }
                        }
                    });
                    break;
                case 4:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }while(1==1);
    }
}