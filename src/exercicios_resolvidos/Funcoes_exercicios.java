package exercicios_resolvidos;
import java.util.Random;

public class Funcoes_exercicios {
	//ex1
	public static StringBuilder Show_n(int n) {
		StringBuilder saida = new StringBuilder();
		for (int i =0;i<=n;i++) {
			for (int j =0;j<i;j++) {
				saida.append(i+" ");
			}
			saida.append("\n");
		}
		return saida;
	}
	//ex2
	public static StringBuilder Show_n_vert(int n) {
		//Mostra verticalmente
		StringBuilder saida = new StringBuilder();
		for (int i=0;i<=n;i++) {
			for (int j=0;j<i;j++) {
				saida.append((j+1)+" ");
			}
			saida.append("\n");
		}
		return saida;
	}
	//ex3
	public static double soma(double a,double b, double c) {
		return a+b+c;
	}
	//ex4
	public static String is_positive(double a) {
		if (a>0) {
			return "P";
		} else {
			return "N";
		}
	}
	//ex5
	public static double soma_imposto(double taxaImposto,double custo) {
		return custo+(custo*taxaImposto);
	}
	//ex6
	public static String tim24to12(int hours,int minutes){
		String period;
		if (hours>12){
			hours = hours-12;
			period = "P.M";
		} else {
			period = "A.M";
		}
		String saida = hours+":"+minutes+" "+period;
		return saida;
	}
	//ex7
	public static double valorPagamento(double value,double days){
		if (days==0){
			return value;
		} else {
			value = value+(value*0.03)+(days*(value*0.001));
		}
		return value;
	}
	//ex8
	public static int countDigits(int num) {
		String snum = String.valueOf(num);
		return snum.length();
	}
	//ex9
	public static int reverseNumber(int num) {
		StringBuilder snum = new StringBuilder();
		snum.append(String.valueOf(num));
		String result = snum.reverse().toString();
		return Integer.parseInt(result);
	}
	//ex10
	public static int randomNumber(int first,int last){
		Random random = new Random();
		return random.nextInt(first, last);
	}
	//ex11
	public static String data_por_extenso(String date) {
		String[] meses = {"Janeiro","Fevereiro","Marco","Abril","Maio",
		"Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
		String[] vet_date = date.split("/");
		String dd = vet_date[0];
		int mm = Integer.parseInt(vet_date[1]);
		String mm_extenso = meses[mm-1];
		String aaaa = vet_date[2];
		String final_string = String.format("%s de %s de %s",dd,mm_extenso,aaaa);
		return final_string;
	}
	//ex12
	public static String shuffle_word(String word) {
		Random random = new Random();
		String[] letters = word.split("");
		int rand_pos;
		for (int i=0;i<word.length();i++){
			rand_pos = random.nextInt(0,word.length());
			String temp = letters[i];
			letters[i] = letters[rand_pos];
			letters[rand_pos] = temp;
		}
		return String.join("",letters);
	}
	//ex13
	public static String rectangle(int row,int column) {
		StringBuilder new_rectangle = new StringBuilder();
		for (int i=0;i<row;i++){
			for (int j=0;j<column;j++){
				if ((i==0&&j==0)||(i==(row-1)&&j==0)||(i==0&&j==(column-1))||(i==(row-1)&&j==(column-1))){
					//corners
					new_rectangle.append("+");
				} else if (j==0 || j==(column-1)){
					new_rectangle.append("|");
				} else if (i==0 || i==(row-1)){
					new_rectangle.append("-");
				} else {
					new_rectangle.append(" ");
				}
			}
			new_rectangle.append("\n");
		}
		return new_rectangle.toString();
	}
}
