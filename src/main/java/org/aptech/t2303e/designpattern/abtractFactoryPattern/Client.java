package org.aptech.t2303e.designpattern.abtractFactoryPattern;

import org.aptech.t2303e.designpattern.abtractFactoryPattern.Furniture.FurnitureAbstractFactory;
import org.aptech.t2303e.designpattern.abtractFactoryPattern.Furniture.FurnitureFactory;
import org.aptech.t2303e.designpattern.abtractFactoryPattern.Material.MaterialType;

public class Client {
    public static void main(String[] args) throws IllegalAccessException {
        FurnitureAbstractFactory factory2 = FurnitureFactory.getFactory(MaterialType.Wood);
        FurnitureAbstractFactory factory1 = FurnitureFactory.getFactory(MaterialType.Plastic);
        Chair chair2 = factory2.createChair();
        Table table2 = factory2.createTable();
        Chair chair1 = factory1.createChair();
        Table table1 = factory1.createTable();
        System.err.println(chair1);
        System.err.println(table1);
        System.err.println(chair2);
        System.err.println(table2);
    }
}
