package com.ccl.documentmanagementintapi.utils.thumbnail;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ThumbnailSize {
    private Integer width;
    private Integer height;
}
