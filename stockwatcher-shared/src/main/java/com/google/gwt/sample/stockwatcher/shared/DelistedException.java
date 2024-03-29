package com.google.gwt.sample.stockwatcher.shared;

import java.io.Serializable;

public class DelistedException extends Exception implements Serializable {
	private static final long serialVersionUID = 9217289749063979133L;

	private String symbol;

    public DelistedException() {
    }

    public DelistedException(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }

}
