package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ms4  reason: default package */
/* loaded from: classes.dex */
public final class ms4 implements Parcelable {
    public static final Parcelable.Creator<ms4> CREATOR = new cxd(12);
    public final String C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final int H;
    public final String I;
    public final int J;
    public final boolean K;
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;

    public ms4(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        this.a = parcel.readString();
        this.b = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.d = z2;
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.C = parcel.readString();
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.D = z3;
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.E = z4;
        if (parcel.readInt() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.F = z5;
        if (parcel.readInt() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.G = z6;
        this.H = parcel.readInt();
        this.I = parcel.readString();
        this.J = parcel.readInt();
        this.K = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((int) Token.CASE);
        sb.append("FragmentState{");
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        if (this.d) {
            sb.append(" dynamicContainer");
        }
        int i = this.f;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.C;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.D) {
            sb.append(" retainInstance");
        }
        if (this.E) {
            sb.append(" removing");
        }
        if (this.F) {
            sb.append(" detached");
        }
        if (this.G) {
            sb.append(" hidden");
        }
        String str2 = this.I;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.J);
        }
        if (this.K) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.C);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeInt(this.H);
        parcel.writeString(this.I);
        parcel.writeInt(this.J);
        parcel.writeInt(this.K ? 1 : 0);
    }

    public ms4(rr4 rr4Var) {
        this.a = rr4Var.getClass().getName();
        this.b = rr4Var.e;
        this.c = rr4Var.J;
        this.d = rr4Var.L;
        this.e = rr4Var.T;
        this.f = rr4Var.U;
        this.C = rr4Var.V;
        this.D = rr4Var.Y;
        this.E = rr4Var.H;
        this.F = rr4Var.X;
        this.G = rr4Var.W;
        this.H = rr4Var.i0.ordinal();
        this.I = rr4Var.D;
        this.J = rr4Var.E;
        this.K = rr4Var.d0;
    }
}
