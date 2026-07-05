package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dv0  reason: default package */
/* loaded from: classes3.dex */
public final class dv0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dv0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                dv0 dv0Var = new dv0((ev0) obj5, (i38) obj4, (hg) obj3, (se0) obj2, m42Var, 0);
                dv0Var.b = obj;
                return dv0Var;
            case 1:
                return new dv0((zwb) this.b, (aw7) obj5, (aw7) obj4, (aw7) obj3, (aw7) obj2, m42Var, 1);
            case 2:
                return new dv0((List) this.b, (aw7) obj5, (aw7) obj4, (aw7) obj3, (aw7) obj2, m42Var, 2);
            case 3:
                return new dv0((gbc) this.b, (String) obj5, (String) obj4, (String) obj3, (String) obj2, m42Var, 3);
            case 4:
                return new dv0((mrd) this.b, (w22) obj5, (dc) obj4, (tc6) obj3, (vk8) obj2, m42Var, 4);
            default:
                dv0 dv0Var2 = new dv0((d19) obj5, (atd) obj4, (aw7) obj3, (aw7) obj2, m42Var, 5);
                dv0Var2.b = obj;
                return dv0Var2;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((dv0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((dv0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                ((dv0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                ((dv0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 4:
                ((dv0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((dv0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        long j;
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = 0;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                hre.r(obj);
                m82 m82Var = (m82) this.b;
                ev0 ev0Var = (ev0) obj5;
                z87.v(m82Var, null, null, new n0(ev0Var, (i38) obj4, (hg) obj3, null, 14), 3);
                return z87.v(m82Var, null, null, new cv0(ev0Var, (se0) obj2, null, 0), 3);
            case 1:
                hre.r(obj);
                return g9a.e0(new ff4(new ff4(sl1.V(((zwb) this.b).g), true, new ig7((aw7) obj5, 28)), true, new mj7((aw7) obj4, (aw7) obj3, (aw7) obj2, 0)));
            case 2:
                hre.r(obj);
                aw7 aw7Var = (aw7) obj2;
                boolean booleanValue = ((Boolean) ((aw7) obj5).getValue()).booleanValue();
                List list = (List) this.b;
                if (booleanValue) {
                    list = sl1.p0(list);
                }
                aw7 aw7Var2 = (aw7) obj3;
                ff4 ff4Var = new ff4(sl1.V(list), true, new wmb((aw7) obj4, 0));
                if (!k4b.j0(((jub) aw7Var2.getValue()).a.b)) {
                    ff4Var = new ff4(ff4Var, true, new wmb(aw7Var2, 1));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ef4 ef4Var = new ef4(ff4Var);
                while (ef4Var.hasNext()) {
                    Object next = ef4Var.next();
                    Integer num = new Integer(((pmb) next).c);
                    Object obj6 = linkedHashMap.get(num);
                    if (obj6 == null) {
                        obj6 = new ArrayList();
                        linkedHashMap.put(num, obj6);
                    }
                    ((List) obj6).add(next);
                }
                aw7Var.setValue(linkedHashMap);
                return pvcVar;
            case 3:
                hre.r(obj);
                gbc gbcVar = (gbc) this.b;
                ArrayList E0 = sl1.E0(((fbc) gbcVar.d.getValue()).b);
                String str = (String) obj2;
                int size = E0.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        Object obj7 = E0.get(i3);
                        i3++;
                        if (!c16.i(((orc) obj7).a, str)) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                if (i2 != -1) {
                    E0.set(i2, orc.a((orc) E0.get(i2), false, (String) obj5, (String) obj4, (String) obj3, 3));
                } else {
                    E0.add(new orc(ube.B(), (String) obj5, (String) obj4, (String) obj3, true));
                }
                hk1 a = jdd.a(gbcVar);
                sw2 sw2Var = ab3.a;
                gbcVar.f(a, ru2.c, new q4c(gbcVar, E0, null, 10));
                return pvcVar;
            case 4:
                hre.r(obj);
                mrd mrdVar = (mrd) this.b;
                o7b o7bVar = mrdVar.b;
                btd btdVar = mrdVar.a;
                List A = tl1.A(new th4());
                o7bVar.getClass();
                o7bVar.E.setValue(A);
                b7b b7bVar = o7bVar.e;
                b7bVar.getClass();
                zr1.A();
                if (!c16.i(b7bVar.t, A)) {
                    b7bVar.t = A;
                    qw6 qw6Var = b7bVar.a;
                    a0b a0bVar = new a0b(2, A, b7bVar);
                    qw6Var.getClass();
                    qw6Var.b(mw6.b, a0bVar);
                    b7bVar.f("regionDecodersChanged");
                }
                btdVar.j((w22) obj5);
                btdVar.h((dc) obj4);
                btdVar.l((tc6) obj3);
                long h = ((vk8) obj2).h();
                if (h != 9205357640488583168L) {
                    j = (k27.A(Float.intBitsToFloat((int) (h & 4294967295L))) & 4294967295L) | (k27.A(Float.intBitsToFloat((int) (h >> 32))) << 32);
                } else {
                    j = 0;
                }
                btdVar.k(j);
                return pvcVar;
            default:
                m82 m82Var2 = (m82) this.b;
                hre.r(obj);
                d19 d19Var = (d19) obj5;
                atd atdVar = (atd) obj4;
                esd esdVar = new esd(d19Var, atdVar, null, 0);
                p82 p82Var = p82.d;
                z87.v(m82Var2, null, p82Var, esdVar, 1);
                z87.v(m82Var2, null, p82Var, new esd(d19Var, atdVar, null, 1), 1);
                z87.v(m82Var2, null, p82Var, new lc9((d19) obj5, atdVar, (aw7) obj3, (aw7) obj2, (m42) null, 20), 1);
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dv0(Object obj, Object obj2, Object obj3, Object obj4, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }
}
