package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e0  reason: default package */
/* loaded from: classes.dex */
public final class e0 extends v72 {
    public final float e;
    public final int f;
    public final float g;
    public final int h;
    public final float i;
    public final int j;
    public final float k;
    public final int l;

    public e0(float f, int i, float f2, int i2, float f3, int i3, float f4, int i4) {
        super(new sg3(f), new sg3(f2), new sg3(f3), new sg3(f4));
        this.e = f;
        this.f = i;
        this.g = f2;
        this.h = i2;
        this.i = f3;
        this.j = i3;
        this.k = f4;
        this.l = i4;
    }

    public static float f(z72 z72Var) {
        if (z72Var instanceof kx5) {
            Object g = ((kx5) z72Var).g();
            g.getClass();
            return ((rg3) g).a;
        }
        return nae.e;
    }

    @Override // defpackage.v72
    public final v72 c(z72 z72Var, z72 z72Var2, z72 z72Var3, z72 z72Var4) {
        float f;
        float f2;
        float f3;
        float f4;
        z72Var.getClass();
        z72Var2.getClass();
        z72Var3.getClass();
        z72Var4.getClass();
        if (rg3.b(f(z72Var), f(this.a))) {
            f = this.e;
        } else {
            f = f(z72Var);
        }
        float f5 = f;
        if (rg3.b(f(z72Var2), f(this.b))) {
            f2 = this.g;
        } else {
            f2 = f(z72Var2);
        }
        float f6 = f2;
        if (rg3.b(f(z72Var3), f(this.c))) {
            f3 = this.i;
        } else {
            f3 = f(z72Var3);
        }
        float f7 = f3;
        if (rg3.b(f(z72Var4), f(this.d))) {
            f4 = this.k;
        } else {
            f4 = f(z72Var4);
        }
        return new e0(f5, this.f, f6, this.h, f7, this.j, f4, this.l);
    }

    @Override // defpackage.v72
    public final kwe e(long j, float f, float f2, float f3, float f4, tc6 tc6Var) {
        tc6Var.getClass();
        if (f + f2 + f3 + f4 == nae.e) {
            return new tf8(npe.n(0L, j));
        }
        int i = this.f;
        int i2 = this.h;
        int i3 = this.j;
        int i4 = this.l;
        if (i + i2 + i3 + i4 == 0) {
            return new uf8(vte.d(npe.n(0L, j), (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L)));
        }
        yj a = dk.a();
        Path path = a.a;
        int i5 = (int) (4294967295L & j);
        int i6 = (int) (j >> 32);
        float min = Math.min(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6)) / 2.0f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        lqa lqaVar = (lqa) linkedHashMap.get(f + " - " + i);
        if (lqaVar == null) {
            lqaVar = new lqa(f, min, i);
        }
        xy xyVar = lqaVar.e;
        p09 p09Var = lqaVar.c;
        p09 p09Var2 = lqaVar.b;
        p09 p09Var3 = lqaVar.a;
        a.i(p09Var3.b, p09Var3.a);
        float f5 = p09Var2.b;
        float f6 = p09Var2.a;
        float f7 = p09Var.b;
        float f8 = p09Var.a;
        p09 p09Var4 = lqaVar.d;
        a.f(f5, f6, f7, f8, p09Var4.b, p09Var4.a);
        float f9 = xyVar.a * 2.0f;
        float n = ((float) (yte.n(180.0d) + xyVar.b)) * 57.29578f;
        float f10 = xyVar.c * 57.29578f;
        if (a.b == null) {
            a.b = new RectF();
        }
        RectF rectF = a.b;
        rectF.getClass();
        rectF.set(nae.e, nae.e, f9, f9);
        RectF rectF2 = a.b;
        rectF2.getClass();
        path.arcTo(rectF2, n, f10, false);
        a.f(p09Var.a, p09Var.b, p09Var2.a, p09Var2.b, p09Var3.a, p09Var3.b);
        lqa lqaVar2 = (lqa) linkedHashMap.get(f2 + " - " + i2);
        if (lqaVar2 == null) {
            lqaVar2 = new lqa(f2, min, i2);
        }
        p09 p09Var5 = lqaVar2.c;
        p09 p09Var6 = lqaVar2.b;
        p09 p09Var7 = lqaVar2.a;
        xy xyVar2 = lqaVar2.e;
        a.h(Float.intBitsToFloat(i6) - p09Var7.a, p09Var7.b);
        float intBitsToFloat = Float.intBitsToFloat(i6) - p09Var6.a;
        float f11 = p09Var6.b;
        float intBitsToFloat2 = Float.intBitsToFloat(i6) - p09Var5.a;
        float f12 = p09Var5.b;
        float intBitsToFloat3 = Float.intBitsToFloat(i6);
        p09 p09Var8 = lqaVar2.d;
        a.f(intBitsToFloat, f11, intBitsToFloat2, f12, intBitsToFloat3 - p09Var8.a, p09Var8.b);
        float intBitsToFloat4 = Float.intBitsToFloat(i6) - (xyVar2.a * 2.0f);
        float intBitsToFloat5 = Float.intBitsToFloat(i6);
        float f13 = xyVar2.a * 2.0f;
        float n2 = ((float) (yte.n(270.0d) + xyVar2.b)) * 57.29578f;
        float f14 = xyVar2.c * 57.29578f;
        if (a.b == null) {
            a.b = new RectF();
        }
        RectF rectF3 = a.b;
        rectF3.getClass();
        rectF3.set(intBitsToFloat4, nae.e, intBitsToFloat5, f13);
        RectF rectF4 = a.b;
        rectF4.getClass();
        path.arcTo(rectF4, n2, f14, false);
        a.f(Float.intBitsToFloat(i6) - p09Var5.b, p09Var5.a, Float.intBitsToFloat(i6) - p09Var6.b, p09Var6.a, Float.intBitsToFloat(i6) - p09Var7.b, p09Var7.a);
        lqa lqaVar3 = (lqa) linkedHashMap.get(f3 + " - " + i3);
        if (lqaVar3 == null) {
            lqaVar3 = new lqa(f3, min, i3);
        }
        p09 p09Var9 = lqaVar3.d;
        xy xyVar3 = lqaVar3.e;
        p09 p09Var10 = lqaVar3.c;
        p09 p09Var11 = lqaVar3.b;
        p09 p09Var12 = lqaVar3.a;
        float intBitsToFloat6 = Float.intBitsToFloat(i6);
        float f15 = p09Var12.b;
        float f16 = p09Var12.a;
        a.h(intBitsToFloat6 - f15, Float.intBitsToFloat(i5) - f16);
        float intBitsToFloat7 = Float.intBitsToFloat(i6);
        float f17 = p09Var11.b;
        float f18 = p09Var11.a;
        float intBitsToFloat8 = Float.intBitsToFloat(i6);
        float f19 = p09Var10.b;
        float f20 = p09Var10.a;
        a.f(intBitsToFloat7 - f17, Float.intBitsToFloat(i5) - f18, intBitsToFloat8 - f19, Float.intBitsToFloat(i5) - f20, Float.intBitsToFloat(i6) - p09Var9.b, Float.intBitsToFloat(i5) - p09Var9.a);
        float intBitsToFloat9 = Float.intBitsToFloat(i5) - (xyVar3.a * 2.0f);
        float intBitsToFloat10 = Float.intBitsToFloat(i6) - (xyVar3.a * 2.0f);
        float intBitsToFloat11 = Float.intBitsToFloat(i6);
        float intBitsToFloat12 = Float.intBitsToFloat(i5);
        float n3 = ((float) (yte.n(0.0d) + xyVar3.b)) * 57.29578f;
        float f21 = xyVar3.c * 57.29578f;
        if (a.b == null) {
            a.b = new RectF();
        }
        RectF rectF5 = a.b;
        rectF5.getClass();
        rectF5.set(intBitsToFloat10, intBitsToFloat9, intBitsToFloat11, intBitsToFloat12);
        RectF rectF6 = a.b;
        rectF6.getClass();
        path.arcTo(rectF6, n3, f21, false);
        a.f(Float.intBitsToFloat(i6) - f20, Float.intBitsToFloat(i5) - p09Var10.b, Float.intBitsToFloat(i6) - f18, Float.intBitsToFloat(i5) - p09Var11.b, Float.intBitsToFloat(i6) - f16, Float.intBitsToFloat(i5) - p09Var12.b);
        lqa lqaVar4 = (lqa) linkedHashMap.get(f4 + " - " + i4);
        if (lqaVar4 == null) {
            lqaVar4 = new lqa(f4, min, i4);
        }
        xy xyVar4 = lqaVar4.e;
        p09 p09Var13 = lqaVar4.d;
        p09 p09Var14 = lqaVar4.c;
        p09 p09Var15 = lqaVar4.b;
        p09 p09Var16 = lqaVar4.a;
        a.h(p09Var16.a, Float.intBitsToFloat(i5) - p09Var16.b);
        a.f(p09Var15.a, Float.intBitsToFloat(i5) - p09Var15.b, p09Var14.a, Float.intBitsToFloat(i5) - p09Var14.b, p09Var13.a, Float.intBitsToFloat(i5) - p09Var13.b);
        float intBitsToFloat13 = Float.intBitsToFloat(i5);
        float f22 = xyVar4.a * 2.0f;
        float f23 = intBitsToFloat13 - f22;
        float intBitsToFloat14 = Float.intBitsToFloat(i5);
        float n4 = ((float) (yte.n(90.0d) + xyVar4.b)) * 57.29578f;
        float f24 = xyVar4.c * 57.29578f;
        if (a.b == null) {
            a.b = new RectF();
        }
        RectF rectF7 = a.b;
        rectF7.getClass();
        rectF7.set(nae.e, f23, f22, intBitsToFloat14);
        RectF rectF8 = a.b;
        rectF8.getClass();
        path.arcTo(rectF8, n4, f24, false);
        a.f(p09Var14.b, Float.intBitsToFloat(i5) - p09Var14.a, p09Var15.b, Float.intBitsToFloat(i5) - p09Var15.a, p09Var16.b, Float.intBitsToFloat(i5) - p09Var16.a);
        a.e();
        return new sf8(a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e0) {
                e0 e0Var = (e0) obj;
                if (!rg3.b(this.e, e0Var.e) || this.f != e0Var.f || !rg3.b(this.g, e0Var.g) || this.h != e0Var.h || !rg3.b(this.i, e0Var.i) || this.j != e0Var.j || !rg3.b(this.k, e0Var.k) || this.l != e0Var.l) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + nk2.d(this.k, hl5.a(this.j, nk2.d(this.i, hl5.a(this.h, nk2.d(this.g, hl5.a(this.f, Float.hashCode(this.e) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String c = rg3.c(this.e);
        String c2 = rg3.c(this.g);
        String c3 = rg3.c(this.i);
        String c4 = rg3.c(this.k);
        StringBuilder s = s21.s("AbsoluteSmoothCornerShape(cornerRadiusTL=", c, ", smoothnessAsPercentTL=", this.f, ", cornerRadiusTR=");
        a82.u(this.h, c2, ", smoothnessAsPercentTR=", ", cornerRadiusBR=", s);
        a82.u(this.j, c3, ", smoothnessAsPercentBR=", ", cornerRadiusBL=", s);
        s.append(c4);
        s.append(", smoothnessAsPercentBL=");
        s.append(this.l);
        s.append(")");
        return s.toString();
    }
}
