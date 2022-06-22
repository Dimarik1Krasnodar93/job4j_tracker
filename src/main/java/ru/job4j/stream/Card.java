package ru.job4j.stream;

public class Card {
    public enum Value {
        V_6, V_7, V_8
    }

    public enum Suit {
        Diamonds, Hearts, Spades, Clubs
    }

    @Override
    public String toString() {
        return value.name() + " " + suit.name();
    }
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }
}