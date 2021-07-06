package com.cidadera.trabalhofinal.business.entities;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.cidadera.trabalhofinal.business.entities.Comment;

import static com.cidadera.trabalhofinal.business.entities.enums.IssueCategoryEnum.AGUA;
import static com.cidadera.trabalhofinal.business.entities.enums.IssueStatusEnum.ABERTA;
import static java.awt.geom.Path2D.contains;
import static java.lang.Long.parseLong;
import static java.time.LocalDate.of;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.*;

class IssueTest {

    @Test
    void getId() throws  NoSuchFieldException, IllegalAccessException{
        final Issue issueId = new Issue();
        final Field field = issueId.getClass().getDeclaredField("id");
        field.setAccessible(true);
        field.set(issueId, parseLong("01010101"));

        final Long result = issueId.getId();

        assertEquals(result,  parseLong("01010101"));
    }

    @Test
    void setId() throws  NoSuchFieldException, IllegalAccessException{
        final Issue issueId = new Issue();

        issueId.setId(parseLong("01010101"));

        final Field field = issueId.getClass().getDeclaredField("id");
        field.setAccessible(true);
        assertEquals(field.get(issueId), parseLong("01010101"));
    }

    @Test
    void getTitle() throws  NoSuchFieldException, IllegalAccessException{
        final Issue issueTitle = new Issue();
        final Field field = issueTitle.getClass().getDeclaredField("title");
        field.setAccessible(true);
        field.set(issueTitle, "Not a title");

        final String result = issueTitle.getTitle();

        assertEquals(result,  "Not a title");
    }

    @Test
    void setTitle() throws  NoSuchFieldException, IllegalAccessException{
        final Issue issueTitle = new Issue();

        issueTitle.setTitle("Not a Title");

        final Field field = issueTitle.getClass().getDeclaredField("title");
        field.setAccessible(true);
        assertEquals(field.get(issueTitle), "Not a Title");
    }

    @Test
    void getDescription() throws  NoSuchFieldException, IllegalAccessException{
        final Issue issueDescription = new Issue();
        final Field field = issueDescription.getClass().getDeclaredField("description");
        field.setAccessible(true);
        field.set(issueDescription, "Not a description");

        final String result = issueDescription.getDescription();

        assertEquals(result, "Not a description");
    }

    @Test
    void setDescription() throws  NoSuchFieldException, IllegalAccessException{
        final Issue issueDescription = new Issue();

        issueDescription.setDescription("Not a Description");

        final Field field = issueDescription.getClass().getDeclaredField("description");
        field.setAccessible(true);
        assertEquals(field.get(issueDescription), "Not a Description");
    }

    @Test
    void getDate() throws  NoSuchFieldException, IllegalAccessException{
        final Issue issueDate = new Issue();
        final Field field = issueDate.getClass().getDeclaredField("date");
        field.setAccessible(true);
        field.set(issueDate, of(1990, 12, 31));

        final LocalDate result = issueDate.getDate();

        assertEquals(result, of(1990, 12, 31));
    }

    @Test
    void setDate() throws  NoSuchFieldException, IllegalAccessException{
        final Issue issueDate = new Issue();

        issueDate.setDate(of(1990, 12, 31));

        final Field field = issueDate.getClass().getDeclaredField("date");
        field.setAccessible(true);
        assertEquals(field.get(issueDate), of(1990, 12, 31));
    }

    @Test
    void getNeighborhood() throws  NoSuchFieldException, IllegalAccessException{
        final Issue issueNeighborhood = new Issue();
        final Field field = issueNeighborhood.getClass().getDeclaredField("neighborhood");
        field.setAccessible(true);
        field.set(issueNeighborhood, "Hollywood");

        final String result = issueNeighborhood.getNeighborhood();

        assertEquals(result,  "Hollywood");
    }

    @Test
    void setNeighborhood() throws  NoSuchFieldException, IllegalAccessException{
        final Issue issueNeighborhood = new Issue();

        issueNeighborhood.setNeighborhood("Hollywood");

        final Field field = issueNeighborhood.getClass().getDeclaredField("neighborhood");
        field.setAccessible(true);
        assertEquals(field.get(issueNeighborhood), "Hollywood");
    }

    @Test
    void getStreet() throws  NoSuchFieldException, IllegalAccessException{
        final Issue issueStreet = new Issue();
        final Field field = issueStreet.getClass().getDeclaredField("street");
        field.setAccessible(true);
        field.set(issueStreet, "Azenha");

        final String result = issueStreet.getStreet();

        assertEquals(result,  "Azenha");
    }

    @Test
    void setStreet() throws  NoSuchFieldException, IllegalAccessException{
        final Issue issueStreet = new Issue();

        issueStreet.setStreet("Azenha");

        final Field field = issueStreet.getClass().getDeclaredField("street");
        field.setAccessible(true);
        assertEquals(field.get(issueStreet), "Azenha");
    }

    @Test
    void getCategory() throws  NoSuchFieldException, IllegalAccessException{
        final Issue issueCategory = new Issue();
        final Field field = issueCategory.getClass().getDeclaredField("category");
        field.setAccessible(true);
        field.set(issueCategory, AGUA);

        final Enum result = issueCategory.getCategory();

        assertEquals(result,  AGUA);
    }

    @Test
    void setCategory() throws  NoSuchFieldException, IllegalAccessException{
        final Issue issueCategory = new Issue();

        issueCategory.setCategory(AGUA);

        final Field field = issueCategory.getClass().getDeclaredField("category");
        field.setAccessible(true);
        assertEquals(field.get(issueCategory), AGUA);
    }

    @Test
    void getImageLink() throws  NoSuchFieldException, IllegalAccessException{
        final Issue issueImage = new Issue();
        final Field field = issueImage.getClass().getDeclaredField("imageLink");
        field.setAccessible(true);
        field.set(issueImage, "https://www.google.com.br");

        final String result = issueImage.getImageLink();

        assertEquals(result,  "https://www.google.com.br");
    }

    @Test
    void setImageLink() throws  NoSuchFieldException, IllegalAccessException{
        final Issue issueImage = new Issue();

        issueImage.setImageLink("https://www.google.com.br");

        final Field field = issueImage.getClass().getDeclaredField("imageLink");
        field.setAccessible(true);
        assertEquals(field.get(issueImage), "https://www.google.com.br");
    }

    @Test
    void getIssueStatus() throws  NoSuchFieldException, IllegalAccessException{
        final Issue issueStatus = new Issue();
        final Field field = issueStatus.getClass().getDeclaredField("issueStatus");
        field.setAccessible(true);
        field.set(issueStatus, ABERTA);

        final Enum result = issueStatus.getIssueStatus();

        assertEquals(result,  ABERTA);
    }

    @Test
    void setIssueStatus() throws  NoSuchFieldException, IllegalAccessException{
        final Issue issueStatus = new Issue();

        issueStatus.setIssueStatus(ABERTA);

        final Field field = issueStatus.getClass().getDeclaredField("issueStatus");
        field.setAccessible(true);
        assertEquals(field.get(issueStatus), ABERTA);
    }

    @Test
    void getComment() throws  NoSuchFieldException, IllegalAccessException {
        final Issue issueComment = new Issue();

        final List result = issueComment.getComments();

        assertEquals(result,  null);
    }

    @Test
    void setComment() throws  NoSuchFieldException, IllegalAccessException{
        final Issue issueComment = new Issue();

        issueComment.setComments(null);

        final Field field = issueComment.getClass().getDeclaredField("comments");
        field.setAccessible(true);
        assertEquals(field.get(issueComment), null);
    }
}