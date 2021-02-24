

public class Main {
    public static void main(String[] args) {
        Prince prince = new Prince("Oleg", 22, 35);
        Princess[] princess = {
                new Princess("Ira", 18, 36),
                new Princess("Olga", 17, 35),
                new Princess("Vika", 18, 34)
        };
        Princess kek = prince.find(princess);
        System.out.println(kek);
    }
}
