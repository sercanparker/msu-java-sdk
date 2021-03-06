package com.merchantsafeunipay.sdk.request.apiv2.invoice;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.InvoiceAddResponse;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class InvoiceAddRequest extends ApiRequest<InvoiceAddResponse> {
    private String dealerCode;

    private String invoiceId;

    private String name;

    private String issueDate;

    private String dueDate;

    private BigDecimal amount;

    private BigDecimal originalAmount;

    private Currency currency;

    private String dealerTypeName;

    private Map<String, String> extra = new LinkedHashMap<>();

    private String merchantOrderId;

    private InvoiceAddRequest() {
    }

    public static InvoiceAddRequestBuilder builder() {
        return new InvoiceAddRequestBuilder();
    }

    @Override
    public Class<InvoiceAddResponse> responseClass() {
        return InvoiceAddResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.INVOICEID, this.invoiceId);
        addToPayload(Param.NAME, this.name);
        addToPayload(Param.ISSUEDATE, this.issueDate);
        addToPayload(Param.DUEDATE, this.dueDate);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.ORIGINALAMOUNT, this.originalAmount);
        addToPayload(Param.CURRENCY, this.currency);
        addToPayload(Param.DEALERTYPENAME, this.dealerTypeName);
        addToPayload(Param.EXTRA, this.extra);
        addToPayload(Param.MERCHANTORDERID, this.merchantOrderId);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.INVOICEADD;
    }

    public static final class InvoiceAddRequestBuilder {
        private String dealerCode;

        private String invoiceId;

        private String name;

        private String issueDate;

        private String dueDate;

        private BigDecimal amount;

        private BigDecimal originalAmount;

        private Currency currency;

        private String dealerTypeName;

        private Authentication authentication;

        Map<String, String> extra = new LinkedHashMap<>();

        private String merchantOrderId;

        public InvoiceAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public InvoiceAddRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public InvoiceAddRequestBuilder withInvoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        public InvoiceAddRequestBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public InvoiceAddRequestBuilder withIssueDate(String issueDate) {
            this.issueDate = issueDate;
            return this;
        }

        public InvoiceAddRequestBuilder withDueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public InvoiceAddRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public InvoiceAddRequestBuilder withOriginalAmount(BigDecimal originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }

        public InvoiceAddRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public InvoiceAddRequestBuilder withDealerTypeName(String dealerTypeName) {
            this.dealerTypeName = dealerTypeName;
            return this;
        }

        public InvoiceAddRequestBuilder withExtra(Map<String, String> extra){
            this.extra = extra;
            return this;
        }

        public InvoiceAddRequestBuilder withMerchantOrderId(String merchantOrderId){
            this.merchantOrderId = merchantOrderId;
            return this;
        }

        public InvoiceAddRequest build() {
            InvoiceAddRequest request = new InvoiceAddRequest();
            request.authentication = this.authentication;
            request.dealerCode = this.dealerCode;
            request.invoiceId = this.invoiceId;
            request.name = this.name;
            request.issueDate = this.issueDate;
            request.dueDate = this.dueDate;
            request.amount = this.amount;
            request.originalAmount = this.originalAmount;
            request.currency = this.currency;
            request.dealerTypeName = this.dealerTypeName;
            request.extra = this.extra;
            request.merchantOrderId = this.merchantOrderId;
            return request;
        }
    }
}
