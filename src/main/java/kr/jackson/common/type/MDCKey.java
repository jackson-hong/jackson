package kr.jackson.common.type;

import lombok.Getter;

public enum MDCKey {
    TRX_ID("trxId");

    @Getter
    private String key;

    MDCKey(String key) {
        this.key = key;
    }
}
