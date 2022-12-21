package com.example.blokus.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum Piece {

    T(Stream.of(
                    new Coordinate(0, 1)
                    , new Coordinate(1, 0)
                    , new Coordinate(1, 1)
                    , new Coordinate(2, 1)
            )
            .collect(Collectors.toList())),
    I(Stream.of(
                    new Coordinate(0, 1)
                    , new Coordinate(0, 2)
                    , new Coordinate(0, 3)
                    , new Coordinate(0, 4)
                    , new Coordinate(0, 5)
            )
            .collect(Collectors.toList())),
    G(Stream.of(
                    new Coordinate(0, 0)
                    , new Coordinate(1, 0)
                    , new Coordinate(0, 1)
                    , new Coordinate(0, 2)
            )
            .collect(Collectors.toList())),
    G2(Stream.of(
                    new Coordinate(0, 0)
                    , new Coordinate(1, 0)
                    , new Coordinate(1, 1)
                    , new Coordinate(1, 2)
                    , new Coordinate(1, 3)
            )
            .collect(Collectors.toList()));

    private List<Coordinate> coordinates;

//        public List<Coordinate> rotateRight() {
//
//        }
}