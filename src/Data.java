import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Data {
    private static String login;
    private static String password;
    private static String confirmPassword;

    public static boolean checkLoginPassword()
            throws WrongPasswordException, WrongLoginException {

        if (password.length() != confirmPassword.length() || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        } else {
            checkLogin(login);
        }
        return true;

    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Data(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        this.login = login;
        checkPassword(password);
        checkConfirmPassword(confirmPassword);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public static void checkLogin(String date) throws WrongLoginException {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9_]{1,20}$");
        Matcher matcher = pattern.matcher(date);
        if (matcher.matches() == true) {
            login = date;
        } else {
            throw new WrongLoginException();
        }
    }

    public void checkPassword(String date) throws WrongPasswordException {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9_]{1,20}$");
        Matcher matcher = pattern.matcher(date);
        if (matcher.matches() == true) {
            password = date;
        } else {
            throw new WrongPasswordException();
        }
    }

    public void checkConfirmPassword(String date) throws WrongPasswordException {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9_]{1,20}$");
        Matcher matcher = pattern.matcher(date);
        if (matcher.matches() == true) {
            confirmPassword = date;
        } else {
            throw new WrongPasswordException();
        }
    }
}
