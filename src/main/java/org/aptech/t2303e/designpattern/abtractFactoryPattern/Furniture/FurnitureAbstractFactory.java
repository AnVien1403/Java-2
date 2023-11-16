package org.aptech.t2303e.designpattern.abtractFactoryPattern.Furniture;

import org.aptech.t2303e.designpattern.abtractFactoryPattern.Chair;
import org.aptech.t2303e.designpattern.abtractFactoryPattern.Table;

public abstract class FurnitureAbstractFactory {
    public abstract Chair createChair();
    public abstract Table createTable();

}
