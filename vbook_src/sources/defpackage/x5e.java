package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x5e  reason: default package */
/* loaded from: classes.dex */
public final class x5e implements l1e {
    public String C;
    public boolean D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public ArrayList K;
    public String L;
    public boolean a;
    public String b;
    public String c;
    public long d;
    public String e;
    public String f;

    public final hde a() {
        if (TextUtils.isEmpty(this.E) && TextUtils.isEmpty(this.F)) {
            return null;
        }
        String str = this.f;
        String str2 = this.F;
        String str3 = this.E;
        String str4 = this.I;
        String str5 = this.G;
        am8.q(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            vs.m("Must specify an idToken or an accessToken.");
            return null;
        }
        return new hde(str, str2, str3, null, str4, str5, null);
    }

    @Override // defpackage.l1e
    public final l1e zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.b = j4b.a(jSONObject.optString("idToken", null));
            this.c = j4b.a(jSONObject.optString("refreshToken", null));
            this.d = jSONObject.optLong("expiresIn", 0L);
            j4b.a(jSONObject.optString("localId", null));
            this.e = j4b.a(jSONObject.optString("email", null));
            j4b.a(jSONObject.optString("displayName", null));
            j4b.a(jSONObject.optString("photoUrl", null));
            this.f = j4b.a(jSONObject.optString("providerId", null));
            this.C = j4b.a(jSONObject.optString("rawUserInfo", null));
            this.D = jSONObject.optBoolean("isNewUser", false);
            this.E = jSONObject.optString("oauthAccessToken", null);
            this.F = jSONObject.optString("oauthIdToken", null);
            this.H = j4b.a(jSONObject.optString("errorMessage", null));
            this.I = j4b.a(jSONObject.optString("pendingToken", null));
            this.J = j4b.a(jSONObject.optString("tenantId", null));
            this.K = x4e.a(jSONObject.optJSONArray("mfaInfo"));
            this.L = j4b.a(jSONObject.optString("mfaPendingCredential", null));
            this.G = j4b.a(jSONObject.optString("oauthTokenSecret", null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw nq2.G(e, "x5e", str);
        }
    }
}
