import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Collections;

class DnDCharacter {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public DnDCharacter() {
        strength = ability(rollDice());
        dexterity = ability(rollDice());
        constitution = ability(rollDice());
        intelligence = ability(rollDice());
        wisdom = ability(rollDice());
        charisma = ability(rollDice());
    }
    
    int ability(List<Integer> scores) {
        List<Integer> scoresAL = new ArrayList<>(scores);
        Collections.sort(scoresAL); 

        int total = 0;
        for (int i = 1; i < 4; i++) {
            total += scoresAL.get(i);
        }
        return total;
    }

    List<Integer> rollDice() {
        List <Integer> diceResults = new Random().ints(4, 1, 7)
                                                    .boxed()
                                                    .collect(Collectors.toList());
        return diceResults;
    }

    int modifier(int input) {
        double modified = (input - 10.0) / 2.0;
        return (int) Math.floor(modified);
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }
}
