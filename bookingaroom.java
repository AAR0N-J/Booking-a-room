import java.util.ArrayList;
import java.util.Scanner;

public class bookingaroom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rooms = sc.nextInt();
        int booked = sc.nextInt();
        if (booked == rooms || rooms == 0){
            System.out.println("too late");
            System.exit(0);
        }
        ArrayList<Integer> bookedRooms = new ArrayList<>();
        for (int i = 0; i < booked; i++) {
            bookedRooms.add(sc.nextInt());
        }
        int randomNumber = (int) Math.floor(Math.random()*(rooms-1+1)+1);
        while (true) {
            if (bookedRooms.contains(randomNumber)) {
                randomNumber =(int) Math.floor(Math.random()*(rooms-1+1)+1);
            } else{
                System.out.println(randomNumber);
                System.exit(0);
            }
        }
    }
}
