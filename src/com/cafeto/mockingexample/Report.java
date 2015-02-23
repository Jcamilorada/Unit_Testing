package com.cafeto.mockingexample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Report {

	@Getter
    @Setter
    private String titulo;
    @Getter @Setter private String informacion;
}
