import java.util.Scanner;
import java.util.ArrayList;

public class Metodos {

    public int num1, num2, posi, nums, nums1,nums2,nums3;
    public String letra,turno;
    public float nota1,nota2,media;

    ArrayList<Integer> array = new ArrayList<Integer>();    

   public Scanner leitor = new Scanner(System.in);

    public void maiorNum() {

        System.out.println("Informe o primeiro número: ");
        num1 = leitor.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = leitor.nextInt();

        if (num1 > num2) {

            System.out.println("O mair número é: " + num1);

        } else if (num2 > num1) {

            System.out.println("O maior Numero é: " + num2);

        } else {

            System.out.println("Os dois números são iguais.");

        }

    }

    public void posi(){

        System.out.println("Informe um número: ");
        posi=leitor.nextInt();
    
        if(posi>0){

            System.out.println("O número informado ("+posi+") é positivo.");

        }else{

            System.out.println("O número informado é ("+posi+" é negativo.");

        }
       
       

    }

    public void lerNum(){

        for(int i=1; i<=3;i++){

            System.out.println("Informe o "+i+" número: ");
            nums=leitor.nextInt();

            array.add(nums);
        }

        if(array.get(0)>array.get(1) && array.get(0)>array.get(2)){
        
            System.out.println("O maior número é o número "+array.get(0));

        }else if(array.get(1)>array.get(0) && array.get(1)>array.get(2)){

            System.out.println("O maior número é o "+array.get(1));

        }else{

            System.out.println("O maior número é o "+array.get(2));

        }


    }

        public void letra(){

                
            leitor.nextLine();
            System.out.println("Digite M ou F");
            letra=leitor.nextLine();

            if(letra.substring(0).equalsIgnoreCase("M")){

                System.out.println("Sexo: Masculino.");

            }else if(letra.substring(0).equalsIgnoreCase("F")){

                System.out.println("Sexo: Feminino.");

            }

        }

        public void turno(){

            System.out.println("Informe o seu turno: M-matutino ou V-Vespertino ou N- Noturno.");
            turno=leitor.next();

            switch(turno){

                case "m-matutino":
                System.out.println("Bom dia!");
                break;

                case "v-vespertino":
                System.out.println("Boa tarde!");
                break;

                case "n-noturno":
                System.out.println("Boa noite!");
                break;

                default:
                System.err.println("Valor inválido!");


            }


        }

        public void maiorMenor(){


                System.out.println("Informe o primeiro número: ");
                nums1=leitor.nextInt();
                System.out.println("Informe o segundo número: ");
                nums2=leitor.nextInt();
                System.out.println("Informe o terceiro número: ");
                nums3=leitor.nextInt();

                if(nums1>nums2&&nums1>nums3){

                    System.out.println("O maior número informado é o: "+nums1);

                }else if(nums2>nums1&&nums2>nums3){

                    System.out.println("O maior número informado é o: "+nums2);

                }else{

                    System.out.println("O maior número informado é o: "+nums3);

                }

        }

        public void media(){

            System.out.println("Informe a primeira nota: ");
            nota1=leitor.nextFloat();
            System.out.println("Informe a segunda nota: ");
            nota2=leitor.nextFloat();

            media = (nota1+nota2)/2;
            
            if(media>=7){

                System.out.println("O aluno foi aprovado! ("+media+")");

            }else if(media<7){

                System.out.println("O aluno foi reprovado! ("+media+")");

            }else if(media==10){

                System.out.println("O aluno foi aprovado com distinção! ("+media+")");

            }


        }


    }



