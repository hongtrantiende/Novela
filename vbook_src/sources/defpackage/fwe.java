package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fwe  reason: default package */
/* loaded from: classes.dex */
public final class fwe extends o3 {
    public static final Parcelable.Creator<fwe> CREATOR = new kbe(19);
    public final int[] C;
    public final byte[][] D;
    public final int[] E;
    public final byte[][] F;
    public final String a;
    public final byte[] b;
    public final byte[][] c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f;

    public fwe(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.a = str;
        this.b = bArr;
        this.c = bArr2;
        this.d = bArr3;
        this.e = bArr4;
        this.f = bArr5;
        this.C = iArr;
        this.D = bArr6;
        this.E = iArr2;
        this.F = bArr7;
    }

    public static void c(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            am8.s(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public static Set e(byte[][] bArr) {
        int length;
        if (bArr != null && (length = bArr.length) != 0) {
            HashSet hashSet = new HashSet(nxe.p(length));
            for (byte[] bArr2 : bArr) {
                am8.s(bArr2);
                hashSet.add(Base64.encodeToString(bArr2, 3));
            }
            return hashSet;
        }
        return Collections.EMPTY_SET;
    }

    public static List f(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new cxe(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final Set d() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.D;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.b;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return e((byte[][]) arrayList.toArray(new byte[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        int length;
        int length2;
        if (obj instanceof fwe) {
            fwe fweVar = (fwe) obj;
            if (ube.G(this.a, fweVar.a) && ube.G(d(), fweVar.d()) && ube.G(e(this.c), e(fweVar.c)) && ube.G(e(this.d), e(fweVar.d)) && ube.G(e(this.e), e(fweVar.e)) && ube.G(e(this.f), e(fweVar.f))) {
                int[] iArr = this.C;
                if (iArr != null && (length2 = iArr.length) != 0) {
                    obj2 = new HashSet(nxe.p(length2));
                    for (int i : iArr) {
                        obj2.add(Integer.valueOf(i));
                    }
                } else {
                    obj2 = Collections.EMPTY_SET;
                }
                int[] iArr2 = fweVar.C;
                if (iArr2 != null && (length = iArr2.length) != 0) {
                    obj3 = new HashSet(nxe.p(length));
                    for (int i2 : iArr2) {
                        obj3.add(Integer.valueOf(i2));
                    }
                } else {
                    obj3 = Collections.EMPTY_SET;
                }
                if (ube.G(obj2, obj3) && ube.G(f(this.E), f(fweVar.E)) && ube.G(e(this.F), e(fweVar.F))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String v;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.a;
        if (str == null) {
            v = "null";
        } else {
            v = nk2.v(new StringBuilder(str.length() + 2), "'", str, "'");
        }
        sb.append(v);
        sb.append(", direct==");
        byte[] bArr = this.b;
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        c(sb, "GAIA=", this.c);
        sb.append(", ");
        c(sb, "PSEUDO=", this.d);
        sb.append(", ");
        c(sb, "ALWAYS=", this.e);
        sb.append(", ");
        c(sb, "OTHER=", this.f);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.C));
        sb.append(", ");
        c(sb, "directs=", this.D);
        sb.append(", genDims=");
        sb.append(Arrays.toString(f(this.E).toArray()));
        sb.append(", ");
        c(sb, "external=", this.F);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 2, this.a);
        uue.I(parcel, 3, this.b);
        uue.J(parcel, 4, this.c);
        uue.J(parcel, 5, this.d);
        uue.J(parcel, 6, this.e);
        uue.J(parcel, 7, this.f);
        uue.L(parcel, 8, this.C);
        uue.J(parcel, 9, this.D);
        uue.L(parcel, 10, this.E);
        uue.J(parcel, 11, this.F);
        uue.V(parcel, U);
    }
}
