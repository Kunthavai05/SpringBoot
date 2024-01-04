package com.jpa.onetomany.entity;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;

public class PasswordUtil {
	public static String getPassword(String phone) {
	MessageDigest algorithm;

	try {
		algorithm = MessageDigest.getInstance("SHA-1");
	} catch (NoSuchAlgorithmException e) {
		throw new RuntimeException("SHA-1 algorithm not found!");
	}
	byte[] digest = algorithm.digest(phone.getBytes());
	return new String(Hex.encodeHex(digest));
}


}
