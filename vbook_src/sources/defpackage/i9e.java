package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i9e  reason: default package */
/* loaded from: classes.dex */
public final class i9e extends o3 {
    public static final Parcelable.Creator<i9e> CREATOR = new u7e(2);
    public final String a;
    public final String b;
    public final String c;

    public i9e(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static final i9e c(JSONObject jSONObject) {
        return new i9e(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName"));
    }

    public static o9e d(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            l6e l6eVar = f4e.C;
            Object[] objArr = new Object[4];
            int i = 0;
            int i2 = 0;
            boolean z = false;
            while (i < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                i9e i9eVar = new i9e(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName"));
                int y = yf2.y(objArr.length, i2 + 1);
                if (y > objArr.length || z) {
                    objArr = Arrays.copyOf(objArr, y);
                    z = false;
                }
                objArr[i2] = i9eVar;
                i++;
                i2++;
            }
            if (i2 == 0) {
                return o9e.F;
            }
            return new o9e(objArr, i2);
        }
        l6e l6eVar2 = f4e.C;
        return o9e.F;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 1, this.a);
        uue.P(parcel, 2, this.b);
        uue.P(parcel, 3, this.c);
        uue.V(parcel, U);
    }
}
