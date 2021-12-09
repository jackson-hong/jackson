package kr.jackson.manager;

import kr.jackson.controller.param.JacksonRequest;
import kr.jackson.controller.payload.BasePayload;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ServiceChannelManager {

    public BasePayload findJackson(JacksonRequest request){
        log.info("findJackson executed");

        return BasePayload.builder()
                .resultCode("0000")
                .resultMsg("성공")
                .build();
    };
}
