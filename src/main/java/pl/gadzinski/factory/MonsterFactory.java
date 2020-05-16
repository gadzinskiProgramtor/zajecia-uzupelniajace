package pl.gadzinski.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonsterFactory {
    private Level level;

    public MonsterFactory(Level level) {
        this.level = level;
    }

    public List<Monster> chapterOne(){
        List<Archer> archers = Arrays.asList(new Archer(level.getValue()*15,1));
        List<Monster> monsters = new ArrayList<>();
        monsters.addAll(archers);
        return monsters;
    }
//    public List<Monster> chapterTwo(){}
}
