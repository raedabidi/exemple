public class Zoo {
    private String city;
    private String name;
    private int nbrCages;
    Animal [] animals ;
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
    }
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                animals[i].displayInfoanim();
            }
        }
        }

    public void addAnimal(Animal animal, int i) {
        if (i >= 0 && i < animals.length) {
            animals[i] = animal;
        } else {
            System.out.println("Index out of bounds. Cannot add animal.");
        }
    }
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == animal) {
                return i;
            }
        }
        return -1;
    }
}