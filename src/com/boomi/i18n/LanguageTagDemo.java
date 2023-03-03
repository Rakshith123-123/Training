package com.boomi.i18n;

import java.util.List;
import java.util.Locale;

public class LanguageTagDemo {

    public static void main(String[] args) {
        // Create Locale
        Locale l = Locale.forLanguageTag("en-US");

        // Define Some LanguageRange Objects
        Locale.LanguageRange range1 = new Locale.LanguageRange("en-US",Locale.LanguageRange.MAX_WEIGHT);
        Locale.LanguageRange range2 = new Locale.LanguageRange("en-GB*",0.5);
        Locale.LanguageRange range3 = new Locale.LanguageRange("fr-FR",Locale.LanguageRange.MIN_WEIGHT);

        String ranges = "en-US;q=1.0,en-GB;q=0.5,fr-FR;q=0.0";

        // Create a Language Priority List
        List<Locale.LanguageRange> languageRanges = Locale.LanguageRange.parse(ranges);
    }
}
