package com.darkknight.spiderbot.utility;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Pair {
    private String source;
    private String dest;

    Pair(String source, String dest) {
        this.source = source;
        this.dest = dest;
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, dest);
    }

    @Override
    public boolean equals(Object obj) {
        Pair pair = (Pair)obj;

        if (this.hashCode() == pair.hashCode()) {
            if (source.equals(pair.getSource()) && dest.equals(pair.getDest())) {
                return true;
            }
            return false;
        }
        return false;
    }
}
