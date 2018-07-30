package com.bqt.test.aar;

import android.content.Context;
import android.widget.Toast;

/**
 * Desc：
 *
 * @author 白乾涛 <p>
 * @tag <p>
 * @date 2018/7/30 16:01 <p>
 */
public class AARUtils {
	public static void showToast(Context mContext, String text) {
		Toast.makeText(mContext, text, Toast.LENGTH_SHORT).show();
	}
}