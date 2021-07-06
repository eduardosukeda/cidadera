package com.cidadera.trabalhofinal.business.entities.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IssueCategoryEnumTest {

    @Test
    void valuesAgua() {
        IssueCategoryEnum Category = IssueCategoryEnum.AGUA;
        assertEquals(IssueCategoryEnum.valueOf("AGUA"), Category);
    }
    @Test
    void valuesIluminacao(){
        IssueCategoryEnum Category = IssueCategoryEnum.ILUMINACAO;
        assertEquals(IssueCategoryEnum.valueOf("ILUMINACAO"), Category);
    }
    @Test
    void valuesBuracoNaVia(){
        IssueCategoryEnum Category = IssueCategoryEnum.BURACO_NA_VIA;
        assertEquals(IssueCategoryEnum.valueOf("BURACO_NA_VIA"), Category);
    }

    @Test
    void valuesEsgoto(){
        IssueCategoryEnum Category = IssueCategoryEnum.ESGOTO;
        assertEquals(IssueCategoryEnum.valueOf("ESGOTO"), Category);
    }

    @Test
    void valuesSeguranca(){
        IssueCategoryEnum Category = IssueCategoryEnum.SEGURANCA;
        assertEquals(IssueCategoryEnum.valueOf("SEGURANCA"), Category);
    }
}