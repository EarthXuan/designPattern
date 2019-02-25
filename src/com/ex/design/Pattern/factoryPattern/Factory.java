package com.ex.design.Pattern.factoryPattern;

public class Factory {
    public FactoryInterface createFactory(Class clazz){
        FactoryInterface factoryInterface=null;
        try {
            try {
                factoryInterface=(FactoryInterface)Class.forName(clazz.getName()).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return factoryInterface;
    }
}
