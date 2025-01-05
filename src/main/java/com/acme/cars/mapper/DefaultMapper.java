package com.acme.cars.mapper;

import com.acme.cars.dto.DefaultDTO;

import java.util.List;
import java.util.stream.Collectors;

public class DefaultMapper {

    private static DefaultDTO toDefaultDTO(String value) {
        return new DefaultDTO(value);
    }

    public static List<DefaultDTO> toDefaultDTOList(List<String> values) {
        return values.stream()
                .map(DefaultMapper::toDefaultDTO)
                .collect(Collectors.toList());
    }

}
