package defpackage;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s96  reason: default package */
/* loaded from: classes3.dex */
public final class s96 implements ldd {
    public final gi1 a;
    public final q0a b;
    public final vt4 c;

    public s96(gi1 gi1Var, q0a q0aVar, vt4 vt4Var) {
        this.a = gi1Var;
        this.b = q0aVar;
        this.c = vt4Var;
    }

    @Override // defpackage.ldd
    public final gdd c(gi1 gi1Var, ru7 ru7Var) {
        xj xjVar = new xj(this.c, ru7Var);
        m96 m96Var = this.b.e;
        kn9 kn9Var = m96Var.e;
        kn9Var.getClass();
        Object obj = kn9Var.a.get(r96.a);
        if (obj == null) {
            obj = null;
        }
        if (!c16.i(obj, Boolean.TRUE)) {
            return (gdd) this.b.e(this.a, xjVar, null);
        }
        String str = gi1Var.g() + '-' + hre.q().toString();
        lsc lscVar = new lsc(gi1Var);
        lsc lscVar2 = pdd.a;
        oaa oaaVar = m96Var.c;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) oaaVar.d;
        ((m96) oaaVar.b).a.getClass();
        ul6 ul6Var = ul6.a;
        ul6 ul6Var2 = ul6.e;
        ul6Var2.compareTo(ul6Var);
        Set set = (Set) oaaVar.c;
        if (!set.contains(lscVar)) {
            ul6Var2.compareTo(ul6Var);
            set.add(lscVar);
        }
        if (!concurrentHashMap.containsKey(str)) {
            q0a q0aVar = new q0a(lscVar, str, lscVar2, (m96) oaaVar.b, 4);
            q0a[] q0aVarArr = {(q0a) oaaVar.e};
            if (!q0aVar.c) {
                q0aVar.f.addAll(0, b00.D0(q0aVarArr));
                concurrentHashMap.put(str, q0aVar);
                q0a q0aVar2 = this.b;
                if (!q0aVar2.c) {
                    q0a[] q0aVarArr2 = {q0aVar2};
                    if (!q0aVar.c) {
                        q0aVar.f.addAll(0, b00.D0(q0aVarArr2));
                    } else {
                        vs.k("Can't add scope link to a root scope");
                        return null;
                    }
                }
                gdd gddVar = (gdd) q0aVar.e(this.a, xjVar, null);
                m97 m97Var = new m97(str, m96Var);
                hdd hddVar = gddVar.a;
                if (hddVar != null) {
                    if (hddVar.d) {
                        hdd.a(m97Var);
                        return gddVar;
                    }
                    synchronized (hddVar.a) {
                        hddVar.c.add(m97Var);
                    }
                    return gddVar;
                }
                return gddVar;
            }
            vs.k("Can't add scope link to a root scope");
            return null;
        }
        throw new e60(19, hl5.n("Scope with id '", str, "' is already created"), false);
    }
}
