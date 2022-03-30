import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // part a
        Dog fluffy = new Dog("Fluffy", "pomeranian");
        fluffy.printPetInfo();

        // part b
        ArrayList<Pet> petList = new ArrayList<Pet>();
        Pet pet1 = new Pet("Floppy", "rabbit");
        Pet pet2 = new Dog("Arty", "pug");
        petList.add(pet1);
        petList.add(pet2);

        // part c
        PetOwner owner1 = new PetOwner(pet1, "Jerry");
        owner1.printOwnerInfo();
        PetOwner owner2 = new PetOwner(pet2, "Kris");
        owner2.printOwnerInfo();
    }

}