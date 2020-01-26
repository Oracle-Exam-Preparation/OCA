package com.trl.lambda;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 06/08/19
 */
public class Main {

    public static void main(String[] args) {

        PathMatcher matcher1 = (Path p) -> {
            return (p.toString().contains("DNA"));
        };

        PathMatcher matcher2 = p -> {
            return (p.toString().equals("DNA"));
        };

        PathMatcher matcher3 = (Path p) -> p.toString().startsWith("DNA");

        PathMatcher matcher4 = p -> p.toString().endsWith("DNA");

        Path path = FileSystems.getDefault().getPath("\\dna_data\\DNA_results.txt");

        System.out.print(matcher1.matches(path));
        System.out.print(" " + matcher2.matches(path));
        System.out.print(" " + matcher3.matches(path));
        System.out.print(" " + matcher4.matches(path));

    }

}
