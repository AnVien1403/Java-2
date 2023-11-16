package org.aptech.t2303e.designpattern.abtractFactoryPattern.ipm;

import org.aptech.t2303e.designpattern.abtractFactoryPattern.Chair;

public class PlasticChair implements Chair {
    @Override
    public void create() {
        System.err.println("create Chair");
    }
}
