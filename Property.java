// Waleed Akhtar

public class Property {

    // Attributes
    protected String address;
    protected int number_of_bedrooms;
    protected int id;
    private static int counter = 0;

    // Constructor
    public Property(String name, int number_of_bedrooms){
        this.address = name;
        this.number_of_bedrooms = number_of_bedrooms;
        id = counter;
        counter++;
    }

    // Getters
    public int getId(){
        return id;
    }

    public String getAddress(){
        return this.address;
    }

    public int getNumber_of_bedrooms(){
        return this.number_of_bedrooms;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber_of_bedrooms(int number_of_bedrooms) {
        this.number_of_bedrooms = number_of_bedrooms;
    }

    //toString
    @Override
    public String toString() {
        return "Property{ " +
                "Address = '" + address + '\'' +
                ", Number of bedrooms = " + number_of_bedrooms +
                ", id = " + id +
                '}';
    }
}
