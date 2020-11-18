// Waleed Akhtar

public class SemiDetachted extends Property{

    // Attributes
    private int bathrooms;
    private int windows;

    // Constructor
    public SemiDetachted(int bathrooms, int windows, String address, int number_of_bedrooms){
        super(address, number_of_bedrooms);
        this.bathrooms = bathrooms;
        this.windows = windows;
    }

        // Getters
        public int getBathrooms() {
            return bathrooms;
        }

        public int getWindows() {
            return windows;
        }

        // Setters
        public void setBathrooms(int bathrooms) {
            this.bathrooms = bathrooms;
        }

        public void setWindows(int windows) {
            this.windows = windows;
        }

        // toString
        @Override
        public String toString() {
            return "Semi Detachted{ " +
                    "Bathrooms = " + bathrooms +
                    ", Windows = " + windows +
                    ", Address = '" + address + '\'' +
                    ", Number of Bedrooms = " + number_of_bedrooms +
                    ", id = " + id +
                    '}';
        }
}
