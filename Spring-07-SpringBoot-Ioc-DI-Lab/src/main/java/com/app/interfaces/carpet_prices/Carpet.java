package com.app.interfaces.carpet_prices;

import com.app.enums.City;
import java.math.BigDecimal;

public interface Carpet {

  BigDecimal getSqFtPrice(City city);
}
