package challenge;

import java.util.LinkedList;
import java.util.*;

public class TestMain {
    public static void main(String[] args){
        LinkedList<Place> places = new LinkedList<>();
        places.add(new Place("Sydney",0));
        addPlace(places, new Place("Melbourne", 877));
        addPlace(places, new Place("Brisbane", 917));
        addPlace(places, new Place("Adelaide", 1374));
        addPlace(places, new Place("Alice Springs", 2771));
        addPlace(places, new Place("Perth", 3923));
        addPlace(places, new Place("Darwin", 3972));
        ListIterator<Place> iterator = places.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean shutDown = false;
        boolean forward = true;
        printMenu();
        while(!shutDown){
            System.out.print("Enter your choice: ");
            String input = scanner.nextLine().toUpperCase();
            switch(input){
                case "F":
                    if (!forward){
                        if (iterator.hasNext()){
                            iterator.next();
                        }
                        forward = true;
                    }
                    if (iterator.hasNext()) {
                        Place place = iterator.next();
                        System.out.println("Forward to: " + place);
                    } else {
                        System.out.println("end of the itinerary!");
                        forward = false;
                    }
                    break;


            case "B":
                if (forward) {

                    if (iterator.hasPrevious()) {
                        iterator.previous();
                    }
                    forward = false;
                }

                if (iterator.hasPrevious()) {
                    Place place = iterator.previous();
                    System.out.println("BACKWARD to: " + place);
                } else {
                    System.out.println("beginning of the itinerary!");
                    forward = true;
                }
                break;

        case "L":
        System.out.println("==============================");
        for (Place place : places) {
            System.out.println(place);
        }
        System.out.println("===============================");
        break;

        case "M":
        printMenu();
        break;

        case "Q":

        shutDown = true;
        System.out.println("Goodbye!");
        break;

        default:
        System.out.println("Invalid choice. Please try again.");
        break;
    }
}

        scanner.close();
    }



    public static void addPlace(LinkedList<Place> places,Place newPlace){
        if (places.contains(newPlace)){
            System.out.println(newPlace.getName()+" already exist!");
            return;
        }
        ListIterator<Place> iterator = places.listIterator();
        while(iterator.hasNext()){
            Place currentIterator = iterator.next();
            if (newPlace.getDistanceSydney() < currentIterator.getDistanceSydney()) {
                iterator.previous();
                iterator.add(newPlace);
                return;
            }
        }
        places.add(newPlace);

    }
    private static void printMenu() {
        System.out.println("====================================");
        System.out.println("Available actions (select word or letter):");
        System.out.println("  (F)orward");
        System.out.println("  (B)ackward");
        System.out.println("  (L)ist Places");
        System.out.println("  (M)enu");
        System.out.println("  (Q)uit");
        System.out.println("=====================================");
    }
}
