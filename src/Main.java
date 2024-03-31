
public class Main {
    public static void main(String[] args) {
        try {
//            Check.check("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
//            Check.check("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
//            Check.check("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
            Check.check(1,"java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
            Check.check(2,"java_skypro_go22222222222222", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println("Введены не верные данные " + exception.getMessage());
        }
    }

}