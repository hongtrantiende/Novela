package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qe  reason: default package */
/* loaded from: classes.dex */
public final class qe {
    public final hm8 c;
    public final hm8 d;
    public final dm8 g;
    public final hm8 h;
    public final hm8 i;
    public final le j;
    public final y4 a = new y4(11);
    public final ow7 b = new ow7();
    public final h23 e = yae.q(new ee(this, 0));
    public final dm8 f = new dm8(Float.NaN);

    public qe(Object obj) {
        this.c = yae.z(obj);
        this.d = yae.z(obj);
        yae.r(new ee(this, 1), zj1.G);
        this.g = new dm8(nae.e);
        this.h = yae.z(null);
        this.i = yae.z(new jt2(ks3.a, new float[0]));
        this.j = new le(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r11, defpackage.jw7 r12, defpackage.nu4 r13, defpackage.n42 r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.ie
            if (r0 == 0) goto L13
            r0 = r14
            ie r0 = (defpackage.ie) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ie r0 = new ie
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.a
            int r1 = r0.c
            hm8 r2 = r10.h
            r3 = 1
            r8 = 0
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2b
            defpackage.hre.r(r14)     // Catch: java.lang.Throwable -> L28
            goto L65
        L28:
            r0 = move-exception
            r10 = r0
            goto L69
        L2b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            r10 = 0
            return r10
        L32:
            defpackage.hre.r(r14)
            jt2 r14 = r10.b()
            java.util.List r14 = r14.a
            int r14 = r14.indexOf(r11)
            r1 = -1
            if (r14 == r1) goto L6d
            ow7 r14 = r10.b     // Catch: java.lang.Throwable -> L28
            je r4 = new je     // Catch: java.lang.Throwable -> L28
            r9 = 1
            r5 = r10
            r6 = r11
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L28
            r0.c = r3     // Catch: java.lang.Throwable -> L28
            r14.getClass()     // Catch: java.lang.Throwable -> L28
            r7 = r4
            xr0 r4 = new xr0     // Catch: java.lang.Throwable -> L28
            r9 = 13
            r5 = r12
            r6 = r14
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r10 = defpackage.k27.p(r4, r0)     // Catch: java.lang.Throwable -> L28
            n82 r11 = defpackage.n82.a
            if (r10 != r11) goto L65
            return r11
        L65:
            r2.setValue(r8)
            goto L77
        L69:
            r2.setValue(r8)
            throw r10
        L6d:
            r5 = r10
            r6 = r11
            hm8 r10 = r5.d
            r10.setValue(r6)
            r5.e(r6)
        L77:
            pvc r10 = defpackage.pvc.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe.a(java.lang.Object, jw7, nu4, n42):java.lang.Object");
    }

    public final jt2 b() {
        return (jt2) this.i.getValue();
    }

    public final float c(float f) {
        float h;
        float f2;
        dm8 dm8Var = this.f;
        if (Float.isNaN(dm8Var.h())) {
            h = nae.e;
        } else {
            h = dm8Var.h();
        }
        float f3 = h + f;
        float[] fArr = b().b;
        float f4 = Float.NaN;
        int i = 1;
        if (fArr.length == 0) {
            f2 = Float.NaN;
        } else {
            f2 = fArr[0];
            int length = fArr.length - 1;
            if (1 <= length) {
                int i2 = 1;
                while (true) {
                    f2 = Math.min(f2, fArr[i2]);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        float[] fArr2 = b().b;
        if (fArr2.length != 0) {
            f4 = fArr2[0];
            int length2 = fArr2.length - 1;
            if (1 <= length2) {
                while (true) {
                    f4 = Math.max(f4, fArr2[i]);
                    if (i == length2) {
                        break;
                    }
                    i++;
                }
            }
        }
        return dce.m(f3, f2, f4);
    }

    public final float d() {
        dm8 dm8Var = this.f;
        if (Float.isNaN(dm8Var.h())) {
            ov5.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return dm8Var.h();
    }

    public final void e(Object obj) {
        this.c.setValue(obj);
    }
}
