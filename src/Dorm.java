public class Dorm implements Liveable{
    private String address;

    public Dorm(String address) {
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
        return "Dorm{" +
                "address='" + address + '\'' +
                '}';
    }

    @Override
    public void comusluga() {
        System.out.println("Arenda toloshot");

    }
}


