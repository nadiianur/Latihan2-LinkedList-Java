import java.util.LinkedList;

public class latihan2 {
    public static void main(String[] args) {
        LinkedList<String> saya = new LinkedList<>();

        // karakter nama 
        saya.add("N");
        saya.add("A");
        saya.add("D");
        saya.add("I");
        saya.add("A");
        saya.add("");
        saya.add("N");
        saya.add("U");
        saya.add("R");
        saya.add("");
        saya.add("S");
        saya.add("A");
        saya.add("I");
        saya.add("D");
        saya.add("A");

        System.out.println("List awal\t\t: " + saya + ", dengan ukuran : " + saya.size());
        System.out.println("-------------------------");

        // Fungsi add karakter lain (.add)
        saya.addFirst("X");
        saya.addLast("X");
        saya.add(8, "X");
        System.out.println("List setelah tambahan\t: " + saya + ", dengan ukuran : " + saya.size());
        System.out.println("-------------------------");

        // Fungsi sisipkan karakter lain (.set)
        saya.set(0, "D");
        saya.set(1, "R");
        saya.set(2, "E");
        saya.set(3, "A");
        saya.set(4, "M");
        System.out.println("List setelah sisip\t: " + saya + ", dengan ukuran : " + saya.size());
        System.out.println("-------------------------");

        // Fungsi hapus beberapa karakter (.remove)
        saya.removeFirst();
        saya.removeLast();
        saya.remove(11);
        System.out.println("List setalah di hapus\t: " + saya + ", dengan ukuran : " + saya.size());
        System.out.println("-------------------------");

        // Fungsi push (.push)
        saya.push("Dia");
        saya.push("Aku");
        saya.push("Kamu");
        System.out.println("List setelah PUSH\t: " + saya + ", dengan ukuran : " + saya.size());
        System.out.println("-------------------------");

        // Fungsi POP (.pop)
        saya.pop();
        saya.pop();
        System.out.println("List setelah POP\t: " + saya + ", dengan ukuran : " + saya.size());
        System.out.println("--------------------------");

    }
}
