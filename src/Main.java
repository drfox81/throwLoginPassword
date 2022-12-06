public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Data proba=new Data("Aft_hiuygyt", "Wef", "wef");

        //System.out.println(Data.checkLoginPassword());

        try {
            Data.checkLoginPassword();
        } catch (WrongPasswordException e){
            e.getMessage("");
        } catch (WrongLoginException e){
            e.getMessage("");
        }


    }
}