public class Main {

    public static void main(String[] args) {
        int[] sales = {1, 10, 20, 50, 80};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
    }
}
