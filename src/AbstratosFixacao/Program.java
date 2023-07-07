package AbstratosFixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Abstratos_entidades.Pessoa;
import Abstratos_entidades.PessoaFisica;
import Abstratos_entidades.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		List<Pessoa> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de contribuientes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Contribuinete " + i + ":");
			System.out.print("Pessoa física ou jurídica (f/j)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();

			if (ch == 'f') {
				System.out.print("Gastos com saúde: ");
				double saude = sc.nextDouble();
				list.add(new PessoaFisica(nome, renda, saude));
			} else {
				System.out.print("Número de funcionários: ");
				int funcionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, renda, funcionarios));
			}
		}
		System.out.println();
		System.out.println("Impostos Pagos: ");

		for (Pessoa pessoa : list) {
			System.out.println(pessoa.getNome() + " $ " + String.format("%.2f", pessoa.imposto()));
		}
		// pesquisei ajuda apenas paga soma do total :) e uma correção do get-set nas classes
		  double soma = 0.0;
		for (Pessoa pessoa : list) {
			soma += pessoa.imposto();
			}
		System.out.println("Total de impostos pagos: $ " + String.format("%.2f", soma));

		sc.close();
	}

}
