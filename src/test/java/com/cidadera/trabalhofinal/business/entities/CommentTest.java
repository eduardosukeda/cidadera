package com.cidadera.trabalhofinal.business.entities;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static java.lang.Long.parseLong;
import static org.junit.jupiter.api.Assertions.*;

class CommentTest {

    @Test
    void getId() throws NoSuchFieldException, IllegalAccessException{
        final Comment idcommentget = new Comment();
        final Field field = idcommentget.getClass().getDeclaredField("id");
        field.setAccessible(true);
        field.set(idcommentget, parseLong("01010101"));

        final Long result = idcommentget.getId();

        assertEquals(result,  parseLong("01010101"));
        //assertEquals(result,  10L);

    }

    @Test
    void setId() throws NoSuchFieldException, IllegalAccessException{
        final Comment idcommentset = new Comment();

        idcommentset.setId(parseLong("01010101"));

        final Field field = idcommentset.getClass().getDeclaredField("id");
        field.setAccessible(true);
        assertEquals(field.get(idcommentset), parseLong("01010101"));

    }

    @Test
    void getComment() throws NoSuchFieldException, IllegalAccessException{
        final Comment idcommentget = new Comment();
        final Field field = idcommentget.getClass().getDeclaredField("comment");
        field.setAccessible(true);
        field.set(idcommentget, "Olá mundo");

        final String result = idcommentget.getComment();

        assertEquals(result,  "Olá mundo");
    }

    @Test
    void setComment() throws NoSuchFieldException, IllegalAccessException{
        final Comment idcommentset = new Comment();

        idcommentset.setComment("Olá mundo");

        final Field field = idcommentset.getClass().getDeclaredField("comment");
        field.setAccessible(true);
        assertEquals(field.get(idcommentset), "Olá mundo");
    }

    @Test
    void getImage() throws NoSuchFieldException, IllegalAccessException{
            final Comment imageget = new Comment();
            final Field field = imageget.getClass().getDeclaredField("image");
            field.setAccessible(true);
            field.set(imageget, "https://www.google.com");

            final String result = imageget.getImage();

            assertEquals(result,  "https://www.google.com");
    }

    @Test
    void setImage() throws NoSuchFieldException, IllegalAccessException{
        final Comment imageset = new Comment();

        imageset.setImage("https://www.google.com");

        final Field field = imageset.getClass().getDeclaredField("image");
        field.setAccessible(true);
        assertEquals(field.get(imageset), "https://www.google.com");
    }

    @Test
    void getIssue() throws NoSuchFieldException, IllegalAccessException{
        final Comment commentIssue = new Comment();
        final Issue commentIssueInside = new Issue();
        final Field field = commentIssue.getClass().getDeclaredField("issue");
        field.setAccessible(true);
        field.set(commentIssue, commentIssueInside);

        final Issue result = commentIssue.getIssue();

        assertEquals(result,  commentIssueInside);
    }

    @Test
    void setIssue() throws NoSuchFieldException, IllegalAccessException{
        final Comment commentIssue = new Comment();
        final Issue commentIssueInside = new Issue();

        commentIssue.setIssue(commentIssueInside);

        final Field field = commentIssue.getClass().getDeclaredField("issue");
        field.setAccessible(true);
        assertEquals(field.get(commentIssue), commentIssueInside);
    }
}