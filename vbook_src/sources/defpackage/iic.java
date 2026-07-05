package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iic  reason: default package */
/* loaded from: classes.dex */
public final class iic extends et7 {
    public static final Parcelable.Creator<iic> CREATOR = new u7e(13);
    public final String a;
    public final String b;
    public final long c;
    public final s5e d;

    public iic(String str, String str2, long j, s5e s5eVar) {
        am8.p(str);
        this.a = str;
        this.b = str2;
        this.c = j;
        am8.t(s5eVar, "totpInfo cannot be null.");
        this.d = s5eVar;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [s5e, java.lang.Object] */
    public static iic e(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            long optLong = jSONObject.optLong("enrollmentTimestamp");
            if (jSONObject.opt("totpInfo") != null) {
                return new iic(jSONObject.optString("uid"), jSONObject.optString("displayName"), optLong, new Object());
            }
            vs.m("A totpInfo is required to build a TotpMultiFactorInfo instance.");
            return null;
        }
        vs.m("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
        return null;
    }

    @Override // defpackage.et7
    public final String c() {
        return "totp";
    }

    @Override // defpackage.et7
    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.a);
            jSONObject.putOpt("displayName", this.b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.c));
            jSONObject.putOpt("totpInfo", this.d);
            return jSONObject;
        } catch (JSONException e) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 1, this.a);
        uue.P(parcel, 2, this.b);
        uue.T(parcel, 3, 8);
        parcel.writeLong(this.c);
        uue.O(parcel, 4, this.d, i);
        uue.V(parcel, U);
    }
}
