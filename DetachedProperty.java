// Waleed Akhtar

public class DetachedProperty extends Property {

    // Attributes
    private int gardenLength;
    private int parking_spots;

    // Constructor
    public DetachedProperty(int gardenLength, int parking_spots, String address, int number_of_bedrooms) {
        super(address, number_of_bedrooms);
        this.gardenLength = gardenLength;
        this.parking_spots = parking_spots;
    }

        // Getters
        public int getGardenLength() {
            return gardenLength;
        }

        public int getParking_spots() {
            return parking_spots;
        }

        // Setters
        public void setGardenLength(int gardenLength) {
            this.gardenLength = gardenLength;
        }

        public void setParking_spots(int parking_spots) {
            this.parking_spots = parking_spots;
        }

        // toString
        @Override
        public String toString() {
            return "Detached Property{ " +
                    "Garden length = " + gardenLength +
                    ", Parking spots = " + parking_spots +
                    ", Address = '" + address + '\'' +
                    ", Number of bedrooms = " + number_of_bedrooms +
                    ", id = " + id +
                    '}';
        }
}