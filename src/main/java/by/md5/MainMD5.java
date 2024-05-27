package by.md5;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MainMD5 {
  public static void main(String[] args) {
    String encrypted = "Pass_1";
    MessageDigest messageDigest = null;
    byte[] bytesEncoded = null;
    try {
      messageDigest = MessageDigest.getInstance("SHA-1"); // only once !
      messageDigest.update(encrypted.getBytes("utf8"));
      bytesEncoded = messageDigest.digest();
    } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
      e.printStackTrace();
    }
    BigInteger bigInt = new BigInteger(1, bytesEncoded); //1(sign+) or -1(sign-)
    String resHex = bigInt.toString(16);
    System.out.println(resHex);
  }
}

