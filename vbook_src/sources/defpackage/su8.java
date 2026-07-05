package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: su8  reason: default package */
/* loaded from: classes.dex */
public final class su8 extends et7 {
    public static final Parcelable.Creator<su8> CREATOR = new u7e(9);
    public final String a;
    public final String b;
    public final long c;
    public final String d;

    public su8(long j, String str, String str2, String str3) {
        am8.p(str);
        this.a = str;
        this.b = str2;
        this.c = j;
        am8.p(str3);
        this.d = str3;
    }

    public static su8 e(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new su8(jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optString("phoneNumber"));
        }
        vs.m("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
        return null;
    }

    @Override // defpackage.et7
    public final String c() {
        return "phone";
    }

    @Override // defpackage.et7
    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.a);
            jSONObject.putOpt("displayName", this.b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.c));
            jSONObject.putOpt("phoneNumber", this.d);
            return jSONObject;
        } catch (JSONException e) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
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
        uue.P(parcel, 4, this.d);
        uue.V(parcel, U);
    }
}
