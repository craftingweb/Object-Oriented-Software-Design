public class House {
    private int bedrooms;
    private int kitchens;
    private int bathrooms;
    private int windows;
    private int doors;
    public House() {};

    public void setBedrooms(int bedrooms){
        if ( bedrooms < 0 ) throw new IllegalArgumentException("Number of bedrooms can not be negative number");
        this.bedrooms = bedrooms;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setKitchens(int kitchens) {
        if ( kitchens < 0 ) throw new IllegalArgumentException("Number of kitchens can not be negative number");
        this.kitchens = kitchens;
    }

    public int getKitchens() {
        return kitchens;
    }

    public void setBathrooms(int bathrooms) {
        if ( bathrooms < 0 ) throw new IllegalArgumentException("Number of bathrooms can not be negative number");
        this.bathrooms = bathrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setWindows(int windows) {
        if ( windows < 0 ) throw new IllegalArgumentException("Number of windows can not be negative number");
        this.windows = windows;
    }

    public int getWindows() {
        return windows;
    }

    public void setDoors(int doors) {
        if ( doors < 0 ) throw new IllegalArgumentException("Number of windows can not be negative number");
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }
}
