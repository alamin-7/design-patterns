package com.spring;

public class Topics {

    private String history;
    private String philosophy;

    public Topics(String history, String philosophy) {
        this.history = history;
        this.philosophy = philosophy;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getPhilosophy() {
        return philosophy;
    }

    public void setPhilosophy(String philosophy) {
        this.philosophy = philosophy;
    }

    @Override
    public String toString() {
        return "Topics{" +
                "history='" + history + '\'' +
                ", philosophy='" + philosophy + '\'' +
                '}';
    }
}
