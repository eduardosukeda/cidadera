package com.cidadera.trabalhofinal.business.entities;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static com.cidadera.trabalhofinal.business.entities.enums.UserTypeEnum.ADMINISTRADOR;
import static java.lang.Long.parseLong;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getId() throws NoSuchFieldException, IllegalAccessException{
        final User userId = new User();
        final Field field = userId.getClass().getDeclaredField("id");
        field.setAccessible(true);
        field.set(userId, parseLong("01010101"));

        final Long result = userId.getId();

        assertEquals(result,  parseLong("01010101"));
    }

    @Test
    void setId() throws NoSuchFieldException, IllegalAccessException{
        final User userid = new User();

        userid.setId(parseLong("01010101"));

        final Field field = userid.getClass().getDeclaredField("id");
        field.setAccessible(true);
        assertEquals(field.get(userid), parseLong("01010101"));
    }

    @Test
    void getName() throws NoSuchFieldException, IllegalAccessException{
        final User userName = new User();
        final Field field = userName.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(userName, "Ballharar");

        final String result = userName.getName();

        assertEquals(result,  "Ballharar");
    }

    @Test
    void setName() throws NoSuchFieldException, IllegalAccessException{
        final User userName = new User();

        userName.setName("Ballharar");

        final Field field = userName.getClass().getDeclaredField("name");
        field.setAccessible(true);
        assertEquals(field.get(userName), "Ballharar");
    }

    @Test
    void getUserType() throws  NoSuchFieldException, IllegalAccessException{
        final User userType = new User();
        final Field field = userType.getClass().getDeclaredField("userType");
        field.setAccessible(true);
        field.set(userType, ADMINISTRADOR);

        final Enum result = userType.getUserType();

        assertEquals(result,  ADMINISTRADOR);
    }

    @Test
    void setUserType() throws  NoSuchFieldException, IllegalAccessException{
        final User userType = new User();

        userType.setUserType(ADMINISTRADOR);

        final Field field = userType.getClass().getDeclaredField("userType");
        field.setAccessible(true);
        assertEquals(field.get(userType), ADMINISTRADOR);
    }
}