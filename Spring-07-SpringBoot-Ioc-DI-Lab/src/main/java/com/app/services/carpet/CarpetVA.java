package com.app.services.carpet;

import com.app.enums.City;
import com.app.interfaces.carpet_prices.Carpet;
import com.sun.xml.internal.xsom.impl.scd.Iterators;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CarpetVA implements Carpet {

    private static final Map<City, BigDecimal> sqPriceForCity = new HashMap<>();

    static {
        sqPriceForCity.put(City.MCLEAN, new BigDecimal("4.32"));
        sqPriceForCity.put(City.ARLINGTON, new BigDecimal("2.92"));
        sqPriceForCity.put(City.FAIRFAX, new BigDecimal("4.65"));

    }

    @Override
    public BigDecimal getSqFtPrice(com.app.enums.City city) {
        BigDecimal defaultValue = BigDecimal.ZERO;
        Optional<Map.Entry<City, BigDecimal>> collect = sqPriceForCity.entrySet().stream().filter(x -> x.getKey() == city).findFirst();

        return collect.isPresent() ? collect.get().getValue() : defaultValue;
    }
}
