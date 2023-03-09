package com.boomi.designpattrens.abstractfactory.factories;

import com.boomi.designpattrens.abstractfactory.products.AsusGpu;
import com.boomi.designpattrens.abstractfactory.products.AsusMonitor;
import com.boomi.designpattrens.abstractfactory.products.Gpu;
import com.boomi.designpattrens.abstractfactory.products.Monitor;

public class AsusManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }

}
