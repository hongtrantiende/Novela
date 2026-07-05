package defpackage;

import android.text.TextUtils;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yhe  reason: default package */
/* loaded from: classes.dex */
public final class yhe implements k1e {
    public final /* synthetic */ int a;
    public String b;
    public static final yhe c = new yhe("TINK", 0);
    public static final yhe d = new yhe("CRUNCHY", 0);
    public static final yhe e = new yhe("NO_PREFIX", 0);
    public static final yhe f = new yhe("TINK", 1);
    public static final yhe C = new yhe("CRUNCHY", 1);
    public static final yhe D = new yhe("NO_PREFIX", 1);
    public static final yhe E = new yhe("TINK", 2);
    public static final yhe F = new yhe("CRUNCHY", 2);
    public static final yhe G = new yhe("NO_PREFIX", 2);

    public /* synthetic */ yhe(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
                return this.b;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.k1e
    public String zza() {
        JSONObject jSONObject = new JSONObject();
        String str = this.b;
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("tenantId", str);
        }
        if (!TextUtils.isEmpty("CLIENT_TYPE_ANDROID")) {
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        }
        if (!TextUtils.isEmpty("RECAPTCHA_ENTERPRISE")) {
            jSONObject.put("recaptchaVersion", "RECAPTCHA_ENTERPRISE");
        }
        return jSONObject.toString();
    }
}
