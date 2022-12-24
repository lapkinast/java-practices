package pr2;

public class TestAuthor {
    public static void main(String[] args){
        Author me = new Author("Angelina", "angelovaat@mail.ru", 'w');
        System.out.println(me);
        me.setEmail();
        System.out.println("Email: " + me.getEmail());
    }
}