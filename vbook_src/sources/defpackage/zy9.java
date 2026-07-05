package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zy9  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zy9 implements lu4 {
    public final /* synthetic */ int a;

    public /* synthetic */ zy9(int i) {
        this.a = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        ts tsVar;
        Object a;
        Integer num;
        Long l;
        String str;
        Integer num2;
        Long l2;
        String str2;
        f6a f6aVar;
        oq9 oq9Var;
        f6a f6aVar2;
        f6a f6aVar3;
        f6a f6aVar4;
        oq9 oq9Var2;
        f6a f6aVar5;
        f6a f6aVar6;
        boolean z = false;
        boolean z2 = false;
        Boolean bool = null;
        switch (this.a) {
            case 0:
                rx9 rx9Var = (rx9) obj;
                return Integer.valueOf(((wp4) obj2).a);
            case 1:
                rx9 rx9Var2 = (rx9) obj;
                return Integer.valueOf(((xp4) obj2).a);
            case 2:
                rx9 rx9Var3 = (rx9) obj;
                e4c e4cVar = (e4c) obj2;
                long j = e4c.c;
                if (e4cVar != null) {
                    z = e4c.a(e4cVar.a, j);
                }
                if (z) {
                    return Boolean.FALSE;
                }
                return tl1.m(Float.valueOf(e4c.c(e4cVar.a)), cz9.a(new f4c(e4c.b(e4cVar.a)), cz9.y, rx9Var3));
            case 3:
                dp6 dp6Var = (dp6) obj2;
                return tl1.m(dp6Var.a, cz9.a(dp6Var.b, cz9.j, (rx9) obj));
            case 4:
                rx9 rx9Var4 = (rx9) obj;
                long j2 = ((f4c) obj2).a;
                if (f4c.a(j2, 8589934592L)) {
                    return 0;
                }
                if (f4c.a(j2, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 5:
                rx9 rx9Var5 = (rx9) obj;
                y78 y78Var = (y78) obj2;
                if (y78Var != null) {
                    z2 = y78.d(y78Var.a, 9205357640488583168L);
                }
                if (z2) {
                    return Boolean.FALSE;
                }
                return tl1.m(Float.valueOf(Float.intBitsToFloat((int) (y78Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (y78Var.a & 4294967295L))));
            case 6:
                rx9 rx9Var6 = (rx9) obj;
                os osVar = (os) obj2;
                Object obj3 = osVar.a;
                if (obj3 instanceof pl8) {
                    tsVar = ts.a;
                } else if (obj3 instanceof uva) {
                    tsVar = ts.b;
                } else if (obj3 instanceof f5d) {
                    tsVar = ts.c;
                } else if (obj3 instanceof wyc) {
                    tsVar = ts.d;
                } else if (obj3 instanceof ep6) {
                    tsVar = ts.e;
                } else if (obj3 instanceof dp6) {
                    tsVar = ts.f;
                } else if (obj3 instanceof p3b) {
                    tsVar = ts.C;
                } else {
                    cp8.q();
                    return null;
                }
                switch (tsVar.ordinal()) {
                    case 0:
                        obj3.getClass();
                        a = cz9.a((pl8) obj3, cz9.h, rx9Var6);
                        break;
                    case 1:
                        obj3.getClass();
                        a = cz9.a((uva) obj3, cz9.i, rx9Var6);
                        break;
                    case 2:
                        obj3.getClass();
                        a = cz9.a((f5d) obj3, cz9.d, rx9Var6);
                        break;
                    case 3:
                        obj3.getClass();
                        a = cz9.a((wyc) obj3, cz9.e, rx9Var6);
                        break;
                    case 4:
                        obj3.getClass();
                        a = cz9.a((ep6) obj3, cz9.f, rx9Var6);
                        break;
                    case 5:
                        obj3.getClass();
                        a = cz9.a((dp6) obj3, cz9.g, rx9Var6);
                        break;
                    case 6:
                        obj3.getClass();
                        a = ((p3b) obj3).a;
                        break;
                    default:
                        xk5.o();
                        return null;
                }
                return tl1.m(tsVar, a, Integer.valueOf(osVar.b), Integer.valueOf(osVar.c), osVar.d);
            case 7:
                rx9 rx9Var7 = (rx9) obj;
                List list = ((ov6) obj2).a;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(cz9.a((nv6) list.get(i), cz9.B, rx9Var7));
                }
                return arrayList;
            case 8:
                rx9 rx9Var8 = (rx9) obj;
                return ((nv6) obj2).a.toLanguageTag();
            case 9:
                rx9 rx9Var9 = (rx9) obj;
                so6 so6Var = (so6) obj2;
                return tl1.m(cz9.a(new po6(so6Var.a), cz9.D, rx9Var9), cz9.a(new ro6(so6Var.b), cz9.E, rx9Var9), cz9.a(new qo6(so6Var.c), cz9.F, rx9Var9));
            case 10:
                rx9 rx9Var10 = (rx9) obj;
                return Float.valueOf(((po6) obj2).a);
            case 11:
                rx9 rx9Var11 = (rx9) obj;
                return Integer.valueOf(((ro6) obj2).a);
            case 12:
                rx9 rx9Var12 = (rx9) obj;
                return Integer.valueOf(((qo6) obj2).a);
            case 13:
                rx9 rx9Var13 = (rx9) obj;
                return ((f5d) obj2).a;
            case 14:
                rx9 rx9Var14 = (rx9) obj;
                pl8 pl8Var = (pl8) obj2;
                Object a2 = cz9.a(new tlb(pl8Var.a), cz9.s, rx9Var14);
                Object a3 = cz9.a(new mpb(pl8Var.b), cz9.t, rx9Var14);
                Object a4 = cz9.a(new e4c(pl8Var.c), cz9.x, rx9Var14);
                rub rubVar = pl8Var.d;
                rub rubVar2 = rub.c;
                Object a5 = cz9.a(rubVar, cz9.m, rx9Var14);
                Object a6 = cz9.a(pl8Var.e, kte.d, rx9Var14);
                so6 so6Var2 = pl8Var.f;
                so6 so6Var3 = so6.d;
                return tl1.m(a2, a3, a4, a5, a6, cz9.a(so6Var2, cz9.C, rx9Var14), cz9.a(new mo6(pl8Var.g), kte.f, rx9Var14), cz9.a(new hj5(pl8Var.h), cz9.u, rx9Var14), cz9.a(pl8Var.i, kte.g, rx9Var14));
            case 15:
                rx9 rx9Var15 = (rx9) obj;
                return ((wyc) obj2).a;
            case 16:
                rx9 rx9Var16 = (rx9) obj;
                uva uvaVar = (uva) obj2;
                zl1 zl1Var = new zl1(uvaVar.a.a());
                bz9 bz9Var = cz9.r;
                Object a7 = cz9.a(zl1Var, bz9Var, rx9Var16);
                e4c e4cVar2 = new e4c(uvaVar.b);
                bz9 bz9Var2 = cz9.x;
                Object a8 = cz9.a(e4cVar2, bz9Var2, rx9Var16);
                dq4 dq4Var = uvaVar.c;
                dq4 dq4Var2 = dq4.b;
                Object a9 = cz9.a(dq4Var, cz9.n, rx9Var16);
                Object a10 = cz9.a(uvaVar.d, cz9.v, rx9Var16);
                Object a11 = cz9.a(uvaVar.e, cz9.w, rx9Var16);
                String str3 = uvaVar.g;
                Object a12 = cz9.a(new e4c(uvaVar.h), bz9Var2, rx9Var16);
                Object a13 = cz9.a(uvaVar.i, cz9.o, rx9Var16);
                Object a14 = cz9.a(uvaVar.j, cz9.l, rx9Var16);
                ov6 ov6Var = uvaVar.k;
                ov6 ov6Var2 = ov6.c;
                Object a15 = cz9.a(ov6Var, cz9.A, rx9Var16);
                Object a16 = cz9.a(new zl1(uvaVar.l), bz9Var, rx9Var16);
                Object a17 = cz9.a(uvaVar.m, cz9.k, rx9Var16);
                nea neaVar = uvaVar.n;
                nea neaVar2 = nea.d;
                return tl1.m(a7, a8, a9, a10, a11, -1, str3, a12, a13, a14, a15, a16, a17, cz9.a(neaVar, cz9.q, rx9Var16));
            case 17:
                rx9 rx9Var17 = (rx9) obj;
                lvb lvbVar = (lvb) obj2;
                uva uvaVar2 = lvbVar.a;
                yy9 yy9Var = cz9.i;
                return tl1.m(cz9.a(uvaVar2, yy9Var, rx9Var17), cz9.a(lvbVar.b, yy9Var, rx9Var17), cz9.a(lvbVar.c, yy9Var, rx9Var17), cz9.a(lvbVar.d, yy9Var, rx9Var17));
            case 18:
                ox8 ox8Var = (ox8) obj2;
                Boolean valueOf = Boolean.valueOf(ox8Var.a);
                yy9 yy9Var2 = cz9.a;
                return tl1.m(valueOf, cz9.a(new ur3(ox8Var.b), kte.e, (rx9) obj));
            case 19:
                rx9 rx9Var18 = (rx9) obj;
                return Integer.valueOf(((ur3) obj2).a);
            case 20:
                rx9 rx9Var19 = (rx9) obj;
                return Integer.valueOf(((mo6) obj2).a);
            case 21:
                dwb dwbVar = (dwb) obj2;
                return tl1.m(cz9.a(new cwb(dwbVar.a), kte.h, (rx9) obj), Boolean.valueOf(dwbVar.b));
            case 22:
                rx9 rx9Var20 = (rx9) obj;
                return Integer.valueOf(((cwb) obj2).a);
            case 23:
                rx9 rx9Var21 = (rx9) obj;
                return Integer.valueOf(((k2a) obj2).a.h());
            case 24:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                g6a d = ((cu7) obj).d();
                if (d == null) {
                    return null;
                }
                if (booleanValue) {
                    return new g6a(d.b, d.a, true);
                }
                return d;
            case 25:
                rx9 rx9Var22 = (rx9) obj;
                return Long.valueOf(((n7a) obj2).d.get());
            case 26:
                rx9 rx9Var23 = (rx9) obj;
                q7a q7aVar = (q7a) obj2;
                List list2 = (List) q7aVar.c.getValue();
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(ps.e.a.invoke(rx9Var23, (ps) list2.get(i2)));
                }
                g6a a18 = q7aVar.a();
                if (a18 != null && (f6aVar6 = a18.a) != null) {
                    num = Integer.valueOf(f6aVar6.b);
                } else {
                    num = null;
                }
                g6a a19 = q7aVar.a();
                if (a19 != null && (f6aVar5 = a19.a) != null) {
                    l = Long.valueOf(f6aVar5.c);
                } else {
                    l = null;
                }
                g6a a20 = q7aVar.a();
                if (a20 != null && (f6aVar4 = a20.a) != null && (oq9Var2 = f6aVar4.a) != null) {
                    str = oq9Var2.name();
                } else {
                    str = null;
                }
                g6a a21 = q7aVar.a();
                if (a21 != null && (f6aVar3 = a21.b) != null) {
                    num2 = Integer.valueOf(f6aVar3.b);
                } else {
                    num2 = null;
                }
                g6a a22 = q7aVar.a();
                if (a22 != null && (f6aVar2 = a22.b) != null) {
                    l2 = Long.valueOf(f6aVar2.c);
                } else {
                    l2 = null;
                }
                g6a a23 = q7aVar.a();
                if (a23 != null && (f6aVar = a23.b) != null && (oq9Var = f6aVar.a) != null) {
                    str2 = oq9Var.name();
                } else {
                    str2 = null;
                }
                g6a a24 = q7aVar.a();
                if (a24 != null) {
                    bool = Boolean.valueOf(a24.c);
                }
                return tl1.B(arrayList2, num, l, str, num2, l2, str2, bool);
            case 27:
                gi1 gi1Var = (gi1) obj;
                List list3 = (List) obj2;
                gi1Var.getClass();
                list3.getClass();
                ArrayList k = sze.k(baa.a, list3, true);
                k.getClass();
                return sze.h(gi1Var, k, new k71(9, list3));
            case 28:
                gi1 gi1Var2 = (gi1) obj;
                List list4 = (List) obj2;
                gi1Var2.getClass();
                list4.getClass();
                ArrayList k2 = sze.k(baa.a, list4, true);
                k2.getClass();
                s76 h = sze.h(gi1Var2, k2, new k71(10, list4));
                if (h == null) {
                    return null;
                }
                return wq9.H(h);
            default:
                y78 y78Var2 = (y78) obj2;
                ((ak3) obj).getClass();
                return pvc.a;
        }
    }
}
