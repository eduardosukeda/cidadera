package com.cidadera.trabalhofinal.business.entities.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTypeEnumTest {
    @Test
    void valuesNormal(){
        UserTypeEnum Category = UserTypeEnum.NORMAL;
        assertEquals(UserTypeEnum.valueOf("NORMAL"), Category);
    }

    @Test
    void valuesAdministrador(){
        UserTypeEnum Category = UserTypeEnum.ADMINISTRADOR;
        assertEquals(UserTypeEnum.valueOf("ADMINISTRADOR"), Category);
    }

    @Test
    void valuesOficial(){
        UserTypeEnum Category = UserTypeEnum.OFICIAL;
        assertEquals(UserTypeEnum.valueOf("OFICIAL"), Category);
    }

}