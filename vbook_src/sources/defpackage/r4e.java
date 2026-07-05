package defpackage;

import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r4e  reason: default package */
/* loaded from: classes.dex */
public final class r4e implements l1e {
    public String a;
    public o9e b;

    public final boolean a() {
        am8.p("EMAIL_PASSWORD_PROVIDER");
        o9e o9eVar = this.b;
        String str = null;
        if (o9eVar != null && !o9eVar.isEmpty()) {
            o9e o9eVar2 = this.b;
            int i = o9eVar2.E;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                }
                Object obj = o9eVar2.get(i2);
                i2++;
                r2e r2eVar = (r2e) obj;
                String str2 = r2eVar.b;
                String str3 = r2eVar.a;
                if (str2 != null && str3 != null && str3.equals("EMAIL_PASSWORD_PROVIDER")) {
                    str = str2;
                    break;
                }
            }
        }
        if (str == null || (!str.equals("ENFORCE") && !str.equals("AUDIT"))) {
            return false;
        }
        return true;
    }

    @Override // defpackage.l1e
    public final l1e zza(String str) {
        o9e o9eVar;
        r2e r2eVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = j4b.a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    l6e l6eVar = f4e.C;
                    Object[] objArr = new Object[4];
                    int i = 0;
                    int i2 = 0;
                    boolean z = false;
                    while (i < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        if (jSONObject2 == null) {
                            r2eVar = new r2e(null, null);
                        } else {
                            r2eVar = new r2e(j4b.a(jSONObject2.optString("provider")), j4b.a(jSONObject2.optString("enforcementState")));
                        }
                        int y = yf2.y(objArr.length, i2 + 1);
                        if (y > objArr.length || z) {
                            objArr = Arrays.copyOf(objArr, y);
                            z = false;
                        }
                        objArr[i2] = r2eVar;
                        i++;
                        i2++;
                    }
                    if (i2 == 0) {
                        o9eVar = o9e.F;
                    } else {
                        o9eVar = new o9e(objArr, i2);
                    }
                    this.b = o9eVar;
                }
                l6e l6eVar2 = f4e.C;
                o9eVar = o9e.F;
                this.b = o9eVar;
            }
            return this;
        } catch (NullPointerException e) {
            e = e;
            throw nq2.G(e, "r4e", str);
        } catch (JSONException e2) {
            e = e2;
            throw nq2.G(e, "r4e", str);
        }
    }
}
