package com.tistory.heowc.visit;

public interface NodeVisitor {
    public void visit(DirectoryPart directoryPart);
    public void visit(FilePart filePart);
}
