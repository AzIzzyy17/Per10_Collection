// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.HashSet;

// public class CountrySetDemo {
//     public static void main(String[] args) {
//         // --- Bagian Step 10 & Step 11 ---
//         HashSet<String> countries = new HashSet<>();
//         countries.add("Indonesia");
//         countries.add("Japan");
//         countries.add("Malaysia");
//         countries.add("Singapore");
//         countries.add("Thailand");
//         countries.add("Indonesia"); // duplikat

//         System.out.println(countries);
//         System.out.println("Jumlah elemen = " + countries.size());

//         System.out.println(countries.contains("Indonesia"));
//         countries.remove("Japan");
//         System.out.println(countries);
//         System.out.println(countries.size());

//         // --- Bagian Step 12: Coba Collections.sort pada Set ---
//         HashSet<String> countriesSet = new HashSet<String>();
//         countriesSet.add("Japan");
//         countriesSet.add("Indonesia");
//         countriesSet.add("Malaysia");

//         // Aktifkan baris berikut untuk melihat error kompilasi, lalu beri komentar lagi:
//         // Collections.sort(countriesSet);

//         ArrayList<String> countriesList = new ArrayList<String>();
//         countriesList.add("Japan");
//         countriesList.add("Indonesia");
//         countriesList.add("Malaysia");

//         Collections.sort(countriesList);
//         System.out.println(countriesList);
//     }
// }

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CountrySetDemo {
    public static void main(String[] args) {
        //Bagian Step 10 & Step 11
        HashSet<String> countries = new HashSet<>();
        countries.add("Indonesia");
        countries.add("Japan");
        countries.add("Malaysia");
        countries.add("Singapore");
        countries.add("Thailand");
        countries.add("Indonesia"); // duplikat

        System.out.println(countries);
        System.out.println("Jumlah elemen = " + countries.size());

        System.out.println(countries.contains("Indonesia"));
        countries.remove("Japan");
        System.out.println(countries);
        System.out.println(countries.size());

        //Bagian Step 12: Coba Collections.sort pada Set
        HashSet<String> countriesSet = new HashSet<String>();
        countriesSet.add("Japan");
        countriesSet.add("Indonesia");
        countriesSet.add("Malaysia");

        // Collections.sort(countriesSet); // error kompilasi jika diaktifkan

        ArrayList<String> countriesList = new ArrayList<String>();
        countriesList.add("Japan");
        countriesList.add("Indonesia");
        countriesList.add("Malaysia");

        Collections.sort(countriesList);
        System.out.println(countriesList);

        // Bagian Step 13: Menampilkan data Set secara terurut
        ArrayList<String> sortedCountries = new ArrayList<>(countriesSet);
        Collections.sort(sortedCountries);
        System.out.println(sortedCountries);
    }
}