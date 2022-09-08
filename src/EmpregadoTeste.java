import java.util.Scanner;

public class EmpregadoTeste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		String nome1,nome2;
		double salario1,salario2;
		
		System.out.println("Digite o nome do funcionario");
		nome1=entrada.next();
		System.out.println("Digite o salario");
		salario1 = Double.parseDouble(entrada.next());
		
		System.out.println("Digite o nome do funcionario");
		nome2=entrada.next();
		System.out.println("Digite o salario");
		salario2 = Double.parseDouble(entrada.next());
		
		
		Empregado e1 = new Empregado(nome1,salario1);
		Empregado e2 = new Empregado(nome2, salario2);
		
		System.out.println("Informaçãoes");
		System.out.println(e1.exibir());
		System.out.println(e2.exibir());

		e1.aumentarSalario(2.00);
		e2.aumentarSalario(5.00);
		
		System.out.println("Reajuste nos salarios");
		System.out.println(e1.exibir());
		System.out.println(e2.exibir());
		
		
		entrada.close();
	}

}
