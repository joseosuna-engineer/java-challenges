/*
 * MIT License
 *
 * Copyright (c)  2021 Jose Osuna
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package com.prottonne.challenges;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MyFileReader {
    public static void main(String[] args) {
        final String fileName = "resources/files/InputFile.txt";
        final Path filePath = Paths.get(fileName);

        readLineByLine(filePath, StandardCharsets.UTF_8);
        readAllFile(filePath, StandardCharsets.UTF_8);

    }

    private static void readLineByLine(Path filePath, Charset charset) {
        // The file is closed by closing the stream.
        // Try-with-resources to ensure that each resource is closed at the end of the statement
        try (Stream<String> stream = Files.lines(filePath, charset)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readAllFile(Path filePath, Charset charset) {
        try {
            //The method ensures that the file is closed when all content have been read
            String contentFile = Files.readString(filePath, charset);
            System.out.println(contentFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
