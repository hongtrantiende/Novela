package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nwe  reason: default package */
/* loaded from: classes.dex */
public final class nwe extends o3 implements Comparable {
    public static final Parcelable.Creator<nwe> CREATOR = new kbe(20);
    public final int C;
    public final int D;
    public final int E;
    public final String a;
    public final long b;
    public final boolean c;
    public final double d;
    public final String e;
    public final byte[] f;

    public nwe(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = d;
        this.e = str2;
        this.f = bArr;
        this.C = i;
        this.D = i2;
        this.E = i3;
    }

    public final void c(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.a;
        sb.append(str);
        sb.append(", ");
        int i = this.C;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            sb.append("'");
                            byte[] bArr = this.f;
                            am8.s(bArr);
                            sb.append(Base64.encodeToString(bArr, 3));
                            sb.append("'");
                        } else {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i).length());
                            sb2.append("Invalid type: ");
                            sb2.append(str);
                            sb2.append(", ");
                            sb2.append(i);
                            throw new AssertionError(sb2.toString());
                        }
                    } else {
                        sb.append("'");
                        String str2 = this.e;
                        am8.s(str2);
                        sb.append(str2);
                        sb.append("'");
                    }
                } else {
                    sb.append(this.d);
                }
            } else {
                sb.append(this.c);
            }
        } else {
            sb.append(this.b);
        }
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(this.D);
        sb.append(", ");
        sb.append(this.E);
        sb.append(")");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00a3 A[RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(java.lang.Object r8) {
        /*
            r7 = this;
            nwe r8 = (defpackage.nwe) r8
            java.lang.String r0 = r8.a
            java.lang.String r1 = r7.a
            int r0 = r1.compareTo(r0)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            int r0 = r8.C
            r1 = -1
            r2 = 0
            r3 = 1
            int r4 = r7.C
            if (r4 >= r0) goto L18
            r0 = r1
            goto L1d
        L18:
            if (r4 == r0) goto L1c
            r0 = r3
            goto L1d
        L1c:
            r0 = r2
        L1d:
            if (r0 == 0) goto L20
            return r0
        L20:
            if (r4 == r3) goto L97
            r0 = 2
            if (r4 == r0) goto L8d
            r0 = 3
            if (r4 == r0) goto L84
            r0 = 4
            if (r4 == r0) goto L72
            r0 = 5
            if (r4 != r0) goto L59
            byte[] r8 = r8.f
            byte[] r7 = r7.f
            if (r7 != r8) goto L36
            goto La2
        L36:
            if (r7 != 0) goto L3a
            goto L9f
        L3a:
            if (r8 != 0) goto L3e
            goto La3
        L3e:
            r0 = r2
        L3f:
            int r4 = r8.length
            int r5 = r7.length
            int r6 = java.lang.Math.min(r5, r4)
            if (r0 >= r6) goto L52
            r4 = r7[r0]
            r5 = r8[r0]
            int r4 = r4 - r5
            if (r4 == 0) goto L4f
            return r4
        L4f:
            int r0 = r0 + 1
            goto L3f
        L52:
            if (r5 >= r4) goto L55
            return r1
        L55:
            if (r5 == r4) goto L58
            return r3
        L58:
            return r2
        L59:
            java.lang.String r7 = java.lang.String.valueOf(r4)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 20
            r8.<init>(r7)
            java.lang.String r7 = "Invalid enum value: "
            java.lang.String r7 = defpackage.nk2.s(r4, r7, r8)
            defpackage.vs.j(r7)
            return r2
        L72:
            java.lang.String r8 = r8.e
            java.lang.String r7 = r7.e
            if (r7 != r8) goto L79
            goto La2
        L79:
            if (r7 != 0) goto L7c
            goto L9f
        L7c:
            if (r8 != 0) goto L7f
            goto La3
        L7f:
            int r7 = r7.compareTo(r8)
            return r7
        L84:
            double r0 = r7.d
            double r7 = r8.d
            int r7 = java.lang.Double.compare(r0, r7)
            return r7
        L8d:
            boolean r8 = r8.c
            boolean r7 = r7.c
            if (r7 != r8) goto L94
            goto La2
        L94:
            if (r7 == 0) goto L9f
            goto La3
        L97:
            long r4 = r7.b
            long r7 = r8.b
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 >= 0) goto La0
        L9f:
            return r1
        La0:
            if (r7 != 0) goto La3
        La2:
            return r2
        La3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwe.compareTo(java.lang.Object):int");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nwe) {
            nwe nweVar = (nwe) obj;
            if (ube.G(this.a, nweVar.a)) {
                int i = nweVar.C;
                int i2 = this.C;
                if (i2 == i && this.D == nweVar.D && this.E == nweVar.E) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 == 5) {
                                        return Arrays.equals(this.f, nweVar.f);
                                    }
                                    vs.j(nk2.s(i2, "Invalid enum value: ", new StringBuilder(String.valueOf(i2).length() + 20)));
                                    return false;
                                }
                                return ube.G(this.e, nweVar.e);
                            } else if (this.d != nweVar.d) {
                                return false;
                            } else {
                                return true;
                            }
                        } else if (this.c != nweVar.c) {
                            return false;
                        } else {
                            return true;
                        }
                    } else if (this.b != nweVar.b) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        c(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z;
        String str = this.a;
        if (str == null) {
            z = true;
        } else {
            z = false;
        }
        int U = uue.U(parcel, 20293);
        if (!z) {
            uue.P(parcel, 2, str);
        }
        long j = this.b;
        if (j != 0) {
            uue.T(parcel, 3, 8);
            parcel.writeLong(j);
        }
        if (this.c) {
            uue.T(parcel, 4, 4);
            parcel.writeInt(1);
        }
        double d = this.d;
        if (d != 0.0d) {
            uue.T(parcel, 5, 8);
            parcel.writeDouble(d);
        }
        String str2 = this.e;
        if (str2 != null) {
            uue.P(parcel, 6, str2);
        }
        byte[] bArr = this.f;
        if (bArr != null) {
            uue.I(parcel, 7, bArr);
        }
        int i2 = this.C;
        if (i2 != 0) {
            uue.T(parcel, 8, 4);
            parcel.writeInt(i2);
        }
        int i3 = this.D;
        if (i3 != 0) {
            uue.T(parcel, 9, 4);
            parcel.writeInt(i3);
        }
        int i4 = this.E;
        if (i4 != 0) {
            uue.T(parcel, 10, 4);
            parcel.writeInt(i4);
        }
        uue.V(parcel, U);
    }
}
