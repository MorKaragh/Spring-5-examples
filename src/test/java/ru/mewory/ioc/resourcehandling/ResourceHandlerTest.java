package ru.mewory.ioc.resourcehandling;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ResourceHandlerTest {

    @Autowired
    private ResourceHandler resourceHandler;

    @Test
    public void testResource() throws IOException {
        assertTrue(resourceHandler.getClasspathFile().getFile().exists());
        String fileContent;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(resourceHandler.getClasspathFile().getInputStream(), StandardCharsets.UTF_8))) {
            fileContent = br.lines().collect(Collectors.joining(System.lineSeparator()));
        }
        assertTrue(fileContent.contains("<bean"));
    }

}