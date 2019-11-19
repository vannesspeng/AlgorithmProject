package com.vanness.designmode.FactoryMode.SimpleFactory;

public class SharpFactory {
    public static Shape getShape(String sharpType) {
        if (sharpType == null) {
            return null;
        }

        if (sharpType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (sharpType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (sharpType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
