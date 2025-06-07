package org.example;

public class studentmanges {
    public static void main(String[] args) {

        // 學生姓名數組
        String[] names = {"小明", "小華", "小芳", "小強", "小李"};
        
        // 各科成績數組
        int[] mathScores = {85, 76, 92, 63, 70};
        int[] englishScores = {92, 83, 78, 86, 72};
        int[] scienceScores = {76, 90, 88, 67, 95};

        // 顯示所有學生的成績
        System.out.println("所有學生成績單：");
        displayAllGrades(names, mathScores, englishScores, scienceScores);

        // 計算並顯示平均分
        System.out.println("\n各科平均分：");
        displayAverage(mathScores, englishScores, scienceScores);

        // 找出各科最高分的學生
        System.out.println("\n各科最高分：");
        displayTopStudent(names, mathScores, englishScores, scienceScores);

        // 計算並顯示總分排名
        System.out.println("\n總分排名：");
        displayTotalRank(names, mathScores, englishScores, scienceScores);
    }

    // 顯示所有學生的成績
    public static void displayAllGrades(String[] names, int[] mathScores, int[] englishScores, int[] scienceScores) {
        System.out.println("姓名\t數學\t英語\t科學\t總分");
        System.out.println("----------------------------------------");
        for (int i = 0; i < names.length; i++) {
            int total = mathScores[i] + englishScores[i] + scienceScores[i];
            System.out.println(names[i] + "\t" + mathScores[i] + "\t" + englishScores[i] + "\t" + scienceScores[i] + "\t" + total);
        }
    }

    // 顯示各科平均分
    public static void displayAverage(int[] mathScores, int[] englishScores, int[] scienceScores) {
        double mathAvg = calculateAverage(mathScores);
        double englishAvg = calculateAverage(englishScores);
        double scienceAvg = calculateAverage(scienceScores);

        System.out.printf("數學平均：%.2f\n", mathAvg);
        System.out.printf("英語平均：%.2f\n", englishAvg);
        System.out.printf("科學平均：%.2f\n", scienceAvg);
    }

    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    // 顯示各科最高分及其學生
    public static void displayTopStudent(String[] names, int[] mathScores, int[] englishScores, int[] scienceScores) {
        findTopStudent(names, mathScores, "數學");
        findTopStudent(names, englishScores, "英語");
        findTopStudent(names, scienceScores, "科學");
    }

    public static void findTopStudent(String[] names, int[] scores, String subject) {
        int maxIndex = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > scores[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println(subject + "最高分：" + names[maxIndex] + "（" + scores[maxIndex] + "分）");
    }

    // 計算總分並顯示排名
    public static void displayTotalRank(String[] names, int[] mathScores, int[] englishScores, int[] scienceScores) {
        int[] totals = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            totals[i] = mathScores[i] + englishScores[i] + scienceScores[i];
        }

        // 排序（簡單用氣泡排序）
        for (int i = 0; i < totals.length - 1; i++) {
            for (int j = 0; j < totals.length - 1 - i; j++) {
                if (totals[j] < totals[j + 1]) {
                    // 交換總分
                    int temp = totals[j];
                    totals[j] = totals[j + 1];
                    totals[j + 1] = temp;
                    // 同時交換名字
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println("第" + (i + 1) + "名：" + names[i] + "（總分：" + totals[i] + "）");
        }
    }
}


