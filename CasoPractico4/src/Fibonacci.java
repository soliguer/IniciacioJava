import java.util.Scanner;

public class Fibonacci {
	int numero;
	int index;
	public Fibonacci(int index) {
		this.index=index;
		try {
		this.numero=getFibonacci(this.index);
		}
		catch (NotNaturalException e) {
			
		}
	}
	
	
	public static int getFibonacci(int index) throws NotNaturalException{
		int resultat=0;
		int prefibonacci=0;
		int preprefibonacci=0;
		if (index <0) {
			throw new NotNaturalException("El número ha de ser major de zero"); 
			
		}
		for (int i=0;i<=index;++i) {
			
			if (i==0) {resultat=0;}
			if (i==1) {resultat=1;prefibonacci=1;}
			else {
				resultat=prefibonacci+preprefibonacci;
				preprefibonacci=prefibonacci;
				prefibonacci=resultat;
			}
				}
		return resultat;
	}
	
	public static int getIndex() {
		System.out.println("Introdueix el numero per a calcular el numero de fibonacci associat:");
		//Llegir numero de l'entrada
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();		
	}
	
	public static void main(String[] args) {
	int i;
	i=getIndex();
	for (int n=0;n<i;n++) {
	Fibonacci fibo=new Fibonacci(n);
	System.out.println(fibo.numero);
	}
	}

}
