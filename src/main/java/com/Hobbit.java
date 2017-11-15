package com;

public class Hobbit extends Character{

    Hobbit() {
        super(3, 0);
    }
    public String toCry(){
        return this.toString() + " has zero chances";
    }

    @Override
    public void kick(Character c) {
        String msg = this.toCry();
        System.out.println(toCry());
        this.setHp(0);
    }

    @Override
    public String toString() {
        return "Hobbit: "
                + "hp="
                + this.getHp()
                + ", power="
                + this.getPower();
    }
}
