package com.jakob.effectivejava.item14;

import java.util.Comparator;

import static java.util.Comparator.comparingInt;

/**
 * @author Jakob
 */
public class PhoneNumber implements Comparable<PhoneNumber> {

    // Comparable with comparator construction methods
    private static final Comparator<PhoneNumber> COMPARATOR =
            comparingInt((PhoneNumber pn) -> pn.areaCode)
                    .thenComparingInt(pn -> pn.prefix)
                    .thenComparingInt(pn -> pn.lineNum);
    private final short areaCode;
    private final short prefix;
    private final short lineNum;

    public PhoneNumber(short areaCode, short prefix, short lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    @Override
    public int compareTo(PhoneNumber pn) {
        return COMPARATOR.compare(this,pn);
    }

    public int getAreaCode() {
        return areaCode;
    }

    public int getPrefix() {
        return prefix;
    }

    public int getLineNum() {
        return lineNum;
    }
}
