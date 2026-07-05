package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p15  reason: default package */
/* loaded from: classes.dex */
public final class p15 {
    public static final jc6 C;
    public boolean A;
    public RectF B;
    public final r15 a;
    public Outline f;
    public float j;
    public kwe k;
    public yj l;
    public yj m;
    public boolean n;
    public n61 o;
    public ljc p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public int v;
    public int w;
    public int x;
    public int y;
    public long z;
    public r13 b = kte.c;
    public tc6 c = tc6.a;
    public xt4 d = vt3.D;
    public final jc e = new jc(this, 19);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final vz0 r = new Object();

    static {
        jc6 jc6Var;
        if (c16.i(Build.FINGERPRINT, "robolectric")) {
            jc6Var = tn3.C;
        } else if (Build.VERSION.SDK_INT >= 28) {
            jc6Var = nc6.a;
        } else {
            jc6Var = j55.C;
        }
        C = jc6Var;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, vz0] */
    public p15(r15 r15Var) {
        this.a = r15Var;
        r15Var.w(false);
        this.t = 0L;
        this.u = 0L;
        this.z = 9205357640488583168L;
    }

    public final void a() {
        long j;
        Outline outline;
        if (this.g) {
            boolean z = this.A;
            Outline outline2 = null;
            r15 r15Var = this.a;
            if (!z && r15Var.Z() <= nae.e) {
                r15Var.w(false);
                r15Var.F(null, 0L);
            } else {
                yj yjVar = this.l;
                if (yjVar != null) {
                    RectF rectF = this.B;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.B = rectF;
                    }
                    boolean z2 = yjVar instanceof yj;
                    if (z2) {
                        Path path = yjVar.a;
                        path.computeBounds(rectF, false);
                        int i = Build.VERSION.SDK_INT;
                        if (i <= 28 && !path.isConvex()) {
                            Outline outline3 = this.f;
                            if (outline3 != null) {
                                outline3.setEmpty();
                            }
                            this.n = true;
                            outline = null;
                        } else {
                            outline = this.f;
                            if (outline == null) {
                                outline = new Outline();
                                this.f = outline;
                            }
                            if (i >= 30) {
                                qka.y(outline, yjVar);
                            } else if (z2) {
                                outline.setConvexPath(path);
                            } else {
                                xk5.q("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.offset(this.v, this.w);
                            this.n = !outline.canClip();
                        }
                        this.l = yjVar;
                        if (outline != null) {
                            outline.setAlpha(r15Var.z());
                            outline2 = outline;
                        }
                        r15Var.F(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                        if (this.n && this.A) {
                            r15Var.w(false);
                            r15Var.G();
                        } else {
                            r15Var.w(this.A);
                        }
                    } else {
                        xk5.q("Unable to obtain android.graphics.Path");
                        return;
                    }
                } else {
                    r15Var.w(this.A);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long A = eg0.A(this.u);
                    long j2 = this.h;
                    long j3 = this.i;
                    if (j3 == 9205357640488583168L) {
                        j = A;
                    } else {
                        j = j3;
                    }
                    int i2 = (int) (j2 >> 32);
                    int i3 = (int) (j2 & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat((int) (j >> 32)) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (4294967295L & j)) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(r15Var.z());
                    r15Var.F(outline5, eg0.y(j));
                }
            }
        }
        this.g = false;
    }

    public final void b() {
        p15 p15Var;
        if (this.s && this.q == 0) {
            vz0 vz0Var = this.r;
            p15 p15Var2 = (p15) vz0Var.b;
            if (p15Var2 != null) {
                p15Var2.q--;
                p15Var2.b();
                vz0Var.b = null;
            }
            uv7 uv7Var = (uv7) vz0Var.d;
            if (uv7Var != null) {
                Object[] objArr = uv7Var.b;
                long[] jArr = uv7Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    p15Var.q--;
                                    ((p15) objArr[(i << 3) + i3]).b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                uv7Var.b();
            }
            this.a.G();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.k61 r23, defpackage.p15 r24) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p15.c(k61, p15):void");
    }

    public final void d(ak3 ak3Var) {
        p15 p15Var;
        vz0 vz0Var = this.r;
        vz0Var.c = (p15) vz0Var.b;
        uv7 uv7Var = (uv7) vz0Var.d;
        if (uv7Var != null && uv7Var.h()) {
            uv7 uv7Var2 = (uv7) vz0Var.e;
            if (uv7Var2 == null) {
                uv7 uv7Var3 = uz9.a;
                uv7Var2 = new uv7();
                vz0Var.e = uv7Var2;
            }
            uv7Var2.j(uv7Var);
            uv7Var.b();
        }
        vz0Var.a = true;
        this.d.invoke(ak3Var);
        vz0Var.a = false;
        p15 p15Var2 = (p15) vz0Var.c;
        if (p15Var2 != null) {
            p15Var2.q--;
            p15Var2.b();
        }
        uv7 uv7Var4 = (uv7) vz0Var.e;
        if (uv7Var4 != null && uv7Var4.h()) {
            Object[] objArr = uv7Var4.b;
            long[] jArr = uv7Var4.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                p15Var.q--;
                                ((p15) objArr[(i << 3) + i3]).b();
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            uv7Var4.b();
        }
    }

    public final kwe e() {
        kwe tf8Var;
        kwe kweVar = this.k;
        yj yjVar = this.l;
        if (kweVar != null) {
            return kweVar;
        }
        if (yjVar != null) {
            sf8 sf8Var = new sf8(yjVar);
            this.k = sf8Var;
            return sf8Var;
        }
        long A = eg0.A(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            A = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (A >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (A & 4294967295L)) + intBitsToFloat2;
        float f = this.j;
        if (f > nae.e) {
            long floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
            float intBitsToFloat5 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            float intBitsToFloat6 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat5) << 32) | (Float.floatToRawIntBits(intBitsToFloat6) & 4294967295L);
            tf8Var = new uf8(new ou9(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, floatToRawIntBits2, floatToRawIntBits2, floatToRawIntBits2, floatToRawIntBits2));
        } else {
            tf8Var = new tf8(new rk9(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.k = tf8Var;
        return tf8Var;
    }

    public final void f(r13 r13Var, tc6 tc6Var, long j, xt4 xt4Var) {
        boolean b = zy5.b(this.u, j);
        r15 r15Var = this.a;
        if (!b) {
            this.u = j;
            long j2 = this.t;
            r15Var.H((int) (j2 >> 32), j, (int) (j2 & 4294967295L));
            if (this.i == 9205357640488583168L) {
                this.g = true;
                a();
            }
        }
        this.b = r13Var;
        this.c = tc6Var;
        this.d = xt4Var;
        r15Var.W(r13Var, tc6Var, this, this.e);
    }

    public final void g(float f) {
        r15 r15Var = this.a;
        if (r15Var.z() == f) {
            return;
        }
        r15Var.q(f);
    }

    public final void h(int i) {
        r15 r15Var = this.a;
        if (r15Var.J() == i) {
            return;
        }
        r15Var.X(i);
    }

    public final void i(float f, long j, long j2) {
        long j3 = y78.j(j, (Float.floatToRawIntBits(this.w) & 4294967295L) | (Float.floatToRawIntBits(this.v) << 32));
        if (y78.d(this.h, j3) && dna.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j3;
        this.i = j2;
        this.j = f;
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.o15
            if (r0 == 0) goto L13
            r0 = r5
            o15 r0 = (defpackage.o15) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            o15 r0 = new o15
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r5)
            goto L3c
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r5)
            r0.c = r2
            jc6 r5 = defpackage.p15.C
            java.lang.Object r5 = r5.i(r4, r0)
            n82 r4 = defpackage.n82.a
            if (r5 != r4) goto L3c
            return r4
        L3c:
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            jj r4 = new jj
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p15.j(n42):java.lang.Object");
    }
}
