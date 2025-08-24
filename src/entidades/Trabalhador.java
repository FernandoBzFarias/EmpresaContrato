package entidades;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import entidades.enums.LevelFuncionario;

public class Trabalhador {

	private String nome;
	private LevelFuncionario level;
	private Double salarioBase;
	
	
	//associaçoes das entidades
	private Departamento departamento;
	private List <ContratoHora> contratos = new ArrayList<>();
	
	public Trabalhador() {
		
	}

	public Trabalhador(String nome, LevelFuncionario level, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.level = level;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LevelFuncionario getLevel() {
		return level;
	}

	public void setLevel(LevelFuncionario level) {
		this.level = level;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getContratos() {
		return contratos;
	}

	public void addContrato (ContratoHora novoContrato) {
		contratos.add(novoContrato);	
	}
	
	public void removContrato (ContratoHora removerContrato) {
		contratos.remove(removerContrato);
	}
	
	public Double quantidade (int mes, int ano) {
	    double soma = salarioBase;
	    Calendar cal = Calendar.getInstance(); 
	    for(ContratoHora c: contratos) {
	        cal.setTime(c.getData());
	        int c_ano = cal.get(Calendar.YEAR);
	        int c_mes = 1 + cal.get(Calendar.MONTH);
	        if(ano == c_ano && mes == c_mes) {
	            soma += c.valorTotal();
	        }
	    }
	    return soma;
	}
}
