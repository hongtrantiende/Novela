package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: en1  reason: default package */
/* loaded from: classes.dex */
public class en1 {
    public static boolean n(sm3 sm3Var) {
        b4d b4dVar = sm3Var.b;
        if (b4dVar != b4d.f && b4dVar != b4d.C) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [km3, java.lang.Object] */
    public lm3 A() {
        ?? obj = new Object();
        obj.a = "tertiary_fixed";
        obj.b = new zm1(6);
        obj.c = new zm1(7);
        obj.d = true;
        obj.f = new m0(1, this, en1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 26);
        obj.h = new zm1(8);
        obj.i = new ym1(this, 1);
        return obj.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [km3, java.lang.Object] */
    public lm3 B() {
        ?? obj = new Object();
        obj.a = "tertiary_fixed_dim";
        obj.b = new v71(22);
        obj.c = new v71(23);
        obj.d = true;
        obj.f = new m0(1, this, en1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 27);
        obj.h = new v71(24);
        obj.i = new ym1(this, 0);
        return obj.a();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [km3, java.lang.Object] */
    public lm3 a() {
        ?? obj = new Object();
        obj.a = "background";
        obj.b = new bn1(11);
        obj.c = new bn1(22);
        obj.d = true;
        return obj.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [km3, java.lang.Object] */
    public lm3 b() {
        ?? obj = new Object();
        obj.a = "error";
        obj.b = new bn1(7);
        obj.c = new bn1(8);
        obj.d = true;
        obj.f = new m0(1, this, en1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 10);
        obj.h = new bn1(9);
        obj.i = new ym1(this, 7);
        return obj.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [km3, java.lang.Object] */
    public lm3 c() {
        ?? obj = new Object();
        obj.a = "error_container";
        obj.b = new bn1(24);
        obj.c = new bn1(25);
        obj.d = true;
        obj.f = new m0(1, this, en1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 11);
        obj.h = new bn1(26);
        obj.i = new ym1(this, 9);
        return obj.a();
    }

    public kfc d(b4d b4dVar, i45 i45Var, boolean z, rm3 rm3Var, double d) {
        rm3Var.getClass();
        switch (b4dVar.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                xk5.o();
                break;
        }
        return null;
    }

    public i45 e(lm3 lm3Var, sm3 sm3Var) {
        sm3Var.getClass();
        double k = k(lm3Var, sm3Var);
        kfc kfcVar = (kfc) lm3Var.b.invoke(sm3Var);
        return rqe.i(kfcVar.a, kfcVar.b, k);
    }

    public kfc f(b4d b4dVar, i45 i45Var, boolean z, rm3 rm3Var, double d) {
        double d2 = i45Var.b;
        rm3Var.getClass();
        switch (b4dVar.ordinal()) {
            case 0:
                return wq9.F(d2, 0.0d);
            case 1:
                return wq9.F(d2, 2.0d);
            case 2:
                return wq9.F(d2, 6.0d);
            case 3:
                return wq9.F(d2, 10.0d);
            case 4:
                double d3 = (d2 + 15.0d) % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                return wq9.F(d3, 8.0d);
            case 5:
            case 6:
                return wq9.F(d2, i45Var.c / 8.0d);
            case 7:
                return wq9.F(d2, 0.0d);
            case 8:
                return wq9.F(d2, 10.0d);
            default:
                xk5.o();
                return null;
        }
    }

    public kfc g(b4d b4dVar, i45 i45Var, boolean z, rm3 rm3Var, double d) {
        double d2 = i45Var.c;
        double d3 = i45Var.b;
        rm3Var.getClass();
        switch (b4dVar.ordinal()) {
            case 0:
                return wq9.F(d3, 0.0d);
            case 1:
                return wq9.F(d3, 2.0d);
            case 2:
                return wq9.F(d3, 8.0d);
            case 3:
                return wq9.F(d3, 12.0d);
            case 4:
                double d4 = (d3 + 15.0d) % 360.0d;
                if (d4 < 0.0d) {
                    d4 += 360.0d;
                }
                return wq9.F(d4, 12.0d);
            case 5:
                return wq9.F(d3, (d2 / 8.0d) + 4.0d);
            case 6:
                return wq9.F(d3, (d2 / 8.0d) + 4.0d);
            case 7:
                return wq9.F(d3, 0.0d);
            case 8:
                return wq9.F(d3, 16.0d);
            default:
                xk5.o();
                return null;
        }
    }

    public kfc h(b4d b4dVar, i45 i45Var, boolean z, rm3 rm3Var, double d) {
        double d2 = i45Var.b;
        rm3Var.getClass();
        switch (b4dVar.ordinal()) {
            case 0:
                return wq9.F(d2, 0.0d);
            case 1:
                return wq9.F(d2, 12.0d);
            case 2:
                return wq9.F(d2, 36.0d);
            case 3:
                return wq9.F(d2, 200.0d);
            case 4:
                double d3 = (d2 + 240.0d) % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                return wq9.F(d3, 40.0d);
            case 5:
            case 6:
                return wq9.F(d2, i45Var.c);
            case 7:
                return wq9.F(d2, 48.0d);
            case 8:
                double d4 = (d2 - 50.0d) % 360.0d;
                if (d4 < 0.0d) {
                    d4 += 360.0d;
                }
                return wq9.F(d4, 48.0d);
            default:
                xk5.o();
                return null;
        }
    }

    public kfc i(b4d b4dVar, i45 i45Var, boolean z, rm3 rm3Var, double d) {
        double d2 = i45Var.b;
        rm3Var.getClass();
        switch (b4dVar.ordinal()) {
            case 0:
                return wq9.F(d2, 0.0d);
            case 1:
                return wq9.F(d2, 8.0d);
            case 2:
                return wq9.F(d2, 16.0d);
            case 3:
                return wq9.F(que.u(i45Var, new double[]{0.0d, 41.0d, 61.0d, 101.0d, 131.0d, 181.0d, 251.0d, 301.0d, 360.0d}, new double[]{18.0d, 15.0d, 10.0d, 12.0d, 15.0d, 18.0d, 15.0d, 12.0d, 12.0d}), 24.0d);
            case 4:
                return wq9.F(que.u(i45Var, new double[]{0.0d, 21.0d, 51.0d, 121.0d, 151.0d, 191.0d, 271.0d, 321.0d, 360.0d}, new double[]{45.0d, 95.0d, 45.0d, 20.0d, 45.0d, 90.0d, 45.0d, 45.0d, 45.0d}), 24.0d);
            case 5:
            case 6:
                double d3 = i45Var.c;
                return wq9.F(d2, Math.max(d3 - 32.0d, d3 * 0.5d));
            case 7:
                return wq9.F(d2, 16.0d);
            case 8:
                double d4 = (d2 - 50.0d) % 360.0d;
                if (d4 < 0.0d) {
                    d4 += 360.0d;
                }
                return wq9.F(d4, 36.0d);
            default:
                xk5.o();
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.kfc j(defpackage.b4d r26, defpackage.i45 r27, boolean r28, defpackage.rm3 r29, double r30) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en1.j(b4d, i45, boolean, rm3, double):kfc");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double k(defpackage.lm3 r32, defpackage.sm3 r33) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en1.k(lm3, sm3):double");
    }

    public final lm3 l(sm3 sm3Var) {
        sm3Var.getClass();
        if (sm3Var.c) {
            return w();
        }
        return x();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [km3, java.lang.Object] */
    public lm3 m() {
        ?? obj = new Object();
        obj.a = "inverse_surface";
        obj.b = new dn1(12);
        obj.c = new dn1(22);
        obj.d = true;
        return obj.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [km3, java.lang.Object] */
    public lm3 o() {
        ?? obj = new Object();
        obj.a = "primary";
        obj.b = new zm1(10);
        obj.c = new zm1(11);
        obj.d = true;
        obj.f = new m0(1, this, en1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 16);
        obj.h = new zm1(12);
        obj.i = new ym1(this, 2);
        return obj.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [km3, java.lang.Object] */
    public lm3 p() {
        ?? obj = new Object();
        obj.a = "primary_container";
        obj.b = new v71(29);
        obj.c = new zm1(this);
        obj.d = true;
        obj.f = new m0(1, this, en1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 17);
        obj.h = new zm1(19);
        obj.i = new ym1(this, 4);
        return obj.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [km3, java.lang.Object] */
    public lm3 q() {
        ?? obj = new Object();
        obj.a = "primary_fixed";
        obj.b = new zm1(17);
        obj.c = new zm1(18);
        obj.d = true;
        obj.f = new m0(1, this, en1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 18);
        obj.h = new zm1(20);
        obj.i = new ym1(this, 3);
        return obj.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [km3, java.lang.Object] */
    public lm3 r() {
        ?? obj = new Object();
        obj.a = "primary_fixed_dim";
        obj.b = new cn1(26);
        obj.c = new cn1(27);
        obj.d = true;
        obj.f = new m0(1, this, en1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 19);
        obj.h = new cn1(28);
        obj.i = new ym1(this, 11);
        return obj.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [km3, java.lang.Object] */
    public lm3 s() {
        ?? obj = new Object();
        obj.a = "secondary";
        obj.b = new an1(9);
        obj.c = new an1(20);
        obj.d = true;
        obj.f = new m0(1, this, en1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 20);
        obj.h = new an1(28);
        obj.i = new ym1(this, 6);
        return obj.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [km3, java.lang.Object] */
    public lm3 t() {
        ?? obj = new Object();
        obj.a = "secondary_container";
        obj.b = new dn1(18);
        obj.c = new dn1(this);
        obj.d = true;
        obj.f = new m0(1, this, en1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 21);
        obj.h = new dn1(20);
        obj.i = new ym1(this, 13);
        return obj.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [km3, java.lang.Object] */
    public lm3 u() {
        ?? obj = new Object();
        obj.a = "secondary_fixed";
        obj.b = new cn1(13);
        obj.c = new cn1(14);
        obj.d = true;
        obj.f = new m0(1, this, en1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 22);
        obj.h = new cn1(15);
        obj.i = new ym1(this, 10);
        return obj.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [km3, java.lang.Object] */
    public lm3 v() {
        ?? obj = new Object();
        obj.a = "secondary_fixed_dim";
        obj.b = new cn1(29);
        obj.c = new dn1(0);
        obj.d = true;
        obj.f = new m0(1, this, en1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 23);
        obj.h = new dn1(1);
        obj.i = new ym1(this, 12);
        return obj.a();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [km3, java.lang.Object] */
    public lm3 w() {
        ?? obj = new Object();
        obj.a = "surface_bright";
        obj.b = new an1(4);
        obj.c = new an1(5);
        obj.d = true;
        return obj.a();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [km3, java.lang.Object] */
    public lm3 x() {
        ?? obj = new Object();
        obj.a = "surface_dim";
        obj.b = new bn1(5);
        obj.c = new bn1(6);
        obj.d = true;
        return obj.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [km3, java.lang.Object] */
    public lm3 y() {
        ?? obj = new Object();
        obj.a = "tertiary";
        obj.b = new bn1(20);
        obj.c = new bn1(21);
        obj.d = true;
        obj.f = new m0(1, this, en1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 24);
        obj.h = new bn1(23);
        obj.i = new ym1(this, 8);
        return obj.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [km3, java.lang.Object] */
    public lm3 z() {
        ?? obj = new Object();
        obj.a = "tertiary_container";
        obj.b = new an1(25);
        obj.c = new an1(this);
        obj.d = true;
        obj.f = new m0(1, this, en1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 25);
        obj.h = new an1(27);
        obj.i = new ym1(this, 5);
        return obj.a();
    }
}
