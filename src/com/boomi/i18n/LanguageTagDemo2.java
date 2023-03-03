package com.boomi.i18n;

import java.util.Locale;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class LanguageTagDemo2 {

    public static void main(String[] args) {

        // Create a collection of String objects to match against
        Collection<String> tags = new ArrayList<>();
        tags.add("en-GB");
        tags.add("ja");
        tags.add("zh-cmn-Hans-CN");
        tags.add("en-US");

        // Express user's preferences with a Language Priority List
        String ranges = "en-US;q=1.0,en-GB;q=0.5,fr-FR;q=0.0";
        List<Locale.LanguageRange> languageRanges = Locale.LanguageRange.parse(ranges);

        // Now search the locales for the best match
        List<String> results = Locale.filterTags(languageRanges, tags);

        // Print out the matches
        for (String s : results) {
            System.out.println(s);
        }
    }
}
