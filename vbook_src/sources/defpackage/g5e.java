package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g5e  reason: default package */
/* loaded from: classes.dex */
public final class g5e implements l1e {
    public x47 a;
    public String b;
    public String c;
    public long d;

    @Override // defpackage.l1e
    public final l1e zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            j4b.a(jSONObject.optString("email"));
            j4b.a(jSONObject.optString("passwordHash"));
            jSONObject.optBoolean("emailVerified", false);
            j4b.a(jSONObject.optString("displayName"));
            j4b.a(jSONObject.optString("photoUrl"));
            this.a = x47.a(jSONObject.optJSONArray("providerUserInfo"));
            this.b = j4b.a(jSONObject.optString("idToken"));
            this.c = j4b.a(jSONObject.optString("refreshToken"));
            this.d = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw nq2.G(e, "g5e", str);
        }
    }
}
