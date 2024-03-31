import java.util.regex.Pattern;

public class Check {
    private Check() {
    }
    private static final Pattern PATTERN = Pattern.compile("\\w{1,20}");

    public static void check( int id, String login, String password, String confirmPassword) throws
//    public static void check( String login, String password, String confirmPassword) throws
            WrongLoginException, WrongPasswordException {

        if (login.length() >= 20) {
            System.out.println("Проверьте учётную запись № "+id);
            throw new WrongLoginException("Превышено количество символов в логине.");
        }
        if (password.length() >= 20) {
            System.out.println("Проверьте учётную запись № "+id);
            throw new WrongLoginException("Пароль не должен содержать более двадцати символов." );
        }
        if (!PATTERN.matcher(login).matches()) {
            System.out.println("Проверьте учётную запись № "+id);
            throw new WrongLoginException(login + " Этот логин не соответсвует требованиям");
        }
        if (!PATTERN.matcher(password).matches()) {
            System.out.println("Проверьте учётную запись № "+id);
            throw new WrongPasswordException("Пароль не соответсвует требованиям");
        }
        if (!password.equals(confirmPassword)) {
            System.out.println("Проверьте учётную запись № "+id);
            throw new WrongPasswordException("Пароли не совпадают");
        }

    }
}

