package kr.jackson.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import kr.jackson.controller.param.JacksonRequest;
import kr.jackson.controller.payload.BasePayload;
import kr.jackson.domain.TestEntity;
import kr.jackson.manager.ServiceChannelManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/jck/api/v1")
@Api(tags = "general controller")
@RequiredArgsConstructor
@Slf4j
public class GeneralController {

    private final ServiceChannelManager serviceChannelManager;

    @ApiOperation("JCK-101 잭슨 조회하기")
    @PostMapping("/find")
    public BasePayload methodOne(@RequestBody @Valid @ApiParam("조회 정보") JacksonRequest jacksonRequest){

        return serviceChannelManager.findJackson(jacksonRequest);

    }

}
