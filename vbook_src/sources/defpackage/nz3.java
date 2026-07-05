package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nz3  reason: default package */
/* loaded from: classes.dex */
public final class nz3 implements u08 {
    public final /* synthetic */ oz3 a;

    public nz3(oz3 oz3Var) {
        this.a = oz3Var;
    }

    @Override // defpackage.u08
    public final long i1(long j, long j2, int i) {
        oz3 oz3Var = this.a;
        cgc cgcVar = oz3Var.a;
        if (((Boolean) oz3Var.d.invoke()).booleanValue()) {
            int i2 = (int) (j & 4294967295L);
            cgcVar.b.i(Float.intBitsToFloat(i2) + cgcVar.b.h());
            int i3 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i3) >= nae.e && Float.intBitsToFloat(i2) >= nae.e) {
                if (Float.intBitsToFloat(i3) > nae.e) {
                    float h = cgcVar.d.h();
                    cgcVar.b(Float.intBitsToFloat(i3) + cgcVar.d.h());
                    return (Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(cgcVar.d.h() - h) & 4294967295L);
                }
                return 0L;
            }
            float h2 = cgcVar.d.h();
            cgcVar.b(Float.intBitsToFloat(i2) + cgcVar.d.h());
            float h3 = cgcVar.d.h() - h2;
            return (Float.floatToRawIntBits(h3) & 4294967295L) | (Float.floatToRawIntBits(nae.e) << 32);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    @Override // defpackage.u08
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l1(long r13, long r15, defpackage.m42 r17) {
        /*
            r12 = this;
            r0 = r17
            oz3 r1 = r12.a
            cgc r2 = r1.a
            boolean r3 = r0 instanceof defpackage.mz3
            if (r3 == 0) goto L1a
            r3 = r0
            mz3 r3 = (defpackage.mz3) r3
            int r4 = r3.d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.d = r4
        L18:
            r9 = r3
            goto L22
        L1a:
            mz3 r3 = new mz3
            n42 r0 = (defpackage.n42) r0
            r3.<init>(r12, r0)
            goto L18
        L22:
            java.lang.Object r0 = r9.b
            int r3 = r9.d
            r10 = 2
            r4 = 1
            n82 r11 = defpackage.n82.a
            if (r3 == 0) goto L43
            if (r3 == r4) goto L3d
            if (r3 != r10) goto L36
            long r12 = r9.a
            defpackage.hre.r(r0)
            goto L7b
        L36:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r12)
            r12 = 0
            return r12
        L3d:
            long r12 = r9.a
            defpackage.hre.r(r0)
            goto L63
        L43:
            defpackage.hre.r(r0)
            float r0 = defpackage.z4d.c(r15)
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L54
            dm8 r0 = r2.b
            r0.i(r3)
        L54:
            r7 = r15
            r9.a = r7
            r9.d = r4
            r4 = r12
            r5 = r13
            java.lang.Object r0 = super.l1(r5, r7, r9)
            if (r0 != r11) goto L62
            goto L79
        L62:
            r12 = r15
        L63:
            z4d r0 = (defpackage.z4d) r0
            long r3 = r0.a
            float r12 = defpackage.z4d.c(r12)
            pq2 r13 = r1.c
            xr r14 = r1.b
            r9.a = r3
            r9.d = r10
            java.lang.Object r0 = defpackage.vv.g(r2, r12, r13, r14, r9)
            if (r0 != r11) goto L7a
        L79:
            return r11
        L7a:
            r12 = r3
        L7b:
            z4d r0 = (defpackage.z4d) r0
            long r0 = r0.a
            long r12 = defpackage.z4d.e(r12, r0)
            z4d r14 = new z4d
            r14.<init>(r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz3.l1(long, long, m42):java.lang.Object");
    }

    @Override // defpackage.u08
    public final long u0(int i, long j) {
        oz3 oz3Var = this.a;
        cgc cgcVar = oz3Var.a;
        if (((Boolean) oz3Var.d.invoke()).booleanValue()) {
            int i2 = (int) (4294967295L & j);
            if (Float.intBitsToFloat(i2) <= nae.e) {
                float h = cgcVar.d.h();
                cgcVar.b(Float.intBitsToFloat(i2) + cgcVar.d.h());
                if (h != cgcVar.d.h()) {
                    return y78.b(j, nae.e, nae.e, 2);
                }
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }
}
