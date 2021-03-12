package com.gridnine.testing.flights;


import java.util.List;
import java.util.stream.Collectors;

/**
 * Bean that represents a flight.
 */
public class Flight {
    private static int index = 0;

    private final int count = 1 + index;
    private final List<Segment> segments;

    Flight(final List<Segment> segs) {
        segments = segs;
        index++;
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public int getIndex() {
        return count;
    }

    @Override
    public String toString() {
        return segments.stream().map(Object::toString)
                .collect(Collectors.joining(" "));
    }
}

