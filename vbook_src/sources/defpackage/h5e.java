package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h5e  reason: default package */
/* loaded from: classes.dex */
public final class h5e implements l1e {
    public String a;
    public String b;
    public long c;

    @Override // defpackage.l1e
    public final l1e zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = j4b.a(jSONObject.optString("idToken", null));
            j4b.a(jSONObject.optString("displayName", null));
            j4b.a(jSONObject.optString("email", null));
            this.b = j4b.a(jSONObject.optString("refreshToken", null));
            this.c = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw nq2.G(e, "h5e", str);
        }
    }
}
