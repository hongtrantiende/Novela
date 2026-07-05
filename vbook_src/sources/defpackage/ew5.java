package defpackage;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ew5  reason: default package */
/* loaded from: classes.dex */
public final class ew5 extends uea {
    public final lea i;
    public final ljc j;
    public iy0 k;
    public mx1 l;

    public ew5(lea leaVar, kwe kweVar) {
        super(kweVar);
        this.i = leaVar;
        this.j = lre.c();
    }

    @Override // defpackage.uea
    public final void a(ak3 ak3Var, long j, long j2, yj yjVar) {
        int i;
        int i2;
        BlurMaskFilter blurMaskFilter;
        iy0 iy0Var;
        int i3;
        char c;
        ljc ljcVar;
        jj jjVar;
        BlurMaskFilter blurMaskFilter2;
        BlurMaskFilter blurMaskFilter3;
        lea leaVar = this.i;
        float L0 = ak3Var.L0(leaVar.a);
        float L02 = ak3Var.L0(leaVar.b);
        long j3 = leaVar.c;
        float L03 = ak3Var.L0(tg3.a(j3));
        float L04 = ak3Var.L0(tg3.b(j3));
        ljc ljcVar2 = this.j;
        if (yjVar != null) {
            int ceil = (int) Math.ceil(Float.intBitsToFloat((int) (j >> 32)));
            int ceil2 = (int) Math.ceil(Float.intBitsToFloat((int) (j & 4294967295L)));
            if (L02 > nae.e) {
                rk9 g = yjVar.g();
                c = ' ';
                float f = g.c - g.a;
                float f2 = g.d - g.b;
                i3 = ceil;
                ljcVar = ljcVar2;
                jjVar = twe.d((int) Math.ceil(f), (int) Math.ceil(f2), 1, 24);
                sf a = zbe.a(jjVar);
                a.b(yjVar, ljcVar);
                a.o(nae.e, nae.e, f, f2, 1);
                hif.k(ljcVar, 0, null, 5);
                ljcVar.w(L02 * 2.0f);
                a.b(yjVar, ljcVar);
            } else {
                i3 = ceil;
                c = ' ';
                ljcVar = ljcVar2;
                jjVar = null;
            }
            int ceil3 = ((int) Math.ceil(L0)) * 2;
            jj d = twe.d(i3 + ceil3, ceil2 + ceil3, 1, 24);
            Bitmap bitmap = d.a;
            sf a2 = zbe.a(d);
            if (jjVar != null) {
                hif.k(ljcVar, 0, null, 15);
                a2.a.drawRect(nae.e, nae.e, bitmap.getWidth(), bitmap.getHeight(), (Paint) ljcVar.b);
                long floatToRawIntBits = (Float.floatToRawIntBits(L03) << c) | (Float.floatToRawIntBits(L04) & 4294967295L);
                if (L0 > nae.e) {
                    blurMaskFilter3 = fca.a(L0);
                } else {
                    blurMaskFilter3 = null;
                }
                hif.k(ljcVar, 11, blurMaskFilter3, 9);
                a2.l(jjVar, floatToRawIntBits, ljcVar);
                iy0Var = new iy0(eh.b(d));
            } else {
                a2.i();
                a2.p(L03, L04);
                if (L0 > nae.e) {
                    blurMaskFilter2 = fca.a(L0);
                } else {
                    blurMaskFilter2 = null;
                }
                hif.k(ljcVar, 0, blurMaskFilter2, 11);
                a2.b(yjVar, ljcVar);
                a2.q();
                hif.k(ljcVar, 11, null, 13);
                a2.a.drawRect(nae.e, nae.e, bitmap.getWidth(), bitmap.getHeight(), (Paint) ljcVar.b);
                iy0Var = new iy0(eh.b(d));
            }
        } else {
            jj d2 = twe.d((int) Math.ceil(Float.intBitsToFloat(i)), (int) Math.ceil(Float.intBitsToFloat(i2)), 1, 24);
            sf a3 = zbe.a(d2);
            float f3 = L03 + L02;
            float f4 = L04 + L02;
            float max = Math.max(f3, (Float.intBitsToFloat((int) (j >> 32)) + L03) - L02);
            float max2 = Math.max(f4, (Float.intBitsToFloat((int) (j & 4294967295L)) + L04) - L02);
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            if (L0 > nae.e) {
                blurMaskFilter = fca.a(L0);
            } else {
                blurMaskFilter = null;
            }
            hif.k(ljcVar2, 0, blurMaskFilter, 11);
            a3.a.drawRoundRect(f3, f4, max, max2, intBitsToFloat, intBitsToFloat2, (Paint) ljcVar2.b);
            Bitmap bitmap2 = d2.a;
            hif.k(ljcVar2, 11, null, 13);
            a3.a.drawRect(nae.e, nae.e, bitmap2.getWidth(), bitmap2.getHeight(), (Paint) ljcVar2.b);
            iy0Var = new iy0(eh.b(d2));
        }
        this.k = iy0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r5 == false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ak3 r17, long r18, defpackage.yj r20, float r21, defpackage.em1 r22, defpackage.hy0 r23, int r24) {
        /*
            r16 = this;
            r0 = r16
            iy0 r1 = r0.k
            if (r1 == 0) goto L71
            lea r2 = r0.i
            hy0 r3 = r2.f
            boolean r4 = r3 instanceof defpackage.jea
            if (r4 == 0) goto L2d
            mx1 r4 = r0.l
            if (r4 == 0) goto L1d
            jea r5 = r4.d
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L1b
            goto L1d
        L1b:
            r1 = r4
            goto L2d
        L1d:
            mx1 r4 = new mx1
            jea r1 = defpackage.c16.y(r1)
            jea r3 = defpackage.c16.y(r3)
            r4.<init>(r1, r3)
            r0.l = r4
            goto L1b
        L2d:
            r4 = r1
            if (r20 == 0) goto L42
            r7 = 0
            r10 = 8
            r3 = r17
            r6 = r21
            r8 = r22
            r9 = r24
            r5 = r4
            r4 = r20
            defpackage.ak3.N(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L42:
            r0 = 0
            r9 = r18
            boolean r0 = defpackage.w92.s(r9, r0)
            if (r0 == 0) goto L5f
            r10 = 0
            r13 = 22
            r5 = 0
            r7 = 0
            r3 = r17
            r9 = r21
            r11 = r22
            r12 = r24
            defpackage.ak3.h1(r3, r4, r5, r7, r9, r10, r11, r12, r13)
            return
        L5f:
            int r14 = r2.d
            r12 = 0
            r15 = 38
            r5 = 0
            r7 = 0
            r3 = r17
            r11 = r21
            r13 = r22
            defpackage.ak3.t0(r3, r4, r5, r7, r9, r11, r12, r13, r14, r15)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ew5.c(ak3, long, yj, float, em1, hy0, int):void");
    }
}
