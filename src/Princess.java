public class Princess extends Human{
    int footSize;

    public Princess() {
    }

    public Princess(String name, int age, int footSize) {
        super(name, age);
        this.footSize = footSize;
    }


    @Override
    public String toString() {
        return "Princess{" + "name='" + name + '\'' + ", age=" + age + ", footSize=" + footSize + '}';
    }
}
