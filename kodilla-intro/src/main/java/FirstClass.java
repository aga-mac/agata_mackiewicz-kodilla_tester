public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 3000, 2020);
        System.out.println("notebook.weight:" + notebook.weight + " " + "notebook.price:" + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearPrice();

        Notebook heavyNotebook = new Notebook(2000, 750, 2016);
        System.out.println("heavyNotebook.weight:" + heavyNotebook.weight + " " + "heavyNotebook.price:" + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearPrice();

        Notebook oldNotebook = new Notebook(1200, 550, 2010);
        System.out.println("oldNotebook.weight:" + oldNotebook.weight + " " + "oldNotebook.price:" + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearPrice();
    }
}