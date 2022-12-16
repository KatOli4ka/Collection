public class Data {
    public static final String VALID_SYMBOLS = "abcdefjhigklmnopqrstuvwxyzaABCDEFJHIGKLMNOPQRSTUVWXYZ_0123456789";
    private Data() {

    }
    public static boolean proverka(String login, String password, String confirmPassword) {
        try {
            check(login,password,confirmPassword);
        } catch (WrongLoginException |WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static boolean valid(String s) {
        if (s.length() > 20) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!VALID_SYMBOLS.contains(String.valueOf(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
    private static void check(String login, String password, String confirmPassword)
        throws WrongPasswordException,WrongLoginException{
        if (!valid(login)) {
            throw new WrongLoginException("Неверный логин!");
        }
        if (!valid(password)) {
            throw new WrongPasswordException("Неверный пароль!");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают!");
        }
    }
}
