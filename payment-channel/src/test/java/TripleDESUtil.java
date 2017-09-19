import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.SecureRandom;


public class TripleDESUtil {

    public static final String ALGORITHM = "DESede";
    public static final String TRANSFORMATION = "DESede/ECB/PKCS5Padding";

    /**
     * 生成随机密钥
     *
     * @return
     * @throws Exception
     */
    public static Key generateKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(ALGORITHM);
        keyGenerator.init(new SecureRandom());
        Key key = keyGenerator.generateKey();
        return key;
    }

    /**
     * 生成固定密钥
     *
     * @param seed
     * @return
     * @throws Exception
     */
    public static Key generateKey(byte[] seed) throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(ALGORITHM);
        keyGenerator.init(new SecureRandom(seed));
        Key key = keyGenerator.generateKey();
        return key;
    }

    /**
     * 生成固定密钥
     *
     * @param password
     * @return
     * @throws Exception
     */
    public static Key generateKey(String password) throws Exception {
        return generateKey(password.getBytes());
    }

    /**
     * 执行加密
     *
     * @param content
     * @param key     长度必须为8位，即64bit
     * @return
     * @throws Exception
     */
    public static byte[] encrypt(byte[] content, byte[] key) throws Exception {
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, ALGORITHM));
        byte[] output = cipher.doFinal(content);
        return output;
    }

    /**
     * 执行加密
     *
     * @param content
     * @param password
     * @return
     * @throws Exception
     */
    public static byte[] encrypt(byte[] content, String password) throws Exception {
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.ENCRYPT_MODE, generateKey(password));
        byte[] output = cipher.doFinal(content);
        return output;
    }

    /**
     * 执行解密
     *
     * @param content
     * @param key     长度必须为8位，即64bit
     * @return
     * @throws Exception
     */
    public static byte[] decrypt(byte[] content, byte[] key) throws Exception {
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key, ALGORITHM));
        byte[] output = cipher.doFinal(content);
        return output;
    }

    /**
     * 执行解密
     *
     * @param content
     * @param password
     * @return
     * @throws Exception
     */
    public static byte[] decrypt(byte[] content, String password) throws Exception {
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.DECRYPT_MODE, generateKey(password));
        byte[] output = cipher.doFinal(content);
        return output;
    }
}