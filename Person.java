public class Person {
    String nama, jenisKelamin;
    int umur;
    public static void main(String[] args) throws Exception {
        System.out.println("\tHello, World!");
        Person person1 = new Person();
        Person person2 = new Person();

        person1.nama = "Anton";
        person1.jenisKelamin = "Laki-laki";
        person1.umur = 21;

        person2.nama = "Riko";
        person2.jenisKelamin = "Laki-laki";
        person2.umur = 22;

        System.out.println("Nama orang pertama adalah " + person1.nama);
        System.out.println("Jenis Kelamin orang pertama adalah " + person1.jenisKelamin);
        System.out.println("Umur orang pertama adalah " + person1.umur + "Tahun\n");

        System.out.println("Nama orang Kedua adalah " + person2.nama);
        System.out.println("Jenis Kelamin orang Kedua adalah " + person2.jenisKelamin);
        System.out.println("Umur orang Kedua adalah " + person2.umur + "Tahun\n");
    }
}
