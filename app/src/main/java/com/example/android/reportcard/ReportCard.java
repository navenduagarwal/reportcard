package com.example.android.reportcard;

/**
 * class to set a report card for a student
 */
public class ReportCard {
    private String name;
    private double englishGrade;
    private double mathsGrade;
    private double historyGrade;
    private double computersGrade;

    public ReportCard(String Name, double english, double maths, double history, double computers) {
        name = Name;
        if (english < 0 || english > 100) {
            englishGrade = 0;
        } else {
            englishGrade = english;
        }
        if (maths < 0 || maths > 100) {
            mathsGrade = 0;
        } else {
            mathsGrade = maths;
        }
        if (history < 0 || history > 100) {
            historyGrade = 0;
        } else {
            historyGrade = history;
        }
        if (computers < 0 || computers > 100) {
            computersGrade = 0;
        } else {
            computersGrade = computers;
        }
    }

    @Override
    public String toString() {
        return "Name: " + getName()
                + "\nEnglish Grades: " + getEnglishGrade()
                + "\nMaths Grades: " + getMathsGrade()
                + "\nHistory Grades: " + getHistoryGrade()
                + "\nComputers Grades: " + getComputersGrade();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        if (englishGrade < 0 || englishGrade > 100) {
            this.englishGrade = 0;
        } else {
            this.englishGrade = englishGrade;
        }
    }

    public double getMathsGrade() {
        return mathsGrade;
    }

    public void setMathsGrade(double mathsGrade) {
        if (mathsGrade < 0 || mathsGrade > 100) {
            this.mathsGrade = 0;
        } else {
            this.mathsGrade = mathsGrade;
        }
    }

    public double getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(double historyGrade) {
        if (historyGrade < 0 || historyGrade > 100) {
            this.historyGrade = 0;
        } else {
            this.historyGrade = historyGrade;
        }
    }

    public double getComputersGrade() {
        return computersGrade;
    }

    public void setComputersGrade(double computersGrade) {
        if (computersGrade < 0 || computersGrade > 100) {
            this.computersGrade = 0;
        } else {
            this.computersGrade = computersGrade;
        }
    }
}
