package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zs9  reason: default package */
/* loaded from: classes.dex */
public final class zs9 extends sm1 {
    public static final cp8 r = new Object();
    public final hid d;
    public final float e;
    public final float f;
    public final yjc g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final te3 k;
    public final ys9 l;
    public final vs9 m;
    public final te3 n;
    public final ys9 o;
    public final vs9 p;
    public final boolean q;

    /* JADX WARN: Code restructure failed: missing block: B:36:0x01e0, code lost:
        if ((((r25 - r12) * r3) - ((r1 - r15) * r10)) >= defpackage.nae.e) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r44v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zs9(java.lang.String r36, float[] r37, defpackage.hid r38, float[] r39, defpackage.te3 r40, defpackage.te3 r41, float r42, float r43, defpackage.yjc r44, int r45) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zs9.<init>(java.lang.String, float[], hid, float[], te3, te3, float, float, yjc, int):void");
    }

    @Override // defpackage.sm1
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.sm1
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.sm1
    public final boolean c() {
        return this.q;
    }

    @Override // defpackage.sm1
    public final long d(float f, float f2, float f3) {
        double d = f;
        vs9 vs9Var = this.p;
        float c = (float) vs9Var.c(d);
        float c2 = (float) vs9Var.c(f2);
        float c3 = (float) vs9Var.c(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * c3) + (fArr[3] * c2) + (fArr[0] * c);
        float f5 = fArr[1] * c;
        return (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits((fArr[7] * c3) + (fArr[4] * c2) + f5));
    }

    @Override // defpackage.sm1
    public final float e(float f, float f2, float f3) {
        double d = f;
        vs9 vs9Var = this.p;
        float c = (float) vs9Var.c(f2);
        float[] fArr = this.i;
        return (fArr[8] * ((float) vs9Var.c(f3))) + (fArr[5] * c) + (fArr[2] * ((float) vs9Var.c(d)));
    }

    @Override // defpackage.sm1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zs9.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        zs9 zs9Var = (zs9) obj;
        if (Float.compare(zs9Var.e, this.e) != 0 || Float.compare(zs9Var.f, this.f) != 0 || !c16.i(this.d, zs9Var.d) || !Arrays.equals(this.h, zs9Var.h)) {
            return false;
        }
        yjc yjcVar = zs9Var.g;
        yjc yjcVar2 = this.g;
        if (yjcVar2 != null) {
            return c16.i(yjcVar2, yjcVar);
        }
        if (yjcVar == null) {
            return true;
        }
        if (!c16.i(this.k, zs9Var.k)) {
            return false;
        }
        return c16.i(this.n, zs9Var.n);
    }

    @Override // defpackage.sm1
    public final long f(float f, float f2, float f3, float f4, sm1 sm1Var) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = fArr[2] * f;
        float f8 = (fArr[8] * f3) + (fArr[5] * f2) + f7;
        vs9 vs9Var = this.m;
        return sve.a((float) vs9Var.c(f5), (float) vs9Var.c(f6), (float) vs9Var.c(f8), f4, sm1Var);
    }

    @Override // defpackage.sm1
    public final int hashCode() {
        int floatToIntBits;
        int floatToIntBits2;
        int hashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int i = 0;
        if (f == nae.e) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f);
        }
        int i2 = (hashCode + floatToIntBits) * 31;
        float f2 = this.f;
        if (f2 == nae.e) {
            floatToIntBits2 = 0;
        } else {
            floatToIntBits2 = Float.floatToIntBits(f2);
        }
        int i3 = (i2 + floatToIntBits2) * 31;
        yjc yjcVar = this.g;
        if (yjcVar != null) {
            i = yjcVar.hashCode();
        }
        int i4 = i3 + i;
        if (yjcVar == null) {
            return this.n.hashCode() + ((this.k.hashCode() + (i4 * 31)) * 31);
        }
        return i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zs9(java.lang.String r19, float[] r20, defpackage.hid r21, final defpackage.yjc r22, int r23) {
        /*
            r18 = this;
            r9 = r22
            double r0 = r9.a
            r2 = -4609434218613702656(0xc008000000000000, double:-3.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 != 0) goto Le
            r4 = r6
            goto Lf
        Le:
            r4 = r5
        Lf:
            double r7 = r9.g
            double r10 = r9.f
            r12 = -4611686018427387904(0xc000000000000000, double:-2.0)
            r14 = 0
            if (r4 == 0) goto L22
            xs9 r4 = new xs9
            r16 = r2
            r2 = 4
            r4.<init>()
            goto L44
        L22:
            r16 = r2
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 != 0) goto L2f
            xs9 r4 = new xs9
            r2 = 5
            r4.<init>()
            goto L44
        L2f:
            int r2 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r2 != 0) goto L3e
            int r2 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r2 != 0) goto L3e
            xs9 r4 = new xs9
            r2 = 6
            r4.<init>()
            goto L44
        L3e:
            xs9 r4 = new xs9
            r2 = 7
            r4.<init>()
        L44:
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto L4f
            xs9 r0 = new xs9
            r0.<init>()
        L4d:
            r6 = r0
            goto L6f
        L4f:
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 != 0) goto L59
            xs9 r0 = new xs9
            r0.<init>()
            goto L4d
        L59:
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 != 0) goto L68
            int r0 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r0 != 0) goto L68
            xs9 r0 = new xs9
            r1 = 2
            r0.<init>()
            goto L4d
        L68:
            xs9 r0 = new xs9
            r1 = 3
            r0.<init>()
            goto L4d
        L6f:
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r5 = r4
            r4 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r10 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zs9.<init>(java.lang.String, float[], hid, yjc, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zs9(java.lang.String r18, float[] r19, defpackage.hid r20, final double r21, float r23, float r24, int r25) {
        /*
            r17 = this;
            r1 = r21
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            cp8 r3 = defpackage.zs9.r
            if (r0 != 0) goto Lc
            r11 = r3
            goto L13
        Lc:
            ws9 r4 = new ws9
            r5 = 0
            r4.<init>()
            r11 = r4
        L13:
            if (r0 != 0) goto L17
        L15:
            r12 = r3
            goto L1e
        L17:
            ws9 r3 = new ws9
            r0 = 1
            r3.<init>()
            goto L15
        L1e:
            yjc r15 = new yjc
            r7 = 0
            r9 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r0 = r15
            r0.<init>(r1, r3, r5, r7, r9)
            r10 = 0
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r13 = r23
            r14 = r24
            r16 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zs9.<init>(java.lang.String, float[], hid, double, float, float, int):void");
    }
}
