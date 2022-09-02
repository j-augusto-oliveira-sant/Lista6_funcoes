package exercicios_resolvidos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//CLASSE MAIN EXERCICIOS
		Scanner scan = new Scanner(System.in);
		System.out.println("#########################");
		System.out.println("DIGITE NUMERO EXERCICIO: ");
		int escolha = scan.nextInt();
		if (escolha == 1) {
			ex1();
		} else if (escolha==2) {
			ex2();
		} else if (escolha==3) {
			ex3();
		} else if (escolha==4) {
			ex4();
		} else if (escolha==5) {
			ex5();
		} else if (escolha==6) {
			ex6();
		} else if (escolha==7) {
			ex7();
		} else if (escolha==8) {
			ex8();
		} else if (escolha==9) {
			ex9();
		} else if (escolha==10) {
			ex10();
		} else if (escolha==11) {
			ex11();
		} else if (escolha==12) {
			ex12();
		} else if (escolha==13) {
			ex13();
		}
		System.out.println("#########################");
		scan.close();	
	}
	private static void ex1() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(Funcoes_exercicios.Show_n(n));
		scan.close();
	}
	private static void ex2() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(Funcoes_exercicios.Show_n_vert(n));
		scan.close();
	}
	private static void ex3() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println(Funcoes_exercicios.soma(a, b, c));
		scan.close();
	}
	private static void ex4() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(Funcoes_exercicios.is_positive(a));
		scan.close();
	}
	private static void ex5() {
		Scanner scan = new Scanner(System.in);
		double custo = scan.nextInt();
		double taxaImposto = scan.nextInt();
		System.out.println(Funcoes_exercicios.soma_imposto(taxaImposto, custo));
		scan.close();
	}
	private static void ex6() {
		Scanner scan = new Scanner(System.in);
		int hours=1;
		while (hours!=0){
			System.out.println("Horas: ");
			hours = scan.nextInt();
			System.out.println("Minutos: ");
			int minutes = scan.nextInt();
			System.out.println(Funcoes_exercicios.tim24to12(hours, minutes));
		}
		scan.close();
	}
	private static void ex7() {
		Scanner scan = new Scanner(System.in);
		double valor_prest = 1;
		while (valor_prest!=0){
			System.out.println("Valor Prestacao: ");
			valor_prest = scan.nextDouble();
			System.out.println("Dias atrasado: ");
			double dias = scan.nextDouble();
			System.out.println("Valor a pagar: R$"+Funcoes_exercicios.valorPagamento(valor_prest, dias));
		}
		scan.close();
	}
	private static void ex8() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Numero: ");
		int num = scan.nextInt();
		System.out.println(Funcoes_exercicios.countDigits(num));
		scan.close();
	}
	private static void ex9() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Numero para inverter: ");
		int num = scan.nextInt();
		System.out.println(Funcoes_exercicios.reverseNumber(num));
		scan.close();
	}
	private static void ex10() {
		int turno = 0,dado,ponto=0;
		boolean finished = false;
		while (finished==false){
			dado = Funcoes_exercicios.randomNumber(2, 12);
			System.out.println("|Dado: "+dado);
			if (turno==0 && (dado==7 || dado==11)){
				System.out.println("Natural! GANHOU!");
				finished=true;
			} else if (turno==0 && (dado==2||dado==3||dado==12)) {
				System.out.println("Craps! PERDEU!");
				finished=true;
			} else if (turno==1 && (dado>=4&&dado<=10)) {
				ponto = dado;
			}
			if (turno>1 && dado==ponto){
				System.out.println("GANHOU");
				finished=true;
			} else if (turno>1 && dado==7){
				System.out.println("PERDEU!");
				finished=true;
			}
			turno+=1;
		}
	}
	private static void ex11() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe data dd/mm/aaaa: ");
		String data = scan.nextLine();
		System.out.println(Funcoes_exercicios.data_por_extenso(data));
		
		scan.close();
	}
	private static void ex12() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Palavra: ");
		String palavra = scan.nextLine();
		System.out.println(Funcoes_exercicios.shuffle_word(palavra));
		
		scan.close();
	}
	private static void ex13() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Linhas: ");
		int linha = scan.nextInt();
		System.out.println("Colunas: ");
		int coluna = scan.nextInt();
		System.out.println(Funcoes_exercicios.rectangle(linha, coluna));
		scan.close();
	}
}
