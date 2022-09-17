import java.util.Scanner;
import java.util.ArrayList;

public class Metodos {

    public Scanner leitor = new Scanner(System.in);

    public ArrayList<Integer> arraylist = new ArrayList<Integer>();

    public int numero;
    public int num1, num2, soma;
    public int nota1, media, mediafinal;
    public int num;
    public double horas,salario;
    public String nome;

    public void olaMundo() {

        System.out.println("Alô, mundo!");

    }

    public void mostrarNum() {

        System.out.print("Informe o número: ");
        numero = leitor.nextInt();

        System.out.println(numero);

    }

    public void somar() {

        System.out.println("Informe o primeiro número: ");
        num1 = leitor.nextInt();

        System.out.println("Informe o Segundo número: ");
        num2 = leitor.nextInt();
        soma = num1 + num2;

        System.out.println("A soma entre os números " + num1 + " e " + num2 + " é: " + soma);
    }

    public void media() {

        for (int i = 4; i > 0; i--) {

            System.out.println("Informe a " + i + "° nota:");
            media = leitor.nextInt();

            arraylist.add(media);

        }

        nota1 = arraylist.get(0) + arraylist.get(1) + arraylist.get(2) + arraylist.get(3);
        mediafinal = nota1 / 4;

        System.out.println("A média do aluno(a) é: "+mediafinal);

    }

    public void antecessorNum(){

        System.out.println("Informe o número: ");
        num = leitor.nextInt();

        System.out.println("O antecessor do número "+num+ " é: "+(num-1));

    }

    public void salario(){

        System.out.println("Informe quanto você ganha por hora: ");
        salario=leitor.nextFloat();

        System.out.println("Informe quantas horas que você trabalhou no mês");
        horas=leitor.nextFloat();

        System.out.println("O salário será de: "+(salario*horas));

    }

    public void boaNoite(){

        leitor.nextLine();
        System.out.println("Informe o seu nome: ");
        nome=leitor.nextLine();
        System.out.println("Boa noite, "+nome+"!");
        
    }


}
