import java.util.ArrayList;
import java.util.Scanner;

public class ConcertTickets {
    public static void main(String[] args) {
        ArrayList<String> concertList = new ArrayList<String>();
        concertList.add("Taylor Swift");
        concertList.add("BlackBear");
        concertList.add("Bruno Mars");
        String list = concertList.toString().replace("[", "").replace("]", "");

        ArrayList<String> showTimes = new ArrayList<String>();
        showTimes.add("2PM");
        showTimes.add("5PM");
        showTimes.add("8PM");
        showTimes.add("11PM");
        String showTimeList = showTimes.toString().replace("[", "").replace("]", "");
        Scanner sc = new Scanner(System.in);
        String choice;
        System.out.println(
                "What concert would you like to see? >>>" + "\n" + list + "\n" + "Night Shows: " + showTimeList);
        if (choice == "Taylor Swift") {
            System.out.println("Shake it off-->> to to your sit.");
        } else if (choice == "Bruno Mars") {
            System.out.println("I hope he buys you flowers -->> and your ticket.");
        } else if (choice == "BlackBear") {
            System.out.println("I dont have a play on words for this one but your ticket price is.");
        } else {
            System.out.println("Thats not a singer here.");
        }
        sc.close();
    }
}