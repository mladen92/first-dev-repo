package com.app.services.floor;

import com.app.interfaces.floor_types.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class LivingRoom implements Floor {
    @Value("${length}")
    BigDecimal length;
    @Value("${width}")
    BigDecimal width;

    @Override
    public BigDecimal getArea() {
        return width.multiply(length);
    }
}
