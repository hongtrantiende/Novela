package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wi  reason: default package */
/* loaded from: classes.dex */
public final class wi {
    public final r13 a;
    public long b = 9205357640488583168L;
    public final sn3 c;
    public final hm8 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final m03 i;

    public wi(Context context, r13 r13Var, long j, rh8 rh8Var) {
        m03 pz4Var;
        this.a = r13Var;
        sn3 sn3Var = new sn3(context, sve.x(j));
        this.c = sn3Var;
        this.d = new hm8(pvc.a, r0f.J);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        hab a = dab.a(new vi(this, 0));
        if (Build.VERSION.SDK_INT >= 31) {
            pz4Var = new p1b(a, this, sn3Var);
        } else {
            pz4Var = new pz4(a, this, sn3Var, rh8Var);
        }
        this.i = pz4Var;
    }

    public final void a() {
        boolean z;
        sn3 sn3Var = this.c;
        EdgeEffect edgeEffect = sn3Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = sn3Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            if (edgeEffect2.isFinished() && !z) {
                z = false;
            } else {
                z = true;
            }
        }
        EdgeEffect edgeEffect3 = sn3Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            if (edgeEffect3.isFinished() && !z) {
                z = false;
            } else {
                z = true;
            }
        }
        EdgeEffect edgeEffect4 = sn3Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0129, code lost:
        if (r4 == r6) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r19, defpackage.lu4 r21, defpackage.n42 r22) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi.b(long, lu4, n42):java.lang.Object");
    }

    public final long c() {
        long j = this.b;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = sxd.j(this.g);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.g >> 32))) << 32);
    }

    public final void d() {
        if (this.e) {
            this.d.setValue(pvc.a);
        }
    }

    public final boolean e() {
        float f;
        float f2;
        float f3;
        float f4;
        sn3 sn3Var = this.c;
        EdgeEffect edgeEffect = sn3Var.d;
        if (edgeEffect != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                f4 = ih.k(edgeEffect);
            } else {
                f4 = 0.0f;
            }
            if (f4 != nae.e) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = sn3Var.e;
        if (edgeEffect2 != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                f3 = ih.k(edgeEffect2);
            } else {
                f3 = 0.0f;
            }
            if (f3 != nae.e) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = sn3Var.f;
        if (edgeEffect3 != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                f2 = ih.k(edgeEffect3);
            } else {
                f2 = 0.0f;
            }
            if (f2 != nae.e) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = sn3Var.g;
        if (edgeEffect4 != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                f = ih.k(edgeEffect4);
            } else {
                f = 0.0f;
            }
            if (f != nae.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final float f(long j) {
        float f;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect b = this.c.b();
        float f2 = -intBitsToFloat2;
        float f3 = 1.0f - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f2 = ih.p(b, f2, f3);
        } else {
            b.onPull(f2, f3);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & this.g)) * (-f2);
        if (i2 >= 31) {
            f = ih.k(b);
        } else {
            f = 0.0f;
        }
        if (f == nae.e) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float f;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect c = this.c.c();
        float f2 = 1.0f - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = ih.p(c, intBitsToFloat2, f2);
        } else {
            c.onPull(intBitsToFloat2, f2);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.g >> 32)) * intBitsToFloat2;
        if (i2 >= 31) {
            f = ih.k(c);
        } else {
            f = 0.0f;
        }
        if (f == nae.e) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float f;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect d = this.c.d();
        float f2 = -intBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f2 = ih.p(d, f2, intBitsToFloat);
        } else {
            d.onPull(f2, intBitsToFloat);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.g >> 32)) * (-f2);
        if (i2 >= 31) {
            f = ih.k(d);
        } else {
            f = 0.0f;
        }
        if (f == nae.e) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    public final float i(long j) {
        float f;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect e = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = ih.p(e, intBitsToFloat2, intBitsToFloat);
        } else {
            e.onPull(intBitsToFloat2, intBitsToFloat);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.g & 4294967295L)) * intBitsToFloat2;
        if (i2 >= 31) {
            f = ih.k(e);
        } else {
            f = 0.0f;
        }
        if (f == nae.e) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    public final void j(long j) {
        boolean a = dna.a(this.g, 0L);
        boolean a2 = dna.a(j, this.g);
        this.g = j;
        if (!a2) {
            int A = k27.A(Float.intBitsToFloat((int) (j >> 32)));
            long A2 = (k27.A(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (A << 32);
            sn3 sn3Var = this.c;
            sn3Var.c = A2;
            EdgeEffect edgeEffect = sn3Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (A2 >> 32), (int) (A2 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = sn3Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (A2 >> 32), (int) (A2 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = sn3Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (A2 & 4294967295L), (int) (A2 >> 32));
            }
            EdgeEffect edgeEffect4 = sn3Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (A2 & 4294967295L), (int) (A2 >> 32));
            }
            EdgeEffect edgeEffect5 = sn3Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (A2 >> 32), (int) (A2 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = sn3Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (A2 >> 32), (int) (A2 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = sn3Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (A2 & 4294967295L), (int) (A2 >> 32));
            }
            EdgeEffect edgeEffect8 = sn3Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & A2), (int) (A2 >> 32));
            }
        }
        if (!a && !a2) {
            a();
        }
    }
}
