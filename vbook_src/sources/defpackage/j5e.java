package defpackage;

import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j5e  reason: default package */
/* loaded from: classes.dex */
public final class j5e implements k1e {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public j5e(String str, String str2, String str3, String str4, String str5, int i) {
        switch (i) {
            case 1:
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = str4;
                this.e = str5;
                return;
            default:
                am8.p(str);
                this.a = str;
                am8.p(str2);
                this.b = str2;
                this.c = str3;
                this.d = str4;
                this.e = str5;
                return;
        }
    }

    @Override // defpackage.k1e
    public String zza() {
        JSONObject jSONObject = new JSONObject();
        String str = this.a;
        if (str != null) {
            jSONObject.put("email", str);
        }
        String str2 = this.b;
        if (str2 != null) {
            jSONObject.put("password", str2);
        }
        String str3 = this.c;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.d;
        if (str4 != null) {
            nq2.H(jSONObject, "captchaResponse", str4);
        } else {
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        }
        String str5 = this.e;
        if (str5 != null) {
            jSONObject.put("idToken", str5);
        }
        return jSONObject.toString();
    }
}
