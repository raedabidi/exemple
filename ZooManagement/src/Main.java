public class Main {
public static void main(String[] args) {
        ZooManagement zooManagement = new ZooManagement();
        Animal lion = new Animal("lion","bobi",8,true);
        //Animal lion = new Animal("lion","kkkis",7,false);
        Animal tiger = new Animal("tiger","sandi",5,false);
        Zoo myZoo = new Zoo("Safari Park", "Nairobi", 20);
        System.out.println( );
        myZoo.addAnimal(lion,0);
        myZoo.addAnimal(tiger,1);
        //System.out.println(myZoo);
        //System.out.println(myZoo.toString());
        myZoo.displayZoo();
        /*int x = myZoo.searchAnimal(tiger);
        if(x == -1) {
                System.out.println("L'animal n'existe pas");
        }
        else {
                System.out.println("L'animal existe dans cette indice : " + x);
        }*/
    }
}
