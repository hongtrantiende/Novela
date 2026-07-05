package defpackage;

import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cq2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cq2 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cq2(un3 un3Var, s6f s6fVar) {
        this.a = 18;
        this.b = un3Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        String str;
        String concat;
        int length;
        int i;
        String str2;
        nu3 nu3Var;
        List list;
        int i2;
        int i3;
        long c;
        long c2;
        long j;
        int i4;
        int i5;
        long c3;
        Object value;
        List list2;
        int i6 = this.a;
        boolean z = true;
        pvc pvcVar = pvc.a;
        Object obj2 = this.b;
        switch (i6) {
            case 0:
                nm nmVar = (nm) obj;
                nmVar.getClass();
                nmVar.g(0, ((dq2) obj2).c);
                return pvcVar;
            case 1:
                nm nmVar2 = (nm) obj;
                nmVar2.getClass();
                nmVar2.g(0, ((dq2) obj2).c);
                return pvcVar;
            case 2:
                ((Boolean) obj).getClass();
                ((ws2) obj2).a();
                return pvcVar;
            case 3:
                float floatValue = ((Float) obj).floatValue();
                cgc e = ((qma) obj2).k.e();
                e.b(e.d.h() + floatValue);
                return pvcVar;
            case 4:
                Throwable th = (Throwable) obj;
                ((y26) obj2).o0();
                return pvcVar;
            case 5:
                float floatValue2 = ((Float) obj).floatValue();
                cgc e2 = ((crc) obj2).o.e();
                e2.b(e2.d.h() + floatValue2);
                return pvcVar;
            case 6:
                i53 i53Var = (i53) obj2;
                do6 do6Var = (do6) obj;
                do6Var.getClass();
                i53Var.k();
                return new rf0(do6Var, i53Var, 4);
            case 7:
                u73 u73Var = (u73) obj2;
                do6 do6Var2 = (do6) obj;
                do6Var2.getClass();
                u73Var.k();
                return new rf0(do6Var2, u73Var, 5);
            case 8:
                m83 m83Var = (m83) obj2;
                do6 do6Var3 = (do6) obj;
                do6Var3.getClass();
                m83Var.k();
                return new rf0(do6Var3, m83Var, 6);
            case 9:
                l93 l93Var = (l93) obj2;
                String str3 = (String) obj;
                str3.getClass();
                hk1 a = jdd.a(l93Var);
                sw2 sw2Var = ab3.a;
                l93Var.f(a, ru2.c, new d53((fdd) l93Var, (Object) str3, (m42) null, 2));
                return pvcVar;
            case 10:
                h93 h93Var = (h93) obj2;
                do6 do6Var4 = (do6) obj;
                do6Var4.getClass();
                h93Var.k();
                return new rf0(do6Var4, h93Var, 7);
            case 11:
                br6 br6Var = (br6) obj2;
                do6 do6Var5 = (do6) obj;
                do6Var5.getClass();
                br6Var.k();
                return new rf0(do6Var5, br6Var, 8);
            case 12:
                ma3 ma3Var = (ma3) obj2;
                int intValue = ((Integer) obj).intValue();
                hk1 a2 = jdd.a(ma3Var);
                sw2 sw2Var2 = ab3.a;
                ma3Var.f(a2, ru2.c, new rr0(ma3Var, intValue, (m42) null, 1));
                return pvcVar;
            case 13:
                IOException iOException = (IOException) obj;
                ((ra3) obj2).H = true;
                return pvcVar;
            case 14:
                kc3 kc3Var = (kc3) obj2;
                do6 do6Var6 = (do6) obj;
                do6Var6.getClass();
                kc3Var.k();
                return new rf0(do6Var6, kc3Var, 9);
            case 15:
                Boolean bool = (Boolean) ((jh3) obj2).M.invoke((bh3) obj);
                bool.getClass();
                return bool;
            case 16:
                z09 z09Var = (z09) obj;
                ((da0) obj2).invoke(z09Var, Float.valueOf(Float.intBitsToFloat((int) (ie2.z(z09Var, false) >> 32))));
                z09Var.a();
                return pvcVar;
            case 17:
                ni3 ni3Var = (ni3) obj2;
                ax4 ax4Var = (ax4) obj;
                if (ax4Var instanceof hj3) {
                    z = ((Boolean) ni3Var.invoke(ax4Var)).booleanValue();
                }
                return Boolean.valueOf(z);
            case 18:
                un3 un3Var = (un3) obj;
                if (((un3) obj2) == un3Var) {
                    str = " > ";
                } else {
                    str = "   ";
                }
                if (un3Var instanceof mq1) {
                    mq1 mq1Var = (mq1) un3Var;
                    length = mq1Var.a.b.length();
                    i = mq1Var.b;
                    str2 = "CommitTextCommand(text.length=";
                } else if (un3Var instanceof zba) {
                    zba zbaVar = (zba) un3Var;
                    length = zbaVar.a.b.length();
                    i = zbaVar.b;
                    str2 = "SetComposingTextCommand(text.length=";
                } else {
                    if (un3Var instanceof yba) {
                        concat = ((yba) un3Var).toString();
                    } else if (un3Var instanceof i13) {
                        concat = ((i13) un3Var).toString();
                    } else if (un3Var instanceof j13) {
                        concat = ((j13) un3Var).toString();
                    } else if (un3Var instanceof aca) {
                        concat = ((aca) un3Var).toString();
                    } else if (un3Var instanceof kf4) {
                        concat = "FinishComposingTextCommand()";
                    } else if (un3Var instanceof a13) {
                        concat = "DeleteAllCommand()";
                    } else {
                        String g = cm9.a(un3Var.getClass()).g();
                        if (g == null) {
                            g = "{anonymous EditCommand}";
                        }
                        concat = "Unknown EditCommand: ".concat(g);
                    }
                    return str.concat(concat);
                }
                concat = hl5.i(length, i, str2, ", newCursorPosition=", ")");
                return str.concat(concat);
            case 19:
                kw5 kw5Var = (kw5) obj2;
                Object obj3 = ((LinkedHashMap) kw5Var.b).get(cm9.a(obj.getClass()));
                if (obj3 instanceof nu3) {
                    nu3Var = (nu3) obj3;
                } else {
                    nu3Var = null;
                }
                ((LinkedHashMap) kw5Var.c).get(obj);
                if (nu3Var != null) {
                    return new jz7(obj, nu3Var.b.invoke(obj), (Map) nu3Var.c.invoke(obj), nu3Var.d);
                }
                vs.k(rs8.i(obj, "Unknown screen "));
                return null;
            case 20:
                bw3 bw3Var = (bw3) obj2;
                do6 do6Var7 = (do6) obj;
                do6Var7.getClass();
                bw3Var.k();
                return new rf0(do6Var7, bw3Var, 10);
            case 21:
                Throwable th2 = (Throwable) obj;
                ((x04) obj2).close();
                return pvcVar;
            case 22:
                int intValue2 = ((Integer) obj).intValue();
                ArrayList arrayList = ((t14) obj2).f;
                String str4 = ((r14) arrayList.get(intValue2)).e;
                if (str4.length() == 0) {
                    return ((r14) arrayList.get(intValue2)).a;
                }
                return str4;
            case 23:
                ak3 ak3Var = (ak3) obj;
                ak3Var.getClass();
                List list3 = ((e34) obj2).b;
                int size = list3.size();
                int i7 = 0;
                while (i7 < size) {
                    qf2 qf2Var = (qf2) list3.get(i7);
                    switch (qf2Var.a) {
                        case 0:
                            list = list3;
                            i2 = size;
                            i3 = i7;
                            rf2 rf2Var = (rf2) qf2Var.d;
                            List list4 = qf2Var.b;
                            fvb fvbVar = qf2Var.c;
                            ak3Var.getClass();
                            long j2 = rf2Var.a;
                            yj yjVar = rf2Var.d;
                            s4b s4bVar = new s4b(ak3Var.k1(j2), nae.e, 1, 1, new zj(new DashPathEffect(rf2Var.c, nae.e)), 2);
                            int size2 = list4.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                os osVar = (os) list4.get(i8);
                                List b = d34.b(rf2Var, fvbVar, osVar.b, osVar.c);
                                zl1 f = zve.f((String) osVar.a);
                                if (f != null) {
                                    c = f.a;
                                } else {
                                    c = fvbVar.a.b.c();
                                }
                                int size3 = b.size();
                                long j3 = c;
                                int i9 = 0;
                                while (i9 < size3) {
                                    rk9 rk9Var = (rk9) b.get(i9);
                                    yjVar.m();
                                    List list5 = list4;
                                    float k1 = (ak3Var.k1(j2) / 2.0f) + rk9Var.a;
                                    long j4 = j2;
                                    float k12 = ak3Var.k1(rf2Var.b) + rk9Var.d;
                                    yjVar.i(k1, k12);
                                    yjVar.h(rk9Var.c - (ak3Var.k1(j2) / 2.0f), k12);
                                    ak3.t1(ak3Var, yjVar, j3, nae.e, s4bVar, 52);
                                    i9++;
                                    b = b;
                                    list4 = list5;
                                    fvbVar = fvbVar;
                                    j2 = j4;
                                }
                            }
                            break;
                        case 1:
                            list = list3;
                            i2 = size;
                            i3 = i7;
                            ixa ixaVar = (ixa) qf2Var.d;
                            List list6 = qf2Var.b;
                            fvb fvbVar2 = qf2Var.c;
                            ak3Var.getClass();
                            long j5 = ixaVar.a;
                            yj yjVar2 = ixaVar.f;
                            float k13 = ak3Var.k1(j5);
                            long j6 = ixaVar.b;
                            s4b s4bVar2 = new s4b(k13, nae.e, 1, 1, new zj(new CornerPathEffect(ak3Var.k1(j6))), 2);
                            int size4 = list6.size();
                            int i10 = 0;
                            while (i10 < size4) {
                                os osVar2 = (os) list6.get(i10);
                                List list7 = list6;
                                List b2 = d34.b(ixaVar, fvbVar2, osVar2.b, osVar2.c);
                                zl1 f2 = zve.f((String) osVar2.a);
                                if (f2 != null) {
                                    c2 = f2.a;
                                } else {
                                    c2 = fvbVar2.a.b.c();
                                }
                                long j7 = c2;
                                int size5 = b2.size();
                                int i11 = 0;
                                while (i11 < size5) {
                                    List list8 = b2;
                                    rk9 rk9Var2 = (rk9) b2.get(i11);
                                    yjVar2.m();
                                    fvb fvbVar3 = fvbVar2;
                                    float k14 = (ak3Var.k1(j5) / 2.0f) + rk9Var2.a;
                                    float k15 = rk9Var2.c - (ak3Var.k1(j5) / 2.0f);
                                    float k16 = ak3Var.k1(ixaVar.d) + rk9Var2.d;
                                    float k17 = ak3Var.k1(j6) / 10.0f;
                                    int ceil = (int) Math.ceil((k15 - k14) / k17);
                                    int i12 = ceil + 1;
                                    long j8 = j5;
                                    ArrayList arrayList2 = new ArrayList(ceil + 2);
                                    if (i12 >= 0) {
                                        float f3 = k14;
                                        int i13 = 0;
                                        while (true) {
                                            j = j6;
                                            float k18 = (ak3Var.k1(ixaVar.c) * ((float) Math.sin((((Number) ixaVar.e.a.getValue()).floatValue() * 6.2831855f) + (((f3 - k14) / ak3Var.k1(j6)) * 6.2831855f)))) + k16;
                                            if (i13 == 0) {
                                                yjVar2.i(f3, k18);
                                            } else {
                                                yjVar2.h(f3, k18);
                                            }
                                            f3 += k17;
                                            if (f3 > k15) {
                                                f3 = k15;
                                            }
                                            arrayList2.add(pvcVar);
                                            if (i13 != i12) {
                                                i13++;
                                                j6 = j;
                                            }
                                        }
                                    } else {
                                        j = j6;
                                    }
                                    int i14 = size5;
                                    ak3.t1(ak3Var, yjVar2, j7, nae.e, s4bVar2, 52);
                                    size5 = i14;
                                    fvbVar2 = fvbVar3;
                                    j6 = j;
                                    i10 = i10;
                                    i11++;
                                    b2 = list8;
                                    j5 = j8;
                                }
                                i10++;
                                list6 = list7;
                            }
                            break;
                        default:
                            fvc fvcVar = (fvc) qf2Var.d;
                            List list9 = qf2Var.b;
                            fvb fvbVar4 = qf2Var.c;
                            ak3Var.getClass();
                            long j9 = fvcVar.a;
                            yj yjVar3 = fvcVar.c;
                            s4b s4bVar3 = new s4b(ak3Var.k1(j9), nae.e, 1, 1, null, 18);
                            int size6 = list9.size();
                            int i15 = 0;
                            while (i15 < size6) {
                                os osVar3 = (os) list9.get(i15);
                                List list10 = list3;
                                List b3 = d34.b(fvcVar, fvbVar4, osVar3.b, osVar3.c);
                                zl1 f4 = zve.f((String) osVar3.a);
                                if (f4 != null) {
                                    i4 = size;
                                    i5 = i7;
                                    c3 = f4.a;
                                } else {
                                    i4 = size;
                                    i5 = i7;
                                    c3 = fvbVar4.a.b.c();
                                }
                                int size7 = b3.size();
                                s4b s4bVar4 = s4bVar3;
                                int i16 = 0;
                                while (i16 < size7) {
                                    List list11 = b3;
                                    rk9 rk9Var3 = (rk9) b3.get(i16);
                                    yjVar3.m();
                                    long j10 = c3;
                                    float k19 = (ak3Var.k1(j9) / 2.0f) + rk9Var3.a;
                                    float k110 = rk9Var3.c - (ak3Var.k1(j9) / 2.0f);
                                    int i17 = size7;
                                    float k111 = ak3Var.k1(fvcVar.b) + rk9Var3.d;
                                    yjVar3.i(k19, k111);
                                    yjVar3.h(k110, k111);
                                    int i18 = size6;
                                    s4b s4bVar5 = s4bVar4;
                                    long j11 = j9;
                                    yj yjVar4 = yjVar3;
                                    ak3.t1(ak3Var, yjVar4, j10, nae.e, s4bVar5, 52);
                                    size6 = i18;
                                    yjVar3 = yjVar4;
                                    s4bVar4 = s4bVar5;
                                    fvbVar4 = fvbVar4;
                                    j9 = j11;
                                    i16++;
                                    b3 = list11;
                                    c3 = j10;
                                    size7 = i17;
                                }
                                s4bVar3 = s4bVar4;
                                i15++;
                                i7 = i5;
                                j9 = j9;
                                list3 = list10;
                                size = i4;
                            }
                            list = list3;
                            i2 = size;
                            i3 = i7;
                            break;
                    }
                    i7 = i3 + 1;
                    size = i2;
                    list3 = list;
                }
                return pvcVar;
            case 24:
                String str5 = (String) obj;
                str5.getClass();
                cza czaVar = ((o34) obj2).e;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                        list2 = ((n34) value).b;
                        list2.getClass();
                    } while (!czaVar.l(value, new n34(str5, list2)));
                    return pvcVar;
                }
                return pvcVar;
            case 25:
                da4 da4Var = (da4) obj2;
                do6 do6Var8 = (do6) obj;
                do6Var8.getClass();
                da4Var.k();
                return new rf0(do6Var8, da4Var, 11);
            case 26:
                u82 u82Var = (u82) obj;
                u82Var.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", u82Var);
                return new vaa(((waa) obj2).a.a(null), null, null);
            case 27:
                ((ib3) obj).getClass();
                return new r6((ww1) obj2, 10);
            case 28:
                ((ib3) obj).getClass();
                return new r6((mj4) obj2, 9);
            default:
                gw7 gw7Var = (gw7) obj2;
                lw8 lw8Var = (lw8) obj;
                Object[] objArr = gw7Var.a;
                int i19 = gw7Var.c;
                for (int i20 = 0; i20 < i19; i20++) {
                    ((c37) objArr[i20]).a();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ cq2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
