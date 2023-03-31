public class Main {
    public static void main(String[] args) {
        BasicStructure audi = new BasicStructure();
        audi.color = "black";
        audi.model = "A5";
        audi.power = "5000cc";


        Engine X = new Engine();
        X.cylinders = "8";
        X.size = "5200cc";
        X.weight = "7574kg";

        Light light = new Light();
        light.color = "White";
        light.size = "15cm";
        light.intensity = "500lumin";

    }
}