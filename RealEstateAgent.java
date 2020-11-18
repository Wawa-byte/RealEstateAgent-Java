// Waleed Akhtar

import java.util.ArrayList;

public class RealEstateAgent {

    // Attributes
    private String name;
    private int id;
    ArrayList<Property> property_list = new ArrayList<Property>();

    public RealEstateAgent(String name, int id){
        this.name = name;
        this.id = id;
    }

    // Getters
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }


    public void addProperty(Property newProperty){
        property_list.add(newProperty);
    }

    // The find property for ID
    public Property findProperty(int id){
        Property returnProperty = null;

        for (Property temp_property : property_list) {
            if (temp_property.getId() == id){ // Check if id entered matches with property id
                returnProperty = temp_property; // return property is equal to the property entered
                break;
            }
        }
        return returnProperty;
    }

    // The find property for the address
    public Property findProperty(String address){
        Property returnProperty = null;

        for (Property address_property : property_list){
            if (address_property.getAddress().equals(address)){ // Check if name entered matches with property address
                returnProperty = address_property; // return property with entered address if they match
                break;
            }
        }
        return returnProperty;
    }

    public void showAllProperties(){
        for (Property property_print : property_list){
            System.out.println(property_print.toString());
            System.out.println();
        }
    }

    // toString
    @Override
    public String toString() {
        return "RealEstateAgent{ " +
                "Name = '" + name + '\'' +
                ", id = " + id +
                ", Property list = " + property_list +
                '}';
    }
}
