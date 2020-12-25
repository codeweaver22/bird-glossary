package com.codebeaver.repository;

import com.codebeaver.model.Bird;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class BirdDao {

    List<Bird> birds = Stream.of(
            new Bird("Oriole", "Yellow", "Icteridae"),
            new Bird("Curaeus", "Black", "Icteridae"),
            new Bird("Red-headed woodpecker", "Red", "Picidae")
    ).collect(Collectors.toList());

    public List<Bird> getBirds() {
        return birds;
    }

    public List<Bird> getBirdByName(String name) {
        return birds.stream().filter(b -> b.getName().equals(name)).collect(Collectors.toList());
    }
}
