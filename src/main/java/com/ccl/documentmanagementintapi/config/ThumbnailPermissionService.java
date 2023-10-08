package com.ccl.documentmanagementintapi.config;

import lombok.NonNull;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThumbnailPermissionService {
    @Autowired
    private KieContainer kieContainer;

    public boolean checkThumbnailPermission(@NonNull Integer category, @NonNull String origin) {
        ThumbnailPermission thumbnailPermission = new ThumbnailPermission(category, origin);

        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(thumbnailPermission);
        kieSession.fireAllRules();
        kieSession.dispose();

        return thumbnailPermission.isAllowed();
    }
}
