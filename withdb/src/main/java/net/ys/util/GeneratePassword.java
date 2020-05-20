package net.ys.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author wxb
 * @date 2018/10/23 0023
 */
public class GeneratePassword {
    public static String generatePassword(String password) {
        return new BCryptPasswordEncoder().encode(password);
    }

    public static void main(String[] args) {
        System.out.println(generatePassword("pwd"));
    }
}
