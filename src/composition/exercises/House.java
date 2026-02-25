package composition.exercises;

/**
 1. Create class Room with fields: length, width.
 2. Add method getArea() in Room.
 3. Create class House that HAS-A Room.
 4. Add method printRoomArea() in House to delegate to Room.
*/
public class House {
    Room room;      //  House HAS-A room

    void printRoomArea() {
        System.out.println(room.length * room.width);
    }

//    Separation of Concerns principle
//    Loosely Coupling    good
//    Tight coupling      bad
}

class Room {

    Double length;
    Double width;

    Double balcony;

    Double getArea() {
        return (length * width);
    }
}