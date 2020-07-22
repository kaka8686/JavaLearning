package com.spike.abstracttest;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

//public class MyFileVisitor implements FileVisitor {
//    @Override
//    public FileVisitResult preVisitDirectory(Object dir, BasicFileAttributes attrs) throws IOException {
//        System.out.println(dir);
//        return FileVisitResult.CONTINUE;
//    }
//
//    @Override
//    public FileVisitResult visitFile(Object file, BasicFileAttributes attrs) throws IOException {
//        System.out.println(file);
//        return FileVisitResult.CONTINUE;
//    }
//
//    @Override
//    public FileVisitResult visitFileFailed(Object file, IOException exc) throws IOException {
//        return FileVisitResult.CONTINUE;
//    }
//
//    @Override
//    public FileVisitResult postVisitDirectory(Object dir, IOException exc) throws IOException {
//        return FileVisitResult.CONTINUE;
//    }
//}


public class FileFilterVisitor extends SimpleFileVisitor<Path> {

    private String extension;
    private List<String> filteredNames = new ArrayList<>();

    public FileFilterVisitor(String extension) {
        this.extension = extension;
    }

    public List<String> getFilteredNames() {
        return filteredNames;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attr) throws IOException {
        if (file.getFileName().toString().endsWith(extension)) {
            filteredNames.add(file.getFileName().toString());
        }
        return FileVisitResult.CONTINUE;
    }
}
