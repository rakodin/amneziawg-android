package com.wireguard.config;

import java.util.Arrays;

public enum AmneziaKey {
    Jc,
    Jmin,
    Jmax,
    S1,
    S2,
    H1,
    H2,
    H3,
    H4;

    public static AmneziaKey of(String s) {
       return Arrays.stream(AmneziaKey.values())
               .filter(k -> k.name().equalsIgnoreCase(s))
               .findAny()
               .orElseThrow(() -> new IllegalArgumentException(String.format("Invalid " +
                       "Amnezia key %s", s)));
    }
}
