package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p4e  reason: default package */
/* loaded from: classes.dex */
public final class p4e extends o3 implements l1e {
    public static final Parcelable.Creator<p4e> CREATOR = new rwd(23);
    public String a;
    public String b;
    public Long c;
    public String d;
    public Long e;

    public p4e(String str, String str2, Long l, String str3) {
        this(str, str2, l, str3, Long.valueOf(System.currentTimeMillis()));
    }

    public static p4e c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            p4e p4eVar = new p4e();
            p4eVar.a = jSONObject.optString("refresh_token", null);
            p4eVar.b = jSONObject.optString("access_token", null);
            p4eVar.c = Long.valueOf(jSONObject.optLong("expires_in"));
            p4eVar.d = jSONObject.optString("token_type", null);
            p4eVar.e = Long.valueOf(jSONObject.optLong("issued_at"));
            return p4eVar;
        } catch (JSONException e) {
            Log.d("p4e", "Failed to read GetTokenResponse from JSONObject");
            throw new RuntimeException(e);
        }
    }

    public final String d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.a);
            jSONObject.put("access_token", this.b);
            jSONObject.put("expires_in", this.c);
            jSONObject.put("token_type", this.d);
            jSONObject.put("issued_at", this.e);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d("p4e", "Failed to convert GetTokenResponse to JSON");
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long longValue;
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 2, this.a);
        uue.P(parcel, 3, this.b);
        Long l = this.c;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        uue.N(parcel, 4, Long.valueOf(longValue));
        uue.P(parcel, 5, this.d);
        Long l2 = this.e;
        l2.getClass();
        uue.N(parcel, 6, l2);
        uue.V(parcel, U);
    }

    @Override // defpackage.l1e
    public final l1e zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = j4b.a(jSONObject.optString("refresh_token"));
            this.b = j4b.a(jSONObject.optString("access_token"));
            this.c = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.d = j4b.a(jSONObject.optString("token_type"));
            this.e = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e) {
            throw nq2.G(e, "p4e", str);
        }
    }

    public final boolean zzg() {
        if (System.currentTimeMillis() + 300000 < (this.c.longValue() * 1000) + this.e.longValue()) {
            return true;
        }
        return false;
    }

    public p4e(String str, String str2, Long l, String str3, Long l2) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = str3;
        this.e = l2;
    }

    public p4e() {
        this.e = Long.valueOf(System.currentTimeMillis());
    }
}
