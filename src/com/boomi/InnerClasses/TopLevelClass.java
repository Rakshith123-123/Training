package com.boomi.InnerClasses;
public class TopLevelClass {
    public void accessMembers(OuterClass outerClass) {
        // Compiler error: Cannot make a static reference to the non-static
        //     field OuterClass.outerField
        // System.out.println(OuterClass.outerField);
        System.out.println(outerClass.outerField);
        System.out.println(OuterClass.staticOuterField);
    }
}
