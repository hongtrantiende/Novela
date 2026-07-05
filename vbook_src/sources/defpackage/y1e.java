package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y1e  reason: default package */
/* loaded from: classes.dex */
public final class y1e implements ww9 {
    public static final Parcelable.Creator<y1e> CREATOR = new rwd(25);
    public final long a;
    public final long b;

    public y1e(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static y1e a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new y1e(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 8);
        parcel.writeLong(this.a);
        uue.T(parcel, 2, 8);
        parcel.writeLong(this.b);
        uue.V(parcel, U);
    }
}
