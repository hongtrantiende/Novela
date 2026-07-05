package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lr  reason: default package */
/* loaded from: classes.dex */
public final class lr implements xq2 {
    public final dq5 a;
    public final xe8 b;
    public final boolean c;

    public lr(dq5 dq5Var, xe8 xe8Var, boolean z) {
        this.a = dq5Var;
        this.b = xe8Var;
        this.c = z;
    }

    public static Drawable b(lr lrVar, vl9 vl9Var) {
        dq5 z = ube.z(lrVar.a, lrVar.c);
        try {
            ImageDecoder.Source E = ff.E(z, lrVar.b, true);
            if (E == null) {
                bz0 v = z.v();
                v.request(Long.MAX_VALUE);
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect((int) v.b().b);
                while (!v.b().k()) {
                    v.b().read(allocateDirect);
                }
                allocateDirect.flip();
                v.close();
                E = ImageDecoder.createSource(allocateDirect);
            }
            Drawable decodeDrawable = ImageDecoder.decodeDrawable(E, new ir(lrVar, vl9Var, 0));
            dxe.r(z, null);
            return decodeDrawable;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                dxe.r(z, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r1 == r4) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Type inference failed for: r8v3, types: [vl9, java.lang.Object] */
    @Override // defpackage.xq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.m42 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.hr
            if (r0 == 0) goto L13
            r0 = r8
            hr r0 = (defpackage.hr) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            hr r0 = new hr
            n42 r8 = (defpackage.n42) r8
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            n82 r4 = defpackage.n82.a
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            vl9 r7 = r0.a
            defpackage.hre.r(r8)
            goto L68
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            r7 = 0
            return r7
        L35:
            vl9 r1 = r0.a
            defpackage.hre.r(r8)
            r6 = r1
            r1 = r8
            r8 = r6
            goto L58
        L3e:
            defpackage.hre.r(r8)
            vl9 r8 = new vl9
            r8.<init>()
            t7 r1 = new t7
            r5 = 8
            r1.<init>(r5, r7, r8)
            r0.a = r8
            r0.d = r3
            java.lang.Object r1 = defpackage.st0.r(r1, r0)
            if (r1 != r4) goto L58
            goto L64
        L58:
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r0.a = r8
            r0.d = r2
            java.lang.Object r7 = r7.c(r1, r0)
            if (r7 != r4) goto L65
        L64:
            return r4
        L65:
            r6 = r8
            r8 = r7
            r7 = r6
        L68:
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            ml5 r8 = defpackage.aye.d(r8)
            boolean r7 = r7.a
            tq2 r0 = new tq2
            r0.<init>(r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr.a(m42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.graphics.drawable.Drawable r7, defpackage.n42 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.jr
            if (r0 == 0) goto L13
            r0 = r8
            jr r0 = (defpackage.jr) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jr r0 = new jr
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 0
            xe8 r6 = r6.b
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            java.lang.Object r7 = r0.a
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            defpackage.hre.r(r8)
            goto L85
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r3
        L32:
            defpackage.hre.r(r8)
            boolean r8 = r7 instanceof android.graphics.drawable.AnimatedImageDrawable
            if (r8 != 0) goto L3a
            return r7
        L3a:
            u4 r8 = defpackage.kp5.a
            java.lang.Object r1 = defpackage.fca.k(r6, r8)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r4 = -2
            if (r1 == r4) goto L59
            r1 = r7
            android.graphics.drawable.AnimatedImageDrawable r1 = (android.graphics.drawable.AnimatedImageDrawable) r1
            java.lang.Object r8 = defpackage.fca.k(r6, r8)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r1.setRepeatCount(r8)
        L59:
            u4 r8 = defpackage.kp5.c
            java.lang.Object r8 = defpackage.fca.k(r6, r8)
            vt4 r8 = (defpackage.vt4) r8
            u4 r1 = defpackage.kp5.d
            java.lang.Object r1 = defpackage.fca.k(r6, r1)
            vt4 r1 = (defpackage.vt4) r1
            if (r8 != 0) goto L6d
            if (r1 == 0) goto L85
        L6d:
            sw2 r4 = defpackage.ab3.a
            n35 r4 = defpackage.zz6.a
            n35 r4 = r4.f
            kr r5 = new kr
            r5.<init>(r7, r8, r1, r3)
            r0.a = r7
            r0.d = r2
            java.lang.Object r8 = defpackage.z87.E(r4, r5, r0)
            n82 r0 = defpackage.n82.a
            if (r8 != r0) goto L85
            return r0
        L85:
            jz9 r8 = new jz9
            hz9 r6 = r6.c
            r8.<init>(r7, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr.c(android.graphics.drawable.Drawable, n42):java.lang.Object");
    }
}
