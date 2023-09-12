public class Product {


    private String ID;
    private String name;
    private String description;
    private double cost;

    public Product(String ID, String name, String description, double cost) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getfName() {
        return name;
    }

    public void setfName(String fName) {
        this.name = fName;
    }

    public String getlName() {
        return description;
    }

    public void setlName(String lName) {
        this.description = lName;
    }

    public double getTitle() {
        return cost;
    }

    public void setTitle(double title) {
        this.cost = title;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", fName='" + name + '\'' +
                ", lName='" + description + '\'' +
                ", title='" + cost + '\'' +
                '}';
    }

    public String toCSV()
    {
        return ID + ", " + name + ", " + description + ", " + cost ;
    }

    public String getName(){return name;}

    public String getDescription() {return name + ": " + description;}

    public double getCost() {return cost;}

}





