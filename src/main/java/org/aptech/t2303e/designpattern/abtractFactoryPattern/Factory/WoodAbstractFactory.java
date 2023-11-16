package org.aptech.t2303e.designpattern.abtractFactoryPattern.Factory;

import org.aptech.t2303e.designpattern.abtractFactoryPattern.Chair;
import org.aptech.t2303e.designpattern.abtractFactoryPattern.FurnitureAbstractFactory;
import org.aptech.t2303e.designpattern.abtractFactoryPattern.Table;
import org.aptech.t2303e.designpattern.abtractFactoryPattern.ipm.WoodChair;
import org.aptech.t2303e.designpattern.abtractFactoryPattern.ipm.WoodTable;

public class WoodAbstractFactory extends FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}

