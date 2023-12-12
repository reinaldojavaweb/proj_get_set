package projweb;

import javax.swing.JOptionPane;

import projAluno.Aluno;

public class teste {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome do Aluno: ");
		String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento: ");
		String idade = JOptionPane.showInputDialog("Idade: ");
		String mae = JOptionPane.showInputDialog("Nome da Mãe: ");
		String pai = JOptionPane.showInputDialog("Nome Pai: ");
		String endereco = JOptionPane.showInputDialog("Qual seu Endereço: ");
		String rg = JOptionPane.showInputDialog("RG: ");
		String cpf = JOptionPane.showInputDialog("CPF: ");
		String escola = JOptionPane.showInputDialog("Qual é a Faculdade: ");
		String disciplina1 = JOptionPane.showInputDialog("Primeira Disciplina: ");
		String n1 = JOptionPane.showInputDialog("Primeira Nota: ");
		String disciplina2 = JOptionPane.showInputDialog("Segunda Disciplina: ");
		String n2 = JOptionPane.showInputDialog("Segunda Nota: ");
		String disciplina3 = JOptionPane.showInputDialog("Terceira Disciplina: ");
		String n3 = JOptionPane.showInputDialog("Terceira Nota: ");
		String disciplina4 = JOptionPane.showInputDialog("Quarta Disciplina: ");
		String n4 = JOptionPane.showInputDialog("Quarta Nota: ");
			
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setEndereco(endereco);
		aluno1.setMae(mae);
		aluno1.setPai(pai);
		aluno1.setRg(rg);
		aluno1.setCpf(cpf);
		aluno1.setEscola(escola);
		aluno1.setN1(Double.valueOf(n1));
		aluno1.setN2(Double.valueOf(n2));
		aluno1.setN3(Double.valueOf(n3));
		aluno1.setN4(Double.valueOf(n4));
		System.out.println("Nome: "+aluno1.getNome());
		System.out.println("Idade: "+aluno1.getIdade());
		System.out.println("Data Nascimento: "+aluno1.getDataNascimento());
		System.out.println("Mãe: "+aluno1.getMae());
		System.out.println("Pai: "+aluno1.getPai());
		System.out.println("RG: "+aluno1.getRg());
		System.out.println("CPF: "+aluno1.getCpf());
		System.out.println("Endereço: "+aluno1.getEndereco());
		System.out.println("Nota 1: "+aluno1.getN1());
		System.out.println("Nota 2: "+aluno1.getN2());
		System.out.println("Nota 3: "+aluno1.getN3());
		System.out.println("Nota 4: "+aluno1.getN4());
		System.out.println("Escola: "+aluno1.getEscola());
		System.out.println("Primeira Nota: "+aluno1.getN1());
		System.out.println("Segunda Nota: "+aluno1.getN2());
		System.out.println("Terceira Nota: "+aluno1.getN3());
		System.out.println("Quarta Nota: "+aluno1.getN4());
		JOptionPane.showMessageDialog(null,"Nome é "+aluno1.getNome());
		JOptionPane.showMessageDialog(null,"Data de Nascimento é "+aluno1.getDataNascimento());
		JOptionPane.showMessageDialog(null, "A idade é: "+aluno1.getIdade());
		JOptionPane.showMessageDialog(null, "Nome da MÃE: "+aluno1.getMae());
		JOptionPane.showMessageDialog(null, "Nome do Pai: "+aluno1.getPai());
		JOptionPane.showMessageDialog(null, "Endereço: "+aluno1.getEndereco());
		JOptionPane.showMessageDialog(null, "Faculdade: "+aluno1.getEscola());
		System.out.println("MÉDIA: "+aluno1.getNotaMedia());
		System.out.println("Resultado: "+(aluno1.getAlunoAprovado()?"APROVADO":"REPROVADO"));
		System.out.println("-----------------------------------------------");
		
		Aluno aluno2 = new Aluno();
		System.out.println(aluno2.toString());
		aluno2.setNome(nome);
			if(aluno2.equals(aluno1)) {
				System.out.println("iguais");
				
			}
			else {
				System.out.println("Diferente");
			}
			
		aluno2.setNome(nome);
		aluno2.setIdade(Integer.valueOf(idade));
		aluno2.setDataNascimento(dataNascimento);
		aluno2.setMae(mae);
		aluno2.setPai(pai);
		aluno2.setEndereco(endereco);
		aluno2.setEscola(escola);
		aluno2.setRg(rg);
		aluno2.setCpf(cpf);
		aluno2.setN1(Double.parseDouble(n1));
		aluno2.setN2(Double.parseDouble(n2));
		aluno2.setN3(Double.parseDouble(n3));
		aluno2.setN4(Double.parseDouble(n4));
		aluno2.setDisciplina1(disciplina1);
		aluno2.setDisciplina2(disciplina2);
		aluno2.setDisciplina3(disciplina3);
		aluno2.setDisciplina4(disciplina4);
		System.out.println("Nome: "+aluno2.getNome());
		System.out.println("Idade: "+aluno2.getIdade());
		System.out.println("Data de Nascimento: "+aluno2.getDataNascimento());
		System.out.println("Mãe: "+aluno2.getMae());
		System.out.println("Pai: "+aluno2.getPai());
		System.out.println("RG: "+aluno2.getRg());
		System.out.println("CPF: "+aluno2.getCpf());
		System.out.println("Endereço: "+aluno2.getEndereco());
		System.out.println("Primeira Nota: "+aluno2.getN1());
		System.out.println("Segunda Nota: "+aluno2.getN2());
		System.out.println("Terceira Nota: "+aluno2.getN3());
		System.out.println("Quarta nota: "+aluno2.getN4());
		System.out.println("Primeira Disciplina: "+aluno2.getDisciplina1());
		System.out.println("Segunda Disciplina: "+aluno2.getDisciplina2());
		System.out.println("Terceira Disciplina: "+aluno2.getDisciplina3());
		System.out.println("Quarta Disciplina: "+aluno2.getDisciplina4());
		System.out.println("Média: "+aluno2.getNotaMedia());
		System.out.println("Resultado: "+(aluno2.getAlunoAprovado()?"APROVADO":"reprovado"));
		
		
		
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();
		Aluno aluno5 = new Aluno();
		Aluno aluno6 = new Aluno();
		Aluno aluno7 = new Aluno();
		Aluno aluno8 = new Aluno();
		Aluno aluno9 = new Aluno();
		Aluno aluno10 = new Aluno();
		
	}

}
