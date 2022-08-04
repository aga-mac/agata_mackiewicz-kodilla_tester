public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight < 800) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 800 && this.weight < 1500) {
            System.out.println( "This notebook is not so heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }
    public void checkYearPrice () {
        if (this.year == 2015 || this.price > 550 && this.price < 800) {
            System.out.println("Good deal.");
        } else if (this.year > 2015 && this.year > 2020|| this.price > 500 && this.price < 3000) {
            System.out.println("Very good deal.");
        } else if (this.year >= 2020 || this.price >= 3000) {
            System.out.println("The best you can have.");
        }
    }
    }