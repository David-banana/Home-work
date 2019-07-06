
public class Test02 {
    public static class FirstThread implements Runnable{
        @Override
        public void run() {
            for(int i = 0;i < 1000; i++)
                System.out.println("你好");
        }
    }
    public static class SecondThread implements Runnable{
        @Override
        public void run() {
            for(int i = 0;i < 1000;i ++){
                System.out.println("再见");
            }
        }
    }
    public static void main(String[] args){
        Thread t1 = new Thread(new FirstThread());
        Thread t2 = new Thread(new SecondThread());
        t1.start();
        t2.start();
    }
}