public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 48_500;
        float length = 153;
        float index = service.calculate(weight, length);
        System.out.println(index);
    }
}
