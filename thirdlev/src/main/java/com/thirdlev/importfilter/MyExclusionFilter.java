package com.thirdlev.importfilter;

import org.springframework.boot.autoconfigure.AutoConfigurationImportFilter;
import org.springframework.boot.autoconfigure.AutoConfigurationMetadata;

import java.util.HashSet;
import java.util.Set;

public class MyExclusionFilter
        implements AutoConfigurationImportFilter {

//    private static final Set<String> SHOULD_SKIP = new HashSet<>(
//            Arrays.asList("org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration",
//                    "org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration"));

    private static final Set<String> SHOULD_SKIP = new HashSet<>(
    );

    @Override
    public boolean[] match(String[] classNames, AutoConfigurationMetadata metadata) {

        System.out.println("match=>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (String className : classNames) {
            System.out.println(className);
        }

        boolean[] matches = new boolean[classNames.length];

        for (int i = 0; i < classNames.length; i++) {
            matches[i] = !SHOULD_SKIP.contains(classNames[i]);
        }
        return matches;
    }
}