import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human pa = new Human("Bazarov", "Alex", Gender.Mail,"08.07.1949");
        Human ma = new Human("Budina", "Anna", Gender.Fimale,"15.09.1948");
        Human sister1 = new Human("Bazarova","Helga", Gender.Fimale,"10.03.1978");
        Human sister2 = new Human("Bazarova","Tasy", Gender.Fimale,"10.03.1978");

        sister1.mother = ma;
        sister1.father = pa;
        System.out.println (sister1.getMother());
        System.out.println (sister1.getFather());
        TreeFamily tree = new TreeFamily();
        tree.addHuman(pa);
        tree.addHuman(pa);
        tree.addHuman(sister1);
        tree.addHuman(sister2);
        pa.addChildrenList(sister1);
        pa.addChildrenList(sister2);

        System.out.println(pa.getСhildrenList());
        System.out.println();
        
    }
}