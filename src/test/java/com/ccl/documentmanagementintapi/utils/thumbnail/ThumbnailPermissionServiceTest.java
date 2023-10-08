package com.ccl.documentmanagementintapi.utils.thumbnail;

import com.ccl.documentmanagementintapi.config.ThumbnailPermissionService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@ActiveProfiles("local")
@RunWith(SpringRunner.class)
@SpringBootTest
public class ThumbnailPermissionServiceTest {

    @Autowired
    ThumbnailPermissionService thumbnailPermissionService;

    private Integer category;
    private String origin;

    private boolean isAllowed;

    @Test
    public void checkPermissionsResultsTrue() {
        category = 22;
        origin = "AMOB_COMPOUND";
        isAllowed = thumbnailPermissionService.checkThumbnailPermission(category, origin);

        log.info("Thumbnail generation is allowed: {}, for category: {} and origin: {}", isAllowed, category, origin);

        Assert.assertTrue(isAllowed);
    }

    @Test
    public void checkOriginPermissionsResultsFalse() {
        category = 22;
        origin = "MOBILE_SEMAT";
        isAllowed = thumbnailPermissionService.checkThumbnailPermission(category, origin);

        log.info("Thumbnail generation is allowed: {}, for category: {} and origin: {}", isAllowed, category, origin);

        Assert.assertFalse(isAllowed);
    }

    @Test
    public void checkCategoryPermissionsResultsFalse() {
        category = 15;
        origin = "AMOB_COMPOUND";
        isAllowed = thumbnailPermissionService.checkThumbnailPermission(category, origin);

        log.info("Thumbnail generation is allowed: {}, for category: {} and origin: {}", isAllowed, category, origin);

        Assert.assertFalse(isAllowed);
    }
}