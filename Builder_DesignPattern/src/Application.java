public class Application {
    public static void main(String [] args){
       Laptop.Builder lap_builder= new Laptop.Builder("Msi");
       Laptop  laptops = lap_builder.laptopSize("175").gamingCapability(false).laptopServiceWarranty("No Warranty").build();
       System.out.println(laptops);


    }
}