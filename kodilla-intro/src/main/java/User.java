public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

public static void main(String[] args) {
        User katarzyna = new User("Katarzyna", 28);
        User tomek = new User("Tomek", 34);
        User agata = new User("Agata", 22);
        User maciej = new User("Maciej", 42);
        User ola = new User("Ola", 14);
        User jarek = new User("Jarek", 36);

        User[] users = {katarzyna, tomek, agata, maciej, ola, jarek};

        int result = 0;
        for (int i = 0; i < users.length; i++) {
        result = result + users[i].age;
        }
        int average = result / users.length;
        for (int i = 0; i < users.length; i++) {
            if (users[i].age < average){
                System.out.println(users[i].name);
            }
        }
    }
}
