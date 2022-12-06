public class WrongLoginException extends Exception{
    public WrongLoginException() {
        System.out.println("Введен не верный логин, попробуйте еще раз");
    }

    public void getMessage(String s) {
        System.out.println("логин не туд и не сюда");
    }
}
