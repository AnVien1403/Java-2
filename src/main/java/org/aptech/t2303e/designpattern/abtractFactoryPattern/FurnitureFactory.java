package org.aptech.t2303e.designpattern.abtractFactoryPattern;

import org.aptech.t2303e.designpattern.abtractFactoryPattern.Factory.PlasticAbstractFactory;
import org.aptech.t2303e.designpattern.abtractFactoryPattern.Factory.WoodAbstractFactory;
import org.aptech.t2303e.designpattern.abtractFactoryPattern.Material.MaterialType;

public class FurnitureFactory {
    public static FurnitureAbstractFactory getFactory(MaterialType materialType) throws IllegalAccessException {
        switch (materialType) {
            case Wood:
                return new WoodAbstractFactory();
            case Plastic:
                return new PlasticAbstractFactory();
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
