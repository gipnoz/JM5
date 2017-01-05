package JM5;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        for (Room a:controller.requestRooms(1000, 2, "Kyiv", "Continental")){
            System.out.println(a.toString());
        }
        for (Room a:controller.requestRooms(300, 5, "Grand Canyon Luxury Resort & SPA 5*", "Zaporogye")){
            System.out.println(a.toString());
        }
        for (Room a:controller.requestRooms(200, 2, "Odessa", "BlackSea")){
            System.out.println(a.toString());
        }
        System.out.println(Arrays.toString((controller.check(new TripAdvisorAPI(), new GoogleAPI())).toArray()));
        System.out.println(Arrays.toString((controller.check(new TripAdvisorAPI(), new BookingComAPI())).toArray()));
        System.out.println(Arrays.toString((controller.check(new BookingComAPI(), new GoogleAPI())).toArray()));
    }
}
