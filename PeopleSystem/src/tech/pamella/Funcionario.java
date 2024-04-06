package tech.pamella;

import java.time.LocalDate;

import tech.composicao.*;


public class Funcionario extends Pessoas {
	private int matricula;
	private double salario;
	private LocalDate dataAdmissao;
	
	
	private Profissoes profissao;
	

	
	

	public Funcionario(int matricula, double salario, LocalDate dataAdmissao, Profissoes profissao) {
		super();
		this.matricula = matricula;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		this.profissao = profissao;
	}
	
	
	
	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public Profissoes getProfissao() {
		return profissao;
	}
	public void setProfissao(Profissoes profissao) {
		this.profissao = profissao;
	}
	
	

}
