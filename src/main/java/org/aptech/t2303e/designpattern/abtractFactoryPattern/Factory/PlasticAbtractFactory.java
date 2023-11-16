package org.aptech.t2303e.designpattern.abtractFactoryPattern.Factory;

import org.aptech.t2303e.designpattern.abtractFactoryPattern.Chair;
import org.aptech.t2303e.designpattern.abtractFactoryPattern.FunitureAbtractFactory;
import org.aptech.t2303e.designpattern.abtractFactoryPattern.Table;
import org.aptech.t2303e.designpattern.abtractFactoryPattern.ipm.PlasticChair;
import org.aptech.t2303e.designpattern.abtractFactoryPattern.ipm.PlasticTable;

public class PlasticAbtractFactory extends FunitureAbtractFactory {
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }
}
