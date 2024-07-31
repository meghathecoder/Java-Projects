public class Flat{
    private int squareFeet;
    private double price;
    private int floors;
    private int rooms;

    public Flat(int squareFeet, double price, int floors, int rooms){
        this.squareFeet=squareFeet;
        this.price=price;
        this.floors=floors;
        this.rooms=rooms;
    }
    public double flatPrice(){
        return squareFeet*price;
    }
    public String toString(){
        return "Square feet:\t\t"+squareFeet+"\nPrice:\t\t\t"+price+"\nFloors:\t\t\t"+floors+"\nRooms:\t\t\t"+rooms;
    }
}