package com.lexsci.questions.domain;

public enum Subject {
    MATH("Mathematics"),PHYS("Physics"),CHEM("Chemistry"),BIO("Biology"),EARTH_ENVIR("Earth and Enviroment"),
    COMP("Computer Science");
    private String label;
    private Subject(String label) {
        this.label = label;
    }
    public static Subject findByLabel(String byLabel) {
        for (Subject s : Subject.values()) {
            if (s.label.equalsIgnoreCase(byLabel))
                return s;
        }
        return null;
    }
}
