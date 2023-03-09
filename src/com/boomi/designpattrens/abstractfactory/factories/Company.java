package com.boomi.designpattrens.abstractfactory.factories;

import com.boomi.designpattrens.abstractfactory.products.Gpu;
import com.boomi.designpattrens.abstractfactory.products.Monitor;

public abstract class Company {

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();

}
