package kr.jackson.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import kr.jackson.controller.param.JacksonRequest;
import kr.jackson.controller.payload.BasePayload;
import kr.jackson.manager.ServiceChannelManager;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@RestController
@RequestMapping("/jck/api/v1")
@Api(tags = "general controller")
@RequiredArgsConstructor
public class GeneralController {

    private final ServiceChannelManager serviceChannelManager;

    private static final Logger log = LoggerFactory.getLogger(GeneralController.class);

    @ApiOperation("JCK-101 잭슨 조회하기")
    @PostMapping("/find")
    public BasePayload methodOne(@RequestBody @Valid @ApiParam("조회 정보") JacksonRequest jacksonRequest){
        log.info("JCK-101");
        return serviceChannelManager.findJackson(jacksonRequest);
    }

}
