package com.boomi.i18n;

import java.util.Locale;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class LanguageTagDemo1 {

    public static void main(String[] args) {

        // Create a collection of Locale objects to filter
        Collection<Locale> locales = new ArrayList<>();
        locales.add(Locale.forLanguageTag("en-GB"));
        locales.add(Locale.forLanguageTag("ja"));
        locales.add(Locale.forLanguageTag("zh-cmn-Hans-CN"));
        locales.add(Locale.forLanguageTag("en-US"));

        // Express the user's preferences with a Language Priority List
        String ranges = "en-US;q=1.0,en-GB;q=0.5,fr-FR;q=0.0";
        List<Locale.LanguageRange> languageRanges = Locale.LanguageRange.parse(ranges);

        // Now filter the Locale objects, returning any matches
        List<Locale> results = Locale.filter(languageRanges,locales);

        // Print out the matches
        for(Locale l : results){
            System.out.println(l.toString());
        }
    }
}
