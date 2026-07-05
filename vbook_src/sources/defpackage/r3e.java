package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r3e  reason: default package */
/* loaded from: classes.dex */
public final class r3e implements l1e {
    public k57 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [x3e] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, x3e] */
    @Override // defpackage.l1e
    public final l1e zza(String str) {
        k57 k57Var;
        int i;
        JSONArray jSONArray;
        ?? x3eVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z = false;
            if (!jSONObject.has("users")) {
                k57Var = new k57(22, false);
                k57Var.b = new ArrayList();
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    int i2 = 0;
                    while (i2 < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                        if (jSONObject2 == null) {
                            x3eVar = new Object();
                            x3eVar.f = new x47(1);
                            l6e l6eVar = f4e.C;
                            x3eVar.m = o9e.F;
                            jSONArray = optJSONArray;
                            i = i2;
                        } else {
                            String a = j4b.a(jSONObject2.optString("localId", null));
                            String a2 = j4b.a(jSONObject2.optString("email", null));
                            boolean optBoolean = jSONObject2.optBoolean("emailVerified", z);
                            String a3 = j4b.a(jSONObject2.optString("displayName", null));
                            String a4 = j4b.a(jSONObject2.optString("photoUrl", null));
                            x47 a5 = x47.a(jSONObject2.optJSONArray("providerUserInfo"));
                            j4b.a(jSONObject2.optString("rawPassword", null));
                            i = i2;
                            jSONArray = optJSONArray;
                            x3eVar = new x3e(a, a2, optBoolean, a3, a4, a5, j4b.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), x4e.a(jSONObject2.optJSONArray("mfaInfo")), i9e.d(jSONObject2.optJSONArray("passkeyInfo")));
                        }
                        arrayList.add(x3eVar);
                        i2 = i + 1;
                        optJSONArray = jSONArray;
                        z = false;
                    }
                    k57Var = new k57(arrayList);
                }
                k57Var = new k57(new ArrayList());
            }
            this.a = k57Var;
            return this;
        } catch (NullPointerException e) {
            e = e;
            throw nq2.G(e, "r3e", str);
        } catch (JSONException e2) {
            e = e2;
            throw nq2.G(e, "r3e", str);
        }
    }
}
