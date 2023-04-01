import java.util.ArrayList;
import java.util.List;

public class TreeFamily {
    private List<Human> list;

    public TreeFamily() {
        list = new ArrayList<>();
    }


    public void addHuman(Human human) {
        list.add(human);
    }

    public Human getByMather(Human human) {
        for (Human hum : list) {
            if (hum.getMother().equals(human.getMother())) {
                return hum;
            }
        }
        return null;
    }


    public void addKid(Human kid) {
        for (Human hum : list) {
            if (kid.getMother().equals(hum)
                    || kid.getFather().equals(hum)) {
                hum.addСhildrenList(kid);
            }
        }
    }
}
