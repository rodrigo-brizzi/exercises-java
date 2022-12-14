package excecao;

public class Causa {

    public static void main(String[] args) {
        try{
            metodoA(null);
        } catch (Exception e){
            //e.printStackTrace();
            if(e.getCause() != null){
                System.out.println(e.getCause().getMessage());
            }
        }

        //metodoA(null);
    }

    static void metodoA(Aluno aluno){
        try{
            metodoB(aluno);
        } catch (Exception causa){
            throw new IllegalArgumentException(causa);
        }
    }

    static void metodoB(Aluno aluno){
        if(aluno == null){
            throw new NullPointerException("Aluno está NULLLOOOO!!!");
        }
    }
}
