package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ied  reason: default package */
/* loaded from: classes.dex */
public final class ied {
    public final r13 a;
    public gd b;
    public cd6 c;
    public final cza d;
    public final cza e;
    public final jj9 f;
    public final a52 g;
    public final sk8 h;

    /* JADX WARN: Type inference failed for: r2v4, types: [sk8, java.lang.Object] */
    public ied(r13 r13Var, float f, float f2, gd gdVar, ff8 ff8Var, float f3, cd6 cd6Var, zi8 zi8Var, boolean z) {
        int i;
        r13Var.getClass();
        ff8Var.getClass();
        cd6Var.getClass();
        zi8Var.getClass();
        this.a = r13Var;
        this.b = gdVar;
        this.c = cd6Var;
        tt0 tt0Var = new tt0(f, f2);
        ks3 ks3Var = ks3.a;
        cza a = dza.a(new zc6(9205357640488583168L, nae.e, ff8Var, 0L, ks3Var, ks3Var, 0L, 1.0f, f3, tt0Var, cd6Var, zi8Var, z));
        this.d = a;
        gd gdVar2 = this.b;
        int i2 = 0;
        if (gdVar2 != null && (i = gdVar2.a) >= 0) {
            i2 = i;
        }
        cza a2 = dza.a(Integer.valueOf(i2));
        this.e = a2;
        this.f = z1d.q(a2);
        this.g = new a52(ade.y(r13Var), a);
        imb imbVar = new imb(this, 20);
        r13Var.getClass();
        ?? obj = new Object();
        obj.a = imbVar;
        obj.b = dza.a(new tk8(1.0f, nae.e, nae.e, nae.e, nae.e, nae.e, nae.e, 0, 0));
        pga a3 = qga.a(1, 5, null);
        obj.c = a3;
        obj.d = a3;
        obj.e = ade.y(r13Var);
        obj.f = tte.v(nae.e, 300.0f, 5, null);
        obj.g = tte.v(0.85f, 300.0f, 4, null);
        this.h = obj;
    }

    public final zc6 a(gd gdVar, zc6 zc6Var) {
        Object obj;
        long a;
        gdVar.getClass();
        boolean j = ((zc6) this.d.getValue()).j();
        List list = zc6Var.f;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = list.get(i);
                if (((mi8) obj).a == gdVar.a) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        mi8 mi8Var = (mi8) obj;
        if (mi8Var == null) {
            return zc6Var;
        }
        float f = mi8Var.b;
        float f2 = -(((mi8Var.c - f) * gdVar.b) + f);
        if (j) {
            a = y78.a(yz1.t(zc6Var.f(), zc6Var.e()), yz1.t(f2, zc6Var.h()));
        } else {
            a = y78.a(yz1.t(f2, zc6Var.e()), yz1.t(zc6Var.g(), zc6Var.h()));
        }
        return zc6.c(zc6Var, 0L, nae.e, null, 0L, null, null, a, nae.e, null, null, 8127);
    }

    public final yk8 b(List list, long j, float f, boolean z) {
        ff8 ff8Var;
        boolean z2;
        boolean z3;
        boolean z4;
        xh8 xh8Var;
        yk8 yk8Var;
        float f2;
        zi8 zi8Var;
        float f3;
        float f4;
        mi8 mi8Var;
        int i;
        float f5;
        xh8 xh8Var2;
        yk8 yk8Var2;
        float f6;
        ied iedVar = this;
        list.getClass();
        zc6 zc6Var = (zc6) iedVar.d.getValue();
        long j2 = zc6Var.a;
        ff8 ff8Var2 = zc6Var.c;
        cd6 cd6Var = zc6Var.k;
        zi8 zi8Var2 = zc6Var.l;
        boolean z5 = zc6Var.m;
        ff8Var2.getClass();
        cd6Var.getClass();
        zi8Var2.getClass();
        ff8 ff8Var3 = ff8.a;
        if (z) {
            ff8Var = ff8Var3;
        } else {
            ff8Var = ff8.b;
        }
        cd6 cd6Var2 = iedVar.c;
        cd6Var2.getClass();
        if (ff8Var == ff8Var3) {
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        float f7 = 0.0f;
        float f8 = 0.0f;
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                xh8 xh8Var3 = (xh8) obj;
                r13 r13Var = iedVar.a;
                if (z2) {
                    if (cd6Var2.a()) {
                        int i4 = i2;
                        float a = xh8Var3.a();
                        long j3 = xh8Var3.a;
                        int i5 = (int) (j3 >> 32);
                        int i6 = (int) (j3 & 4294967295L);
                        f5 = f7;
                        f4 = f8;
                        xh8Var2 = xh8Var3;
                        i = i4;
                        yk8Var2 = dxe.A(a, i5, i6, j, zi8Var2, r13Var);
                    } else {
                        i = i2;
                        f5 = f7;
                        f4 = f8;
                        xh8Var2 = xh8Var3;
                        int i7 = (int) (j >> 32);
                        yk8Var2 = new yk8(Float.valueOf(Float.intBitsToFloat(i7)), Float.valueOf(xh8Var2.a() * Float.intBitsToFloat(i7)));
                    }
                    float floatValue = ((Number) yk8Var2.a).floatValue();
                    float floatValue2 = ((Number) yk8Var2.b).floatValue() + f5;
                    z3 = z5;
                    mi8Var = new mi8(xh8Var2.b, f5, floatValue2, new uy5(0, (int) f5, (int) floatValue, (int) floatValue2));
                    float f9 = floatValue2 - f5;
                    if (i == list.size() - 1) {
                        f6 = 0.0f;
                    } else {
                        f6 = f;
                    }
                    z4 = z2;
                    f7 = f9 + f6 + f5;
                    zi8Var = zi8Var2;
                } else {
                    z3 = z5;
                    int i8 = i2;
                    float f10 = f7;
                    float f11 = f8;
                    if (cd6Var2.a()) {
                        float a2 = xh8Var3.a();
                        long j4 = xh8Var3.a;
                        z4 = z2;
                        xh8Var = xh8Var3;
                        yk8Var = dxe.A(a2, (int) (j4 >> 32), (int) (j4 & 4294967295L), j, zi8Var2, r13Var);
                    } else {
                        z4 = z2;
                        xh8Var = xh8Var3;
                        int i9 = (int) (j >> 32);
                        float a3 = xh8Var.a() * Float.intBitsToFloat(i9);
                        float intBitsToFloat = Float.intBitsToFloat(i9);
                        int i10 = (int) (j & 4294967295L);
                        if (a3 > Float.intBitsToFloat(i10)) {
                            float intBitsToFloat2 = Float.intBitsToFloat(i10) / a3;
                            a3 *= intBitsToFloat2;
                            intBitsToFloat *= intBitsToFloat2;
                        }
                        yk8Var = new yk8(Float.valueOf(intBitsToFloat), Float.valueOf(a3));
                    }
                    float floatValue3 = ((Number) yk8Var.a).floatValue();
                    float floatValue4 = ((Number) yk8Var.b).floatValue();
                    float intBitsToFloat3 = (Float.intBitsToFloat((int) (j & 4294967295L)) - floatValue4) / 2.0f;
                    float f12 = f11 + floatValue3;
                    float f13 = (floatValue4 + intBitsToFloat3) - intBitsToFloat3;
                    if (f13 > f10) {
                        f10 = f13;
                    }
                    long floatToRawIntBits = (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
                    long intBitsToFloat4 = (((int) Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) << 32) | (((int) Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))) & 4294967295L);
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
                    long intBitsToFloat5 = (((int) Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32))) << 32) | (((int) Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L))) & 4294967295L);
                    zi8Var = zi8Var2;
                    mi8 mi8Var2 = new mi8(xh8Var.b, f11, f12, new uy5((int) (intBitsToFloat4 >> 32), (int) (intBitsToFloat4 & 4294967295L), (int) (intBitsToFloat5 >> 32), (int) (intBitsToFloat5 & 4294967295L)));
                    float f14 = f12 - f11;
                    if (i8 == list.size() - 1) {
                        f3 = 0.0f;
                    } else {
                        f3 = f;
                    }
                    f4 = f14 + f3 + f11;
                    f7 = f10;
                    mi8Var = mi8Var2;
                }
                arrayList.add(mi8Var);
                z2 = z4;
                f8 = f4;
                i2 = i3;
                z5 = z3;
                zi8Var2 = zi8Var;
                iedVar = this;
            } else {
                tl1.M();
                throw null;
            }
        }
        boolean z6 = z2;
        float f15 = f7;
        float f16 = f8;
        if (z5 && !z6) {
            ArrayList arrayList2 = new ArrayList(tl1.s(arrayList, 10));
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj2 = arrayList.get(i11);
                i11++;
                mi8 mi8Var3 = (mi8) obj2;
                float f17 = mi8Var3.c;
                float f18 = f17 - mi8Var3.b;
                float f19 = f16 - f17;
                float f20 = f18 + f19;
                uy5 uy5Var = mi8Var3.d;
                arrayList2.add(new mi8(mi8Var3.a, f19, f20, new uy5((int) f19, uy5Var.b, (int) f20, uy5Var.d)));
            }
            return new yk8(new dna((Float.floatToRawIntBits(f16) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L)), arrayList2);
        }
        return new yk8(new dna((Float.floatToRawIntBits(f16) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L)), arrayList);
    }

    public final int c() {
        float f;
        long j;
        Object obj;
        Object obj2;
        if (this.c.a()) {
            return d();
        }
        zc6 zc6Var = (zc6) this.d.getValue();
        List list = zc6Var.f;
        if (!list.isEmpty()) {
            if (zc6Var.j()) {
                f = zc6Var.g();
            } else {
                f = zc6Var.f();
            }
            float f2 = -f;
            boolean j2 = zc6Var.j();
            long j3 = zc6Var.a;
            if (j2) {
                j = j3 & 4294967295L;
            } else {
                j = j3 >> 32;
            }
            float intBitsToFloat = (Float.intBitsToFloat((int) j) / 2.0f) + f2;
            int size = list.size();
            int i = 0;
            while (true) {
                obj = null;
                if (i < size) {
                    obj2 = list.get(i);
                    mi8 mi8Var = (mi8) obj2;
                    float f3 = mi8Var.b;
                    if (intBitsToFloat <= mi8Var.c && f3 <= intBitsToFloat) {
                        break;
                    }
                    i++;
                } else {
                    obj2 = null;
                    break;
                }
            }
            mi8 mi8Var2 = (mi8) obj2;
            if (mi8Var2 != null) {
                return mi8Var2.a;
            }
            Iterator it = list.iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    mi8 mi8Var3 = (mi8) obj;
                    float min = Math.min(Math.abs(intBitsToFloat - mi8Var3.b), Math.abs(intBitsToFloat - mi8Var3.c));
                    do {
                        Object next = it.next();
                        mi8 mi8Var4 = (mi8) next;
                        float min2 = Math.min(Math.abs(intBitsToFloat - mi8Var4.b), Math.abs(intBitsToFloat - mi8Var4.c));
                        if (Float.compare(min, min2) > 0) {
                            obj = next;
                            min = min2;
                        }
                    } while (it.hasNext());
                }
            }
            mi8 mi8Var5 = (mi8) obj;
            if (mi8Var5 != null) {
                return mi8Var5.a;
            }
        }
        return 0;
    }

    public final int d() {
        return ((Number) this.e.getValue()).intValue();
    }

    public final void e() {
        zc6 zc6Var = (zc6) this.d.getValue();
        cd6 cd6Var = this.c;
        cd6Var.getClass();
        cd6 cd6Var2 = cd6.a;
        if (cd6Var == cd6Var2) {
            zc6Var.a();
        }
        this.b = p1d.j(zc6Var);
        i(zc6Var.b, zc6Var.a);
        cd6 cd6Var3 = this.c;
        cd6Var3.getClass();
        if (cd6Var3 == cd6Var2) {
            this.g.a();
        }
    }

    public final void f(int i) {
        Integer valueOf = Integer.valueOf(i);
        cza czaVar = this.e;
        czaVar.getClass();
        czaVar.n(null, valueOf);
    }

    public final void g(cd6 cd6Var) {
        cza czaVar;
        int i;
        ied iedVar = this;
        cd6Var.getClass();
        if (iedVar.c == cd6Var) {
            return;
        }
        int c = iedVar.c();
        iedVar.c = cd6Var;
        while (true) {
            czaVar = iedVar.d;
            Object value = czaVar.getValue();
            i = c;
            zc6 b = zc6.c((zc6) value, 0L, nae.e, null, 0L, null, null, 0L, 1.0f, cd6Var, null, 7039).b();
            b.a();
            if (czaVar.l(value, b)) {
                break;
            }
            iedVar = this;
            c = i;
        }
        for (xh8 xh8Var : ((zc6) czaVar.getValue()).e) {
            xh8Var.getClass();
            cza czaVar2 = xh8Var.d;
            czaVar2.getClass();
            czaVar2.n(null, cd6Var);
        }
        if (cd6Var.a()) {
            f(i);
            ((pga) this.h.c).f(new l2a(i));
            return;
        }
        this.g.c(i, false);
    }

    public final void h(ff8 ff8Var) {
        ff8 ff8Var2 = ff8Var;
        ff8Var2.getClass();
        boolean a = this.c.a();
        cza czaVar = this.d;
        if (a) {
            if (((zc6) czaVar.getValue()).c == ff8Var2) {
                return;
            }
            while (true) {
                Object value = czaVar.getValue();
                czaVar = czaVar;
                if (czaVar.l(value, zc6.c((zc6) value, 0L, nae.e, ff8Var2, 0L, null, null, 0L, 1.0f, null, null, 8059))) {
                    e();
                    ((pga) this.h.c).f(new l2a(d()));
                    return;
                }
            }
        } else {
            ied iedVar = this;
            iya iyaVar = (iya) iedVar.g.e;
            if (iyaVar != null) {
                iyaVar.cancel(null);
            }
            while (true) {
                Object value2 = czaVar.getValue();
                zc6 zc6Var = (zc6) value2;
                if (zc6Var.c != ff8Var2) {
                    iedVar.b = p1d.j(zc6Var);
                    zc6 b = zc6.c(zc6Var, 0L, nae.e, ff8Var2, 0L, null, null, 0L, 1.0f, null, null, 8059).b();
                    b.a();
                    czaVar = czaVar;
                    if (czaVar.l(value2, b)) {
                        return;
                    }
                    iedVar = this;
                    ff8Var2 = ff8Var;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01bb A[LOOP:1: B:30:0x00ec->B:52:0x01bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b5 A[EDGE_INSN: B:54:0x01b5->B:49:0x01b5 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(float r40, long r41) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ied.i(float, long):void");
    }
}
