package com.app.services.carpet;

import com.app.enums.City;
import com.app.interfaces.carpet_prices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CarpetTX implements Carpet {
    private static final Map<City, BigDecimal> sqPriceForCity = new HashMap<>();

    static {
        sqPriceForCity.put(City.AUSTIN, new BigDecimal("1.32"));
        sqPriceForCity.put(City.DULLES, new BigDecimal("1.92"));
        sqPriceForCity.put(City.SAN_ANTONIO, new BigDecimal("1.65"));

    }

    @Override
    public BigDecimal getSqFtPrice(com.app.enums.City city) {
        BigDecimal defaultValue = BigDecimal.ZERO;
        Optional<Map.Entry<City, BigDecimal>> collect = sqPriceForCity.entrySet().stream().filter(x -> x.getKey() == city).findFirst();
        return collect.isPresent() ? collect.get().getValue() : defaultValue;
    }
}
