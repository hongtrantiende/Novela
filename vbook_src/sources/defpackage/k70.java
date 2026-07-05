package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k70  reason: default package */
/* loaded from: classes.dex */
public final class k70 extends o3 {
    public static final Parcelable.Creator<k70> CREATOR = new kbe(3);
    public final u2d a;
    public final vke b;
    public final l70 c;
    public final fqe d;
    public final String e;

    public k70(u2d u2dVar, vke vkeVar, l70 l70Var, fqe fqeVar, String str) {
        this.a = u2dVar;
        this.b = vkeVar;
        this.c = l70Var;
        this.d = fqeVar;
        this.e = str;
    }

    public final JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            l70 l70Var = this.c;
            if (l70Var != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", l70Var.a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            u2d u2dVar = this.a;
            if (u2dVar != null) {
                jSONObject.put("uvm", u2dVar.c());
            }
            fqe fqeVar = this.d;
            if (fqeVar != null) {
                jSONObject.put("prf", fqeVar.c());
            }
            String str = this.e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e2) {
            cp8.p("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e2);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k70)) {
            return false;
        }
        k70 k70Var = (k70) obj;
        if (!hud.l(this.a, k70Var.a) || !hud.l(this.b, k70Var.b) || !hud.l(this.c, k70Var.c) || !hud.l(this.d, k70Var.d) || !hud.l(this.e, k70Var.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        return hl5.n("AuthenticationExtensionsClientOutputs{", c().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.O(parcel, 1, this.a, i);
        uue.O(parcel, 2, this.b, i);
        uue.O(parcel, 3, this.c, i);
        uue.O(parcel, 4, this.d, i);
        uue.P(parcel, 5, this.e);
        uue.V(parcel, U);
    }
}
