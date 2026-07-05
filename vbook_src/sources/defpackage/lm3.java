package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lm3  reason: default package */
/* loaded from: classes.dex */
public final class lm3 {
    public final String a;
    public final xt4 b;
    public final xt4 c;
    public final boolean d;
    public final xt4 e;
    public final xt4 f;
    public final xt4 g;
    public final xt4 h;
    public final xt4 i;
    public final xt4 j;
    public final HashMap k;

    public lm3(String str, xt4 xt4Var, xt4 xt4Var2, boolean z, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, xt4 xt4Var6, xt4 xt4Var7, xt4 xt4Var8) {
        str.getClass();
        xt4Var.getClass();
        this.a = str;
        this.b = xt4Var;
        this.c = xt4Var2;
        this.d = z;
        this.e = xt4Var3;
        this.f = xt4Var4;
        this.g = xt4Var5;
        this.h = xt4Var6;
        this.i = xt4Var7;
        this.j = xt4Var8;
        this.k = new HashMap();
    }

    public final double a(sm3 sm3Var) {
        en1 en1Var;
        sm3Var.getClass();
        if (sm3Var.l == xm1.d) {
            en1Var = ube.b;
        } else {
            en1Var = ube.a;
        }
        return en1Var.k(this, sm3Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [km3, java.lang.Object] */
    public final km3 b() {
        ?? obj = new Object();
        String str = this.a;
        str.getClass();
        obj.a = str;
        xt4 xt4Var = this.b;
        xt4Var.getClass();
        obj.b = xt4Var;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lm3) {
                lm3 lm3Var = (lm3) obj;
                if (!c16.i(this.a, lm3Var.a) || !c16.i(this.b, lm3Var.b) || !this.c.equals(lm3Var.c) || this.d != lm3Var.d || !c16.i(this.e, lm3Var.e) || !c16.i(this.f, lm3Var.f) || !c16.i(this.g, lm3Var.g) || !c16.i(this.h, lm3Var.h) || !c16.i(this.i, lm3Var.i) || !c16.i(this.j, lm3Var.j)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int k = eub.k((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        int i = 0;
        xt4 xt4Var = this.e;
        if (xt4Var == null) {
            hashCode = 0;
        } else {
            hashCode = xt4Var.hashCode();
        }
        int i2 = (k + hashCode) * 31;
        xt4 xt4Var2 = this.f;
        if (xt4Var2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = xt4Var2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        xt4 xt4Var3 = this.g;
        if (xt4Var3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = xt4Var3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        xt4 xt4Var4 = this.h;
        if (xt4Var4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = xt4Var4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        xt4 xt4Var5 = this.i;
        if (xt4Var5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = xt4Var5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        xt4 xt4Var6 = this.j;
        if (xt4Var6 != null) {
            i = xt4Var6.hashCode();
        }
        return i6 + i;
    }

    public final String toString() {
        return "DynamicColor(name=" + this.a + ", palette=" + this.b + ", tone=" + this.c + ", isBackground=" + this.d + ", chromaMultiplier=" + this.e + ", background=" + this.f + ", secondBackground=" + this.g + ", contrastCurve=" + this.h + ", toneDeltaPair=" + this.i + ", opacity=" + this.j + ")";
    }
}
