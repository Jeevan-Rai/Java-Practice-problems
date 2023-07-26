package Task;

import java.util.Calendar;

public class Greeting {

	public static void main(String[] args) {
		
		
		Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        String greeting;
        if (hour >= 5 && hour < 12) {
            greeting = "Good morning!";
        } else if (hour >= 12 && hour < 17) {
            greeting = "Good afternoon!";
        } else {
            greeting = "Good evening!";
        }

        System.out.println(greeting);
    }

	}