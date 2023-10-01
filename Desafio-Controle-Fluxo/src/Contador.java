import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
            System.out.println("o segundo parametro deve ser maior do que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm>parametroDois){
            throw new ParametrosInvalidosException();
        }
		
		int contagem = parametroDois - parametroUm;
		for(int indice = 0;indice <= contagem;indice++){
            System.out.println("imprimindo o numero "+(indice+1)+": " +(parametroUm+indice));
        }
    }
}
