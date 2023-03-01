package com.boomi.platformenvironment;

import java.util.Map;

public class EnvMap {
    public static void main (String[] args) {
        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n",
                    envName,
                    env.get(envName));
        }
        for (String env1: args) {
            String value = System.getenv(env1);
            if (value != null) {
                System.out.format("%s=%s%n",
                        env1, value);
            } else {
                System.out.format("%s is"
                        + " not assigned.%n", env1);
            }
        }
    }
}
