package lambdas;

public class Threads {

    public static void main(String[] args) {

        Runnable t1 = new Trabalho1();

        Runnable t2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++){
                    System.out.println("Tarefa #02");
                    try{
                        Thread.sleep(100);
                    } catch (Exception e){

                    }
                }
            }
        };

        Runnable t3 = () -> {
            for (int i = 0; i < 100; i++){
                System.out.println("Tarefa #03");
                try{
                    Thread.sleep(100);
                } catch (Exception e){

                }
            }
        };

        Runnable t4 = Threads::t4;

        Thread trabalho1 = new Thread(t1);
        Thread trabalho2 = new Thread(t2);
        Thread trabalho3 = new Thread(t3);
        Thread trabalho4 = new Thread(t4);

        trabalho1.start();
        trabalho2.start();
        trabalho3.start();
        trabalho4.start();


    }

    static void t4() {
        for (int i = 0; i < 100; i++){
            System.out.println("Tarefa #04");
            try{
                Thread.sleep(100);
            } catch (Exception e){

            }
        }
    }
}
