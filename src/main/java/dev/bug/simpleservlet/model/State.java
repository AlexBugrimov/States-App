package dev.bug.simpleservlet.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class State {

    private final String shortName;
    private final String name;
}
