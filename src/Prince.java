public class Prince extends Human{
    int sizeFound;

    public Prince() {
    }

    public Prince(int sizeFound) {
        this.sizeFound = sizeFound;
    }

    public Prince(String name, int age, int sizeFound) {
        super(name, age);
        this.sizeFound = sizeFound;
    }


    public Princess find(Princess[] princesses){
        for (Princess princess : princesses)
            if (princess.footSize == this.sizeFound) {
                return princess;
            }
        return null;
    }


    @Override
    public String toString() {
        return "Prince{" + "name='" + name + '\'' + ", age=" + age + ", sizeFound=" + sizeFound + '}';
    }
}
