package org.example;

class GoblinKing extends Enemy {
    public GoblinKing() {
        description = "Król goblinów";
    }

    public int getHealth() {
        return 750;
    }
    public String getWeakness() { return "Ice"; }
}
