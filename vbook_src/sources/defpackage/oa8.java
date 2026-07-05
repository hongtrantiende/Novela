package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oa8  reason: default package */
/* loaded from: classes3.dex */
public final class oa8 extends aab implements xt4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ pa8 c;
    public final /* synthetic */ gn8 d;
    public final /* synthetic */ cs9 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oa8(pa8 pa8Var, gn8 gn8Var, cs9 cs9Var, m42 m42Var, int i) {
        super(1, m42Var);
        this.a = i;
        this.c = pa8Var;
        this.d = gn8Var;
        this.e = cs9Var;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        switch (this.a) {
            case 0:
                return new oa8(this.c, this.d, this.e, m42Var, 0);
            case 1:
                return new oa8(this.c, this.d, this.e, m42Var, 1);
            case 2:
                return new oa8(this.c, this.d, this.e, m42Var, 2);
            case 3:
                return new oa8(this.c, this.d, this.e, m42Var, 3);
            case 4:
                return new oa8(this.c, this.d, this.e, m42Var, 4);
            case 5:
                return new oa8(this.c, this.d, this.e, m42Var, 5);
            case 6:
                return new oa8(this.c, this.d, this.e, m42Var, 6);
            case 7:
                return new oa8(this.c, this.d, this.e, m42Var, 7);
            default:
                return new oa8(this.c, this.d, this.e, m42Var, 8);
        }
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m42 m42Var = (m42) obj;
        switch (i) {
            case 0:
                return ((oa8) create(m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((oa8) create(m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((oa8) create(m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((oa8) create(m42Var)).invokeSuspend(pvcVar);
            case 4:
                return ((oa8) create(m42Var)).invokeSuspend(pvcVar);
            case 5:
                return ((oa8) create(m42Var)).invokeSuspend(pvcVar);
            case 6:
                return ((oa8) create(m42Var)).invokeSuspend(pvcVar);
            case 7:
                return ((oa8) create(m42Var)).invokeSuspend(pvcVar);
            default:
                return ((oa8) create(m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        wj9 wj9Var;
        k46 k46Var;
        String x;
        int i = this.a;
        final cs9 cs9Var = this.e;
        final pa8 pa8Var = this.c;
        gn8 gn8Var = this.d;
        n82 n82Var = n82.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    qe4.a.getClass();
                    if (gn8Var.a.exists()) {
                        l0e.z(pa8Var.a.I, new nq3(22, cs9Var, pa8Var, gn8Var));
                    }
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    s46 s46Var = pa8Var.b;
                    gn8 b = sye.b(gn8Var, "setting.json");
                    abf abfVar = qe4.a;
                    abfVar.getClass();
                    if (b.a.exists()) {
                        wj9Var = new wj9(abfVar.A(b));
                        try {
                            d56 B = oc2.B(s46Var.c(zpe.i(wj9Var)));
                            if (B != null && (k46Var = (k46) B.get("tag.list")) != null && (x = oc2.x(k46Var)) != null && x.length() > 0) {
                                l0e.z(pa8Var.a.f, new nq3(23, cs9Var, pa8Var, (List) s46Var.a(new sz(y98.Companion.serializer(), 0), x)));
                            }
                            dxe.r(wj9Var, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    gn8 b2 = sye.b(gn8Var, "bookmarks.json");
                    gn8 b3 = sye.b(gn8Var, "notes.json");
                    qe4.a.getClass();
                    if (b2.a.exists() || b3.a.exists()) {
                        pa8 pa8Var2 = this.c;
                        l0e.z(pa8Var2.a.d, new hq(this.e, pa8Var2, b2, b3, 22));
                    }
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 3:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    gn8 b4 = sye.b(gn8Var, "downloads.json");
                    abf abfVar2 = qe4.a;
                    abfVar2.getClass();
                    if (b4.a.exists()) {
                        wj9Var = new wj9(abfVar2.A(b4));
                        try {
                            s46 s46Var2 = pa8Var.b;
                            s46Var2.getClass();
                            final b9a p = ie2.p(s46Var2, wj9Var, ea8.Companion.serializer());
                            l0e.z(pa8Var.a.F, new xt4() { // from class: la8
                                @Override // defpackage.xt4
                                public final Object invoke(Object obj2) {
                                    int i6 = r4;
                                    int i7 = 0;
                                    pvc pvcVar2 = pvc.a;
                                    Set set = rs3.a;
                                    cs9 cs9Var2 = cs9.a;
                                    b9a<sa8> b9aVar = p;
                                    pa8 pa8Var3 = pa8Var;
                                    cs9 cs9Var3 = cs9Var;
                                    cs9 cs9Var4 = cs9.c;
                                    switch (i6) {
                                        case 0:
                                            ii2 ii2Var = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var.L.b0("general");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List<oo2> c = ii2Var.L.i0("general").c();
                                                ArrayList arrayList = new ArrayList(tl1.s(c, 10));
                                                for (oo2 oo2Var : c) {
                                                    arrayList.add(pa8.b(oo2Var));
                                                }
                                                set = sl1.A0(arrayList);
                                            }
                                            for (sa8 sa8Var : b9aVar) {
                                                oo2 l = fre.l(sa8Var, "general");
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.b(l))) {
                                                    ii2Var.L.m0(l);
                                                }
                                            }
                                            return pvcVar2;
                                        case 1:
                                            ii2 ii2Var2 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var2.F.b0();
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List<en2> c2 = ii2Var2.F.l0().c();
                                                ArrayList arrayList2 = new ArrayList(tl1.s(c2, 10));
                                                for (en2 en2Var : c2) {
                                                    arrayList2.add(en2Var.b);
                                                }
                                                set = sl1.A0(arrayList2);
                                            }
                                            Iterator it = b9aVar.iterator();
                                            while (it.hasNext()) {
                                                ea8 ea8Var = (ea8) it.next();
                                                ea8Var.getClass();
                                                String str = ea8Var.a;
                                                String str2 = ea8Var.b;
                                                String str3 = ea8Var.c;
                                                int i8 = ea8Var.f;
                                                en2 en2Var2 = new en2(str, str, str2, str3, "", 0, i8, ea8Var.e, i8, 0, 4, ea8Var.h);
                                                if (cs9Var3 != cs9Var4 || !set.contains(str)) {
                                                    ii2Var2.F.A0(en2Var2);
                                                }
                                            }
                                            return pvcVar2;
                                        case 2:
                                            ii2 ii2Var3 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var3.V.Z("");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                gk2 gk2Var = ii2Var3.V;
                                                gk2Var.getClass();
                                                fq2 fq2Var = fq2.a;
                                                List<zp2> c3 = new dq2(gk2Var, "", new aq2(gk2Var, 0)).c();
                                                ArrayList arrayList3 = new ArrayList(tl1.s(c3, 10));
                                                for (zp2 zp2Var : c3) {
                                                    arrayList3.add(pa8.d(zp2Var));
                                                }
                                                set = sl1.A0(arrayList3);
                                            }
                                            Iterator it2 = b9aVar.iterator();
                                            while (it2.hasNext()) {
                                                hb8 hb8Var = (hb8) it2.next();
                                                hb8Var.getClass();
                                                String B2 = ube.B();
                                                String str4 = hb8Var.a;
                                                boolean z = hb8Var.b;
                                                yj1 yj1Var = by5.a;
                                                zp2 zp2Var2 = new zp2(0, yj1Var.k().b(), yj1Var.k().b(), B2, "", str4, z);
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.d(zp2Var2))) {
                                                    ii2Var3.V.G0(zp2Var2);
                                                }
                                            }
                                            return pvcVar2;
                                        case 3:
                                            ii2 ii2Var4 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var4.K.c0();
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List<mo2> c4 = ii2Var4.K.h0().c();
                                                ArrayList arrayList4 = new ArrayList(tl1.s(c4, 10));
                                                for (mo2 mo2Var : c4) {
                                                    arrayList4.add(mo2Var.a);
                                                }
                                                set = sl1.A0(arrayList4);
                                            }
                                            Iterator it3 = b9aVar.iterator();
                                            while (it3.hasNext()) {
                                                ka8 ka8Var = (ka8) it3.next();
                                                if (ka8Var.b.length() > 0) {
                                                    String valueOf = String.valueOf(ka8Var.a);
                                                    mo2 mo2Var2 = new mo2(valueOf, ka8Var.b, ka8Var.d, ka8Var.c, by5.a.k().b());
                                                    if (cs9Var3 != cs9Var4 || !set.contains(valueOf)) {
                                                        ii2Var4.K.l0(mo2Var2);
                                                    }
                                                }
                                            }
                                            return pvcVar2;
                                        case 4:
                                            ii2 ii2Var5 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var5.Q.h0(1, "general");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List c5 = ii2Var5.Q.m0("general").c();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (Object obj3 : c5) {
                                                    if (((cp2) obj3).e == 1) {
                                                        arrayList5.add(obj3);
                                                    }
                                                }
                                                ArrayList arrayList6 = new ArrayList(tl1.s(arrayList5, 10));
                                                int size = arrayList5.size();
                                                while (i7 < size) {
                                                    Object obj4 = arrayList5.get(i7);
                                                    i7++;
                                                    arrayList6.add(pa8.c((cp2) obj4));
                                                }
                                                set = sl1.A0(arrayList6);
                                            }
                                            Iterator it4 = b9aVar.iterator();
                                            while (it4.hasNext()) {
                                                cp2 u = obe.u((bb8) it4.next(), "general");
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.c(u))) {
                                                    ii2Var5.Q.E0(u);
                                                }
                                            }
                                            return pvcVar2;
                                        default:
                                            ii2 ii2Var6 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var6.Q.h0(0, "general");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List c6 = ii2Var6.Q.m0("general").c();
                                                ArrayList arrayList7 = new ArrayList();
                                                for (Object obj5 : c6) {
                                                    if (((cp2) obj5).e == 0) {
                                                        arrayList7.add(obj5);
                                                    }
                                                }
                                                ArrayList arrayList8 = new ArrayList(tl1.s(arrayList7, 10));
                                                int size2 = arrayList7.size();
                                                while (i7 < size2) {
                                                    Object obj6 = arrayList7.get(i7);
                                                    i7++;
                                                    arrayList8.add(pa8.c((cp2) obj6));
                                                }
                                                set = sl1.A0(arrayList8);
                                            }
                                            Iterator it5 = b9aVar.iterator();
                                            while (it5.hasNext()) {
                                                cp2 v = obe.v((eb8) it5.next(), "general");
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.c(v))) {
                                                    ii2Var6.Q.E0(v);
                                                }
                                            }
                                            return pvcVar2;
                                    }
                                }
                            });
                            dxe.r(wj9Var, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 4:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    gn8 b5 = sye.b(gn8Var, "names.json");
                    abf abfVar3 = qe4.a;
                    abfVar3.getClass();
                    if (b5.a.exists()) {
                        wj9Var = new wj9(abfVar3.A(b5));
                        try {
                            s46 s46Var3 = pa8Var.b;
                            s46Var3.getClass();
                            final b9a p2 = ie2.p(s46Var3, wj9Var, sa8.Companion.serializer());
                            l0e.z(pa8Var.a.L, new xt4() { // from class: la8
                                @Override // defpackage.xt4
                                public final Object invoke(Object obj2) {
                                    int i62 = r4;
                                    int i7 = 0;
                                    pvc pvcVar2 = pvc.a;
                                    Set set = rs3.a;
                                    cs9 cs9Var2 = cs9.a;
                                    b9a<sa8> b9aVar = p2;
                                    pa8 pa8Var3 = pa8Var;
                                    cs9 cs9Var3 = cs9Var;
                                    cs9 cs9Var4 = cs9.c;
                                    switch (i62) {
                                        case 0:
                                            ii2 ii2Var = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var.L.b0("general");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List<oo2> c = ii2Var.L.i0("general").c();
                                                ArrayList arrayList = new ArrayList(tl1.s(c, 10));
                                                for (oo2 oo2Var : c) {
                                                    arrayList.add(pa8.b(oo2Var));
                                                }
                                                set = sl1.A0(arrayList);
                                            }
                                            for (sa8 sa8Var : b9aVar) {
                                                oo2 l = fre.l(sa8Var, "general");
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.b(l))) {
                                                    ii2Var.L.m0(l);
                                                }
                                            }
                                            return pvcVar2;
                                        case 1:
                                            ii2 ii2Var2 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var2.F.b0();
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List<en2> c2 = ii2Var2.F.l0().c();
                                                ArrayList arrayList2 = new ArrayList(tl1.s(c2, 10));
                                                for (en2 en2Var : c2) {
                                                    arrayList2.add(en2Var.b);
                                                }
                                                set = sl1.A0(arrayList2);
                                            }
                                            Iterator it = b9aVar.iterator();
                                            while (it.hasNext()) {
                                                ea8 ea8Var = (ea8) it.next();
                                                ea8Var.getClass();
                                                String str = ea8Var.a;
                                                String str2 = ea8Var.b;
                                                String str3 = ea8Var.c;
                                                int i8 = ea8Var.f;
                                                en2 en2Var2 = new en2(str, str, str2, str3, "", 0, i8, ea8Var.e, i8, 0, 4, ea8Var.h);
                                                if (cs9Var3 != cs9Var4 || !set.contains(str)) {
                                                    ii2Var2.F.A0(en2Var2);
                                                }
                                            }
                                            return pvcVar2;
                                        case 2:
                                            ii2 ii2Var3 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var3.V.Z("");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                gk2 gk2Var = ii2Var3.V;
                                                gk2Var.getClass();
                                                fq2 fq2Var = fq2.a;
                                                List<zp2> c3 = new dq2(gk2Var, "", new aq2(gk2Var, 0)).c();
                                                ArrayList arrayList3 = new ArrayList(tl1.s(c3, 10));
                                                for (zp2 zp2Var : c3) {
                                                    arrayList3.add(pa8.d(zp2Var));
                                                }
                                                set = sl1.A0(arrayList3);
                                            }
                                            Iterator it2 = b9aVar.iterator();
                                            while (it2.hasNext()) {
                                                hb8 hb8Var = (hb8) it2.next();
                                                hb8Var.getClass();
                                                String B2 = ube.B();
                                                String str4 = hb8Var.a;
                                                boolean z = hb8Var.b;
                                                yj1 yj1Var = by5.a;
                                                zp2 zp2Var2 = new zp2(0, yj1Var.k().b(), yj1Var.k().b(), B2, "", str4, z);
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.d(zp2Var2))) {
                                                    ii2Var3.V.G0(zp2Var2);
                                                }
                                            }
                                            return pvcVar2;
                                        case 3:
                                            ii2 ii2Var4 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var4.K.c0();
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List<mo2> c4 = ii2Var4.K.h0().c();
                                                ArrayList arrayList4 = new ArrayList(tl1.s(c4, 10));
                                                for (mo2 mo2Var : c4) {
                                                    arrayList4.add(mo2Var.a);
                                                }
                                                set = sl1.A0(arrayList4);
                                            }
                                            Iterator it3 = b9aVar.iterator();
                                            while (it3.hasNext()) {
                                                ka8 ka8Var = (ka8) it3.next();
                                                if (ka8Var.b.length() > 0) {
                                                    String valueOf = String.valueOf(ka8Var.a);
                                                    mo2 mo2Var2 = new mo2(valueOf, ka8Var.b, ka8Var.d, ka8Var.c, by5.a.k().b());
                                                    if (cs9Var3 != cs9Var4 || !set.contains(valueOf)) {
                                                        ii2Var4.K.l0(mo2Var2);
                                                    }
                                                }
                                            }
                                            return pvcVar2;
                                        case 4:
                                            ii2 ii2Var5 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var5.Q.h0(1, "general");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List c5 = ii2Var5.Q.m0("general").c();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (Object obj3 : c5) {
                                                    if (((cp2) obj3).e == 1) {
                                                        arrayList5.add(obj3);
                                                    }
                                                }
                                                ArrayList arrayList6 = new ArrayList(tl1.s(arrayList5, 10));
                                                int size = arrayList5.size();
                                                while (i7 < size) {
                                                    Object obj4 = arrayList5.get(i7);
                                                    i7++;
                                                    arrayList6.add(pa8.c((cp2) obj4));
                                                }
                                                set = sl1.A0(arrayList6);
                                            }
                                            Iterator it4 = b9aVar.iterator();
                                            while (it4.hasNext()) {
                                                cp2 u = obe.u((bb8) it4.next(), "general");
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.c(u))) {
                                                    ii2Var5.Q.E0(u);
                                                }
                                            }
                                            return pvcVar2;
                                        default:
                                            ii2 ii2Var6 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var6.Q.h0(0, "general");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List c6 = ii2Var6.Q.m0("general").c();
                                                ArrayList arrayList7 = new ArrayList();
                                                for (Object obj5 : c6) {
                                                    if (((cp2) obj5).e == 0) {
                                                        arrayList7.add(obj5);
                                                    }
                                                }
                                                ArrayList arrayList8 = new ArrayList(tl1.s(arrayList7, 10));
                                                int size2 = arrayList7.size();
                                                while (i7 < size2) {
                                                    Object obj6 = arrayList7.get(i7);
                                                    i7++;
                                                    arrayList8.add(pa8.c((cp2) obj6));
                                                }
                                                set = sl1.A0(arrayList8);
                                            }
                                            Iterator it5 = b9aVar.iterator();
                                            while (it5.hasNext()) {
                                                cp2 v = obe.v((eb8) it5.next(), "general");
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.c(v))) {
                                                    ii2Var6.Q.E0(v);
                                                }
                                            }
                                            return pvcVar2;
                                    }
                                }
                            });
                            dxe.r(wj9Var, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 5:
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    gn8 b6 = sye.b(gn8Var, "chinese_names.json");
                    abf abfVar4 = qe4.a;
                    abfVar4.getClass();
                    if (b6.a.exists()) {
                        wj9Var = new wj9(abfVar4.A(b6));
                        try {
                            s46 s46Var4 = pa8Var.b;
                            s46Var4.getClass();
                            final b9a p3 = ie2.p(s46Var4, wj9Var, bb8.Companion.serializer());
                            l0e.z(pa8Var.a.Q, new xt4() { // from class: la8
                                @Override // defpackage.xt4
                                public final Object invoke(Object obj2) {
                                    int i62 = r4;
                                    int i72 = 0;
                                    pvc pvcVar2 = pvc.a;
                                    Set set = rs3.a;
                                    cs9 cs9Var2 = cs9.a;
                                    b9a<sa8> b9aVar = p3;
                                    pa8 pa8Var3 = pa8Var;
                                    cs9 cs9Var3 = cs9Var;
                                    cs9 cs9Var4 = cs9.c;
                                    switch (i62) {
                                        case 0:
                                            ii2 ii2Var = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var.L.b0("general");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List<oo2> c = ii2Var.L.i0("general").c();
                                                ArrayList arrayList = new ArrayList(tl1.s(c, 10));
                                                for (oo2 oo2Var : c) {
                                                    arrayList.add(pa8.b(oo2Var));
                                                }
                                                set = sl1.A0(arrayList);
                                            }
                                            for (sa8 sa8Var : b9aVar) {
                                                oo2 l = fre.l(sa8Var, "general");
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.b(l))) {
                                                    ii2Var.L.m0(l);
                                                }
                                            }
                                            return pvcVar2;
                                        case 1:
                                            ii2 ii2Var2 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var2.F.b0();
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List<en2> c2 = ii2Var2.F.l0().c();
                                                ArrayList arrayList2 = new ArrayList(tl1.s(c2, 10));
                                                for (en2 en2Var : c2) {
                                                    arrayList2.add(en2Var.b);
                                                }
                                                set = sl1.A0(arrayList2);
                                            }
                                            Iterator it = b9aVar.iterator();
                                            while (it.hasNext()) {
                                                ea8 ea8Var = (ea8) it.next();
                                                ea8Var.getClass();
                                                String str = ea8Var.a;
                                                String str2 = ea8Var.b;
                                                String str3 = ea8Var.c;
                                                int i8 = ea8Var.f;
                                                en2 en2Var2 = new en2(str, str, str2, str3, "", 0, i8, ea8Var.e, i8, 0, 4, ea8Var.h);
                                                if (cs9Var3 != cs9Var4 || !set.contains(str)) {
                                                    ii2Var2.F.A0(en2Var2);
                                                }
                                            }
                                            return pvcVar2;
                                        case 2:
                                            ii2 ii2Var3 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var3.V.Z("");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                gk2 gk2Var = ii2Var3.V;
                                                gk2Var.getClass();
                                                fq2 fq2Var = fq2.a;
                                                List<zp2> c3 = new dq2(gk2Var, "", new aq2(gk2Var, 0)).c();
                                                ArrayList arrayList3 = new ArrayList(tl1.s(c3, 10));
                                                for (zp2 zp2Var : c3) {
                                                    arrayList3.add(pa8.d(zp2Var));
                                                }
                                                set = sl1.A0(arrayList3);
                                            }
                                            Iterator it2 = b9aVar.iterator();
                                            while (it2.hasNext()) {
                                                hb8 hb8Var = (hb8) it2.next();
                                                hb8Var.getClass();
                                                String B2 = ube.B();
                                                String str4 = hb8Var.a;
                                                boolean z = hb8Var.b;
                                                yj1 yj1Var = by5.a;
                                                zp2 zp2Var2 = new zp2(0, yj1Var.k().b(), yj1Var.k().b(), B2, "", str4, z);
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.d(zp2Var2))) {
                                                    ii2Var3.V.G0(zp2Var2);
                                                }
                                            }
                                            return pvcVar2;
                                        case 3:
                                            ii2 ii2Var4 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var4.K.c0();
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List<mo2> c4 = ii2Var4.K.h0().c();
                                                ArrayList arrayList4 = new ArrayList(tl1.s(c4, 10));
                                                for (mo2 mo2Var : c4) {
                                                    arrayList4.add(mo2Var.a);
                                                }
                                                set = sl1.A0(arrayList4);
                                            }
                                            Iterator it3 = b9aVar.iterator();
                                            while (it3.hasNext()) {
                                                ka8 ka8Var = (ka8) it3.next();
                                                if (ka8Var.b.length() > 0) {
                                                    String valueOf = String.valueOf(ka8Var.a);
                                                    mo2 mo2Var2 = new mo2(valueOf, ka8Var.b, ka8Var.d, ka8Var.c, by5.a.k().b());
                                                    if (cs9Var3 != cs9Var4 || !set.contains(valueOf)) {
                                                        ii2Var4.K.l0(mo2Var2);
                                                    }
                                                }
                                            }
                                            return pvcVar2;
                                        case 4:
                                            ii2 ii2Var5 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var5.Q.h0(1, "general");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List c5 = ii2Var5.Q.m0("general").c();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (Object obj3 : c5) {
                                                    if (((cp2) obj3).e == 1) {
                                                        arrayList5.add(obj3);
                                                    }
                                                }
                                                ArrayList arrayList6 = new ArrayList(tl1.s(arrayList5, 10));
                                                int size = arrayList5.size();
                                                while (i72 < size) {
                                                    Object obj4 = arrayList5.get(i72);
                                                    i72++;
                                                    arrayList6.add(pa8.c((cp2) obj4));
                                                }
                                                set = sl1.A0(arrayList6);
                                            }
                                            Iterator it4 = b9aVar.iterator();
                                            while (it4.hasNext()) {
                                                cp2 u = obe.u((bb8) it4.next(), "general");
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.c(u))) {
                                                    ii2Var5.Q.E0(u);
                                                }
                                            }
                                            return pvcVar2;
                                        default:
                                            ii2 ii2Var6 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var6.Q.h0(0, "general");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List c6 = ii2Var6.Q.m0("general").c();
                                                ArrayList arrayList7 = new ArrayList();
                                                for (Object obj5 : c6) {
                                                    if (((cp2) obj5).e == 0) {
                                                        arrayList7.add(obj5);
                                                    }
                                                }
                                                ArrayList arrayList8 = new ArrayList(tl1.s(arrayList7, 10));
                                                int size2 = arrayList7.size();
                                                while (i72 < size2) {
                                                    Object obj6 = arrayList7.get(i72);
                                                    i72++;
                                                    arrayList8.add(pa8.c((cp2) obj6));
                                                }
                                                set = sl1.A0(arrayList8);
                                            }
                                            Iterator it5 = b9aVar.iterator();
                                            while (it5.hasNext()) {
                                                cp2 v = obe.v((eb8) it5.next(), "general");
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.c(v))) {
                                                    ii2Var6.Q.E0(v);
                                                }
                                            }
                                            return pvcVar2;
                                    }
                                }
                            });
                            dxe.r(wj9Var, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 6:
                int i8 = this.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    gn8 b7 = sye.b(gn8Var, "chinese_vietphrases.json");
                    abf abfVar5 = qe4.a;
                    abfVar5.getClass();
                    if (b7.a.exists()) {
                        wj9Var = new wj9(abfVar5.A(b7));
                        try {
                            s46 s46Var5 = pa8Var.b;
                            s46Var5.getClass();
                            final b9a p4 = ie2.p(s46Var5, wj9Var, eb8.Companion.serializer());
                            l0e.z(pa8Var.a.Q, new xt4() { // from class: la8
                                @Override // defpackage.xt4
                                public final Object invoke(Object obj2) {
                                    int i62 = r4;
                                    int i72 = 0;
                                    pvc pvcVar2 = pvc.a;
                                    Set set = rs3.a;
                                    cs9 cs9Var2 = cs9.a;
                                    b9a<sa8> b9aVar = p4;
                                    pa8 pa8Var3 = pa8Var;
                                    cs9 cs9Var3 = cs9Var;
                                    cs9 cs9Var4 = cs9.c;
                                    switch (i62) {
                                        case 0:
                                            ii2 ii2Var = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var.L.b0("general");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List<oo2> c = ii2Var.L.i0("general").c();
                                                ArrayList arrayList = new ArrayList(tl1.s(c, 10));
                                                for (oo2 oo2Var : c) {
                                                    arrayList.add(pa8.b(oo2Var));
                                                }
                                                set = sl1.A0(arrayList);
                                            }
                                            for (sa8 sa8Var : b9aVar) {
                                                oo2 l = fre.l(sa8Var, "general");
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.b(l))) {
                                                    ii2Var.L.m0(l);
                                                }
                                            }
                                            return pvcVar2;
                                        case 1:
                                            ii2 ii2Var2 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var2.F.b0();
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List<en2> c2 = ii2Var2.F.l0().c();
                                                ArrayList arrayList2 = new ArrayList(tl1.s(c2, 10));
                                                for (en2 en2Var : c2) {
                                                    arrayList2.add(en2Var.b);
                                                }
                                                set = sl1.A0(arrayList2);
                                            }
                                            Iterator it = b9aVar.iterator();
                                            while (it.hasNext()) {
                                                ea8 ea8Var = (ea8) it.next();
                                                ea8Var.getClass();
                                                String str = ea8Var.a;
                                                String str2 = ea8Var.b;
                                                String str3 = ea8Var.c;
                                                int i82 = ea8Var.f;
                                                en2 en2Var2 = new en2(str, str, str2, str3, "", 0, i82, ea8Var.e, i82, 0, 4, ea8Var.h);
                                                if (cs9Var3 != cs9Var4 || !set.contains(str)) {
                                                    ii2Var2.F.A0(en2Var2);
                                                }
                                            }
                                            return pvcVar2;
                                        case 2:
                                            ii2 ii2Var3 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var3.V.Z("");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                gk2 gk2Var = ii2Var3.V;
                                                gk2Var.getClass();
                                                fq2 fq2Var = fq2.a;
                                                List<zp2> c3 = new dq2(gk2Var, "", new aq2(gk2Var, 0)).c();
                                                ArrayList arrayList3 = new ArrayList(tl1.s(c3, 10));
                                                for (zp2 zp2Var : c3) {
                                                    arrayList3.add(pa8.d(zp2Var));
                                                }
                                                set = sl1.A0(arrayList3);
                                            }
                                            Iterator it2 = b9aVar.iterator();
                                            while (it2.hasNext()) {
                                                hb8 hb8Var = (hb8) it2.next();
                                                hb8Var.getClass();
                                                String B2 = ube.B();
                                                String str4 = hb8Var.a;
                                                boolean z = hb8Var.b;
                                                yj1 yj1Var = by5.a;
                                                zp2 zp2Var2 = new zp2(0, yj1Var.k().b(), yj1Var.k().b(), B2, "", str4, z);
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.d(zp2Var2))) {
                                                    ii2Var3.V.G0(zp2Var2);
                                                }
                                            }
                                            return pvcVar2;
                                        case 3:
                                            ii2 ii2Var4 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var4.K.c0();
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List<mo2> c4 = ii2Var4.K.h0().c();
                                                ArrayList arrayList4 = new ArrayList(tl1.s(c4, 10));
                                                for (mo2 mo2Var : c4) {
                                                    arrayList4.add(mo2Var.a);
                                                }
                                                set = sl1.A0(arrayList4);
                                            }
                                            Iterator it3 = b9aVar.iterator();
                                            while (it3.hasNext()) {
                                                ka8 ka8Var = (ka8) it3.next();
                                                if (ka8Var.b.length() > 0) {
                                                    String valueOf = String.valueOf(ka8Var.a);
                                                    mo2 mo2Var2 = new mo2(valueOf, ka8Var.b, ka8Var.d, ka8Var.c, by5.a.k().b());
                                                    if (cs9Var3 != cs9Var4 || !set.contains(valueOf)) {
                                                        ii2Var4.K.l0(mo2Var2);
                                                    }
                                                }
                                            }
                                            return pvcVar2;
                                        case 4:
                                            ii2 ii2Var5 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var5.Q.h0(1, "general");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List c5 = ii2Var5.Q.m0("general").c();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (Object obj3 : c5) {
                                                    if (((cp2) obj3).e == 1) {
                                                        arrayList5.add(obj3);
                                                    }
                                                }
                                                ArrayList arrayList6 = new ArrayList(tl1.s(arrayList5, 10));
                                                int size = arrayList5.size();
                                                while (i72 < size) {
                                                    Object obj4 = arrayList5.get(i72);
                                                    i72++;
                                                    arrayList6.add(pa8.c((cp2) obj4));
                                                }
                                                set = sl1.A0(arrayList6);
                                            }
                                            Iterator it4 = b9aVar.iterator();
                                            while (it4.hasNext()) {
                                                cp2 u = obe.u((bb8) it4.next(), "general");
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.c(u))) {
                                                    ii2Var5.Q.E0(u);
                                                }
                                            }
                                            return pvcVar2;
                                        default:
                                            ii2 ii2Var6 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var6.Q.h0(0, "general");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List c6 = ii2Var6.Q.m0("general").c();
                                                ArrayList arrayList7 = new ArrayList();
                                                for (Object obj5 : c6) {
                                                    if (((cp2) obj5).e == 0) {
                                                        arrayList7.add(obj5);
                                                    }
                                                }
                                                ArrayList arrayList8 = new ArrayList(tl1.s(arrayList7, 10));
                                                int size2 = arrayList7.size();
                                                while (i72 < size2) {
                                                    Object obj6 = arrayList7.get(i72);
                                                    i72++;
                                                    arrayList8.add(pa8.c((cp2) obj6));
                                                }
                                                set = sl1.A0(arrayList8);
                                            }
                                            Iterator it5 = b9aVar.iterator();
                                            while (it5.hasNext()) {
                                                cp2 v = obe.v((eb8) it5.next(), "general");
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.c(v))) {
                                                    ii2Var6.Q.E0(v);
                                                }
                                            }
                                            return pvcVar2;
                                    }
                                }
                            });
                            dxe.r(wj9Var, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 7:
                int i9 = this.b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    gn8 b8 = sye.b(gn8Var, "trashes.json");
                    abf abfVar6 = qe4.a;
                    abfVar6.getClass();
                    if (b8.a.exists()) {
                        wj9Var = new wj9(abfVar6.A(b8));
                        try {
                            s46 s46Var6 = pa8Var.b;
                            s46Var6.getClass();
                            final b9a p5 = ie2.p(s46Var6, wj9Var, hb8.Companion.serializer());
                            l0e.z(pa8Var.a.V, new xt4() { // from class: la8
                                @Override // defpackage.xt4
                                public final Object invoke(Object obj2) {
                                    int i62 = r4;
                                    int i72 = 0;
                                    pvc pvcVar2 = pvc.a;
                                    Set set = rs3.a;
                                    cs9 cs9Var2 = cs9.a;
                                    b9a<sa8> b9aVar = p5;
                                    pa8 pa8Var3 = pa8Var;
                                    cs9 cs9Var3 = cs9Var;
                                    cs9 cs9Var4 = cs9.c;
                                    switch (i62) {
                                        case 0:
                                            ii2 ii2Var = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var.L.b0("general");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List<oo2> c = ii2Var.L.i0("general").c();
                                                ArrayList arrayList = new ArrayList(tl1.s(c, 10));
                                                for (oo2 oo2Var : c) {
                                                    arrayList.add(pa8.b(oo2Var));
                                                }
                                                set = sl1.A0(arrayList);
                                            }
                                            for (sa8 sa8Var : b9aVar) {
                                                oo2 l = fre.l(sa8Var, "general");
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.b(l))) {
                                                    ii2Var.L.m0(l);
                                                }
                                            }
                                            return pvcVar2;
                                        case 1:
                                            ii2 ii2Var2 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var2.F.b0();
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List<en2> c2 = ii2Var2.F.l0().c();
                                                ArrayList arrayList2 = new ArrayList(tl1.s(c2, 10));
                                                for (en2 en2Var : c2) {
                                                    arrayList2.add(en2Var.b);
                                                }
                                                set = sl1.A0(arrayList2);
                                            }
                                            Iterator it = b9aVar.iterator();
                                            while (it.hasNext()) {
                                                ea8 ea8Var = (ea8) it.next();
                                                ea8Var.getClass();
                                                String str = ea8Var.a;
                                                String str2 = ea8Var.b;
                                                String str3 = ea8Var.c;
                                                int i82 = ea8Var.f;
                                                en2 en2Var2 = new en2(str, str, str2, str3, "", 0, i82, ea8Var.e, i82, 0, 4, ea8Var.h);
                                                if (cs9Var3 != cs9Var4 || !set.contains(str)) {
                                                    ii2Var2.F.A0(en2Var2);
                                                }
                                            }
                                            return pvcVar2;
                                        case 2:
                                            ii2 ii2Var3 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var3.V.Z("");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                gk2 gk2Var = ii2Var3.V;
                                                gk2Var.getClass();
                                                fq2 fq2Var = fq2.a;
                                                List<zp2> c3 = new dq2(gk2Var, "", new aq2(gk2Var, 0)).c();
                                                ArrayList arrayList3 = new ArrayList(tl1.s(c3, 10));
                                                for (zp2 zp2Var : c3) {
                                                    arrayList3.add(pa8.d(zp2Var));
                                                }
                                                set = sl1.A0(arrayList3);
                                            }
                                            Iterator it2 = b9aVar.iterator();
                                            while (it2.hasNext()) {
                                                hb8 hb8Var = (hb8) it2.next();
                                                hb8Var.getClass();
                                                String B2 = ube.B();
                                                String str4 = hb8Var.a;
                                                boolean z = hb8Var.b;
                                                yj1 yj1Var = by5.a;
                                                zp2 zp2Var2 = new zp2(0, yj1Var.k().b(), yj1Var.k().b(), B2, "", str4, z);
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.d(zp2Var2))) {
                                                    ii2Var3.V.G0(zp2Var2);
                                                }
                                            }
                                            return pvcVar2;
                                        case 3:
                                            ii2 ii2Var4 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var4.K.c0();
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List<mo2> c4 = ii2Var4.K.h0().c();
                                                ArrayList arrayList4 = new ArrayList(tl1.s(c4, 10));
                                                for (mo2 mo2Var : c4) {
                                                    arrayList4.add(mo2Var.a);
                                                }
                                                set = sl1.A0(arrayList4);
                                            }
                                            Iterator it3 = b9aVar.iterator();
                                            while (it3.hasNext()) {
                                                ka8 ka8Var = (ka8) it3.next();
                                                if (ka8Var.b.length() > 0) {
                                                    String valueOf = String.valueOf(ka8Var.a);
                                                    mo2 mo2Var2 = new mo2(valueOf, ka8Var.b, ka8Var.d, ka8Var.c, by5.a.k().b());
                                                    if (cs9Var3 != cs9Var4 || !set.contains(valueOf)) {
                                                        ii2Var4.K.l0(mo2Var2);
                                                    }
                                                }
                                            }
                                            return pvcVar2;
                                        case 4:
                                            ii2 ii2Var5 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var5.Q.h0(1, "general");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List c5 = ii2Var5.Q.m0("general").c();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (Object obj3 : c5) {
                                                    if (((cp2) obj3).e == 1) {
                                                        arrayList5.add(obj3);
                                                    }
                                                }
                                                ArrayList arrayList6 = new ArrayList(tl1.s(arrayList5, 10));
                                                int size = arrayList5.size();
                                                while (i72 < size) {
                                                    Object obj4 = arrayList5.get(i72);
                                                    i72++;
                                                    arrayList6.add(pa8.c((cp2) obj4));
                                                }
                                                set = sl1.A0(arrayList6);
                                            }
                                            Iterator it4 = b9aVar.iterator();
                                            while (it4.hasNext()) {
                                                cp2 u = obe.u((bb8) it4.next(), "general");
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.c(u))) {
                                                    ii2Var5.Q.E0(u);
                                                }
                                            }
                                            return pvcVar2;
                                        default:
                                            ii2 ii2Var6 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var6.Q.h0(0, "general");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List c6 = ii2Var6.Q.m0("general").c();
                                                ArrayList arrayList7 = new ArrayList();
                                                for (Object obj5 : c6) {
                                                    if (((cp2) obj5).e == 0) {
                                                        arrayList7.add(obj5);
                                                    }
                                                }
                                                ArrayList arrayList8 = new ArrayList(tl1.s(arrayList7, 10));
                                                int size2 = arrayList7.size();
                                                while (i72 < size2) {
                                                    Object obj6 = arrayList7.get(i72);
                                                    i72++;
                                                    arrayList8.add(pa8.c((cp2) obj6));
                                                }
                                                set = sl1.A0(arrayList8);
                                            }
                                            Iterator it5 = b9aVar.iterator();
                                            while (it5.hasNext()) {
                                                cp2 v = obe.v((eb8) it5.next(), "general");
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.c(v))) {
                                                    ii2Var6.Q.E0(v);
                                                }
                                            }
                                            return pvcVar2;
                                    }
                                }
                            });
                            dxe.r(wj9Var, null);
                        } finally {
                        }
                    }
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            default:
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    gn8 b9 = sye.b(gn8Var, "repositories.json");
                    abf abfVar7 = qe4.a;
                    abfVar7.getClass();
                    if (b9.a.exists()) {
                        wj9Var = new wj9(abfVar7.A(b9));
                        try {
                            s46 s46Var7 = pa8Var.b;
                            s46Var7.getClass();
                            final b9a p6 = ie2.p(s46Var7, wj9Var, ka8.Companion.serializer());
                            l0e.z(pa8Var.a.K, new xt4() { // from class: la8
                                @Override // defpackage.xt4
                                public final Object invoke(Object obj2) {
                                    int i62 = r4;
                                    int i72 = 0;
                                    pvc pvcVar2 = pvc.a;
                                    Set set = rs3.a;
                                    cs9 cs9Var2 = cs9.a;
                                    b9a<sa8> b9aVar = p6;
                                    pa8 pa8Var3 = pa8Var;
                                    cs9 cs9Var3 = cs9Var;
                                    cs9 cs9Var4 = cs9.c;
                                    switch (i62) {
                                        case 0:
                                            ii2 ii2Var = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var.L.b0("general");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List<oo2> c = ii2Var.L.i0("general").c();
                                                ArrayList arrayList = new ArrayList(tl1.s(c, 10));
                                                for (oo2 oo2Var : c) {
                                                    arrayList.add(pa8.b(oo2Var));
                                                }
                                                set = sl1.A0(arrayList);
                                            }
                                            for (sa8 sa8Var : b9aVar) {
                                                oo2 l = fre.l(sa8Var, "general");
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.b(l))) {
                                                    ii2Var.L.m0(l);
                                                }
                                            }
                                            return pvcVar2;
                                        case 1:
                                            ii2 ii2Var2 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var2.F.b0();
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List<en2> c2 = ii2Var2.F.l0().c();
                                                ArrayList arrayList2 = new ArrayList(tl1.s(c2, 10));
                                                for (en2 en2Var : c2) {
                                                    arrayList2.add(en2Var.b);
                                                }
                                                set = sl1.A0(arrayList2);
                                            }
                                            Iterator it = b9aVar.iterator();
                                            while (it.hasNext()) {
                                                ea8 ea8Var = (ea8) it.next();
                                                ea8Var.getClass();
                                                String str = ea8Var.a;
                                                String str2 = ea8Var.b;
                                                String str3 = ea8Var.c;
                                                int i82 = ea8Var.f;
                                                en2 en2Var2 = new en2(str, str, str2, str3, "", 0, i82, ea8Var.e, i82, 0, 4, ea8Var.h);
                                                if (cs9Var3 != cs9Var4 || !set.contains(str)) {
                                                    ii2Var2.F.A0(en2Var2);
                                                }
                                            }
                                            return pvcVar2;
                                        case 2:
                                            ii2 ii2Var3 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var3.V.Z("");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                gk2 gk2Var = ii2Var3.V;
                                                gk2Var.getClass();
                                                fq2 fq2Var = fq2.a;
                                                List<zp2> c3 = new dq2(gk2Var, "", new aq2(gk2Var, 0)).c();
                                                ArrayList arrayList3 = new ArrayList(tl1.s(c3, 10));
                                                for (zp2 zp2Var : c3) {
                                                    arrayList3.add(pa8.d(zp2Var));
                                                }
                                                set = sl1.A0(arrayList3);
                                            }
                                            Iterator it2 = b9aVar.iterator();
                                            while (it2.hasNext()) {
                                                hb8 hb8Var = (hb8) it2.next();
                                                hb8Var.getClass();
                                                String B2 = ube.B();
                                                String str4 = hb8Var.a;
                                                boolean z = hb8Var.b;
                                                yj1 yj1Var = by5.a;
                                                zp2 zp2Var2 = new zp2(0, yj1Var.k().b(), yj1Var.k().b(), B2, "", str4, z);
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.d(zp2Var2))) {
                                                    ii2Var3.V.G0(zp2Var2);
                                                }
                                            }
                                            return pvcVar2;
                                        case 3:
                                            ii2 ii2Var4 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var4.K.c0();
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List<mo2> c4 = ii2Var4.K.h0().c();
                                                ArrayList arrayList4 = new ArrayList(tl1.s(c4, 10));
                                                for (mo2 mo2Var : c4) {
                                                    arrayList4.add(mo2Var.a);
                                                }
                                                set = sl1.A0(arrayList4);
                                            }
                                            Iterator it3 = b9aVar.iterator();
                                            while (it3.hasNext()) {
                                                ka8 ka8Var = (ka8) it3.next();
                                                if (ka8Var.b.length() > 0) {
                                                    String valueOf = String.valueOf(ka8Var.a);
                                                    mo2 mo2Var2 = new mo2(valueOf, ka8Var.b, ka8Var.d, ka8Var.c, by5.a.k().b());
                                                    if (cs9Var3 != cs9Var4 || !set.contains(valueOf)) {
                                                        ii2Var4.K.l0(mo2Var2);
                                                    }
                                                }
                                            }
                                            return pvcVar2;
                                        case 4:
                                            ii2 ii2Var5 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var5.Q.h0(1, "general");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List c5 = ii2Var5.Q.m0("general").c();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (Object obj3 : c5) {
                                                    if (((cp2) obj3).e == 1) {
                                                        arrayList5.add(obj3);
                                                    }
                                                }
                                                ArrayList arrayList6 = new ArrayList(tl1.s(arrayList5, 10));
                                                int size = arrayList5.size();
                                                while (i72 < size) {
                                                    Object obj4 = arrayList5.get(i72);
                                                    i72++;
                                                    arrayList6.add(pa8.c((cp2) obj4));
                                                }
                                                set = sl1.A0(arrayList6);
                                            }
                                            Iterator it4 = b9aVar.iterator();
                                            while (it4.hasNext()) {
                                                cp2 u = obe.u((bb8) it4.next(), "general");
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.c(u))) {
                                                    ii2Var5.Q.E0(u);
                                                }
                                            }
                                            return pvcVar2;
                                        default:
                                            ii2 ii2Var6 = pa8Var3.a;
                                            ((vjc) obj2).getClass();
                                            if (cs9Var3 == cs9Var2) {
                                                ii2Var6.Q.h0(0, "general");
                                            }
                                            if (cs9Var3 == cs9Var4) {
                                                List c6 = ii2Var6.Q.m0("general").c();
                                                ArrayList arrayList7 = new ArrayList();
                                                for (Object obj5 : c6) {
                                                    if (((cp2) obj5).e == 0) {
                                                        arrayList7.add(obj5);
                                                    }
                                                }
                                                ArrayList arrayList8 = new ArrayList(tl1.s(arrayList7, 10));
                                                int size2 = arrayList7.size();
                                                while (i72 < size2) {
                                                    Object obj6 = arrayList7.get(i72);
                                                    i72++;
                                                    arrayList8.add(pa8.c((cp2) obj6));
                                                }
                                                set = sl1.A0(arrayList8);
                                            }
                                            Iterator it5 = b9aVar.iterator();
                                            while (it5.hasNext()) {
                                                cp2 v = obe.v((eb8) it5.next(), "general");
                                                if (cs9Var3 != cs9Var4 || !set.contains(pa8.c(v))) {
                                                    ii2Var6.Q.E0(v);
                                                }
                                            }
                                            return pvcVar2;
                                    }
                                }
                            });
                            dxe.r(wj9Var, null);
                        } finally {
                        }
                    }
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
        }
    }
}
