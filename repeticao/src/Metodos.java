import java.util.Scanner;
public class Metodos {

    public int soma, num1,num2,nums,maior=0,nums2,media,tabuada;

    public Scanner leitor = new Scanner(System.in);

    public void vinte() {

        for (int i = 1; i <= 20; i++) {

            System.out.println(i);

        }

    }

    public void trinta() {

        for (int i = 1; i <= 30; i++) {

            System.out.println(i);
            soma = i + soma;

        }
        System.out.println(soma);
    }

    public void intervaloNum(){

        System.out.println("Informe o primeiro número: ");
        num1=leitor.nextInt();
        System.out.println("Informe o segundo número: ");
        num2=leitor.nextInt();

        if(num1<num2){

            while(num1<num2){
                num1++;
                System.out.println(num1);
                
            }

        }else if(num2<num1){

            while(num2<num1){

                num2++;
                System.out.println(num2);

            }

        }

    }

    public void MaiorNumCinco(){

        for(int i=1;i<=5;i++){

            System.out.println("Informe o "+i+" número: ");
            nums=leitor.nextInt();

            if(nums>=maior){

                maior=nums;

            }

        }

        System.out.println("O maior número é o: "+maior);

    }

    public void MediaCinco(){

        for(int i=1;i<=5;i++){

            System.out.println("Informe o "+i+" número: ");
            nums2=leitor.nextInt();

            media = nums2+media;

    }

    System.out.println("A media dos números é: "+media/5);

}

    public void impares(){

        for(int i=1;i<=100;i=i+2){

            System.out.println(i);

        }


    }

    public void tabuada(){

        System.out.println("De qual número você deseja ver a tabuada?: ");
        tabuada=leitor.nextInt();

        System.out.println("Soma:");
        
        for(int i = 1; i<=10;i++){

            System.out.println(tabuada+" + "+i+": "+tabuada+i);

                
        }

        System.out.println("Subtração: ");

        for(int i = 1; i<=10;i++){

            System.out.println(tabuada+" - "+i+": "+(tabuada-i));

                
        }


        System.out.println("Multiplicação:");
        for(int i = 1; i<=10;i++){

            System.out.println(tabuada+" X "+i+": "+tabuada*i);

                
        }

        System.out.println("Divisão:");

        for(int i = 1; i<=10;i++){

            System.out.println(tabuada+" / "+i+": "+tabuada/i);

                
        }

    }

}