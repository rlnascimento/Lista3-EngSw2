import java.util.Date;

public class Cliente{
	private String Nome;
	private int Telefone;
	private int RG;
	private int CPF;
	private String Endereco;
	private Date DataNascimento;
	private Observador desconto;
	
	public boolean VerificaIdade(Date idade){
		//code...
	}
	
	public boolean VerificaCPF(int cpf){
		//code...
	}
	
	//TODO: Fazer getter e setter
	
	public cadastraDesconto(Observador observador){
		this.desconto = observador;
	}
	
	public Observador removeDesconto(){ // TODO: Importar o observador;
		Observador desconto = this.desconto;
		this.desconto = null;
		return desconto;
	}
	
	public void notificarAlteracao(){
		this.desconto.notificar();
	}
	
	public int getIdade(){
		//code...
	}
}

interface Observador{
	public boolean notificar();
}

public class AtualizaDesconto implements Observador{
	private boolean recebeDesconto;
	
	public boolean notificar(int Idade){
		
	} 
}
