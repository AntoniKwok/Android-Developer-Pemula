package com.dicoding.dicodingsubmission.Object;

import java.util.ArrayList;

public class PresidentData {
    public static String[][] data = new String[][]{
            {"Soekarno", "Presiden Pertama RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/418px-Presiden_Sukarno.jpg", "Presiden Pertama RI", "Blitar, Jawa Timur, 6 Juni 1901", "Jakarta, 21 Juni 1970", "170cm"},
            {"Soeharto", "Presiden Kedua RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/President_Suharto%2C_1993.jpg/468px-President_Suharto%2C_1993.jpg", "Presiden Kedua RI", "Kemusuk, Yogyakarta, tanggal 8 Juni 1921", "Jakarta, 27 Januari 2008", "170cm"},
            {"Bacharuddin Jusuf Habibie", "Presiden Ketiga RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Bacharuddin_Jusuf_Habibie_official_portrait.jpg/520px-Bacharuddin_Jusuf_Habibie_official_portrait.jpg", "Presiden Ketiga RI", "Pare-Pare, Sulawesi Selatan, 25 Juni 1936", "-", "170cm"},
            {"Abdurrahman Wahid", "Presiden Keempat RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/President_Abdurrahman_Wahid_-_Indonesia.jpg/486px-President_Abdurrahman_Wahid_-_Indonesia.jpg", "Presiden Keempat RI", "Denanyar Jombang Jawa Timur, 4 Agustus 1940", "-", "170cm"},
            {"Megawati Soekarnoputri", "Presiden Kelima RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/President_Megawati_Sukarnoputri_-_Indonesia.jpg/540px-President_Megawati_Sukarnoputri_-_Indonesia.jpg", "Presiden Kelima RI", "Yogyakarta, 23 Januari 1947", "-", "170cm"},
            {"Susilo Bambang Yudhoyono", "Presiden Keenam RI", "https://upload.wikimedia.org/wikipedia/commons/5/58/Presiden_Susilo_Bambang_Yudhoyono.png", "Presiden Keenam RI", "Pacitan, Jawa Timur, 9 September 1949", "-", "170cm"},
            {"Joko Widodo", "Presiden Ketujuh RI", "https://upload.wikimedia.org/wikipedia/commons/1/1c/Joko_Widodo_2014_official_portrait.jpg", "Presiden Ketujuh RI", "Mulyono, 21 Juni 1961", "-", "170cm"}
    };

    public static ArrayList<President> getListData(){
        President president = null;
        ArrayList<President> list = new ArrayList<>();
        for (String[] aData : data) {
            president = new President();
            president.setName(aData[0]);
            president.setRemark(aData[1]);
            president.setPhoto(aData[2]);
            president.setDesc(aData[3]);
            president.setBornDate(aData[4]);
            president.setDiedDate(aData[5]);
            president.setTall(aData[6]);

            list.add(president);
        }

        return list;
    }
}
