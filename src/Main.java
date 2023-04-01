import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human grandpa = new Human("Bazarov", "Alex", Gender.Mail,"08.07.1949");
        Human grandma = new Human("Budina", "Anna", Gender.Fimale,"15.09.1948");
        Human sister = new Human("Bazarova","Helga", Gender.Fimale,"10.03.1978");
        sister.mother = grandma;
        sister.father = grandpa;
        System.out.println (sister.getMother());
        List<Human> list = new ArrayList<>();
        list.add(grandpa);
        list.add(grandma);
        list.add(sister);
        TreeFamily tree = new TreeFamily();
        tree.addHuman(grandpa);
        tree.addHuman(grandpa);
        tree.addHuman(sister);
        tree.addKid(sister);

        System.out.println(grandpa.getСhildrenList());
    }
}