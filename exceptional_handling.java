public class exceptional_handling {

    public static void main(String[] args) {
        try {
            int n = 1;
            System.out.println(n/0);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}