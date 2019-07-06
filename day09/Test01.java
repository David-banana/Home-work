
public class Test01 {
    public static class FirstThread extends Thread{
        @Override
        public void run(){
            for(int i = 0;i < 10000;i++){
                System.out.println("你好");
            }
        }
    }
    public static class SecondThread extends Thread{
        @Override
        public void run(){
            for(int i = 0;i < 10000;i++){
                System.out.println("再见");
            }
        }
    }
    public static void main(String[] args){
        FirstThread ft = new FirstThread();
        SecondThread st = new SecondThread();
        ft.start();
        st.start();
    }
}