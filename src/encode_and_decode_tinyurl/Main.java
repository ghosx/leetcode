package encode_and_decode_tinyurl;

import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

    }
}


class Codec {
    private HashMap<String, String> shortToLongMap = new HashMap<>();
    private HashMap<String, String> longToShortMap = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (longToShortMap.containsKey(longUrl)) {
            return longToShortMap.get(longUrl);
        }
        char[] code = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String newCode = "";
        for (int i = 0; i < 6; i++) {
            int ramdom = Math.abs(new Random().nextInt());
            char a = code[ramdom % 62];
            newCode = newCode + a;
        }
        String shortUrl = "http://tinyurl.com/" + newCode;
        shortToLongMap.put(shortUrl, longUrl);
        longToShortMap.put(longUrl, shortUrl);
        return "http://tinyurl.com/" + newCode;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return shortToLongMap.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));