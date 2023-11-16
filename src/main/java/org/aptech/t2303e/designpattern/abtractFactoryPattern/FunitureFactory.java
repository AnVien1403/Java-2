package org.aptech.t2303e.designpattern.abtractFactoryPattern;

import org.aptech.t2303e.designpattern.abtractFactoryPattern.Factory.PlasticAbtractFactory;
import org.aptech.t2303e.designpattern.abtractFactoryPattern.Factory.WoodAbtractFactory;
import org.aptech.t2303e.designpattern.abtractFactoryPattern.Material.MaterialType;

public class FunitureFactory {
    public static FunitureAbtractFactory getFactory(MaterialType materialType) throws IllegalAccessException {
        switch (materialType) {
            case Wood:
                return new WoodAbtractFactory();
            case Plastic:
                return new PlasticAbtractFactory();
            default: {
                try {
                    throw new IllegalAccessException();
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);

                }
            }

        }
    }
}
