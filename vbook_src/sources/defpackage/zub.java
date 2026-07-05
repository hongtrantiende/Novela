package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zub  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class zub implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zub(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        char c;
        boolean z;
        pvc pvcVar;
        Set<Map.Entry> entrySet;
        int i = this.a;
        boolean z2 = true;
        pvc pvcVar2 = pvc.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                lvb lvbVar = (lvb) obj2;
                os osVar = (os) obj;
                ls lsVar = (ls) osVar.a;
                if (lsVar instanceof ep6) {
                    ep6 ep6Var = (ep6) lsVar;
                    if (ep6Var.b == null) {
                        return os.a(osVar, new ep6(ep6Var.a, lvbVar, ep6Var.c), 0, 0, 14);
                    }
                }
                if (lsVar instanceof dp6) {
                    dp6 dp6Var = (dp6) lsVar;
                    if (dp6Var.b == null) {
                        return os.a(osVar, new dp6(dp6Var.a, lvbVar, dp6Var.c), 0, 0, 14);
                    }
                    return osVar;
                }
                return osVar;
            case 1:
                y78 y78Var = (y78) obj;
                ((c5d) obj2).d();
                return pvcVar2;
            case 2:
                c4c c4cVar = (c4c) obj2;
                mnc mncVar = (mnc) obj;
                mncVar.getClass();
                String str = mncVar.a;
                str.getClass();
                hk1 a = jdd.a(c4cVar);
                sw2 sw2Var = ab3.a;
                c4cVar.f(a, ru2.c, new koa(c4cVar, str, null, 28));
                return pvcVar2;
            case 3:
                s8c s8cVar = (s8c) obj2;
                ak3 ak3Var = (ak3) obj;
                ak3Var.getClass();
                char c2 = ' ';
                float intBitsToFloat = Float.intBitsToFloat((int) (ak3Var.b() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L));
                float f = nae.e;
                if (intBitsToFloat > nae.e && intBitsToFloat2 > nae.e) {
                    long j = s8cVar.b.a;
                    int i2 = az5.c;
                    float f2 = (int) (j >> 32);
                    float f3 = (int) (j & 4294967295L);
                    if (f2 > nae.e && f3 > nae.e) {
                        float f4 = intBitsToFloat / f2;
                        float f5 = intBitsToFloat2 / f3;
                        for (s7c s7cVar : (List) s8cVar.g.getValue()) {
                            vy5 vy5Var = s7cVar.b;
                            float f6 = vy5Var.a * f4;
                            float f7 = vy5Var.b * f5;
                            float f8 = vy5Var.c * f4;
                            float f9 = vy5Var.d * f5;
                            float f10 = f8 - f6;
                            if (f10 < f) {
                                f10 = f;
                            }
                            float f11 = f9 - f7;
                            if (f11 < f) {
                                f11 = f;
                            }
                            if (f10 <= f || f11 <= f) {
                                c = c2;
                                z = z2;
                                pvcVar = pvcVar2;
                            } else {
                                int floor = (int) Math.floor(f6);
                                int floor2 = (int) Math.floor(f7);
                                int ceil = (int) Math.ceil(f9);
                                nl5 nl5Var = s7cVar.c;
                                c = c2;
                                long height = (((jj) s7cVar.c).a.getHeight() & 4294967295L) | (((jj) nl5Var).a.getWidth() << c2);
                                pvcVar = pvcVar2;
                                long j2 = (floor2 & 4294967295L) | (floor << c);
                                int ceil2 = ((int) Math.ceil(f8)) - floor;
                                if (ceil2 < 1) {
                                    ceil2 = 1;
                                }
                                int i3 = ceil - floor2;
                                if (i3 < 1) {
                                    i3 = 1;
                                }
                                z = true;
                                ak3.g1(ak3Var, nl5Var, height, j2, (ceil2 << c) | (i3 & 4294967295L), nae.e, null, 2, 480);
                            }
                            c2 = c;
                            pvcVar2 = pvcVar;
                            z2 = z;
                            f = nae.e;
                        }
                    }
                }
                return pvcVar2;
            case 4:
                gbc gbcVar = (gbc) obj2;
                List list = (List) obj;
                list.getClass();
                hk1 a2 = jdd.a(gbcVar);
                sw2 sw2Var2 = ab3.a;
                gbcVar.f(a2, ru2.c, new q4c(gbcVar, list, null, 10));
                return pvcVar2;
            case 5:
                h81 h81Var = (h81) obj2;
                String str2 = (String) obj;
                str2.getClass();
                h81Var.getClass();
                String str3 = h81Var.a.e().b;
                if (str3 != null) {
                    h81Var.d.b(str3, str2);
                }
                return pvcVar2;
            case 6:
                noc nocVar = (noc) obj2;
                hi1 hi1Var = (hi1) obj;
                hi1Var.getClass();
                hi1Var.a("first", nocVar.a.e());
                hi1Var.a("second", nocVar.b.e());
                hi1Var.a("third", nocVar.c.e());
                return pvcVar2;
            case 7:
                csc cscVar = (csc) obj2;
                do6 do6Var = (do6) obj;
                do6Var.getClass();
                cscVar.k();
                return new rf0(do6Var, cscVar, 18);
            case 8:
                g0d g0dVar = (g0d) obj2;
                String str4 = (String) obj;
                str4.getClass();
                g0dVar.e = str4;
                g0dVar.f = 1;
                g0dVar.E.clear();
                g0dVar.j();
                return pvcVar2;
            case 9:
                ubd ubdVar = (ubd) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                hk1 a3 = jdd.a(ubdVar);
                sw2 sw2Var3 = ab3.a;
                ubdVar.f(a3, ru2.c, new gx(ubdVar, booleanValue, (m42) null, 13));
                return pvcVar2;
            case 10:
                Long l = (Long) obj;
                l.longValue();
                ((ora) obj2).remove(l);
                return pvcVar2;
            case 11:
                pm1 pm1Var = (pm1) obj;
                pm1Var.getClass();
                if (((om3) obj2).d()) {
                    long j3 = zl1.b;
                    long j4 = zl1.e;
                    return pm1.a(pm1Var, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j3, j4, j3, j4, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -122881, 65535);
                }
                long j5 = zl1.e;
                long j6 = zl1.b;
                return pm1.a(pm1Var, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j5, j6, j5, j6, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -122881, 65535);
            case 12:
                xdd a4 = ((ydd) obj2).a();
                wdd wddVar = (wdd) a4.b.g(obj);
                if (wddVar != null) {
                    wddVar.d = true;
                    if (wddVar.c <= 0) {
                        a4.e(obj);
                    }
                }
                return pvcVar2;
            case 13:
                gh5 gh5Var = (gh5) obj;
                h40 h40Var = hh5.a;
                gh5Var.getClass();
                o45 o45Var = gh5Var.c;
                d56 B = oc2.B((k46) obj2);
                if (B != null && (entrySet = B.a.entrySet()) != null) {
                    for (Map.Entry entry : entrySet) {
                        String str5 = (String) entry.getKey();
                        String x = oc2.x((k46) entry.getValue());
                        if (x == null) {
                            x = "";
                        }
                        o45Var.h(str5, x);
                    }
                }
                return pvcVar2;
            case 14:
                nqd nqdVar = (nqd) obj2;
                do6 do6Var2 = (do6) obj;
                do6Var2.getClass();
                nqdVar.k();
                return new rf0(do6Var2, nqdVar, 19);
            case 15:
                erd erdVar = (erd) obj2;
                do6 do6Var3 = (do6) obj;
                do6Var3.getClass();
                erdVar.getClass();
                erdVar.V = by5.a.k().b();
                return new rf0(do6Var3, erdVar, 20);
            case 16:
                z09 z09Var = (z09) obj;
                ((kbd) obj2).invoke(z09Var, new y78(ie2.z(z09Var, false)));
                z09Var.a();
                return pvcVar2;
            case 17:
                atd atdVar = (atd) obj2;
                z09 z09Var2 = (z09) obj;
                w26 w26Var = atdVar.p;
                if (w26Var != null) {
                    w26Var.cancel(null);
                }
                atdVar.q.setValue(Boolean.TRUE);
                atdVar.g.a(z09Var2.b, z09Var2.c);
                return pvcVar2;
            default:
                List list2 = (List) obj;
                list2.getClass();
                return new atd((pq2) obj2, ((Number) list2.get(2)).floatValue(), ((Number) list2.get(0)).floatValue(), ((Number) list2.get(1)).floatValue());
        }
    }
}
