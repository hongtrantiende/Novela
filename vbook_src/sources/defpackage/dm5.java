package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dm5  reason: default package */
/* loaded from: classes3.dex */
public final class dm5 {
    public final int a;
    public final int b;
    public final float c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final float j;
    public final int k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final int u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ dm5(int r26, int r27, int r28, int r29, boolean r30, float r31, boolean r32, int r33, int r34) {
        /*
            r25 = this;
            r0 = r34
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L9
            r4 = r2
            goto Lb
        L9:
            r4 = r26
        Lb:
            r1 = r0 & 2
            if (r1 == 0) goto L11
            r5 = r2
            goto L13
        L11:
            r5 = r27
        L13:
            r1 = r0 & 8
            if (r1 == 0) goto L19
            r7 = r2
            goto L1b
        L19:
            r7 = r28
        L1b:
            r1 = r0 & 16
            if (r1 == 0) goto L21
            r8 = r2
            goto L23
        L21:
            r8 = r29
        L23:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L29
            r12 = r2
            goto L2b
        L29:
            r12 = r30
        L2b:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L33
            r1 = 1056964608(0x3f000000, float:0.5)
            r13 = r1
            goto L35
        L33:
            r13 = r31
        L35:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L3e
            r1 = 1
            r20 = r1
            goto L40
        L3e:
            r20 = r32
        L40:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L48
            r24 = r2
            goto L4a
        L48:
            r24 = r33
        L4a:
            r6 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r10 = 0
            r11 = 0
            r14 = 2
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 1
            r21 = 1
            r22 = 1
            r23 = 0
            r3 = r25
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dm5.<init>(int, int, int, int, boolean, float, boolean, int, int):void");
    }

    public static dm5 a(dm5 dm5Var, int i, int i2, float f, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, float f2, int i5, int i6, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i7, int i8) {
        int i9 = (i8 & 1) != 0 ? dm5Var.a : i;
        int i10 = (i8 & 2) != 0 ? dm5Var.b : i2;
        float f3 = (i8 & 4) != 0 ? dm5Var.c : f;
        int i11 = (i8 & 8) != 0 ? dm5Var.d : i3;
        int i12 = (i8 & 16) != 0 ? dm5Var.e : i4;
        boolean z13 = (i8 & 32) != 0 ? dm5Var.f : z;
        boolean z14 = (i8 & 64) != 0 ? dm5Var.g : z2;
        boolean z15 = (i8 & Token.CASE) != 0 ? dm5Var.h : z3;
        boolean z16 = (i8 & 256) != 0 ? dm5Var.i : z4;
        float f4 = (i8 & 512) != 0 ? dm5Var.j : f2;
        dm5Var.getClass();
        int i13 = (i8 & 2048) != 0 ? dm5Var.k : i5;
        int i14 = (i8 & 4096) != 0 ? dm5Var.l : i6;
        boolean z17 = (i8 & 8192) != 0 ? dm5Var.m : z5;
        boolean z18 = (i8 & 16384) != 0 ? dm5Var.n : z6;
        boolean z19 = (i8 & 32768) != 0 ? dm5Var.o : z7;
        boolean z20 = (i8 & Parser.ARGC_LIMIT) != 0 ? dm5Var.p : z8;
        boolean z21 = (i8 & 131072) != 0 ? dm5Var.q : z9;
        boolean z22 = (i8 & 262144) != 0 ? dm5Var.r : z10;
        boolean z23 = (i8 & 524288) != 0 ? dm5Var.s : z11;
        boolean z24 = (i8 & 1048576) != 0 ? dm5Var.t : z12;
        int i15 = (i8 & 2097152) != 0 ? dm5Var.u : i7;
        dm5Var.getClass();
        return new dm5(i9, i10, f3, i11, i12, z13, z14, z15, z16, f4, i13, i14, z17, z18, z19, z20, z21, z22, z23, z24, i15);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dm5) {
                dm5 dm5Var = (dm5) obj;
                if (this.a != dm5Var.a || this.b != dm5Var.b || Float.compare(this.c, dm5Var.c) != 0 || this.d != dm5Var.d || this.e != dm5Var.e || this.f != dm5Var.f || this.g != dm5Var.g || this.h != dm5Var.h || this.i != dm5Var.i || Float.compare(this.j, dm5Var.j) != 0 || this.k != dm5Var.k || this.l != dm5Var.l || this.m != dm5Var.m || this.n != dm5Var.n || this.o != dm5Var.o || this.p != dm5Var.p || this.q != dm5Var.q || this.r != dm5Var.r || this.s != dm5Var.s || this.t != dm5Var.t || this.u != dm5Var.u) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.u) + eub.k(eub.k(eub.k(eub.k(eub.k(eub.k(eub.k(eub.k(hl5.a(this.l, hl5.a(this.k, eub.k(nk2.d(this.j, eub.k(eub.k(eub.k(eub.k(hl5.a(this.e, hl5.a(this.d, nk2.d(this.c, hl5.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31, false), 31), 31), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t);
    }

    public final String toString() {
        StringBuilder r = hl5.r(this.a, this.b, "ImageConfigState(scrollType=", ", scrollDirection=", ", autoScrollSpeed=");
        r.append(this.c);
        r.append(", darkMode=");
        r.append(this.d);
        r.append(", screenOrientation=");
        eub.w(r, this.e, ", isShowCutout=", this.f, ", isOptimizePage=");
        rs8.z(r, this.g, ", isDoublePage=", this.h, ", isAutoBrightness=");
        r.append(this.i);
        r.append(", brightness=");
        r.append(this.j);
        r.append(", isEyeProtect=false, turnPageByTouchOrientation=");
        rs8.q(this.k, this.l, ", turnPageTouchMode=", ", turnPageByVolume=", r);
        rs8.z(r, this.m, ", revertVolumeTurnPage=", this.n, ", turnPageByKeyboard=");
        rs8.z(r, this.o, ", animationTurnPage=", this.p, ", isAlwaysScreenOn=");
        rs8.z(r, this.q, ", isShowReadingProgress=", this.r, ", isEnableZoomDoubleTap=");
        rs8.z(r, this.s, ", isShowControlWhenStartRead=", this.t, ", colorMode=");
        return rs8.g(this.u, ")", r);
    }

    public dm5(int i, int i2, float f, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, float f2, int i5, int i6, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i7) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = i3;
        this.e = i4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = f2;
        this.k = i5;
        this.l = i6;
        this.m = z5;
        this.n = z6;
        this.o = z7;
        this.p = z8;
        this.q = z9;
        this.r = z10;
        this.s = z11;
        this.t = z12;
        this.u = i7;
    }
}
