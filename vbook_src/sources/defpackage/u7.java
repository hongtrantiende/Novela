package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u7  reason: default package */
/* loaded from: classes3.dex */
public final class u7 extends aab implements mu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(cz7 cz7Var, kb kbVar, m42 m42Var) {
        super(3, m42Var);
        this.a = 4;
        this.b = cz7Var;
        this.c = kbVar;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                m82 m82Var = (m82) obj;
                u7 u7Var = new u7((cz7) this.b, (m42) obj3, 0);
                u7Var.c = (l7) obj2;
                u7Var.invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                m82 m82Var2 = (m82) obj;
                u7 u7Var2 = new u7((cz7) this.b, (m42) obj3, 1);
                u7Var2.c = (jr0) obj2;
                u7Var2.invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                m82 m82Var3 = (m82) obj;
                u7 u7Var3 = new u7((cz7) this.b, (m42) obj3, 2);
                u7Var3.c = (tp1) obj2;
                u7Var3.invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                m82 m82Var4 = (m82) obj;
                u7 u7Var4 = new u7((cz7) this.b, (m42) obj3, 3);
                u7Var4.c = (fb2) obj2;
                u7Var4.invokeSuspend(pvcVar);
                return pvcVar;
            case 4:
                m82 m82Var5 = (m82) obj;
                if (obj2 == null) {
                    new u7((cz7) this.b, (kb) this.c, (m42) obj3).invokeSuspend(pvcVar);
                    throw null;
                }
                throw new ClassCastException();
            case 5:
                u7 u7Var5 = new u7(3, 5, (m42) obj3);
                u7Var5.c = (Integer) obj;
                u7Var5.b = (Integer) obj2;
                return u7Var5.invokeSuspend(pvcVar);
            case 6:
                m82 m82Var6 = (m82) obj;
                u7 u7Var6 = new u7((aw7) this.b, (m42) obj3, 6);
                u7Var6.c = (mzb) obj2;
                u7Var6.invokeSuspend(pvcVar);
                return pvcVar;
            case 7:
                u7 u7Var7 = new u7(3, 7, (m42) obj3);
                u7Var7.c = (zga) obj;
                u7Var7.b = (pv7) obj2;
                return u7Var7.invokeSuspend(pvcVar);
            case 8:
                m82 m82Var7 = (m82) obj;
                u7 u7Var8 = new u7((cz7) this.b, (m42) obj3, 8);
                u7Var8.c = (hia) obj2;
                u7Var8.invokeSuspend(pvcVar);
                return pvcVar;
            case 9:
                m82 m82Var8 = (m82) obj;
                u7 u7Var9 = new u7((aw7) this.b, (m42) obj3, 9);
                u7Var9.c = (ohb) obj2;
                u7Var9.invokeSuspend(pvcVar);
                return pvcVar;
            case 10:
                u7 u7Var10 = new u7(3, 10, (m42) obj3);
                u7Var10.c = (kpc) obj;
                u7Var10.b = (String) obj2;
                return u7Var10.invokeSuspend(pvcVar);
            case 11:
                u7 u7Var11 = new u7(3, 11, (m42) obj3);
                u7Var11.c = (List) obj;
                u7Var11.b = (pi8) obj2;
                return u7Var11.invokeSuspend(pvcVar);
            default:
                u7 u7Var12 = new u7(3, 12, (m42) obj3);
                u7Var12.c = (Map) obj;
                u7Var12.b = (Map) obj2;
                return u7Var12.invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                l7 l7Var = (l7) this.c;
                hre.r(obj);
                if (l7Var != null) {
                    zr1.u((cz7) this.b, l7Var.a);
                    return pvcVar;
                }
                xk5.o();
                return null;
            case 1:
                jr0 jr0Var = (jr0) this.c;
                hre.r(obj);
                if (jr0Var instanceof hr0) {
                    lpe.t((cz7) this.b, ((hr0) jr0Var).a, null);
                } else if (!c16.i(jr0Var, ir0.a)) {
                    xk5.o();
                    return null;
                }
                return pvcVar;
            case 2:
                tp1 tp1Var = (tp1) this.c;
                hre.r(obj);
                if (tp1Var != null) {
                    ((cz7) this.b).c();
                    return pvcVar;
                }
                xk5.o();
                return null;
            case 3:
                fb2 fb2Var = (fb2) this.c;
                hre.r(obj);
                if (fb2Var != null) {
                    zr1.u((cz7) this.b, fb2Var.a);
                    return pvcVar;
                }
                xk5.o();
                return null;
            case 4:
                hre.r(obj);
                throw new gt1(7);
            case 5:
                hre.r(obj);
                return new yk8((Integer) this.c, (Integer) this.b);
            case 6:
                hre.r(obj);
                if (c16.i((mzb) this.c, mzb.a)) {
                    ((aw7) this.b).setValue(Boolean.TRUE);
                    return pvcVar;
                }
                xk5.o();
                return null;
            case 7:
                hre.r(obj);
                zga zgaVar = (zga) this.c;
                pv7 pv7Var = (pv7) this.b;
                Set<e49> keySet = pv7Var.a().keySet();
                ArrayList arrayList = new ArrayList(tl1.s(keySet, 10));
                for (e49 e49Var : keySet) {
                    arrayList.add(e49Var.a);
                }
                Map<String, ?> all = zgaVar.a.getAll();
                all.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    Set set = zgaVar.b;
                    if (set != null) {
                        z = set.contains(key);
                    } else {
                        z = true;
                    }
                    if (z) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(p17.k(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key2 = entry2.getKey();
                    Object value = entry2.getValue();
                    if (value instanceof Set) {
                        value = sl1.H0((Iterable) value);
                    }
                    linkedHashMap2.put(key2, value);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                    if (!arrayList.contains((String) entry3.getKey())) {
                        linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                    }
                }
                pv7 g = pv7Var.g();
                for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                    String str = (String) entry4.getKey();
                    Object value2 = entry4.getValue();
                    if (value2 instanceof Boolean) {
                        g.f(s9e.l(str), value2);
                    } else if (value2 instanceof Float) {
                        str.getClass();
                        g.f(new e49(str), value2);
                    } else if (value2 instanceof Integer) {
                        str.getClass();
                        g.f(new e49(str), value2);
                    } else if (value2 instanceof Long) {
                        g.f(s9e.u(str), value2);
                    } else if (value2 instanceof String) {
                        g.f(s9e.x(str), value2);
                    } else if (value2 instanceof Set) {
                        g.f(s9e.y(str), (Set) value2);
                    }
                }
                return g.h();
            case 8:
                hre.r(obj);
                if (c16.i((hia) this.c, hia.a)) {
                    ((cz7) this.b).c();
                    return pvcVar;
                }
                xk5.o();
                return null;
            case 9:
                hre.r(obj);
                if (c16.i((ohb) this.c, jhb.a)) {
                    ((aw7) this.b).setValue(Boolean.TRUE);
                }
                return pvcVar;
            case 10:
                hre.r(obj);
                return new yk8((kpc) this.c, (String) this.b);
            case 11:
                List list = (List) this.c;
                pi8 pi8Var = (pi8) this.b;
                hre.r(obj);
                if ((list != null && !list.isEmpty()) || pi8Var != null) {
                    return zn9.b;
                }
                return zn9.a;
            default:
                Map map = (Map) this.b;
                hre.r(obj);
                return new ilc(true, map, (Map) this.c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u7(int i, int i2, m42 m42Var) {
        super(i, m42Var);
        this.a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u7(Object obj, m42 m42Var, int i) {
        super(3, m42Var);
        this.a = i;
        this.b = obj;
    }
}
