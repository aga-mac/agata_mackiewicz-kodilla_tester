public class Refaktoryzacja {

    public String name;
    public double age;
    public double height;

    public Refaktoryzacja(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public double getAge() {
        return age;
    }
    public double getHeight() {
        return height;
    }
    public void ageAndHeight() {
        if (this.name != null) {
            if (getAge() > 30 && getHeight() > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter).");
            }
        } else {
            return;
        }
    }
}



