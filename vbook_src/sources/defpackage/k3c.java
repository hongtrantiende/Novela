package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k3c  reason: default package */
/* loaded from: classes3.dex */
public abstract class k3c {
    public static final c3c a = new Object();
    public static final float b = 0.125f / 18.0f;

    public static final rk9 a(pwb pwbVar, int i, List list, ff8 ff8Var, List list2) {
        int i2;
        gj6 gj6Var;
        gwb gwbVar;
        gj6 gj6Var2 = (gj6) sl1.e0(list);
        if (gj6Var2 != null) {
            int i3 = gj6Var2.a;
            gj6 gj6Var3 = (gj6) sl1.k0(list);
            if (gj6Var3 != null) {
                int i4 = gj6Var3.a;
                int i5 = -1;
                if (i3 <= i4) {
                    int i6 = i3;
                    i2 = -1;
                    while (true) {
                        wh8 wh8Var = (wh8) sl1.f0(i6, list2);
                        if (wh8Var != null && (wh8Var instanceof gwb) && pwbVar.a == wh8Var.b) {
                            int i7 = pwbVar.b;
                            iwb iwbVar = ((gwb) wh8Var).g;
                            if (i7 >= iwbVar.b && i7 <= iwbVar.c) {
                                i2 = i6 - i3;
                            }
                        }
                        if (i6 == i4) {
                            break;
                        }
                        i6++;
                    }
                } else {
                    i2 = -1;
                }
                if (i2 >= 0 && (gj6Var = (gj6) sl1.f0(i2, list)) != null) {
                    Object f0 = sl1.f0(i2 + i3, list2);
                    Object obj = null;
                    if (f0 instanceof gwb) {
                        gwbVar = (gwb) f0;
                    } else {
                        gwbVar = null;
                    }
                    if (gwbVar != null) {
                        iwb iwbVar2 = gwbVar.g;
                        ArrayList arrayList = iwbVar2.f;
                        int size = arrayList.size();
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size) {
                                break;
                            }
                            Object obj2 = arrayList.get(i9);
                            i9++;
                            jwb jwbVar = (jwb) obj2;
                            int i10 = pwbVar.b;
                            if (i10 >= jwbVar.a && i10 <= jwbVar.b) {
                                i5 = i8;
                                break;
                            }
                            i8++;
                        }
                        jwb jwbVar2 = (jwb) sl1.f0(i5, iwbVar2.f);
                        if (jwbVar2 != null) {
                            int i11 = (i5 * i) / iwbVar2.d;
                            Iterator it = jwbVar2.d.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                kwb kwbVar = (kwb) next;
                                int i12 = pwbVar.b;
                                if (i12 >= kwbVar.d && i12 <= kwbVar.e) {
                                    obj = next;
                                    break;
                                }
                            }
                            kwb kwbVar2 = (kwb) obj;
                            if (kwbVar2 != null) {
                                long j = kwbVar2.a;
                                mn mnVar = kwbVar2.h;
                                if (mnVar != null) {
                                    rk9 a2 = mnVar.a(pwbVar.b - kwbVar2.b);
                                    float f = a2.b;
                                    float f2 = a2.a;
                                    if (ff8Var == ff8.a) {
                                        return npe.n((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + f2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + f + gj6Var.p) & 4294967295L), a2.h());
                                    }
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + i11 + f2 + gj6Var.p;
                                    return npe.n((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + f) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), a2.h());
                                }
                            }
                        }
                    }
                }
            }
        }
        return rk9.e;
    }

    public static final pwb b(float f, float f2, int i, List list, ff8 ff8Var, List list2) {
        l3c d = d(f, f2, i, list, ff8Var, list2);
        if (d == null) {
            return pwb.d;
        }
        int i2 = d.a.b;
        int i3 = d.d;
        kwb kwbVar = d.b;
        return new pwb(i2, dce.n(i3 + kwbVar.b, kwbVar.d, kwbVar.e));
    }

    public static final boolean c(r09 r09Var, long j) {
        Object obj;
        List list = r09Var.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                obj = list.get(i);
                if (y09.a(((z09) obj).a, j)) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        z09 z09Var = (z09) obj;
        if (z09Var != null && z09Var.d) {
            z = true;
        }
        return true ^ z;
    }

    public static final l3c d(float f, float f2, int i, List list, ff8 ff8Var, List list2) {
        ff8 ff8Var2;
        Object obj;
        wh8 wh8Var;
        int i2;
        jwb jwbVar;
        long j;
        l3c l3cVar;
        Object obj2;
        int d;
        int i3;
        int i4;
        int i5;
        int size = list.size();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            ff8Var2 = ff8.a;
            if (i7 < size) {
                obj = list.get(i7);
                gj6 gj6Var = (gj6) obj;
                if (ff8Var == ff8Var2) {
                    if (f2 >= gj6Var.p && f2 <= i5 + gj6Var.q) {
                        break;
                    }
                    i7++;
                } else {
                    if (f >= gj6Var.p && f <= i4 + gj6Var.q) {
                        break;
                    }
                    i7++;
                }
            } else {
                obj = null;
                break;
            }
        }
        gj6 gj6Var2 = (gj6) obj;
        if (gj6Var2 != null && (wh8Var = (wh8) sl1.f0(gj6Var2.a, list2)) != null && (wh8Var instanceof gwb)) {
            gwb gwbVar = (gwb) wh8Var;
            iwb iwbVar = gwbVar.g;
            int size2 = iwbVar.f.size();
            while (true) {
                size2--;
                if (-1 < size2) {
                    i2 = (size2 * i) / iwbVar.d;
                    if (f >= i2) {
                        jwbVar = (jwb) iwbVar.f.get(size2);
                        break;
                    }
                } else {
                    i2 = 0;
                    jwbVar = null;
                    break;
                }
            }
            if (jwbVar != null) {
                List list3 = jwbVar.d;
                int size3 = list3.size();
                while (true) {
                    if (i6 < size3) {
                        obj2 = list3.get(i6);
                        kwb kwbVar = (kwb) obj2;
                        if (ff8Var == ff8Var2) {
                            i3 = size3;
                            l3cVar = null;
                            if (f2 >= Float.intBitsToFloat((int) (kwbVar.a >> 32)) + gj6Var2.p && f2 <= Float.intBitsToFloat((int) (kwbVar.a & 4294967295L)) + gj6Var2.p + kwbVar.g) {
                                j = 4294967295L;
                                break;
                            }
                            i6++;
                            size3 = i3;
                        } else {
                            i3 = size3;
                            l3cVar = null;
                            long j2 = kwbVar.a;
                            j = 4294967295L;
                            if (f2 >= Float.intBitsToFloat((int) (j2 & 4294967295L)) && f2 <= Float.intBitsToFloat((int) (j2 & 4294967295L)) + kwbVar.g) {
                                int i8 = (int) (j2 >> 32);
                                float f3 = i2;
                                if (f >= Float.intBitsToFloat(i8) + gj6Var2.p + f3 && f <= Float.intBitsToFloat(i8) + gj6Var2.p + f3 + kwbVar.f) {
                                    break;
                                }
                            }
                            i6++;
                            size3 = i3;
                        }
                    } else {
                        j = 4294967295L;
                        l3cVar = null;
                        obj2 = null;
                        break;
                    }
                }
                kwb kwbVar2 = (kwb) obj2;
                if (kwbVar2 != null) {
                    long j3 = kwbVar2.a;
                    mn mnVar = kwbVar2.h;
                    if (mnVar != null) {
                        if (ff8Var == ff8Var2) {
                            d = mnVar.d((Float.floatToRawIntBits(f - Float.intBitsToFloat((int) (j3 >> 32))) << 32) | (Float.floatToRawIntBits((f2 - Float.intBitsToFloat((int) (j3 & j))) - gj6Var2.p) & j));
                        } else {
                            d = mnVar.d((Float.floatToRawIntBits(((f - Float.intBitsToFloat((int) (j3 >> 32))) - i2) - gj6Var2.p) << 32) | (Float.floatToRawIntBits(f2 - Float.intBitsToFloat((int) (j3 & j))) & j));
                        }
                        if (d == -1) {
                            return l3cVar;
                        }
                        return new l3c(gwbVar, kwbVar2, mnVar, d);
                    }
                    return l3cVar;
                }
                return l3cVar;
            }
        }
        return null;
    }

    public static final float e(ucd ucdVar, int i) {
        ucdVar.getClass();
        if (i == 2) {
            return ucdVar.f() * b;
        }
        return ucdVar.f();
    }

    public static final nq7 f(nq7 nq7Var, boolean z, int i, kob kobVar, h2a h2aVar, cyb cybVar, ymb ymbVar, rh8 rh8Var, mu4 mu4Var, rv4 rv4Var) {
        Object obj;
        Object obj2;
        Object obj3;
        aw7 aw7Var;
        Object obj4;
        kob kobVar2;
        Object obj5;
        kj6 kj6Var;
        Object[] objArr;
        Object obj6;
        Object obj7;
        nq7 nq7Var2;
        aw7 aw7Var2;
        tc6 tc6Var;
        aw7 aw7Var3;
        cyb cybVar2;
        Object obj8;
        nq7Var.getClass();
        kobVar.getClass();
        cybVar.getClass();
        ymbVar.getClass();
        rh8Var.getClass();
        mu4Var.getClass();
        Object P = rv4Var.P();
        Object obj9 = ax1.a;
        if (P == obj9) {
            P = yae.z(pwb.d);
            rv4Var.o0(P);
        }
        aw7 aw7Var4 = (aw7) P;
        tc6 tc6Var2 = (tc6) rv4Var.j(dy1.n);
        r13 r13Var = (r13) rv4Var.j(dy1.h);
        s35 s35Var = (s35) rv4Var.j(dy1.l);
        Object P2 = rv4Var.P();
        if (P2 == obj9) {
            P2 = yae.z(new y78(0L));
            rv4Var.o0(P2);
        }
        aw7 aw7Var5 = (aw7) P2;
        Object P3 = rv4Var.P();
        if (P3 == obj9) {
            P3 = yae.z(Boolean.FALSE);
            rv4Var.o0(P3);
        }
        aw7 aw7Var6 = (aw7) P3;
        Object P4 = rv4Var.P();
        if (P4 == obj9) {
            P4 = yae.z(Boolean.TRUE);
            rv4Var.o0(P4);
        }
        aw7 aw7Var7 = (aw7) P4;
        Object D = yae.D(ymbVar.a, rv4Var);
        aw7 D2 = yae.D(Float.valueOf(r13Var.L0(zbe.o(rh8Var, tc6Var2))), rv4Var);
        aw7 D3 = yae.D(Float.valueOf(r13Var.L0(rh8Var.d())), rv4Var);
        Object D4 = yae.D(Integer.valueOf(((int) (h2aVar.j() >> 32)) - (r13Var.X0(zbe.n(rh8Var, tc6Var2)) + r13Var.X0(zbe.o(rh8Var, tc6Var2)))), rv4Var);
        WeakHashMap weakHashMap = yjd.w;
        ovc ovcVar = h88.n(rv4Var).l;
        boolean f = rv4Var.f(ovcVar) | rv4Var.e(h2aVar.j()) | rv4Var.f(r13Var) | rv4Var.d(tc6Var2.ordinal());
        Object P5 = rv4Var.P();
        if (!f && P5 != obj9) {
            obj = obj9;
            obj2 = D;
        } else {
            float a2 = ovcVar.a(r13Var);
            obj = obj9;
            float j = ((int) (h2aVar.j() >> 32)) - ovcVar.b(r13Var, tc6Var2);
            float j2 = ((int) (h2aVar.j() & 4294967295L)) - ovcVar.c(r13Var);
            obj2 = D;
            P5 = npe.l((Float.floatToRawIntBits(ovcVar.d(r13Var, tc6Var2)) << 32) | (Float.floatToRawIntBits(a2) & 4294967295L), (Float.floatToRawIntBits(j) << 32) | (Float.floatToRawIntBits(j2) & 4294967295L));
            rv4Var.o0(P5);
        }
        Object obj10 = (rk9) P5;
        Object obj11 = obj2;
        Object[] objArr2 = {cybVar.d(), new zy5(h2aVar.j()), Float.valueOf(((Number) D3.getValue()).floatValue()), Float.valueOf(((Number) D2.getValue()).floatValue())};
        boolean f2 = rv4Var.f(D4) | rv4Var.f(h2aVar) | rv4Var.f(kobVar) | rv4Var.f(D2) | rv4Var.f(D3);
        Object P6 = rv4Var.P();
        Object obj12 = obj;
        if (!f2 && P6 != obj12) {
            obj5 = P6;
            kobVar2 = kobVar;
            obj3 = D4;
            aw7Var = aw7Var4;
            obj4 = obj11;
        } else {
            obj3 = D4;
            aw7Var = aw7Var4;
            obj4 = obj11;
            Object ss6Var = new ss6(cybVar, h2aVar, kobVar, obj3, D2, D3, null, 2);
            kobVar2 = kobVar;
            rv4Var.o0(ss6Var);
            obj5 = ss6Var;
        }
        yte.j(objArr2, (lu4) obj5, rv4Var);
        Object i2 = h2aVar.i();
        aw7 D5 = yae.D(kobVar2, rv4Var);
        rv4Var.e0(-1567585412);
        boolean f3 = rv4Var.f(h2aVar);
        Object P7 = rv4Var.P();
        if (f3 || P7 == obj12) {
            P7 = new y82(h2aVar, 2);
            rv4Var.o0(P7);
        }
        nq7 l = pbe.l(nq7Var, (xt4) P7);
        Object[] objArr3 = {tc6Var2, Boolean.valueOf(z), i2};
        boolean g = rv4Var.g(z) | rv4Var.f(D2) | rv4Var.f(D3) | rv4Var.f(obj3) | rv4Var.f(i2) | rv4Var.f(D5) | rv4Var.f(obj4) | rv4Var.h(s35Var);
        Object P8 = rv4Var.P();
        if (!g && P8 != obj12) {
            kj6Var = i2;
            objArr = objArr3;
            obj6 = obj12;
            obj7 = obj10;
            aw7Var2 = aw7Var6;
            nq7Var2 = l;
            tc6Var = tc6Var2;
            aw7Var3 = aw7Var5;
        } else {
            kj6Var = i2;
            objArr = objArr3;
            obj6 = obj12;
            obj7 = obj10;
            nq7Var2 = l;
            aw7 aw7Var8 = obj3;
            aw7Var2 = aw7Var6;
            tc6Var = tc6Var2;
            aw7Var3 = aw7Var5;
            P8 = new h3c(z, kj6Var, cybVar, s35Var, D2, D3, aw7Var8, D5, obj4, aw7Var, aw7Var3, aw7Var2, aw7Var7);
            obj3 = aw7Var8;
            rv4Var.o0(P8);
        }
        nq7 d = dab.d(nq7Var2, objArr, (PointerInputEventHandler) P8);
        tc6 tc6Var3 = tc6Var;
        Object[] objArr4 = {tc6Var3, rh8Var, cybVar.d(), Boolean.valueOf(z), Integer.valueOf(i)};
        boolean f4 = rv4Var.f(D2) | rv4Var.f(D3) | rv4Var.f(obj3) | rv4Var.f(kj6Var) | rv4Var.f(kobVar) | rv4Var.d(i) | rv4Var.f(mu4Var);
        Object P9 = rv4Var.P();
        Object obj13 = obj6;
        if (!f4 && P9 != obj13) {
            obj8 = P9;
            cybVar2 = cybVar;
        } else {
            cybVar2 = cybVar;
            Object j3cVar = new j3c(cybVar2, kj6Var, kobVar, D2, D3, obj3, i, mu4Var);
            rv4Var.o0(j3cVar);
            obj8 = j3cVar;
        }
        nq7 d2 = dab.d(d, objArr4, (PointerInputEventHandler) obj8);
        Object obj14 = obj7;
        Object[] objArr5 = {tc6Var3, cybVar2.d(), h2aVar, obj14};
        boolean f5 = rv4Var.f(obj14) | rv4Var.f(h2aVar);
        Object P10 = rv4Var.P();
        if (f5 || P10 == obj13) {
            P10 = new d1c(1, cybVar2, obj14, h2aVar);
            rv4Var.o0(P10);
        }
        nq7 d3 = dab.d(d2, objArr5, (PointerInputEventHandler) P10);
        if (cybVar2.d() != p7a.a && ((Boolean) aw7Var2.getValue()).booleanValue() && ((Boolean) cybVar2.f.getValue()).booleanValue()) {
            rv4Var.e0(2023006186);
            Object P11 = rv4Var.P();
            if (P11 == obj13) {
                P11 = new g0c(aw7Var3, 6);
                rv4Var.o0(P11);
            }
            xt4 xt4Var = (xt4) P11;
            Object P12 = rv4Var.P();
            if (P12 == obj13) {
                P12 = new g0c(aw7Var3, 7);
                rv4Var.o0(P12);
            }
            d3 = kxe.o(d3, xt4Var, (xt4) P12, ote.a(120.0f, 60.0f));
            rv4Var.q(false);
        } else {
            rv4Var.e0(2023381069);
            rv4Var.q(false);
        }
        rv4Var.q(false);
        return d3;
    }
}
