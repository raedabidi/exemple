public class Animal {
    private String family;
    private String name;
    private int age;
    boolean isMammal = false;
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public void displayInfoanim() {
        System.out.println("Family: " + family);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is Mammal: " + isMammal);
    }
}