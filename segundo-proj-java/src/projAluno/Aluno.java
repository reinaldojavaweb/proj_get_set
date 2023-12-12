package projAluno;

import java.util.Objects;

public class Aluno {
		
	private String nome;
	private int idade;
	private String dataNascimento;
	private String mae;
	private String pai;
	private String rg;
	private String cpf;
	private String endereco;
	private String escola;
	private double n1;
	private double n2;
	private double n3;
	private double n4;
	private String disciplina1;
	private String disciplina2;
	private String Disciplina3;
	private String Disciplina4;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getMae() {
		return mae;
	}
	public void setMae(String mae) {
		this.mae = mae;
	}
	public String getPai() {
		return pai;
	}
	public void setPai(String pai) {
		this.pai = pai;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEscola() {
		return escola;
	}
	public void setEscola(String escola) {
		this.escola = escola;
	}
	
	
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	public double getN4() {
		return n4;
	}
	public void setN4(double n4) {
		this.n4 = n4;
	}
	
	
	
	//Média do aluno
	
	
	public String getDisciplina1() {
		return disciplina1;
	}
	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}
	public String getDisciplina2() {
		return disciplina2;
	}
	public void setDisciplina2(String disciplina2) {
		this.disciplina2 = disciplina2;
	}
	public String getDisciplina3() {
		return Disciplina3;
	}
	public void setDisciplina3(String disciplina3) {
		Disciplina3 = disciplina3;
	}
	public String getDisciplina4() {
		return Disciplina4;
	}
	public void setDisciplina4(String disciplina4) {
		Disciplina4 = disciplina4;
	}
	public double getNotaMedia() {
		return (n1 + n2 + n3 + n4 )/4;
	}
	
	public boolean getAlunoAprovado() {
	double media = this.getNotaMedia();
	if(media >= 70) {
		return true;
	}
	
	else {
		return false;
	}
	}
	@Override
	public int hashCode() {
		return Objects.hash(Disciplina3, Disciplina4, cpf, dataNascimento, disciplina1, disciplina2, endereco, escola,
				idade, mae, n1, n2, n3, n4, nome, pai, rg);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(Disciplina3, other.Disciplina3) && Objects.equals(Disciplina4, other.Disciplina4)
				&& Objects.equals(cpf, other.cpf) && Objects.equals(dataNascimento, other.dataNascimento)
				&& Objects.equals(disciplina1, other.disciplina1) && Objects.equals(disciplina2, other.disciplina2)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(escola, other.escola)
				&& idade == other.idade && Objects.equals(mae, other.mae)
				&& Double.doubleToLongBits(n1) == Double.doubleToLongBits(other.n1)
				&& Double.doubleToLongBits(n2) == Double.doubleToLongBits(other.n2)
				&& Double.doubleToLongBits(n3) == Double.doubleToLongBits(other.n3)
				&& Double.doubleToLongBits(n4) == Double.doubleToLongBits(other.n4) && Objects.equals(nome, other.nome)
				&& Objects.equals(pai, other.pai) && Objects.equals(rg, other.rg);
	}
	
	

}
