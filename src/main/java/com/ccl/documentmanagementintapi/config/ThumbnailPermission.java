package com.ccl.documentmanagementintapi.config;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ThumbnailPermission {
    private Integer category;
    private String origin;
    private boolean allowed = false;

    public ThumbnailPermission(Integer category, String origin) {
        super();
        this.setCategory(category);
        this.setOrigin(origin);
    }
}
