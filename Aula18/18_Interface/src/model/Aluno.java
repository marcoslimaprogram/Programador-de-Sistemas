package model;

public class Aluno extends Usuario implements IUsuario {

	private int matriculaAluno;
	private String nome;
	private String turno;
	private String turma;

	public int getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(int matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	@Override
	public void mostrar() {
		System.out.println("Infomacoes do aluno");
		System.out.println("Login: " + super.getLogin());
		System.out.println("Senha: *****");

		System.out.println("Matricula: " + matriculaAluno);
		System.out.println("Nome: " + nome);
		System.out.println("Turno: " + turno);
		System.out.println("Turma: " + turma);
	}

	public Aluno() {
		super();
	}

	public Aluno(String login, String senha, int tipo, String nome, String turno, String turma, int matriculaAluno) {

		super(login, senha, tipo);
		this.matriculaAluno = matriculaAluno;
		this.nome = nome;
		this.turno = turno;
		this.turma = turma;

	}

	@Override
	public boolean validarLogin(String login, String Senha) {
		if (getLogin().equals(login) && getSenha().equals(Senha)) {
			return true;

		}
		return false;

	}

}
