package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zc6  reason: default package */
/* loaded from: classes.dex */
public final class zc6 {
    public final long a;
    public final float b;
    public final ff8 c;
    public final long d;
    public final List e;
    public final List f;
    public final long g;
    public final float h;
    public final float i;
    public final tt0 j;
    public final cd6 k;
    public final zi8 l;
    public final boolean m;
    public final ye6 n;
    public final ye6 o;
    public final ye6 p;
    public final ye6 q;
    public final ye6 r;

    public zc6(long j, float f, ff8 ff8Var, long j2, List list, List list2, long j3, float f2, float f3, tt0 tt0Var, cd6 cd6Var, zi8 zi8Var, boolean z) {
        ff8Var.getClass();
        list.getClass();
        list2.getClass();
        cd6Var.getClass();
        zi8Var.getClass();
        this.a = j;
        this.b = f;
        this.c = ff8Var;
        this.d = j2;
        this.e = list;
        this.f = list2;
        this.g = j3;
        this.h = f2;
        this.i = f3;
        this.j = tt0Var;
        this.k = cd6Var;
        this.l = zi8Var;
        this.m = z;
        vt4 vt4Var = new vt4(this) { // from class: yc6
            public final /* synthetic */ zc6 b;

            {
                this.b = this;
            }

            @Override // defpackage.vt4
            public final Object invoke() {
                float intBitsToFloat;
                float intBitsToFloat2;
                int i = r2;
                tt0 tt0Var2 = tt0.c;
                float f4 = nae.e;
                zc6 zc6Var = this.b;
                switch (i) {
                    case 0:
                        return fxe.o(zc6Var.f, zc6Var.a, zc6Var.g, zc6Var.h, zc6Var.j(), zc6Var.i);
                    case 1:
                        return fxe.o((List) zc6Var.n.getValue(), zc6Var.a, zc6Var.g, zc6Var.h, zc6Var.j(), nae.e);
                    case 2:
                        long j4 = zc6Var.a;
                        float f5 = zc6Var.h;
                        long j5 = zc6Var.d;
                        List list3 = (List) zc6Var.o.getValue();
                        boolean j6 = zc6Var.j();
                        list3.getClass();
                        if (j4 != 9205357640488583168L) {
                            if (j6) {
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (j4 & 4294967295L)) / f5;
                                int i2 = (int) (j5 & 4294967295L);
                                if (intBitsToFloat3 > Float.intBitsToFloat(i2)) {
                                    float intBitsToFloat4 = (Float.intBitsToFloat((int) (sxd.j(j4) & 4294967295L)) / f5) - Float.intBitsToFloat((int) (sxd.j(j5) & 4294967295L));
                                    return new tt0(intBitsToFloat4, intBitsToFloat4);
                                }
                                float intBitsToFloat5 = Float.intBitsToFloat(i2) - intBitsToFloat3;
                                if (intBitsToFloat5 < nae.e) {
                                    intBitsToFloat5 = 0.0f;
                                }
                                return new tt0(-intBitsToFloat5, nae.e);
                            } else if (list3.isEmpty()) {
                                float intBitsToFloat6 = Float.intBitsToFloat((int) (sxd.j(j4) & 4294967295L));
                                return new tt0(-intBitsToFloat6, intBitsToFloat6);
                            } else {
                                Iterator it = list3.iterator();
                                if (it.hasNext()) {
                                    int b = ((mi8) it.next()).d.b() / 2;
                                    while (it.hasNext()) {
                                        int b2 = ((mi8) it.next()).d.b() / 2;
                                        if (b < b2) {
                                            b = b2;
                                        }
                                    }
                                    float intBitsToFloat7 = b - (Float.intBitsToFloat((int) (4294967295L & sxd.j(j4))) / f5);
                                    if (intBitsToFloat7 >= nae.e) {
                                        f4 = intBitsToFloat7;
                                    }
                                    return new tt0(-f4, f4);
                                }
                                xk5.g();
                                return null;
                            }
                        }
                        return tt0Var2;
                    case 3:
                        long j7 = zc6Var.a;
                        float f6 = zc6Var.h;
                        long j8 = zc6Var.d;
                        boolean j9 = zc6Var.j();
                        if (j7 != 9205357640488583168L) {
                            if (j9) {
                                float intBitsToFloat8 = Float.intBitsToFloat((int) (sxd.j(j7) >> 32)) - (Float.intBitsToFloat((int) (sxd.j(j7) >> 32)) / f6);
                                if (intBitsToFloat8 >= nae.e) {
                                    f4 = intBitsToFloat8;
                                }
                                return new tt0(-f4, f4);
                            }
                            float intBitsToFloat9 = Float.intBitsToFloat((int) (j7 >> 32)) / f6;
                            int i3 = (int) (j8 >> 32);
                            if (intBitsToFloat9 > Float.intBitsToFloat(i3)) {
                                float intBitsToFloat10 = (Float.intBitsToFloat((int) (sxd.j(j7) >> 32)) / f6) - Float.intBitsToFloat((int) (sxd.j(j8) >> 32));
                                return new tt0(intBitsToFloat10, intBitsToFloat10);
                            }
                            float intBitsToFloat11 = Float.intBitsToFloat(i3) - intBitsToFloat9;
                            if (intBitsToFloat11 < nae.e) {
                                intBitsToFloat11 = 0.0f;
                            }
                            return new tt0(-intBitsToFloat11, nae.e);
                        }
                        return tt0Var2;
                    default:
                        long j10 = zc6Var.a;
                        long j11 = zc6Var.d;
                        tt0 tt0Var3 = zc6Var.j;
                        boolean j12 = zc6Var.j();
                        float f7 = 1.0f;
                        if (j10 == 9205357640488583168L) {
                            return new tt0(1.0f, 1.0f);
                        }
                        float f8 = tt0Var3.a;
                        if (j12) {
                            intBitsToFloat = Float.intBitsToFloat((int) (j10 & 4294967295L));
                            intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
                        } else {
                            intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                            intBitsToFloat2 = Float.intBitsToFloat((int) (j11 >> 32));
                        }
                        float f9 = intBitsToFloat / intBitsToFloat2;
                        if (f9 <= 1.0f) {
                            f7 = f9;
                        }
                        return new tt0(Math.max(f8, f7), tt0Var3.b);
                }
            }
        };
        sk6 sk6Var = sk6.b;
        this.n = ipe.x(sk6Var, vt4Var);
        this.o = ipe.x(sk6Var, new vt4(this) { // from class: yc6
            public final /* synthetic */ zc6 b;

            {
                this.b = this;
            }

            @Override // defpackage.vt4
            public final Object invoke() {
                float intBitsToFloat;
                float intBitsToFloat2;
                int i = r2;
                tt0 tt0Var2 = tt0.c;
                float f4 = nae.e;
                zc6 zc6Var = this.b;
                switch (i) {
                    case 0:
                        return fxe.o(zc6Var.f, zc6Var.a, zc6Var.g, zc6Var.h, zc6Var.j(), zc6Var.i);
                    case 1:
                        return fxe.o((List) zc6Var.n.getValue(), zc6Var.a, zc6Var.g, zc6Var.h, zc6Var.j(), nae.e);
                    case 2:
                        long j4 = zc6Var.a;
                        float f5 = zc6Var.h;
                        long j5 = zc6Var.d;
                        List list3 = (List) zc6Var.o.getValue();
                        boolean j6 = zc6Var.j();
                        list3.getClass();
                        if (j4 != 9205357640488583168L) {
                            if (j6) {
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (j4 & 4294967295L)) / f5;
                                int i2 = (int) (j5 & 4294967295L);
                                if (intBitsToFloat3 > Float.intBitsToFloat(i2)) {
                                    float intBitsToFloat4 = (Float.intBitsToFloat((int) (sxd.j(j4) & 4294967295L)) / f5) - Float.intBitsToFloat((int) (sxd.j(j5) & 4294967295L));
                                    return new tt0(intBitsToFloat4, intBitsToFloat4);
                                }
                                float intBitsToFloat5 = Float.intBitsToFloat(i2) - intBitsToFloat3;
                                if (intBitsToFloat5 < nae.e) {
                                    intBitsToFloat5 = 0.0f;
                                }
                                return new tt0(-intBitsToFloat5, nae.e);
                            } else if (list3.isEmpty()) {
                                float intBitsToFloat6 = Float.intBitsToFloat((int) (sxd.j(j4) & 4294967295L));
                                return new tt0(-intBitsToFloat6, intBitsToFloat6);
                            } else {
                                Iterator it = list3.iterator();
                                if (it.hasNext()) {
                                    int b = ((mi8) it.next()).d.b() / 2;
                                    while (it.hasNext()) {
                                        int b2 = ((mi8) it.next()).d.b() / 2;
                                        if (b < b2) {
                                            b = b2;
                                        }
                                    }
                                    float intBitsToFloat7 = b - (Float.intBitsToFloat((int) (4294967295L & sxd.j(j4))) / f5);
                                    if (intBitsToFloat7 >= nae.e) {
                                        f4 = intBitsToFloat7;
                                    }
                                    return new tt0(-f4, f4);
                                }
                                xk5.g();
                                return null;
                            }
                        }
                        return tt0Var2;
                    case 3:
                        long j7 = zc6Var.a;
                        float f6 = zc6Var.h;
                        long j8 = zc6Var.d;
                        boolean j9 = zc6Var.j();
                        if (j7 != 9205357640488583168L) {
                            if (j9) {
                                float intBitsToFloat8 = Float.intBitsToFloat((int) (sxd.j(j7) >> 32)) - (Float.intBitsToFloat((int) (sxd.j(j7) >> 32)) / f6);
                                if (intBitsToFloat8 >= nae.e) {
                                    f4 = intBitsToFloat8;
                                }
                                return new tt0(-f4, f4);
                            }
                            float intBitsToFloat9 = Float.intBitsToFloat((int) (j7 >> 32)) / f6;
                            int i3 = (int) (j8 >> 32);
                            if (intBitsToFloat9 > Float.intBitsToFloat(i3)) {
                                float intBitsToFloat10 = (Float.intBitsToFloat((int) (sxd.j(j7) >> 32)) / f6) - Float.intBitsToFloat((int) (sxd.j(j8) >> 32));
                                return new tt0(intBitsToFloat10, intBitsToFloat10);
                            }
                            float intBitsToFloat11 = Float.intBitsToFloat(i3) - intBitsToFloat9;
                            if (intBitsToFloat11 < nae.e) {
                                intBitsToFloat11 = 0.0f;
                            }
                            return new tt0(-intBitsToFloat11, nae.e);
                        }
                        return tt0Var2;
                    default:
                        long j10 = zc6Var.a;
                        long j11 = zc6Var.d;
                        tt0 tt0Var3 = zc6Var.j;
                        boolean j12 = zc6Var.j();
                        float f7 = 1.0f;
                        if (j10 == 9205357640488583168L) {
                            return new tt0(1.0f, 1.0f);
                        }
                        float f8 = tt0Var3.a;
                        if (j12) {
                            intBitsToFloat = Float.intBitsToFloat((int) (j10 & 4294967295L));
                            intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
                        } else {
                            intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                            intBitsToFloat2 = Float.intBitsToFloat((int) (j11 >> 32));
                        }
                        float f9 = intBitsToFloat / intBitsToFloat2;
                        if (f9 <= 1.0f) {
                            f7 = f9;
                        }
                        return new tt0(Math.max(f8, f7), tt0Var3.b);
                }
            }
        });
        this.p = ipe.x(sk6Var, new vt4(this) { // from class: yc6
            public final /* synthetic */ zc6 b;

            {
                this.b = this;
            }

            @Override // defpackage.vt4
            public final Object invoke() {
                float intBitsToFloat;
                float intBitsToFloat2;
                int i = r2;
                tt0 tt0Var2 = tt0.c;
                float f4 = nae.e;
                zc6 zc6Var = this.b;
                switch (i) {
                    case 0:
                        return fxe.o(zc6Var.f, zc6Var.a, zc6Var.g, zc6Var.h, zc6Var.j(), zc6Var.i);
                    case 1:
                        return fxe.o((List) zc6Var.n.getValue(), zc6Var.a, zc6Var.g, zc6Var.h, zc6Var.j(), nae.e);
                    case 2:
                        long j4 = zc6Var.a;
                        float f5 = zc6Var.h;
                        long j5 = zc6Var.d;
                        List list3 = (List) zc6Var.o.getValue();
                        boolean j6 = zc6Var.j();
                        list3.getClass();
                        if (j4 != 9205357640488583168L) {
                            if (j6) {
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (j4 & 4294967295L)) / f5;
                                int i2 = (int) (j5 & 4294967295L);
                                if (intBitsToFloat3 > Float.intBitsToFloat(i2)) {
                                    float intBitsToFloat4 = (Float.intBitsToFloat((int) (sxd.j(j4) & 4294967295L)) / f5) - Float.intBitsToFloat((int) (sxd.j(j5) & 4294967295L));
                                    return new tt0(intBitsToFloat4, intBitsToFloat4);
                                }
                                float intBitsToFloat5 = Float.intBitsToFloat(i2) - intBitsToFloat3;
                                if (intBitsToFloat5 < nae.e) {
                                    intBitsToFloat5 = 0.0f;
                                }
                                return new tt0(-intBitsToFloat5, nae.e);
                            } else if (list3.isEmpty()) {
                                float intBitsToFloat6 = Float.intBitsToFloat((int) (sxd.j(j4) & 4294967295L));
                                return new tt0(-intBitsToFloat6, intBitsToFloat6);
                            } else {
                                Iterator it = list3.iterator();
                                if (it.hasNext()) {
                                    int b = ((mi8) it.next()).d.b() / 2;
                                    while (it.hasNext()) {
                                        int b2 = ((mi8) it.next()).d.b() / 2;
                                        if (b < b2) {
                                            b = b2;
                                        }
                                    }
                                    float intBitsToFloat7 = b - (Float.intBitsToFloat((int) (4294967295L & sxd.j(j4))) / f5);
                                    if (intBitsToFloat7 >= nae.e) {
                                        f4 = intBitsToFloat7;
                                    }
                                    return new tt0(-f4, f4);
                                }
                                xk5.g();
                                return null;
                            }
                        }
                        return tt0Var2;
                    case 3:
                        long j7 = zc6Var.a;
                        float f6 = zc6Var.h;
                        long j8 = zc6Var.d;
                        boolean j9 = zc6Var.j();
                        if (j7 != 9205357640488583168L) {
                            if (j9) {
                                float intBitsToFloat8 = Float.intBitsToFloat((int) (sxd.j(j7) >> 32)) - (Float.intBitsToFloat((int) (sxd.j(j7) >> 32)) / f6);
                                if (intBitsToFloat8 >= nae.e) {
                                    f4 = intBitsToFloat8;
                                }
                                return new tt0(-f4, f4);
                            }
                            float intBitsToFloat9 = Float.intBitsToFloat((int) (j7 >> 32)) / f6;
                            int i3 = (int) (j8 >> 32);
                            if (intBitsToFloat9 > Float.intBitsToFloat(i3)) {
                                float intBitsToFloat10 = (Float.intBitsToFloat((int) (sxd.j(j7) >> 32)) / f6) - Float.intBitsToFloat((int) (sxd.j(j8) >> 32));
                                return new tt0(intBitsToFloat10, intBitsToFloat10);
                            }
                            float intBitsToFloat11 = Float.intBitsToFloat(i3) - intBitsToFloat9;
                            if (intBitsToFloat11 < nae.e) {
                                intBitsToFloat11 = 0.0f;
                            }
                            return new tt0(-intBitsToFloat11, nae.e);
                        }
                        return tt0Var2;
                    default:
                        long j10 = zc6Var.a;
                        long j11 = zc6Var.d;
                        tt0 tt0Var3 = zc6Var.j;
                        boolean j12 = zc6Var.j();
                        float f7 = 1.0f;
                        if (j10 == 9205357640488583168L) {
                            return new tt0(1.0f, 1.0f);
                        }
                        float f8 = tt0Var3.a;
                        if (j12) {
                            intBitsToFloat = Float.intBitsToFloat((int) (j10 & 4294967295L));
                            intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
                        } else {
                            intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                            intBitsToFloat2 = Float.intBitsToFloat((int) (j11 >> 32));
                        }
                        float f9 = intBitsToFloat / intBitsToFloat2;
                        if (f9 <= 1.0f) {
                            f7 = f9;
                        }
                        return new tt0(Math.max(f8, f7), tt0Var3.b);
                }
            }
        });
        this.q = ipe.x(sk6Var, new vt4(this) { // from class: yc6
            public final /* synthetic */ zc6 b;

            {
                this.b = this;
            }

            @Override // defpackage.vt4
            public final Object invoke() {
                float intBitsToFloat;
                float intBitsToFloat2;
                int i = r2;
                tt0 tt0Var2 = tt0.c;
                float f4 = nae.e;
                zc6 zc6Var = this.b;
                switch (i) {
                    case 0:
                        return fxe.o(zc6Var.f, zc6Var.a, zc6Var.g, zc6Var.h, zc6Var.j(), zc6Var.i);
                    case 1:
                        return fxe.o((List) zc6Var.n.getValue(), zc6Var.a, zc6Var.g, zc6Var.h, zc6Var.j(), nae.e);
                    case 2:
                        long j4 = zc6Var.a;
                        float f5 = zc6Var.h;
                        long j5 = zc6Var.d;
                        List list3 = (List) zc6Var.o.getValue();
                        boolean j6 = zc6Var.j();
                        list3.getClass();
                        if (j4 != 9205357640488583168L) {
                            if (j6) {
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (j4 & 4294967295L)) / f5;
                                int i2 = (int) (j5 & 4294967295L);
                                if (intBitsToFloat3 > Float.intBitsToFloat(i2)) {
                                    float intBitsToFloat4 = (Float.intBitsToFloat((int) (sxd.j(j4) & 4294967295L)) / f5) - Float.intBitsToFloat((int) (sxd.j(j5) & 4294967295L));
                                    return new tt0(intBitsToFloat4, intBitsToFloat4);
                                }
                                float intBitsToFloat5 = Float.intBitsToFloat(i2) - intBitsToFloat3;
                                if (intBitsToFloat5 < nae.e) {
                                    intBitsToFloat5 = 0.0f;
                                }
                                return new tt0(-intBitsToFloat5, nae.e);
                            } else if (list3.isEmpty()) {
                                float intBitsToFloat6 = Float.intBitsToFloat((int) (sxd.j(j4) & 4294967295L));
                                return new tt0(-intBitsToFloat6, intBitsToFloat6);
                            } else {
                                Iterator it = list3.iterator();
                                if (it.hasNext()) {
                                    int b = ((mi8) it.next()).d.b() / 2;
                                    while (it.hasNext()) {
                                        int b2 = ((mi8) it.next()).d.b() / 2;
                                        if (b < b2) {
                                            b = b2;
                                        }
                                    }
                                    float intBitsToFloat7 = b - (Float.intBitsToFloat((int) (4294967295L & sxd.j(j4))) / f5);
                                    if (intBitsToFloat7 >= nae.e) {
                                        f4 = intBitsToFloat7;
                                    }
                                    return new tt0(-f4, f4);
                                }
                                xk5.g();
                                return null;
                            }
                        }
                        return tt0Var2;
                    case 3:
                        long j7 = zc6Var.a;
                        float f6 = zc6Var.h;
                        long j8 = zc6Var.d;
                        boolean j9 = zc6Var.j();
                        if (j7 != 9205357640488583168L) {
                            if (j9) {
                                float intBitsToFloat8 = Float.intBitsToFloat((int) (sxd.j(j7) >> 32)) - (Float.intBitsToFloat((int) (sxd.j(j7) >> 32)) / f6);
                                if (intBitsToFloat8 >= nae.e) {
                                    f4 = intBitsToFloat8;
                                }
                                return new tt0(-f4, f4);
                            }
                            float intBitsToFloat9 = Float.intBitsToFloat((int) (j7 >> 32)) / f6;
                            int i3 = (int) (j8 >> 32);
                            if (intBitsToFloat9 > Float.intBitsToFloat(i3)) {
                                float intBitsToFloat10 = (Float.intBitsToFloat((int) (sxd.j(j7) >> 32)) / f6) - Float.intBitsToFloat((int) (sxd.j(j8) >> 32));
                                return new tt0(intBitsToFloat10, intBitsToFloat10);
                            }
                            float intBitsToFloat11 = Float.intBitsToFloat(i3) - intBitsToFloat9;
                            if (intBitsToFloat11 < nae.e) {
                                intBitsToFloat11 = 0.0f;
                            }
                            return new tt0(-intBitsToFloat11, nae.e);
                        }
                        return tt0Var2;
                    default:
                        long j10 = zc6Var.a;
                        long j11 = zc6Var.d;
                        tt0 tt0Var3 = zc6Var.j;
                        boolean j12 = zc6Var.j();
                        float f7 = 1.0f;
                        if (j10 == 9205357640488583168L) {
                            return new tt0(1.0f, 1.0f);
                        }
                        float f8 = tt0Var3.a;
                        if (j12) {
                            intBitsToFloat = Float.intBitsToFloat((int) (j10 & 4294967295L));
                            intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
                        } else {
                            intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                            intBitsToFloat2 = Float.intBitsToFloat((int) (j11 >> 32));
                        }
                        float f9 = intBitsToFloat / intBitsToFloat2;
                        if (f9 <= 1.0f) {
                            f7 = f9;
                        }
                        return new tt0(Math.max(f8, f7), tt0Var3.b);
                }
            }
        });
        this.r = ipe.x(sk6Var, new vt4(this) { // from class: yc6
            public final /* synthetic */ zc6 b;

            {
                this.b = this;
            }

            @Override // defpackage.vt4
            public final Object invoke() {
                float intBitsToFloat;
                float intBitsToFloat2;
                int i = r2;
                tt0 tt0Var2 = tt0.c;
                float f4 = nae.e;
                zc6 zc6Var = this.b;
                switch (i) {
                    case 0:
                        return fxe.o(zc6Var.f, zc6Var.a, zc6Var.g, zc6Var.h, zc6Var.j(), zc6Var.i);
                    case 1:
                        return fxe.o((List) zc6Var.n.getValue(), zc6Var.a, zc6Var.g, zc6Var.h, zc6Var.j(), nae.e);
                    case 2:
                        long j4 = zc6Var.a;
                        float f5 = zc6Var.h;
                        long j5 = zc6Var.d;
                        List list3 = (List) zc6Var.o.getValue();
                        boolean j6 = zc6Var.j();
                        list3.getClass();
                        if (j4 != 9205357640488583168L) {
                            if (j6) {
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (j4 & 4294967295L)) / f5;
                                int i2 = (int) (j5 & 4294967295L);
                                if (intBitsToFloat3 > Float.intBitsToFloat(i2)) {
                                    float intBitsToFloat4 = (Float.intBitsToFloat((int) (sxd.j(j4) & 4294967295L)) / f5) - Float.intBitsToFloat((int) (sxd.j(j5) & 4294967295L));
                                    return new tt0(intBitsToFloat4, intBitsToFloat4);
                                }
                                float intBitsToFloat5 = Float.intBitsToFloat(i2) - intBitsToFloat3;
                                if (intBitsToFloat5 < nae.e) {
                                    intBitsToFloat5 = 0.0f;
                                }
                                return new tt0(-intBitsToFloat5, nae.e);
                            } else if (list3.isEmpty()) {
                                float intBitsToFloat6 = Float.intBitsToFloat((int) (sxd.j(j4) & 4294967295L));
                                return new tt0(-intBitsToFloat6, intBitsToFloat6);
                            } else {
                                Iterator it = list3.iterator();
                                if (it.hasNext()) {
                                    int b = ((mi8) it.next()).d.b() / 2;
                                    while (it.hasNext()) {
                                        int b2 = ((mi8) it.next()).d.b() / 2;
                                        if (b < b2) {
                                            b = b2;
                                        }
                                    }
                                    float intBitsToFloat7 = b - (Float.intBitsToFloat((int) (4294967295L & sxd.j(j4))) / f5);
                                    if (intBitsToFloat7 >= nae.e) {
                                        f4 = intBitsToFloat7;
                                    }
                                    return new tt0(-f4, f4);
                                }
                                xk5.g();
                                return null;
                            }
                        }
                        return tt0Var2;
                    case 3:
                        long j7 = zc6Var.a;
                        float f6 = zc6Var.h;
                        long j8 = zc6Var.d;
                        boolean j9 = zc6Var.j();
                        if (j7 != 9205357640488583168L) {
                            if (j9) {
                                float intBitsToFloat8 = Float.intBitsToFloat((int) (sxd.j(j7) >> 32)) - (Float.intBitsToFloat((int) (sxd.j(j7) >> 32)) / f6);
                                if (intBitsToFloat8 >= nae.e) {
                                    f4 = intBitsToFloat8;
                                }
                                return new tt0(-f4, f4);
                            }
                            float intBitsToFloat9 = Float.intBitsToFloat((int) (j7 >> 32)) / f6;
                            int i3 = (int) (j8 >> 32);
                            if (intBitsToFloat9 > Float.intBitsToFloat(i3)) {
                                float intBitsToFloat10 = (Float.intBitsToFloat((int) (sxd.j(j7) >> 32)) / f6) - Float.intBitsToFloat((int) (sxd.j(j8) >> 32));
                                return new tt0(intBitsToFloat10, intBitsToFloat10);
                            }
                            float intBitsToFloat11 = Float.intBitsToFloat(i3) - intBitsToFloat9;
                            if (intBitsToFloat11 < nae.e) {
                                intBitsToFloat11 = 0.0f;
                            }
                            return new tt0(-intBitsToFloat11, nae.e);
                        }
                        return tt0Var2;
                    default:
                        long j10 = zc6Var.a;
                        long j11 = zc6Var.d;
                        tt0 tt0Var3 = zc6Var.j;
                        boolean j12 = zc6Var.j();
                        float f7 = 1.0f;
                        if (j10 == 9205357640488583168L) {
                            return new tt0(1.0f, 1.0f);
                        }
                        float f8 = tt0Var3.a;
                        if (j12) {
                            intBitsToFloat = Float.intBitsToFloat((int) (j10 & 4294967295L));
                            intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
                        } else {
                            intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                            intBitsToFloat2 = Float.intBitsToFloat((int) (j11 >> 32));
                        }
                        float f9 = intBitsToFloat / intBitsToFloat2;
                        if (f9 <= 1.0f) {
                            f7 = f9;
                        }
                        return new tt0(Math.max(f8, f7), tt0Var3.b);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.List] */
    public static zc6 c(zc6 zc6Var, long j, float f, ff8 ff8Var, long j2, ArrayList arrayList, List list, long j3, float f2, cd6 cd6Var, zi8 zi8Var, int i) {
        long j4;
        float f3;
        ff8 ff8Var2;
        long j5;
        ArrayList arrayList2;
        List list2;
        long j6;
        float f4;
        cd6 cd6Var2;
        zi8 zi8Var2;
        if ((i & 1) != 0) {
            j4 = zc6Var.a;
        } else {
            j4 = j;
        }
        if ((i & 2) != 0) {
            f3 = zc6Var.b;
        } else {
            f3 = f;
        }
        if ((i & 4) != 0) {
            ff8Var2 = zc6Var.c;
        } else {
            ff8Var2 = ff8Var;
        }
        if ((i & 8) != 0) {
            j5 = zc6Var.d;
        } else {
            j5 = j2;
        }
        if ((i & 16) != 0) {
            arrayList2 = zc6Var.e;
        } else {
            arrayList2 = arrayList;
        }
        if ((i & 32) != 0) {
            list2 = zc6Var.f;
        } else {
            list2 = list;
        }
        if ((i & 64) != 0) {
            j6 = zc6Var.g;
        } else {
            j6 = j3;
        }
        if ((i & Token.CASE) != 0) {
            f4 = zc6Var.h;
        } else {
            f4 = f2;
        }
        float f5 = zc6Var.i;
        tt0 tt0Var = zc6Var.j;
        if ((i & 1024) != 0) {
            cd6Var2 = zc6Var.k;
        } else {
            cd6Var2 = cd6Var;
        }
        if ((i & 2048) != 0) {
            zi8Var2 = zc6Var.l;
        } else {
            zi8Var2 = zi8Var;
        }
        boolean z = zc6Var.m;
        zc6Var.getClass();
        ff8Var2.getClass();
        arrayList2.getClass();
        list2.getClass();
        cd6Var2.getClass();
        zi8Var2.getClass();
        return new zc6(j4, f3, ff8Var2, j5, arrayList2, list2, j6, f4, f5, tt0Var, cd6Var2, zi8Var2, z);
    }

    public final void a() {
        Object value;
        for (xh8 xh8Var : this.e) {
            cza czaVar = xh8Var.f.p;
            do {
                value = czaVar.getValue();
            } while (!czaVar.l(value, new pz9(null, ((pz9) value).b)));
        }
    }

    public final zc6 b() {
        return c(this, 0L, nae.e, null, 0L, null, null, yz1.x(this.g, e(), h()), yz1.t(this.h, i()), null, null, 7999);
    }

    public final void d() {
        rk9 m;
        uy5 uy5Var;
        Object value;
        uy5 uy5Var2;
        ye6 ye6Var = this.o;
        if (!((List) ye6Var.getValue()).isEmpty()) {
            float f = 1.0f / this.h;
            long j = this.a;
            long e = dna.e(f, j);
            float b = dna.b(j) * 1.15f * f;
            if (j()) {
                float intBitsToFloat = Float.intBitsToFloat((int) (sxd.j(e) >> 32)) + (-f()) + e().b;
                m = npe.m(b / 2.0f, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits((-(g() - b)) - (b - Float.intBitsToFloat((int) (sxd.j(e) & 4294967295L)))) & 4294967295L));
            } else {
                float intBitsToFloat2 = Float.intBitsToFloat((int) (sxd.j(j) & 4294967295L)) + (-g());
                long floatToRawIntBits = Float.floatToRawIntBits((-(f() - b)) - (b - Float.intBitsToFloat((int) (sxd.j(e) >> 32))));
                m = npe.m(b / 2.0f, (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (floatToRawIntBits << 32));
            }
            float f2 = m.d;
            float f3 = m.c;
            float f4 = m.b;
            float f5 = m.a;
            List list = this.e;
            int k = p17.k(tl1.s(list, 10));
            if (k < 16) {
                k = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(k);
            for (Object obj : list) {
                linkedHashMap.put(Integer.valueOf(((xh8) obj).b), obj);
            }
            List list2 = (List) ye6Var.getValue();
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                mi8 mi8Var = (mi8) list2.get(i);
                if (j()) {
                    float f6 = mi8Var.d.b;
                    float f7 = -f6;
                    uy5Var = new uy5(k27.A(Math.max(uy5Var2.a, f5) + nae.e), k27.A(Math.max(f6, f4) + f7), k27.A(Math.min(uy5Var2.c, f3) + nae.e), k27.A(Math.min(uy5Var2.d, f2) + f7));
                } else {
                    uy5 uy5Var3 = mi8Var.d;
                    float f8 = uy5Var3.a;
                    float f9 = uy5Var3.b;
                    float max = Math.max(f8, f5);
                    float max2 = Math.max(f9, f4);
                    float f10 = -f8;
                    float f11 = -f9;
                    uy5Var = new uy5(k27.A(max + f10), k27.A(max2 + f11), k27.A(Math.min(uy5Var3.c, f3) + f10), k27.A(Math.min(uy5Var3.d, f2) + f11));
                }
                xh8 xh8Var = (xh8) linkedHashMap.get(Integer.valueOf(mi8Var.a));
                if (xh8Var != null) {
                    k8c k8cVar = xh8Var.f;
                    uy5 b2 = pc2.b(uy5Var.d(), uy5Var.c());
                    k8cVar.getClass();
                    cza czaVar = k8cVar.p;
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, new pz9(b2, ((pz9) value).b)));
                }
            }
        }
    }

    public final tt0 e() {
        return (tt0) this.q.getValue();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zc6) {
                zc6 zc6Var = (zc6) obj;
                if (!dna.a(this.a, zc6Var.a) || Float.compare(this.b, zc6Var.b) != 0 || this.c != zc6Var.c || !dna.a(this.d, zc6Var.d) || !c16.i(this.e, zc6Var.e) || !c16.i(this.f, zc6Var.f) || !y78.d(this.g, zc6Var.g) || Float.compare(this.h, zc6Var.h) != 0 || Float.compare(this.i, zc6Var.i) != 0 || !this.j.equals(zc6Var.j) || this.k != zc6Var.k || this.l != zc6Var.l || this.m != zc6Var.m) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final float f() {
        return Float.intBitsToFloat((int) (this.g >> 32));
    }

    public final float g() {
        return Float.intBitsToFloat((int) (this.g & 4294967295L));
    }

    public final tt0 h() {
        return (tt0) this.p.getValue();
    }

    public final int hashCode() {
        int d = nk2.d(this.i, nk2.d(this.h, hl5.c(eub.l(eub.l(hl5.c((this.c.hashCode() + nk2.d(this.b, Long.hashCode(this.a) * 31, 31)) * 31, this.d, 31), this.e, 31), this.f, 31), this.g, 31), 31), 31);
        int hashCode = this.k.hashCode();
        int hashCode2 = this.l.hashCode();
        return Boolean.hashCode(this.m) + ((hashCode2 + ((hashCode + ((this.j.hashCode() + d) * 31)) * 31)) * 31);
    }

    public final tt0 i() {
        return (tt0) this.r.getValue();
    }

    public final boolean j() {
        if (this.c == ff8.a) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String f = dna.f(this.a);
        String f2 = dna.f(this.d);
        String l = y78.l(this.g);
        StringBuilder sb = new StringBuilder("LayoutInfo(viewportSize=");
        sb.append(f);
        sb.append(", spacing=");
        sb.append(this.b);
        sb.append(", orientation=");
        sb.append(this.c);
        sb.append(", fullSize=");
        sb.append(f2);
        sb.append(", pages=");
        sb.append(this.e);
        sb.append(", pagePositions=");
        sb.append(this.f);
        sb.append(", offset=");
        sb.append(l);
        sb.append(", zoom=");
        sb.append(this.h);
        sb.append(", bufferRatio=");
        sb.append(this.i);
        sb.append(", userZoomBounds=");
        sb.append(this.j);
        sb.append(", layoutMode=");
        sb.append(this.k);
        sb.append(", pagerFitMode=");
        sb.append(this.l);
        sb.append(", isRtl=");
        return rs8.m(")", sb, this.m);
    }
}
