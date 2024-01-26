public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService ();
        int index = service.calculate(81,1.81);
        System.out.println(index);

    }
}
