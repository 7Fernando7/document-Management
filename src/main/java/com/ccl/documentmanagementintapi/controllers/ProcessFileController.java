package com.ccl.documentmanagementintapi.controllers;

import com.ccl.architecture.elasticsearch.logger.annotations.DefineRequestLogger;
import com.ccl.architecture.elasticsearch.logger.dtos.LogLevels;
import com.ccl.documentmanagementintapi.services.utils.TfnasProcessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class ProcessFileController {

    @Resource
    private TfnasProcessService tfnasProcessService;

    @PostMapping("/processPendingFolders")
    @DefineRequestLogger(inbound = LogLevels.DEBUG, outbound = LogLevels.DEBUG)
    public void processPendingFolders() {
        tfnasProcessService.processPendingFolders();
    }

    @PostMapping("/removeOldFolders")
    @DefineRequestLogger(inbound = LogLevels.DEBUG, outbound = LogLevels.DEBUG)
    public void removeOldFolders() {
        tfnasProcessService.removeOldFolders();
    }

}
