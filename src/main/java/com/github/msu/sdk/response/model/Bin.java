package com.github.msu.sdk.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class Bin {
	@JsonProperty("bin")
	private String binValue;
	private String cardBrand;
	private String cardType;
	private String cardLevel;
	private String cardNetwork;
	private String issuer;
	private String virtual;
	private String cardName;
	private String countryIsoA3;
	private String issuerType;

	public String getBinValue() {
		return binValue;
	}

	public String getCardBrand() {
		return cardBrand;
	}

	public String getCardType() {
		return cardType;
	}

	public String getCardLevel() {
		return cardLevel;
	}

	public String getCardNetwork() {
		return cardNetwork;
	}

	public String getIssuer() {
		return issuer;
	}

	public String getVirtual() {
		return virtual;
	}

	public String getCardName() {
		return cardName;
	}

	public String getCountryIsoA3() {
		return countryIsoA3;
	}

	public String getIssuerType() {
		return issuerType;
	}

}
