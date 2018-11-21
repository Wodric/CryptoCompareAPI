# CryptoCompareAPI
A Java implementation of the [CryptoCompare API service.](https://min-api.cryptocompare.com/)

## Disclamer 

This version of CryptoCompareAPI is not the original one. I duplicate the repository [Josh-McFarlin/CryptoCompareAPI](https://github.com/Josh-McFarlin/CryptoCompareAPI)

But, for my needs I need to improve it and to follow the API updates. Then, I decided to split the project to make it available for everyone.

## Download 

[![Release](https://jitpack.io/v/Wodric/CryptoCompareAPI.svg)](https://jitpack.io/private#Wodric/CryptoCompareAPI/0.1)

#### Gradle


```

repositories {
	...
	maven { url 'https://jitpack.io' }
}

dependencies {
	implementation 'com.github.Wodric:CryptoCompareAPI:Tag'
}
```

#### Maven

```xml
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>
```
```xml
<dependency>
	<groupId>com.github.Wodric</groupId>
	<artifactId>CryptoCompareAPI</artifactId>
	<version>0.2.0</version>
</dependency>
```

## Usage


```java
public class Test {
    private CryptoCompareAPI api = new CryptoCompareAPI();
    
    public static void main(String[] args) {
        double dayAverage = api.historic.getDayAverage("BTC", "USD");
        System.out.println("Bitcoin day average:");
        System.out.println(dayAverage);

        Market.ExchangeAverage exchangeAverage = api.market.getExchangeAverage("BTC", "USD", "Coinbase,Kraken,Bitstamp");
        System.out.println("Bitcoin average from Coinbase, Kraken, and Bitstamp:");
        System.out.println(exchangeAverage.getHigh24Hour());

        Map<String, Double> btcPrice = api.market.getPrice("BTC", "USD,EUR");
        System.out.println("Bitcoin price in USD and EUR:");
        System.out.println(btcPrice);
    }
}
```

An example is provided in the test sources.

## Documentation

No documentation avalaible for the moment. You could use the version of Josh McFarlin instead :

Documentation is provided at [https://joshmcfarlin.me/CryptoCompareAPI/](https://joshmcfarlin.me/CryptoCompareAPI/)

## License
This project is developed under the MIT license. This can be found at [LICENSE](LICENSE).
