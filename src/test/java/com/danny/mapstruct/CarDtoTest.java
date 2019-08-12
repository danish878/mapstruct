package com.danny.mapstruct;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CarDtoTest {

    @Test
    public void shouldMapCarToDto() {
        //given
        Car car = new Car("Morris", 5, CarType.BMW);

        //when
        CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);

        //then
        assertNotNull(carDto);
        assertEquals(carDto.getMake(), "Morris");
        assertEquals(carDto.getSeatCount(), 5);
        assertEquals(carDto.getType(), "BMW");
    }
}