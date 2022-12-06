public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
        System.out.println("Введен не верный пароль, попробуйте еще раз");
    }

    public void getMessage(String s) {
        System.out.println("соберись и сделай по взрослому");
    }
}
