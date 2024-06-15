package Estruturas_Condicionais;

public class Main {
    public static void main(String[] args){

        int nota = 80;
        String graduacao = "B";

        if (nota >= 70) {
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Aluno Reprovado");
        }

        // A 80 B 70 C 60 D 0

        if (nota >= 80){
            System.out.println("Graduação A");
        }
        else if (nota < 80 && nota >= 70){
            System.out.println("Graduação B");
        }
        else if (nota < 70 && nota >= 60) {
            System.out.println("Graduação C");
        }
        else if (nota < 60 && nota >= 0){
            System.out.println("Graduação D");
        }
        else {
            System.out.println("Nota Invalida!");
        }

        switch (graduacao) {
            case "A" :
            case "B" :
                System.out.println("Aluno Aprovado!");
                break;
            case "C" :
            case "D" :
                System.out.println("Aluno reprovado!");
                break;
            default:
                System.out.println("Graduaçao Inválida");
        }
    }
}
