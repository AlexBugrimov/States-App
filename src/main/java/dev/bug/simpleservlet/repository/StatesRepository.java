package dev.bug.simpleservlet.repository;

import com.google.common.collect.ImmutableList;
import dev.bug.simpleservlet.model.State;
import java.util.List;

public class StatesRepository implements Repository<State> {

    private final List<State> states = ImmutableList.<State>builder()
            .add(
                    new State("AL", "Alabama"),
                    new State("AK", "Alaska"),
                    new State("AZ", "Arizona"),
                    new State("AR", "Arkansas"),
                    new State("CA", "California"),
                    new State("CO", "Colorado"),
                    new State("CT", "Connecticut"),
                    new State("FL", "Florida"),
                    new State("GA", "Georgia")
            ).build();

    @Override
    public List<State> findAll() {
        return states;
    }
}
