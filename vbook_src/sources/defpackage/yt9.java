package defpackage;

import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yt9  reason: default package */
/* loaded from: classes.dex */
public abstract class yt9 {
    public static final n07 a;

    static {
        f46 f46Var = new f46();
        r90 r90Var = r90.a;
        f46Var.b(yt9.class, r90Var);
        f46Var.b(cd0.class, r90Var);
        a = new n07(f46Var, 20);
    }

    public static cd0 a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new cd0(string, string2, string3, string4, j);
    }
}
