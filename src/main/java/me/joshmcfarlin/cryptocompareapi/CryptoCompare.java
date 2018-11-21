package me.joshmcfarlin.cryptocompareapi;

import me.joshmcfarlin.cryptocompareapi.api.*;

/**
 * The class's default class to access all the methods
 */
public class CryptoCompare {
    private Coins coinsApi;
    private Exchanges exchangesApi;
    private Historic historicApi;
    private Market marketApi;
    private Mining miningApi;
    private News newsApi;
    private Social socialApi;

    private String extraParams;
    private Boolean sign;

    /**
     * Sets extraParams and sign to null
     * @see #CryptoCompare(String, Boolean)
     */
    public CryptoCompare() {
        this(null, null);
    }

    /**
     * Only instantiates the object with extraParams, sign is set to null
     * @see #CryptoCompare(String, Boolean)
     */
    public CryptoCompare(String extraParams) {
        this(extraParams, null);
    }

    /**
     * Only instantiates the object with sign, extraParams is set to null
     * @see #CryptoCompare(String, Boolean)
     */
    public CryptoCompare(Boolean sign) {
        this(null, sign);
    }

    /**
     * Creates an object to access all the API methods
     * @param extraParams The name of your application (we recommend you send it) [Max character length: 2000]
     * @param sign If set to true, the server will sign the requests (by default we don't sign them), this is useful for usage in smart contracts
     */
    public CryptoCompare(String extraParams, Boolean sign) {
        this.extraParams = extraParams;
        this.sign = sign;

        coinsApi = new Coins();
        exchangesApi = new Exchanges();
        historicApi = new Historic();
        marketApi = new Market();
        miningApi = new Mining();
        newsApi = new News();
        socialApi = new Social();
    }

    /**
     * {@link CryptoCompare#extraParams}
     */
    public String getExtraParams() {
        return extraParams;
    }

    public void setExtraParams(String extraParams) {
        this.extraParams = extraParams;
    }

    /**
     * {@link CryptoCompare#sign}
     */
    public Boolean getSign() {
        return sign;
    }

    public void setSign(Boolean sign) {
        this.sign = sign;
    }

    public Coins getCoinsApi() {
        return coinsApi;
    }

    public Exchanges getExchangesApi() {
        return exchangesApi;
    }

    public Historic getHistoricApi() {
        return historicApi;
    }

    public Market getMarketApi() {
        return marketApi;
    }

    public Mining getMiningApi() {
        return miningApi;
    }

    public News getNewsApi() {
        return newsApi;
    }

    public Social getSocialApi() {
        return socialApi;
    }
}
