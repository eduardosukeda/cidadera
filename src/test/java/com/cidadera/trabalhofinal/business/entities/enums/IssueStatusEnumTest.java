package com.cidadera.trabalhofinal.business.entities.enums;

import com.cidadera.trabalhofinal.business.entities.Issue;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IssueStatusEnumTest {

    @Test
    void valuesAberta() {
        IssueStatusEnum Category = IssueStatusEnum.ABERTA;
        assertEquals(IssueStatusEnum.valueOf("ABERTA"), Category);
    }
    @Test
    void valuesResolvida(){
        IssueStatusEnum Category = IssueStatusEnum.RESOLVIDA;
        assertEquals(IssueStatusEnum.valueOf("RESOLVIDA"), Category);
    }
    @Test
    void valuesEncerrada(){
        IssueStatusEnum Category = IssueStatusEnum.ENCERRADA;
        assertEquals(IssueStatusEnum.valueOf("ENCERRADA"), Category);
    }

}