package com.training.microservices.currencyservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//prefix the variable used in the application.properties
@ConfigurationProperties("currency-service")
public class Configuration {
	private int inr;
	private int usd;
	
	public Configuration() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Configuration [inr=" + inr + ", usd=" + usd + "]";
	}

	public int getInr() {
		return inr;
	}

	public void setInr(int inr) {
		this.inr = inr;
	}

	public int getUsd() {
		return usd;
	}

	public void setUsd(int usd) {
		this.usd = usd;
	}

	public Configuration(int inr, int usd) {
		super();
		this.inr = inr;
		this.usd = usd;
	}
}
