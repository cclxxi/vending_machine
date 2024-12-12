package src.model;


import src.enums.ActionLetter;

public class Soda extends Product {
    public Soda(ActionLetter actionLetter, int price) {
        super("Soda", actionLetter, price);
    }
}
