package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b02  reason: default package */
/* loaded from: classes.dex */
public class b02 {
    public final sm1 a;
    public final sm1 b;
    public final sm1 c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b02(defpackage.sm1 r9, defpackage.sm1 r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.b
            r2 = 12884901888(0x300000000, double:6.365987373E-314)
            boolean r0 = defpackage.vve.d(r0, r2)
            if (r0 == 0) goto L12
            sm1 r0 = defpackage.cwe.a(r9)
            goto L13
        L12:
            r0 = r9
        L13:
            long r4 = r10.b
            boolean r1 = defpackage.vve.d(r4, r2)
            if (r1 == 0) goto L20
            sm1 r1 = defpackage.cwe.a(r10)
            goto L21
        L20:
            r1 = r10
        L21:
            float[] r4 = defpackage.dye.i
            r5 = 3
            if (r11 != r5) goto L6c
            long r6 = r9.b
            boolean r11 = defpackage.vve.d(r6, r2)
            long r6 = r10.b
            boolean r2 = defpackage.vve.d(r6, r2)
            if (r11 == 0) goto L37
            if (r2 == 0) goto L37
            goto L6c
        L37:
            if (r11 != 0) goto L3b
            if (r2 == 0) goto L6c
        L3b:
            if (r11 == 0) goto L3e
            goto L3f
        L3e:
            r9 = r10
        L3f:
            zs9 r9 = (defpackage.zs9) r9
            hid r9 = r9.d
            if (r11 == 0) goto L4a
            float[] r11 = r9.a()
            goto L4b
        L4a:
            r11 = r4
        L4b:
            if (r2 == 0) goto L51
            float[] r4 = r9.a()
        L51:
            r9 = 0
            r2 = r11[r9]
            r3 = r4[r9]
            float r2 = r2 / r3
            r3 = 1
            r6 = r11[r3]
            r7 = r4[r3]
            float r6 = r6 / r7
            r7 = 2
            r11 = r11[r7]
            r4 = r4[r7]
            float r11 = r11 / r4
            float[] r4 = new float[r5]
            r4[r9] = r2
            r4[r3] = r6
            r4[r7] = r11
            goto L6d
        L6c:
            r4 = 0
        L6d:
            r8.<init>(r10, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b02.<init>(sm1, sm1, int):void");
    }

    public long a(long j) {
        float h = zl1.h(j);
        float g = zl1.g(j);
        float e = zl1.e(j);
        float d = zl1.d(j);
        sm1 sm1Var = this.b;
        long d2 = sm1Var.d(h, g, e);
        float intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d2 & 4294967295L));
        float e2 = sm1Var.e(h, g, e);
        float[] fArr = this.d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e2 *= fArr[2];
        }
        float f = intBitsToFloat;
        float f2 = intBitsToFloat2;
        return this.c.f(f, f2, e2, d, this.a);
    }

    public b02(sm1 sm1Var, sm1 sm1Var2, sm1 sm1Var3, float[] fArr) {
        this.a = sm1Var;
        this.b = sm1Var2;
        this.c = sm1Var3;
        this.d = fArr;
    }
}
