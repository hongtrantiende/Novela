package defpackage;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t3a  reason: default package */
/* loaded from: classes.dex */
public final class t3a {
    public x2a a;
    public wi b;
    public li4 c;
    public ff8 d;
    public boolean e;
    public x08 f;
    public final w2a g;
    public final u2a h;
    public boolean i;
    public int j = 1;
    public i2a k = r2a.b;
    public final s3a l = new s3a(this);
    public final ux9 m = new ux9(this, 4);

    public t3a(x2a x2aVar, wi wiVar, li4 li4Var, ff8 ff8Var, boolean z, x08 x08Var, w2a w2aVar, u2a u2aVar) {
        this.a = x2aVar;
        this.b = wiVar;
        this.c = li4Var;
        this.d = ff8Var;
        this.e = z;
        this.f = x08Var;
        this.g = w2aVar;
        this.h = u2aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Type inference failed for: r6v0, types: [yl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r11, defpackage.n42 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.q3a
            if (r0 == 0) goto L13
            r0 = r13
            q3a r0 = (defpackage.q3a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            q3a r0 = new q3a
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            yl9 r11 = r0.a
            defpackage.hre.r(r13)     // Catch: java.lang.Throwable -> L29
            r5 = r10
            goto L58
        L29:
            r0 = move-exception
            r11 = r0
            r5 = r10
            goto L68
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            r10 = 0
            return r10
        L34:
            defpackage.hre.r(r13)
            yl9 r6 = new yl9
            r6.<init>()
            r6.a = r11
            r10.i = r3
            jw7 r13 = defpackage.jw7.a     // Catch: java.lang.Throwable -> L65
            r3a r4 = new r3a     // Catch: java.lang.Throwable -> L65
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L62
            r0.a = r6     // Catch: java.lang.Throwable -> L62
            r0.d = r3     // Catch: java.lang.Throwable -> L62
            java.lang.Object r10 = r5.g(r13, r4, r0)     // Catch: java.lang.Throwable -> L62
            n82 r11 = defpackage.n82.a
            if (r10 != r11) goto L57
            return r11
        L57:
            r11 = r6
        L58:
            r5.i = r2
            long r10 = r11.a
            z4d r12 = new z4d
            r12.<init>(r10)
            return r12
        L62:
            r0 = move-exception
        L63:
            r11 = r0
            goto L68
        L65:
            r0 = move-exception
            r5 = r10
            goto L63
        L68:
            r5.i = r2
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t3a.a(long, n42):java.lang.Object");
    }

    public final boolean b() {
        wi wiVar;
        if (this.a.c() || this.a.b() || ((wiVar = this.b) != null && wiVar.e())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
        if ((r6 instanceof defpackage.wt2) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r4, boolean r6, defpackage.aab r7) {
        /*
            r3 = this;
            pvc r0 = defpackage.pvc.a
            if (r6 == 0) goto Ld
            li4 r6 = r3.c
            az9 r1 = defpackage.r2a.a
            boolean r6 = r6 instanceof defpackage.wt2
            if (r6 == 0) goto Ld
            goto L47
        Ld:
            ff8 r6 = r3.d
            ff8 r1 = defpackage.ff8.b
            r2 = 0
            if (r6 != r1) goto L1a
            r6 = 1
        L15:
            long r4 = defpackage.z4d.a(r4, r2, r2, r6)
            goto L1c
        L1a:
            r6 = 2
            goto L15
        L1c:
            ir5 r6 = new ir5
            r1 = 0
            r6.<init>(r3, r1)
            wi r1 = r3.b
            n82 r2 = defpackage.n82.a
            if (r1 == 0) goto L35
            boolean r3 = r3.b()
            if (r3 == 0) goto L35
            java.lang.Object r3 = r1.b(r4, r6, r7)
            if (r3 != r2) goto L47
            return r3
        L35:
            ir5 r3 = new ir5
            java.lang.Object r6 = r6.e
            t3a r6 = (defpackage.t3a) r6
            r3.<init>(r6, r7)
            r3.d = r4
            java.lang.Object r3 = r3.invokeSuspend(r0)
            if (r3 != r2) goto L47
            return r3
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t3a.c(long, boolean, aab):java.lang.Object");
    }

    public final long d(i2a i2aVar, long j, int i) {
        b18 b18Var;
        long j2;
        long b;
        b18 b18Var2 = this.f.a;
        b18 b18Var3 = null;
        if (b18Var2 != null) {
            b18Var = b18Var2.I1();
        } else {
            b18Var = null;
        }
        long j3 = 0;
        if (b18Var != null) {
            j2 = b18Var.u0(i, j);
        } else {
            j2 = 0;
        }
        long i2 = y78.i(j, j2);
        if (this.d == ff8.b) {
            b = y78.b(i2, nae.e, nae.e, 1);
        } else {
            b = y78.b(i2, nae.e, nae.e, 2);
        }
        long f = f(i(i2aVar.a(h(f(b)))));
        w2a w2aVar = this.g;
        if (w2aVar.J) {
            ViewTreeObserver viewTreeObserver = ((rg) voe.w(w2aVar)).getViewTreeObserver();
            try {
                if (rg.k1 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    rg.k1 = declaredMethod;
                }
                Method method = rg.k1;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long i3 = y78.i(i2, f);
        b18 b18Var4 = this.f.a;
        if (b18Var4 != null) {
            b18Var3 = b18Var4.I1();
        }
        b18 b18Var5 = b18Var3;
        if (b18Var5 != null) {
            j3 = b18Var5.i1(f, i3, i);
        }
        return y78.j(y78.j(j2, f), j3);
    }

    public final float e(float f) {
        if (this.e) {
            return f * (-1.0f);
        }
        return f;
    }

    public final long f(long j) {
        if (this.e) {
            return y78.k(-1.0f, j);
        }
        return j;
    }

    public final Object g(jw7 jw7Var, lu4 lu4Var, n42 n42Var) {
        Object e = this.a.e(jw7Var, new jk8(this, lu4Var, (m42) null, 18), n42Var);
        if (e == n82.a) {
            return e;
        }
        return pvc.a;
    }

    public final float h(long j) {
        long j2;
        if (this.d == ff8.b) {
            j2 = j >> 32;
        } else {
            j2 = j & 4294967295L;
        }
        return Float.intBitsToFloat((int) j2);
    }

    public final long i(float f) {
        if (f == nae.e) {
            return 0L;
        }
        if (this.d == ff8.b) {
            return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L);
        }
        return (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(nae.e) << 32);
    }

    public final float j(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        int i3 = (((float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)))) > 0.7853981633974483d ? 1 : (((float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)))) == 0.7853981633974483d ? 0 : -1));
        ff8 ff8Var = this.d;
        if (i3 >= 0) {
            if (ff8Var != ff8.a) {
                return nae.e;
            }
            return Float.intBitsToFloat(i);
        } else if (ff8Var != ff8.b) {
            return nae.e;
        } else {
            return Float.intBitsToFloat(i2);
        }
    }
}
