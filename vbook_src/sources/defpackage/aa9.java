package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aa9  reason: default package */
/* loaded from: classes.dex */
public final class aa9 extends o3 {
    public static final Parcelable.Creator<aa9> CREATOR = new u7e(8);
    public final da9 a;
    public final p41 b;

    public aa9(String str, int i) {
        am8.s(str);
        try {
            this.a = da9.a(str);
            try {
                this.b = p41.a(i);
            } catch (o41 e) {
                xk5.m(e);
                throw null;
            }
        } catch (ca9 e2) {
            xk5.m(e2);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aa9)) {
            return false;
        }
        aa9 aa9Var = (aa9) obj;
        if (!this.a.equals(aa9Var.a) || !this.b.equals(aa9Var.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return hl5.o("PublicKeyCredentialParameters{\n type=", String.valueOf(this.a), ", \n algorithm=", String.valueOf(this.b), "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        this.a.getClass();
        uue.P(parcel, 2, "public-key");
        uue.M(parcel, 3, Integer.valueOf(this.b.a.a()));
        uue.V(parcel, U);
    }
}
