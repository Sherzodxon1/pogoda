package com.example.pogoda.dto.weatherDTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDTO {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("scaleName")
    private String scaleName;

    @JsonProperty("degree")
    private Integer degree;
}
