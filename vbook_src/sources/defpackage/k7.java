package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k7  reason: default package */
/* loaded from: classes.dex */
public final class k7 extends ji0 {
    public final ys2 g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final qs5 o;
    public final xfb p;
    public float q;
    public int r;
    public int s;
    public long t;
    public z37 u;

    public k7(ajc ajcVar, int[] iArr, ys2 ys2Var, long j, long j2, long j3, qs5 qs5Var) {
        super(ajcVar, iArr);
        if (j3 < j) {
            st0.w("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.g = ys2Var;
        this.h = j * 1000;
        this.i = j2 * 1000;
        this.j = j3 * 1000;
        this.k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = qs5.l(qs5Var);
        this.p = xfb.a;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ls5 ls5Var = (ls5) arrayList.get(i);
            if (ls5Var != null) {
                ls5Var.b(new j7(j, jArr[i]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            z37 z37Var = (z37) yf2.t(list);
            long j = z37Var.C;
            if (j != -9223372036854775807L) {
                long j2 = z37Var.D;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.c14
    public final void b(long j, long j2, long j3, List list, a47[] a47VarArr) {
        long x;
        int e;
        long j4;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.r;
        if (i < a47VarArr.length && a47VarArr[i].next()) {
            a47 a47Var = a47VarArr[this.r];
            x = a47Var.c() - a47Var.b();
        } else {
            int length = a47VarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    a47 a47Var2 = a47VarArr[i2];
                    if (a47Var2.next()) {
                        x = a47Var2.c() - a47Var2.b();
                        break;
                    }
                    i2++;
                } else {
                    x = x(list);
                    break;
                }
            }
        }
        int i3 = this.s;
        if (i3 == 0) {
            this.s = 1;
            this.r = w(elapsedRealtime);
            return;
        }
        int i4 = this.r;
        if (list.isEmpty()) {
            e = -1;
        } else {
            e = e(((z37) yf2.t(list)).d);
        }
        if (e != -1) {
            i3 = ((z37) yf2.t(list)).e;
            i4 = e;
        }
        int w = w(elapsedRealtime);
        if (w != i4 && !a(i4, elapsedRealtime)) {
            vq4[] vq4VarArr = this.d;
            vq4 vq4Var = vq4VarArr[i4];
            vq4 vq4Var2 = vq4VarArr[w];
            int i5 = (j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1));
            long j5 = this.h;
            if (i5 != 0) {
                if (x != -9223372036854775807L) {
                    j4 = j3 - x;
                } else {
                    j4 = j3;
                }
                j5 = Math.min(((float) j4) * this.n, j5);
            }
            int i6 = vq4Var2.j;
            int i7 = vq4Var.j;
            if ((i6 > i7 && j2 < j5) || (i6 < i7 && j2 >= this.i)) {
                w = i4;
            }
        }
        if (w != i4) {
            i3 = 3;
        }
        this.s = i3;
        this.r = w;
    }

    @Override // defpackage.c14
    public final int d() {
        return this.r;
    }

    @Override // defpackage.ji0, defpackage.c14
    public final void i() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // defpackage.ji0, defpackage.c14
    public final int k(long j, List list) {
        z37 z37Var;
        int i;
        int i2;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.t;
        if (j2 != -9223372036854775807L && elapsedRealtime - j2 < 1000 && (list.isEmpty() || ((z37) yf2.t(list)).equals(this.u))) {
            return list.size();
        }
        this.t = elapsedRealtime;
        if (list.isEmpty()) {
            z37Var = null;
        } else {
            z37Var = (z37) yf2.t(list);
        }
        this.u = z37Var;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long D = a2d.D(this.q, ((z37) list.get(size - 1)).C - j);
        long j3 = this.j;
        if (D >= j3) {
            x(list);
            vq4 vq4Var = this.d[w(elapsedRealtime)];
            for (int i3 = 0; i3 < size; i3++) {
                z37 z37Var2 = (z37) list.get(i3);
                vq4 vq4Var2 = z37Var2.d;
                if (a2d.D(this.q, z37Var2.C - j) >= j3 && vq4Var2.j < vq4Var.j && (i = vq4Var2.w) != -1 && i <= this.l && (i2 = vq4Var2.v) != -1 && i2 <= this.k && i < vq4Var.w) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // defpackage.ji0, defpackage.c14
    public final void l() {
        this.u = null;
    }

    @Override // defpackage.c14
    public final int o() {
        return this.s;
    }

    @Override // defpackage.ji0, defpackage.c14
    public final void q(float f) {
        this.q = f;
    }

    @Override // defpackage.c14
    public final Object r() {
        return null;
    }

    public final int w(long j) {
        long j2;
        long j3;
        ys2 ys2Var = this.g;
        synchronized (ys2Var) {
            j2 = ys2Var.l;
        }
        this.g.getClass();
        long j4 = (((float) j2) * this.m) / this.q;
        if (!this.o.isEmpty()) {
            int i = 1;
            while (i < this.o.size() - 1 && ((j7) this.o.get(i)).a < j4) {
                i++;
            }
            j7 j7Var = (j7) this.o.get(i - 1);
            j7 j7Var2 = (j7) this.o.get(i);
            long j5 = j7Var.a;
            float f = ((float) (j4 - j5)) / ((float) (j7Var2.a - j5));
            j4 = j7Var.b + (f * ((float) (j7Var2.b - j3)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !a(i3, j)) {
                if (this.d[i3].j <= j4) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }
}
