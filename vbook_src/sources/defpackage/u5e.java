package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u5e  reason: default package */
/* loaded from: classes.dex */
public final class u5e extends o3 implements k1e {
    public static final Parcelable.Creator<u5e> CREATOR = new rwd(27);
    public String C;
    public String D;
    public boolean F;
    public String G;
    public String H;
    public String I;
    public String J;
    public boolean K;
    public String L;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String a = "http://localhost";
    public boolean E = true;

    public u5e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.c = str;
        this.d = str2;
        this.D = str4;
        this.G = str5;
        this.J = str6;
        this.L = str7;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str5)) {
            vs.m("idToken, accessToken and authCode cannot all be null");
            throw null;
        }
        am8.p(str3);
        this.e = str3;
        this.f = null;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append("id_token=");
            sb.append(str);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append("access_token=");
            sb.append(str2);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(null)) {
            sb.append("identifier=null&");
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append("oauth_token_secret=");
            sb.append(str4);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(str5)) {
            sb.append("code=");
            sb.append(str5);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(str8)) {
            sb.append("nonce=");
            sb.append(str8);
            sb.append("&");
        }
        this.C = s21.q(sb, "providerId=", str3);
        this.F = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 2, this.a);
        uue.P(parcel, 3, this.b);
        uue.P(parcel, 4, this.c);
        uue.P(parcel, 5, this.d);
        uue.P(parcel, 6, this.e);
        uue.P(parcel, 7, this.f);
        uue.P(parcel, 8, this.C);
        uue.P(parcel, 9, this.D);
        boolean z = this.E;
        uue.T(parcel, 10, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.F;
        uue.T(parcel, 11, 4);
        parcel.writeInt(z2 ? 1 : 0);
        uue.P(parcel, 12, this.G);
        uue.P(parcel, 13, this.H);
        uue.P(parcel, 14, this.I);
        uue.P(parcel, 15, this.J);
        boolean z3 = this.K;
        uue.T(parcel, 16, 4);
        parcel.writeInt(z3 ? 1 : 0);
        uue.P(parcel, 17, this.L);
        uue.V(parcel, U);
    }

    @Override // defpackage.k1e
    public final String zza() {
        String str = this.I;
        String str2 = this.H;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.F);
        jSONObject.put("returnSecureToken", this.E);
        String str3 = this.b;
        if (str3 != null) {
            jSONObject.put("idToken", str3);
        }
        String str4 = this.C;
        if (str4 != null) {
            jSONObject.put("postBody", str4);
        }
        String str5 = this.J;
        if (str5 != null) {
            jSONObject.put("tenantId", str5);
        }
        String str6 = this.L;
        if (str6 != null) {
            jSONObject.put("pendingToken", str6);
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("sessionId", str2);
        }
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("requestUri", str);
        } else {
            String str7 = this.a;
            if (str7 != null) {
                jSONObject.put("requestUri", str7);
            }
        }
        jSONObject.put("returnIdpCredential", this.K);
        return jSONObject.toString();
    }
}
