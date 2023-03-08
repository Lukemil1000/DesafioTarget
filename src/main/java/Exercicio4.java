public class Exercicio4 {

    public static void main(String[] args) {

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;

        double psp = (sp/total)*100;
        double prj = (rj/total)*100;
        double pmg = (mg/total)*100;
        double pes = (es/total)*100;
        double poutros = (outros/total)*100;

        System.out.println("O Percentual de SP foi de: " +psp);
        System.out.println("O Percentual de RJ foi de: " +prj);
        System.out.println("O Percentual de MG foi de: " +pmg);
        System.out.println("O Percentual de ES foi de: " +pes);
        System.out.println("O Percentual de Outros foi de: " +poutros);

        double ptotal = psp + prj + pmg + pes + poutros;
        System.out.println(ptotal);
    }
}
