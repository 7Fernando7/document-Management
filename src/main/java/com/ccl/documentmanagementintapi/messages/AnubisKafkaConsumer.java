package com.ccl.documentmanagementintapi.messages;

import com.ccl.documentmanagementintapi.services.AnubisDocumentService;
import com.ccl.transfesa.interfaces.ws.domain.kafka.KFK_EVENT_INSTANCES;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Slf4j
@Component
public class AnubisKafkaConsumer {

    private static final String EVT_UPLOAD_DOCUMENT = "UPLOAD_DOCUMENT";
    private static final String EVT_DELETE_DOCUMENT = "DELETE_DOCUMENT";

    @Resource
    private AnubisDocumentService anubisDocumentService;

    @KafkaListener(topics = "KFK_EVENT_INSTANCES")
    public void listen(KFK_EVENT_INSTANCES message,
                       @Header(KafkaHeaders.OFFSET) Integer offset,
                       @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,
                       @Header(KafkaHeaders.RECEIVED_TOPIC) String topic) {

        String eventDestination = message.getEVTDESTINATION().toString();
        if (eventDestination.equals(EVT_UPLOAD_DOCUMENT)) {
            log.info("Uploading document from ANUBIS with message VALUE: {}  in TOPIC: {},  PARTITION: {},   OFFSET: {}", message.toString(), topic, partition, offset);
            anubisDocumentService.anubisUploadDocument(message.getCID());
        } else if (eventDestination.equals(EVT_DELETE_DOCUMENT)) {
            log.info("Deleting document from ANUBIS with message VALUE: {}  in TOPIC: {},  PARTITION: {},   OFFSET: {}", message.toString(), topic, partition, offset);
            anubisDocumentService.anubisDeleteDocument(message.getCID());
        }
    }

}
