package defpackage;

import android.graphics.Paint;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fka  reason: default package */
/* loaded from: classes.dex */
public final class fka {
    public final xu5 a;
    public final List b;
    public final List c;
    public final float d;
    public final lq e = tc4.a(nae.e, 0.01f);
    public final float[] f = l27.a();
    public final long g;
    public final long h;
    public final ljc i;
    public final ljc j;

    public fka(xu5 xu5Var, List list, List list2, float f) {
        this.a = xu5Var;
        this.b = list;
        this.c = list2;
        this.d = f;
        long floatToRawIntBits = (Float.floatToRawIntBits(nae.e) & 4294967295L) | (Float.floatToRawIntBits((-f) / 2.0f) << 32);
        this.g = floatToRawIntBits;
        this.h = floatToRawIntBits ^ (-9223372034707292160L);
        ljc c = lre.c();
        ((Paint) c.b).setAntiAlias(true);
        c.x(0);
        c.o(6);
        this.i = c;
        this.j = lre.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.n42 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.eka
            if (r0 == 0) goto L14
            r0 = r9
            eka r0 = (defpackage.eka) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            eka r0 = new eka
            r0.<init>(r8, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.a
            int r0 = r6.c
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L27
            defpackage.hre.r(r9)
            goto L4b
        L27:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            r8 = 0
            return r8
        L2e:
            defpackage.hre.r(r9)
            java.lang.Float r2 = new java.lang.Float
            r9 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r9)
            r6.c = r1
            lq r1 = r8.e
            xu5 r3 = r8.a
            r4 = 0
            r5 = 0
            r7 = 12
            java.lang.Object r8 = defpackage.lq.c(r1, r2, r3, r4, r5, r6, r7)
            n82 r9 = defpackage.n82.a
            if (r8 != r9) goto L4b
            return r9
        L4b:
            pvc r8 = defpackage.pvc.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fka.a(n42):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && fka.class == obj.getClass()) {
                fka fkaVar = (fka) obj;
                if (this.a.equals(fkaVar.a) && this.b.equals(fkaVar.b) && this.c.equals(fkaVar.c) && this.d == fkaVar.d) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + eub.l(eub.l(nk2.d(15.0f, hl5.a(6, this.a.hashCode() * 31, 31), 31), this.b, 31), this.c, 31);
    }
}
