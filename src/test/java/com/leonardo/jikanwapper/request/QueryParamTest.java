package com.leonardo.jikanwapper.request;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.*;

class QueryParameterTest {

    @Test
    @DisplayName("Should construct an object with only one String as argument, and split it on key and value properties")
    void construct1Test() {

        //given
        String query = "q=something";

        //when
        QueryParameter actual = new QueryParameter(query);

        //then
        assertEquals("q", actual.getKey());
        assertEquals("something", actual.getValue());

    }

    @Test
    @DisplayName("Should construct an object with a String as first argument and a Object as the second one")
    void construct2Test() {

        //given
        String key = "page";
        Integer value = 2;

        //when
        QueryParameter actual = new QueryParameter(key, value);

        //then
        assertEquals(key, actual.getKey());
        assertEquals(value.toString(), actual.getValue());

    }

    @Test
    @DisplayName("Should consider only the key property on equals and hashCode methods")
    void equalsAndHashCodeTest() {

        //given
        Set<QueryParameter> queries = new HashSet<>();
        QueryParameter param1 = new QueryParameter("page=1");
        QueryParameter param2 = new QueryParameter("page=2");
        QueryParameter param3 = new QueryParameter("q=jump");

        //when
        queries.add(param1);
        queries.add(param2);
        queries.add(param3);

        //then
        assertTrue(queries.contains(param1));
        assertTrue(queries.contains(param3));
        assertTrue(() -> {
            AtomicReference<Boolean> flag = new AtomicReference<>(true);

            queries.forEach(query -> {
                if(query.getValue().equals("2")) {
                    flag.set(false);
                }
            });

            return flag.get();
        });

    }

}