public class LambdaRunnable{
    public static void main(String[] args){
        
        
        new Thread(new Runnable(){
            public void run(){
                System.out.println("Ola mundo!");
            }
        }).run();

        new Thread(()->System.out.println("Ola Mundo")).run();
    }
}