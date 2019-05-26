package io.vickleford.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

@Component
public class FileFortuneService implements FortuneService {
    @Value("${filefortunes.filepath}")
    private String fortunesFilePath;

    public String getFortune() {
        ArrayList<String> lines = new ArrayList<String>();
        System.out.println("trying to open " + fortunesFilePath);

        try {
            File f = new File(fortunesFilePath);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                lines.add(s.nextLine());
            }
            s.close();
        } catch (FileNotFoundException e) {
            return null;
        }

        Random r = new Random();
        int i = lines.size();
        if ("".equals(lines.get(i-1))) {
            i--;
        }
        if (i > 0) {
            return lines.get(r.nextInt(i));
        } else {
            return lines.get(0);
        }
    }
}
