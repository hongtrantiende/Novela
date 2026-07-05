package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.text.ParseException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x4e  reason: default package */
/* loaded from: classes.dex */
public final class x4e {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final s5e e;

    public x4e(String str, String str2, String str3, long j, s5e s5eVar) {
        if (!TextUtils.isEmpty(str) && s5eVar != null) {
            Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
            vs.m("Cannot have both MFA phone_info and totp_info");
            throw null;
        }
        this.a = str;
        am8.p(str2);
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = s5eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList a(JSONArray jSONArray) {
        long j;
        Object obj;
        if (jSONArray != null && jSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String a = j4b.a(jSONObject.optString("phoneInfo"));
                String a2 = j4b.a(jSONObject.optString("mfaEnrollmentId"));
                String a3 = j4b.a(jSONObject.optString("displayName"));
                String optString = jSONObject.optString("enrolledAt", "");
                try {
                    v8e a4 = d9e.a(optString);
                    d9e.b(a4);
                    j = a4.w();
                } catch (ParseException e) {
                    Log.w("MfaInfo", "Could not parse timestamp as ISOString. Invalid ISOString \"" + optString + "\"", e);
                    j = 0;
                }
                if (jSONObject.opt("totpInfo") != null) {
                    obj = new Object();
                } else {
                    obj = null;
                }
                x4e x4eVar = new x4e(a, a2, a3, j, obj);
                jSONObject.optString("unobfuscatedPhoneInfo");
                arrayList.add(x4eVar);
            }
            return arrayList;
        }
        return new ArrayList();
    }
}
