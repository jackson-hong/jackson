package kr.jackson.controller.payload;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class BasePayload {
    String resultCode;
    String resultMsg;
}
