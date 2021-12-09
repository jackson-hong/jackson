package kr.jackson.controller.param;

import kr.jackson.controller.payload.BasePayload;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class JacksonRequest extends BaseParam {
    String jackson;
}
