package com.codingdojo.diamond;

public class Diamond {

    public static final char INITIAL_LETTER = 'A';
    private final char finalLetter;

    public Diamond(char finalLetter) {

        this.finalLetter = finalLetter;
    }

    public Diamond() {
        this.finalLetter = INITIAL_LETTER;
    }

    public String print() {
        int levels = finalLetter - INITIAL_LETTER;
        StringBuilder diamondBuilder = new StringBuilder();
        if(levels>0){
            for(int indent = 0;indent<levels;indent++) {
                addIndentation(diamondBuilder);
            }
        }
        diamondBuilder.append(INITIAL_LETTER);
        for(int level=1;level<levels;level++){
            char letter = (char)(INITIAL_LETTER + level);
            addLineBreak(diamondBuilder);
            diamondBuilder.append(letter);
            addIndentation(diamondBuilder);
            diamondBuilder.append(letter);
        }

        if(levels>0){
            addLineBreak(diamondBuilder);
            diamondBuilder.append(finalLetter);
            if (levels == 1){
                addIndentation(diamondBuilder);

            } else {
                for (int indent = 0; indent <= levels; indent++) {
                    addIndentation(diamondBuilder);
                }
            }
            diamondBuilder.append(finalLetter);
        }

        for(int level=1;level<levels;level++){
            char letter = (char)(finalLetter - level);
            addLineBreak(diamondBuilder);
            diamondBuilder.append(letter);
            addIndentation(diamondBuilder);
            diamondBuilder.append(letter);
        }
        if(levels>0){
            addLineBreak(diamondBuilder);
            for(int indent = 0;indent<levels;indent++) {
                addIndentation(diamondBuilder);
            }
            diamondBuilder.append(INITIAL_LETTER);
        }
        return diamondBuilder.toString();
    }

    private void addIndentation(StringBuilder diamondBuilder) {
        diamondBuilder.append(' ');
    }

    private void addLineBreak(StringBuilder diamondBuilder) {
        diamondBuilder.append("\n");
    }
}
