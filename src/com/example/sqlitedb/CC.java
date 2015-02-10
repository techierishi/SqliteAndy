package com.example.sqlitedb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

public class CC {
	public static Bitmap stringToBitMap(String encodedString) {
		try {
			byte[] encodeByte = Base64.decode(encodedString, Base64.DEFAULT);
			Bitmap bitmap = BitmapFactory.decodeByteArray(encodeByte, 0,
					encodeByte.length);
			return bitmap;
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}
}
