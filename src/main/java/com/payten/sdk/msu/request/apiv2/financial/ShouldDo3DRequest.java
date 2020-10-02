package com.payten.sdk.msu.request.apiv2.financial;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.request.enumerated.Currency;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.ShouldDo3DResponse;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = ShouldDo3DResponse.class
)
public class ShouldDo3DRequest extends ApiRequest {
    private String cardToken;

    private String bin;

    private BigDecimal amount;

    private Currency currency;

    private ShouldDo3DRequest() {
    }

    public static ShouldDo3dRequestBuilder builder() {
        return new ShouldDo3dRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.CARDTOKEN, this.cardToken);
        addToPayload(Param.BIN, this.bin);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.CURRENCY, this.currency);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.SHOULDDO3D;
    }

    public static final class ShouldDo3dRequestBuilder {
        private String cardToken;

        private String bin;

        private BigDecimal amount;

        private Currency currency;

        private Authentication authentication;

        public ShouldDo3dRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public ShouldDo3dRequestBuilder withCardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        public ShouldDo3dRequestBuilder withBin(String bin) {
            this.bin = bin;
            return this;
        }

        public ShouldDo3dRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public ShouldDo3dRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ShouldDo3DRequest build() {
            ShouldDo3DRequest request = new ShouldDo3DRequest();
            request.authentication = this.authentication;
            request.cardToken = this.cardToken;
            request.bin = this.bin;
            request.amount = this.amount;
            request.currency = this.currency;
            return request;
        }
    }
}