package org.aptech.t2303e.designpattern.abtractFactoryPattern;

import org.aptech.t2303e.designpattern.abtractFactoryPattern.Material.MaterialType;

public class cilent {
    public static void main(String[] args) throws IllegalAccessException {
        FunitureAbtractFactory factory2 = FunitureFactory.getFactory(MaterialType.Wood);
        FunitureAbtractFactory factory1 = FunitureFactory.getFactory(MaterialType.Plastic);
        Chair chair2 = factory2.createChair();
        Table table2=factory2.createTable();
        Chair chair1 = factory1.createChair();
        Table table1= factory1.createTable();
        System.err.println(chair1);
        System.err.println(table1);
        System.err.println(chair2);
        System.err.println(table2);
    }
}
