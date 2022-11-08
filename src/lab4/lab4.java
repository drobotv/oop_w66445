package lab4;
import java.lang.Math;
import java.time.LocalDate;

public class lab4 {

    public static void main(String[] args) {

//        //ZAD1
//        Rectangle rectangle = new Rectangle(10, 20);
//        System.out.println("Area:" +  rectangle.getArea());
//        System.out.println("Perimeter:" +  rectangle.getPerimeter());
//        System.out.println("Diagonal:" +  rectangle.getDiagonal());

        //ZAD2
//        Building building = new Building("Bud", LocalDate.of(2020, 12,9), 15);
//        Building building1 = new Building("Bud1", LocalDate.of(2010, 5,1), 12);
//        Building building2 = new Building("Bud2", LocalDate.of(2005, 8,24), 9);
//
//        building.printInfo();
//        building1.printInfo();
//        building2.printInfo();
//
//        System.out.println("Year diff: ");
//        System.out.println(building.getYearDiff());
//        System.out.println(building1.getYearDiff());
//        System.out.println(building2.getYearDiff());


        //ZAD3
//        Species species = new Species("Jenot", "Ssak", 20, 30);
//        Species species1 = new Species("Niedźwiedź", "Ssak", 25, 35);
//        Species species2 = new Species("Lodówka", "Ptak", 30, 40);
//
//        Species speciesCopy = species.copy();
//
//        species.printSpecies();
//        species1.printSpecies();
//        species2.printSpecies();
//        speciesCopy.printSpecies();


    }

    //ZAD1
    public static class Rectangle {
        private double length;
        private double width;

        public Rectangle(double a, double b) {
            this.length = a;
            this.width = b;
        }

        public double getArea(){
            return this.length * this.width;
        }

        public double getPerimeter(){
            return 2 * this.length + 2 * this.width;
        }

        public double getDiagonal(){
            return Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.width, 2));
        }
    }

    //ZAD2
    public static class Building{
        private String name;
        private final LocalDate year;
        private int floors;

        public Building(String name, LocalDate year, int floors) {
            this.name = name;
            this.year = year;
            this.floors = floors;
        }

        public void printInfo(){
            System.out.println("Building information:");
            System.out.println("Name: " + this.name);
            System.out.println("Year: " + this.year.getYear());
            System.out.println("Floors: " + this.floors);
        }

        public int getYearDiff(){
            return LocalDate.now().getYear() - this.year.getYear();
        }
    }

    //ZAD3
    public static class Species{
        String speciesName;
        String speciesType;
        int numberOfChromosomes_2n;
        int numberOfChromosomes_x;

        public Species(Species species){
            this.speciesName = species.speciesName;
            this.speciesType = species.speciesType;
            this.numberOfChromosomes_2n = species.numberOfChromosomes_2n;
            this.numberOfChromosomes_x = species.numberOfChromosomes_x;
        }

        public Species(String speciesName, String speciesType, int numberOfChromosomes_2n, int numberOfChromosomes_x) {
            this.speciesName = speciesName;
            this.speciesType = speciesType;
            this.numberOfChromosomes_2n = numberOfChromosomes_2n;
            this.numberOfChromosomes_x = numberOfChromosomes_x;
        }

        public void printSpecies(){
            System.out.println("Species name: " + this.speciesName);
            System.out.println("Species type: " + this.speciesType);
        }

        public void printNumberOfChromosomesX(){
            System.out.println("Number of chromosomes: " + this.numberOfChromosomes_x);
        }

        public void printAll(){
            System.out.println("Species name: " + this.speciesName);
            System.out.println("Species type: " + this.speciesType);
            System.out.println("Number of chromosomes 2n: " + this.numberOfChromosomes_2n);
            System.out.println("Number of chromosomes x: " + this.numberOfChromosomes_x);
        }

        public Species copy(){
            return this;
//            return new Species(this);
        }
    }


}
