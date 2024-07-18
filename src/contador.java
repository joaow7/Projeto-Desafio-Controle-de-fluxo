import java.util.Scanner;

public class contador {

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        int parametroUm = input.nextInt();
        int parametroDois = input.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e){

            System.out.println(e.getMessage());

        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){

            throw new ParametrosInvalidosException();

        }else{

            int contagem = parametroDois - parametroUm;

            for(int contador = 0; contador < contagem; contador++){
                System.out.println("estamos na iteração : " + contador);
            }

        }
    }
}
