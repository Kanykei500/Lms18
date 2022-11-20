public class Apartment implements Liveable{
    private String address;



    public Apartment(String address, int komusluga) {
        this.address = address;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Apartment{" +
                "address='" + address + '\'' +
                '}';
    }

    @Override
    public void comusluga() {
        System.out.println("Komunalnaya usluga toloshot");
    }
}
