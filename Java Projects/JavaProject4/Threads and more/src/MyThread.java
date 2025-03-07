public class MyThread extends Thread{
    
    @Override
    public void run(){
        if(this.isDaemon()){
            System.out.println("This thread is a  deamond");
        }
        else{
            System.out.println("This thread is not a deamond");

        }
    }

}
