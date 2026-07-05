package defpackage;

import android.util.Log;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b3e  reason: default package */
/* loaded from: classes.dex */
public final class b3e implements k1e {
    public final String a;
    public final String b;
    public final kp3 c;
    public final String d;
    public final String e;

    static {
        boolean z;
        String simpleName = b3e.class.getSimpleName();
        Object[] objArr = {simpleName, 23};
        if (simpleName.length() <= 23) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            for (int i = 2; i <= 7 && !Log.isLoggable(simpleName, i); i++) {
            }
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public b3e(kp3 kp3Var, String str, String str2) {
        am8.s(kp3Var);
        this.c = kp3Var;
        String str3 = kp3Var.a;
        am8.p(str3);
        this.a = str3;
        String str4 = kp3Var.c;
        am8.p(str4);
        this.b = str4;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.k1e
    public final String zza() {
        n5 n5Var;
        String str;
        int i = n5.c;
        String str2 = this.b;
        am8.p(str2);
        String str3 = null;
        try {
            n5Var = new n5(str2);
        } catch (IllegalArgumentException unused) {
            n5Var = null;
        }
        if (n5Var != null) {
            str = n5Var.a;
        } else {
            str = null;
        }
        if (n5Var != null) {
            str3 = n5Var.b;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.a);
        if (str != null) {
            jSONObject.put("oobCode", str);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.d;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        String str5 = this.e;
        if (str5 != null) {
            nq2.H(jSONObject, "captchaResp", str5);
        } else {
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        }
        return jSONObject.toString();
    }
}
