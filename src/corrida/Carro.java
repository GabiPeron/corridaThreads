package corrida;

import java.util.Random;

public class Carro extends Thread {
	private Corrida corrida;
	private int distancia = 0;
	private String nome;
	private Random random;
	
	public Carro(String nome, Corrida corrida) {
		super();
		this.nome = nome;
		this.corrida = corrida;
		this.random = new Random();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getDistancia() {
		return this.distancia;
	}
	
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	public void correr(int distancia) {
		this.distancia += distancia;
	}
	
	public void run() {
		System.out.println(this.nome + " inicial: " + this.distancia);
		
		while (this.distancia < this.corrida.getDistancia()) {
			this.correr(random.nextInt(20));
			
			System.out.println(this.nome + " atual: " + this.distancia);
		}
		
		System.out.println(this.nome + " Finalizou a corrida com: " + this.distancia + " metros de distância");
	}
}
