public class Hotel implements Liveable{
    private String address;


    public Hotel(String address) {
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
        return "Hotel{" +
                "address='" + address + '\'' +
                '}';
    }

    @Override
    public void comusluga() {
        System.out.println("Arenda toloshot");

    }
}


