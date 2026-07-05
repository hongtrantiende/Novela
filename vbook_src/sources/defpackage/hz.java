package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hz  reason: default package */
/* loaded from: classes.dex */
public final class hz implements gz {
    public final float a;
    public final boolean b;
    public final iz c;
    public final float d;

    public hz(float f, boolean z, iz izVar) {
        this.a = f;
        this.b = z;
        this.c = izVar;
        this.d = f;
    }

    @Override // defpackage.fz, defpackage.jz
    public final float b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hz) {
                hz hzVar = (hz) obj;
                if (!rg3.b(this.a, hzVar.a) || this.b != hzVar.b || !c16.i(this.c, hzVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.fz
    public final void f(r13 r13Var, int i, int[] iArr, tc6 tc6Var, int[] iArr2) {
        boolean z;
        int i2;
        if (iArr.length != 0) {
            int X0 = r13Var.X0(this.a);
            if (this.b && tc6Var == tc6.b) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i3 < length) {
                    int max = Math.max(0, i - iArr[i3]);
                    iArr2[i5] = max;
                    i4 = Math.min(X0, max);
                    i = iArr2[i5] - i4;
                    i3++;
                    i5++;
                }
                i2 = i + i4;
            } else {
                int length2 = iArr.length;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i6 < length2) {
                    int i10 = iArr[i6];
                    int min = Math.min(i7, i - i10);
                    iArr2[i9] = min;
                    int min2 = Math.min(X0, (i - min) - i10);
                    i6++;
                    i8 = min2;
                    i7 = iArr2[i9] + i10 + min2;
                    i9++;
                }
                i2 = i - (i7 - i8);
            }
            iz izVar = this.c;
            if (izVar != null && i2 > 0) {
                int b = izVar.b(i2, tc6Var);
                if (z) {
                    b -= i2;
                }
                if (b != 0) {
                    int length3 = iArr2.length;
                    for (int i11 = 0; i11 < length3; i11++) {
                        iArr2[i11] = iArr2[i11] + b;
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode;
        int k = eub.k(Float.hashCode(this.a) * 31, 31, this.b);
        iz izVar = this.c;
        if (izVar == null) {
            hashCode = 0;
        } else {
            hashCode = izVar.hashCode();
        }
        return k + hashCode;
    }

    @Override // defpackage.jz
    public final void k(r13 r13Var, int i, int[] iArr, int[] iArr2) {
        f(r13Var, i, iArr, tc6.a, iArr2);
    }

    public final String toString() {
        String str;
        if (this.b) {
            str = "";
        } else {
            str = "Absolute";
        }
        String c = rg3.c(this.a);
        return str + "Arrangement#spacedAligned(" + c + ", " + this.c + ")";
    }
}
