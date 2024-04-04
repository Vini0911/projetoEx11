//Jhonny Nascimento Dias
//Vinicius Luis De Oliveira Monteiro
//Camila Nicole Nunes De Araujo

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário.

public class Exercicio_11 { // Declaração da classe pública Exercicio_11.
  public static void main(String[] args) { // Método principal que é o ponto de entrada do programa.

        Scanner ler = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do console.
        int quarto; // Declara uma variável para armazenar o número de quartos.
        int camareira; // Declara uma variável para armazenar o número de camareiras.
        float tempo_por_quarto; // Declara uma variável para armazenar o tempo por quarto.

        // Solicita ao usuário o número de quartos e valida a entrada.
        do {
            System.out.println("Quantos quartos tem o seu Hotel?"); // Imprime uma mensagem ao usuário.
            while (!ler.hasNextInt()) {
                System.out.println("Por favor, insira um número válido de quartos.");
                ler.next(); // Descarta a entrada incorreta.
            }
            quarto = ler.nextInt(); // Lê a entrada válida.
        } while (quarto <= 0); // Repete até que um número positivo seja inserido.

        // Solicita ao usuário o número de camareiras e valida a entrada.
        do {
            System.out.println("Quantas camareiras estão trabalhando?");
            while (!ler.hasNextInt()) {
                System.out.println("Por favor, insira um número válido de camareiras.");
                ler.next(); // Descarta a entrada incorreta.
            }
            camareira = ler.nextInt(); // Lê a entrada válida.
        } while (camareira <= 0); // Repete até que um número positivo seja inserido.

        // Solicita ao usuário o tempo que uma camareira leva para limpar um quarto e valida a entrada.
        do {
            System.out.println("Quantos minutos uma camareira demora para limpar um quarto?");
            while (!ler.hasNextFloat()) {
                System.out.println("Por favor, insira um número válido de minutos.");
                ler.next(); // Descarta a entrada incorreta.
            }
            tempo_por_quarto = ler.nextFloat(); // Lê a entrada válida.
        } while (tempo_por_quarto <= 0); // Repete até que um número positivo seja inserido.

        // Calcula o tempo total de limpeza dividindo o número total de minutos pelo número de camareiras.
        double tempo_limpeza = quarto * tempo_por_quarto / camareira;

        // Exibe o tempo total de limpeza.
        System.out.printf("A limpeza de todos os quartos vai demorar %.2f min.\n", tempo_limpeza);
        
        ler.close(); // Fecha o objeto Scanner.
    }
}
