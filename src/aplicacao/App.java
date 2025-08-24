package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.ContratoHora;
import entidades.Departamento;
import entidades.Trabalhador;
import entidades.enums.LevelFuncionario;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Digite nome do Departamento:");
		String departamento = sc.nextLine();
		
		System.out.println("Dados do Funcionario:");
		System.out.print("Nome:");
		String nome = sc.nextLine();
		System.out.print("level:");
		String level = sc.nextLine().toUpperCase();
		System.out.print("Salario Base:");
		Double salario = sc.nextDouble();
		
		//instanciando um novo trabalhador
		Trabalhador trabalhador = new Trabalhador(nome, LevelFuncionario.valueOf(level), salario, new Departamento(departamento));
		
		System.out.print("Quantos contratos para esse funcionario?");
		int n = sc.nextInt();
		
		for (int i=0; i< n; i++) {
		System.out.println("dados do contrato " + i);	
		System.out.print("data: dd/mm/ano ");	
		Date data = sdf.parse(sc.next());
		System.out.print("Valor por hora: ");	
		Double valorHora = sc.nextDouble();
		System.out.print("Tempo: ");
		int horas = sc.nextInt();
			
			ContratoHora contrato = new ContratoHora(data, valorHora, horas);
			trabalhador.addContrato(contrato);	
		}
		
		System.out.println("");
		System.out.print("Informe mes e ano que deseja calcular: ");
		String mesAno=sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		
		System.out.println("");
		
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("No periodo de: " + mesAno + ":" + String.format("%.2f", trabalhador.quantidade(mes, ano)));
		
		sc.close();
	}

}
