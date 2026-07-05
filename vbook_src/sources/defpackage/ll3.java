package defpackage;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ll3  reason: default package */
/* loaded from: classes.dex */
public final class ll3 extends uea {
    public final lea i;
    public final ljc j;
    public jj k;
    public mx1 l;

    public ll3(lea leaVar, kwe kweVar) {
        super(kweVar);
        this.i = leaVar;
        this.j = lre.c();
    }

    @Override // defpackage.uea
    public final void a(ak3 ak3Var, long j, long j2, yj yjVar) {
        jj d;
        BlurMaskFilter blurMaskFilter;
        lea leaVar = this.i;
        float L0 = ak3Var.L0(leaVar.a);
        float L02 = ak3Var.L0(leaVar.b);
        ljc ljcVar = this.j;
        BlurMaskFilter blurMaskFilter2 = null;
        if (yjVar != null) {
            float f = 2.0f * L02;
            float f2 = (L0 * 2.0f) + f;
            d = twe.d((int) Math.ceil(Float.intBitsToFloat((int) (j >> 32)) + f2), (int) Math.ceil(Float.intBitsToFloat((int) (j & 4294967295L)) + f2), 1, 24);
            sf a = zbe.a(d);
            if (L02 > nae.e) {
                float f3 = L02 + L0;
                a.p(f3, f3);
                int i = (L0 > nae.e ? 1 : (L0 == nae.e ? 0 : -1));
                if (i > 0) {
                    blurMaskFilter = fca.a(L0);
                } else {
                    blurMaskFilter = null;
                }
                hif.k(ljcVar, 0, blurMaskFilter, 11);
                a.b(yjVar, ljcVar);
                if (i > 0) {
                    blurMaskFilter2 = fca.a(L0);
                }
                hif.k(ljcVar, 0, blurMaskFilter2, 3);
                ljcVar.w(f);
                a.b(yjVar, ljcVar);
            } else {
                if (L0 > nae.e) {
                    blurMaskFilter2 = fca.a(L0);
                }
                hif.k(ljcVar, 0, blurMaskFilter2, 11);
                a.p(L0, L0);
                a.b(yjVar, ljcVar);
            }
        } else {
            float f4 = (L02 * 2.0f) + (L0 * 2.0f);
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + f4;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + f4;
            d = twe.d((int) Math.ceil(intBitsToFloat), (int) Math.ceil(intBitsToFloat2), 1, 24);
            sf a2 = zbe.a(d);
            float f5 = intBitsToFloat - L0;
            float f6 = intBitsToFloat2 - L0;
            float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
            float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            if (L0 > nae.e) {
                blurMaskFilter2 = fca.a(L0);
            }
            hif.k(ljcVar, 0, blurMaskFilter2, 11);
            a2.a.drawRoundRect(L0, L0, f5, f6, intBitsToFloat3, intBitsToFloat4, (Paint) ljcVar.b);
        }
        this.k = d;
    }

    @Override // defpackage.uea
    public final void c(ak3 ak3Var, long j, yj yjVar, float f, em1 em1Var, hy0 hy0Var, int i) {
        mx1 mx1Var;
        iy0 iy0Var = hy0Var;
        jj jjVar = this.k;
        if (jjVar != null) {
            Bitmap bitmap = jjVar.a;
            lea leaVar = this.i;
            float f2 = -(ak3Var.L0(leaVar.b) + ak3Var.L0(leaVar.a));
            if (iy0Var != null && em1Var == null) {
                mx1 mx1Var2 = this.l;
                if (mx1Var2 != null && mx1Var2.d.equals(iy0Var)) {
                    mx1Var = mx1Var2;
                } else {
                    iy0 iy0Var2 = new iy0(eh.b(jjVar));
                    if (iy0Var instanceof jea) {
                        iy0Var = new iy0(((jea) iy0Var).c((Float.floatToRawIntBits(bitmap.getWidth()) << 32) | (Float.floatToRawIntBits(bitmap.getHeight()) & 4294967295L)));
                    }
                    mx1Var = new mx1(c16.y(iy0Var2), c16.y(iy0Var));
                    this.l = mx1Var;
                }
                ((mu9) ak3Var.Q0().b).D(f2, f2);
                try {
                    ak3.h1(ak3Var, mx1Var, 0L, (Float.floatToRawIntBits(bitmap.getWidth()) << 32) | (Float.floatToRawIntBits(bitmap.getHeight()) & 4294967295L), f, null, null, i, 50);
                    return;
                } finally {
                    float f3 = -f2;
                    ((mu9) ak3Var.Q0().b).D(f3, f3);
                }
            }
            ak3.W(ak3Var, jjVar, (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), f, em1Var, i, 8);
        }
    }
}
