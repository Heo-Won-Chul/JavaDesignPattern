package com.tistory.heowc.visit;

public class LinuxPathVisitor implements NodeVisitor {

    @Override
    public void visit(DirectoryPart directoryPart) {
        System.out.println("/" + directoryPart.getName());
    }

    @Override
    public void visit(FilePart filePart) {
        System.out.println("└ " + filePart.getName());
    }
}
