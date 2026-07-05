package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fqe  reason: default package */
/* loaded from: classes.dex */
public final class fqe extends o3 {
    public static final Parcelable.Creator<fqe> CREATOR = new kbe(14);
    public final boolean a;
    public final qpe b;

    public fqe(boolean z, qpe qpeVar) {
        this.a = z;
        this.b = qpeVar;
    }

    public final JSONObject c() {
        byte[] i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.a) {
                jSONObject.put("enabled", true);
            }
            qpe qpeVar = this.b;
            if (qpeVar == null) {
                i = null;
            } else {
                i = qpeVar.i();
            }
            if (i != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(i, 32), 11));
                if (i.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(i, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            cp8.p("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fqe)) {
            return false;
        }
        fqe fqeVar = (fqe) obj;
        if (this.a != fqeVar.a || !hud.l(this.b, fqeVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final String toString() {
        return hl5.n("AuthenticationExtensionsPrfOutputs{", c().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] i2;
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        qpe qpeVar = this.b;
        if (qpeVar == null) {
            i2 = null;
        } else {
            i2 = qpeVar.i();
        }
        uue.I(parcel, 2, i2);
        uue.V(parcel, U);
    }
}
