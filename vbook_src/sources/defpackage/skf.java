package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: skf  reason: default package */
/* loaded from: classes.dex */
public final class skf extends o3 implements xzc {
    public static final Parcelable.Creator<skf> CREATOR = new rwd(16);
    public String C;
    public boolean D;
    public String E;
    public String a;
    public String b;
    public String c;
    public String d;
    public Uri e;
    public String f;

    public skf(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7) {
        this.a = str;
        this.b = str2;
        this.f = str3;
        this.C = str4;
        this.c = str5;
        this.d = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.e = Uri.parse(str6);
        }
        this.D = z;
        this.E = str7;
    }

    public static skf c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new skf(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.xzc
    public final String a() {
        return this.b;
    }

    public final String d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.a);
            jSONObject.putOpt("providerId", this.b);
            jSONObject.putOpt("displayName", this.c);
            jSONObject.putOpt("photoUrl", this.d);
            jSONObject.putOpt("email", this.f);
            jSONObject.putOpt("phoneNumber", this.C);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.D));
            jSONObject.putOpt("rawUserInfo", this.E);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 1, this.a);
        uue.P(parcel, 2, this.b);
        uue.P(parcel, 3, this.c);
        uue.P(parcel, 4, this.d);
        uue.P(parcel, 5, this.f);
        uue.P(parcel, 6, this.C);
        boolean z = this.D;
        uue.T(parcel, 7, 4);
        parcel.writeInt(z ? 1 : 0);
        uue.P(parcel, 8, this.E);
        uue.V(parcel, U);
    }
}
