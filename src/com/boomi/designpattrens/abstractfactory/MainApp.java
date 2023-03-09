package com.boomi.designpattrens.abstractfactory;

import com.boomi.designpattrens.abstractfactory.factories.AsusManufacturer;
import com.boomi.designpattrens.abstractfactory.factories.Company;
import com.boomi.designpattrens.abstractfactory.factories.MsiManufacturer;
import com.boomi.designpattrens.abstractfactory.products.Product;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        Company msi = new MsiManufacturer();
        Company asus = new AsusManufacturer();
        List.of(msi.createGpu(), msi.createMonitor(), asus.createGpu(), asus.createMonitor())
                .forEach(Product::assemble);

    }

}
