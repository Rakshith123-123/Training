package com.boomi.designpattrens.abstractfactory.factories;

import com.boomi.designpattrens.abstractfactory.products.Gpu;
import com.boomi.designpattrens.abstractfactory.products.Monitor;
import com.boomi.designpattrens.abstractfactory.products.MsiGpu;
import com.boomi.designpattrens.abstractfactory.products.MsiMonitor;

public class MsiManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }

}