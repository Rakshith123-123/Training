package com.boomi.designpattrens.abstractfactory.products;

public class MsiGpu implements Gpu {

    @Override
    public void assemble() {
        // Logic relevant to MSI GPUs
        System.out.println("Assembling MSI GPU");
    }

}