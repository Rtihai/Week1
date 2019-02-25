package Week1.Variables;

public class YourSchedule {
    public static void main(String[] args) {
        String name_1 =  " Ms. Lapan";
        String name_2 =  " Mrs. Gideon";
        String name_3 =  " Mr. Davis";
        String name_4 =  " Ms. Palmer";
        String name_5 =  " Ms. Garcia";
        String name_6 =  " Mrs. Barnett";
        String name_7 =  " Ms. Johannessen";
        String name_8 =  " Mr. James";

        String study_1 =  " English III";
        String study_2 =  " Precalculus";
        String study_3 =  " Music Theory";
        String study_4 =  " Biotechnology";
        String study_5 =  " Principles of Technology I";
        String study_6 =  " Latin II";
        String study_7 =  " AP US History";
        String study_8 =  " Business Computer Infomation Systems";

        System.out.println("+" + "------------------------------------------------------------" + "+");
        System.out.println(String.format("|%d| %37s | %16s |", 1, study_1, name_1));
        System.out.println(String.format("|%d| %37s | %16s |", 2, study_2, name_2));
        System.out.println(String.format("|%d| %37s | %16s |", 3, study_3, name_3));
        System.out.println(String.format("|%d| %37s | %16s |", 4, study_4, name_4));
        System.out.println(String.format("|%d| %37s | %16s |", 5, study_5, name_5));
        System.out.println(String.format("|%d| %37s | %16s |", 6, study_6, name_6));
        System.out.println(String.format("|%d| %37s | %16s |", 7, study_7, name_7));
        System.out.println(String.format("|%d| %37s | %16s |", 8, study_8, name_8));
        System.out.println("+" + "------------------------------------------------------------" + "+");
    }
}
