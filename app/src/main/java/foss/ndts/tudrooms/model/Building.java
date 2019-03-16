package foss.ndts.tudrooms.model;

public class Building {
    public final Area Area;
    public final String Number;
    public final String Address;
    public final String[] Names;

    public Building(Area area, String number, String address, String... names) {
        Area = area;
        Number = number;
        Address = address;
        Names = names;
    }
}
