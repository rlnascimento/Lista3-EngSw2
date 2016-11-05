
import java.util.List; 
import java.util.Date;

public class Pagamento{
	private int Cliente;
	private double ValorTotal;
	private Date Data; 

	public void EfetuarPagamento(){
		//code...
	}

	private void setCliente(int cliente){
		this.Cliente = cliente;
	}
	
	private int getCliente(){
		return this.Cliente;
	}
	
	private void setValorTotal(double valor){
		this.ValorTotal = valor;
	}
	
	private double getValorTotal(){
		return this.ValorTotal;
	}
	
	private void setData (Date data){
		this.Data = data;
	}
	
	private Date getData (){
		return this.Data;
	}
}


public class ComponenteComposite extends Pagamento{

	private List<Pagamento> listaPagamento = new List<Pagamento>();

	public void add(Pagamento pag){
		this.listaPagamento.add(pag);
	}

	public void ComponenteComposite(){
		//code...
	}

}

public class Cartao extends ComponenteComposite{
	private int Conta;
	private int SenhaCartao;
	private int TipoConta;
	
	public boolean ValidaConta(int conta){
		//code...
	}
	
	public boolean ValidaSenhaCartao(int senhaCartao){
		//code...
	}
	
	public void setConta(int conta){
		this.Conta = conta;
	}
	
	public void setSenhaCartao(int senhaCartao){
		this.SenhaCartao = senhaCartao;
	}
	
	public void setTipoConta(int tipoConta){
		this.TipoConta = tipoConta;
	}
	
	public int getConta(){
		return this.Conta;
	}
	
	public int getSenhaCartao(){
		return this.SenhaCartao;
	}
	
	public int getTipoConta(){
		return this.TipoConta;
	}
}

public class Dinheiro extends Pagamento{
	public double Desconto (double ValorTotal){
		//code...
	}
}