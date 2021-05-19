public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        double weight = 73;
        double  height = 1.61;
        double index = service.calculate(weight, height);
        System.out.println("Ваш индекс веса - " + index);
    }
}
