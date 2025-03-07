import java.io.PrintStream;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Test53_Timer {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask  task = new TimerTask(){

            int counter = 10;
            @Override
            public void run() {

                if(counter>0){
                    System.out.println(counter+"");
                    counter--;
                }
                else{
                    System.out.println("Happy New Year");
                    timer.cancel();
                }

            }
            
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2025);
        date.set(Calendar.MONTH,Calendar.MARCH);
        date.set(Calendar.DAY_OF_MONTH, 5);
        date.set(Calendar.HOUR_OF_DAY, 16);
        date.set(Calendar.MINUTE, 17);
        date.set(Calendar.SECOND, 40);
        date.set(Calendar.MILLISECOND, 0);

        System.out.println(date.getTime());

        //timer.schedule(task, date.getTime());
        timer.scheduleAtFixedRate(task, date.getTime(), 1000);


        //timer.schedule(task, 0);//miliseconds
    }
}
