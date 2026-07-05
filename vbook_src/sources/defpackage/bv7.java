package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bv7  reason: default package */
/* loaded from: classes.dex */
public final class bv7 {
    public long[] a;
    public int b;

    public bv7(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = ly6.a;
        } else {
            jArr = new long[i];
        }
        this.a = jArr;
    }

    public final void a(long j) {
        b(this.b + 1);
        long[] jArr = this.a;
        int i = this.b;
        jArr[i] = j;
        this.b = i + 1;
    }

    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            this.a = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
    }

    public final long c(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        cy7.k("Index must be between 0 and size");
        return 0L;
    }

    public final void d(int i, int i2) {
        int i3;
        if (i >= 0 && i <= (i3 = this.b) && i2 >= 0 && i2 <= i3) {
            if (i2 >= i) {
                if (i2 != i) {
                    if (i2 < i3) {
                        long[] jArr = this.a;
                        b00.Y(jArr, jArr, i, i2, i3);
                    }
                    this.b -= i2 - i;
                    return;
                }
                return;
            }
            vs.m("The end index must be < start index");
            return;
        }
        cy7.k("Index must be between 0 and size");
    }

    public final void e(int i, long j) {
        if (i >= 0 && i < this.b) {
            long[] jArr = this.a;
            long j2 = jArr[i];
            jArr[i] = j;
            return;
        }
        cy7.k("Index must be between 0 and size");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bv7) {
            bv7 bv7Var = (bv7) obj;
            int i = bv7Var.b;
            int i2 = this.b;
            if (i == i2) {
                long[] jArr = this.a;
                long[] jArr2 = bv7Var.a;
                ty5 F = dce.F(0, i2);
                int i3 = F.a;
                int i4 = F.b;
                if (i3 <= i4) {
                    while (jArr[i3] == jArr2[i3]) {
                        if (i3 != i4) {
                            i3++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Long.hashCode(jArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long j = jArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append(j);
            i2++;
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ bv7() {
        this(16);
    }
}
