public class Main {
    public static void main(String[] args) {
        Liveable apartment=new Apartment("Osh",200);
        Liveable apartment1=new Apartment("Talas",200);
        Liveable apartment2=new Apartment("Bishkek",200);
        Liveable[] liveables={apartment,apartment1,apartment2};
        System.out.println(liveables.length+" people live in the apartment");
        apartment.comusluga();


        Liveable hotel=new Hotel("Jalal-Abad");
        Liveable  hotel1=new Hotel("Ysyk-Kol");
        Liveable hotel2=new Hotel("Chui");
        Liveable hotel3=new Hotel("Naryn");
        Liveable hotel4=new Hotel("Kara Balta");
        Liveable[] liveables1={hotel,hotel1,hotel2,hotel3,hotel4};
        System.out.println(liveables1.length+" people live in the hotel");
        hotel.comusluga();

        Liveable dorm=new Dorm("Ak-Ordo");
        Liveable dorm1=new Dorm("Batken");
        Liveable[] liveables2={dorm,dorm1};
        System.out.println(liveables2.length+" people live in the dorm");
        dorm.comusluga();









        }




    }
