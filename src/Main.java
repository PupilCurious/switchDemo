public class Main {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade){
            case 'A' :
                System.out.println("aferin en iyisi");
                break;
            case 'B' :
                System.out.println("bi tık daha çalış");
                break;
            case 'C' :
                System.out.println("orta direk");
            case 'D' :
                System.out.println("geçsem yeter kafası");
                break;
            case 'F' :
                System.out.println("seneye tekrar görüşürüz :)");
                break;
            default:
                System.out.println("geçersiz not girişi yaptınız");

        }
    }
}