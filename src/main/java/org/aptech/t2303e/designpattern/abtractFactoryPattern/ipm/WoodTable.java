package org.aptech.t2303e.designpattern.abtractFactoryPattern.ipm;


import org.aptech.t2303e.designpattern.abtractFactoryPattern.Table;

public class WoodTable implements Table {
    @Override
    public void create() {
        System.err.println("create Table");
    }
}
