class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {

    private boolean hasPreparedSpell = false;
    
    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell() {
        hasPreparedSpell = true;
    }

    @Override
    public boolean isVulnerable() {
        return !hasPreparedSpell;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return hasPreparedSpell ? 12 : 3;
    }

    
}
