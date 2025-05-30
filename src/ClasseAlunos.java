
public class ClasseAlunos {
	String nomeAT;
	float notaAT;
	String cursoAT;
	
	public void mostrarNomeMet() {
		System.out.println(this.nomeAT);
	}
	public void mostrarNotaMet() {
		System.out.println(this.notaAT);
	}
	public void mostrarCursoMet() {
		System.out.println(this.cursoAT);
	}
	public void receberNomeMet(String nomePar) {
		this.nomeAT = nomePar;
	}
	public void receberNotaMet(float notaPar) {
		this.notaAT = notaPar;
	}
	public void receberCursoMet(String cursoPar) {
		this.cursoAT = cursoPar;
	}
	
}












