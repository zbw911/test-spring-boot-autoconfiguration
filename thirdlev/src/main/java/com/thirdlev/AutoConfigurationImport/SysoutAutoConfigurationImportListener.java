package com.thirdlev.AutoConfigurationImport;

import org.springframework.boot.autoconfigure.AutoConfigurationImportEvent;
import org.springframework.boot.autoconfigure.AutoConfigurationImportListener;

public class SysoutAutoConfigurationImportListener implements
        AutoConfigurationImportListener {

    @Override
    public void onAutoConfigurationImportEvent(
            AutoConfigurationImportEvent event) {

        System.out.println("================output print registered configurations");
        for (String str : event.getCandidateConfigurations()) {
            System.out.println(">>> the configuration => " + str + " has registered ");
        }

        System.out.println("================output print exclusions configurations");
        for (String str : event.getExclusions()) {
            System.out.println(">>> the configuration =>" + str + " has exclusion ");
        }

    }

}