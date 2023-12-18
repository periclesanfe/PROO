class q3B {
    public static void main(String[] args) {
        int ano = 2000;

        if (ano % 4 == 0) {
            if (ano % 100 != 0 && ano % 400 == 0) {
                System.out.println("O ano " + ano + " é bissexto.");
            } else {
                System.out.println("O ano " + ano + " não é bissexto.");
            }
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
    }
}