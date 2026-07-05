package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n56  reason: default package */
/* loaded from: classes3.dex */
public class n56 extends a2 {
    public final d56 f;
    public final o9a g;
    public int h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n56(r36 r36Var, d56 d56Var, String str, o9a o9aVar) {
        super(r36Var, str);
        r36Var.getClass();
        this.f = d56Var;
        this.g = o9aVar;
    }

    @Override // defpackage.a2
    public k46 F(String str) {
        str.getClass();
        return (k46) o17.p(str, T());
    }

    @Override // defpackage.a2
    public String R(o9a o9aVar, int i) {
        Object obj;
        o9aVar.getClass();
        r36 r36Var = this.c;
        z46.d(r36Var, o9aVar);
        String g = o9aVar.g(i);
        if (this.e.j && !T().a.keySet().contains(g)) {
            j23 j23Var = r36Var.c;
            u93 u93Var = new u93(29, o9aVar, r36Var);
            j23Var.getClass();
            ConcurrentHashMap concurrentHashMap = j23Var.a;
            Map map = (Map) concurrentHashMap.get(o9aVar);
            String str = null;
            j55 j55Var = z46.a;
            if (map != null) {
                obj = map.get(j55Var);
            } else {
                obj = null;
            }
            if (obj == null) {
                obj = null;
            }
            if (obj == null) {
                obj = u93Var.invoke();
                Object obj2 = concurrentHashMap.get(o9aVar);
                if (obj2 == null) {
                    obj2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(o9aVar, obj2);
                }
                ((Map) obj2).put(j55Var, obj);
            }
            Map map2 = (Map) obj;
            Iterator it = T().a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer num = (Integer) map2.get((String) next);
                if (num != null && num.intValue() == i) {
                    str = next;
                    break;
                }
            }
            String str2 = str;
            if (str2 != null) {
                return str2;
            }
        }
        return g;
    }

    @Override // defpackage.a2
    /* renamed from: Y */
    public d56 T() {
        return this.f;
    }

    public final boolean Z(o9a o9aVar, int i) {
        boolean z;
        if (!this.c.a.e && !o9aVar.j(i) && o9aVar.i(i).c()) {
            z = true;
        } else {
            z = false;
        }
        this.i = z;
        return z;
    }

    @Override // defpackage.fx1
    public int f(o9a o9aVar) {
        i56 i56Var;
        o9aVar.getClass();
        while (this.h < o9aVar.f()) {
            int i = this.h;
            this.h = i + 1;
            String S = S(o9aVar, i);
            boolean z = true;
            int i2 = this.h - 1;
            this.i = false;
            if (T().containsKey(S) || Z(o9aVar, i2)) {
                if (this.e.g) {
                    boolean j = o9aVar.j(i2);
                    o9a i3 = o9aVar.i(i2);
                    if (!j || i3.c() || !(((k46) T().get(S)) instanceof a56)) {
                        if (c16.i(i3.e(), t9a.f) && (!i3.c() || !(((k46) T().get(S)) instanceof a56))) {
                            k46 k46Var = (k46) T().get(S);
                            String str = null;
                            if (k46Var instanceof i56) {
                                i56Var = (i56) k46Var;
                            } else {
                                i56Var = null;
                            }
                            if (i56Var != null) {
                                hv5 hv5Var = l46.a;
                                if (!(i56Var instanceof a56)) {
                                    str = i56Var.a();
                                }
                            }
                            if (str != null) {
                                r36 r36Var = this.c;
                                int a = z46.a(i3, r36Var, str);
                                if (r36Var.a.e || !i3.c()) {
                                    z = false;
                                }
                                if (a == -3 && ((j || z) && !Z(o9aVar, i2))) {
                                }
                            }
                        }
                    }
                }
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.a2, defpackage.fx1
    public void n(o9a o9aVar) {
        Object obj;
        Set set;
        Set v;
        o9aVar.getClass();
        r36 r36Var = this.c;
        if (!z46.c(r36Var, o9aVar) && !(o9aVar.e() instanceof l19)) {
            z46.d(r36Var, o9aVar);
            String str = null;
            if (!this.e.j) {
                v = q1d.e(o9aVar);
            } else {
                Set e = q1d.e(o9aVar);
                j23 j23Var = r36Var.c;
                j23Var.getClass();
                Map map = (Map) j23Var.a.get(o9aVar);
                if (map != null) {
                    obj = map.get(z46.a);
                } else {
                    obj = null;
                }
                if (obj == null) {
                    obj = null;
                }
                Map map2 = (Map) obj;
                if (map2 != null) {
                    set = map2.keySet();
                } else {
                    set = null;
                }
                if (set == null) {
                    set = rs3.a;
                }
                v = fca.v(e, set);
            }
            for (String str2 : T().a.keySet()) {
                if (!v.contains(str2) && !c16.i(str2, this.d)) {
                    String n = eub.n('\'', "Encountered an unknown key '", str2);
                    String V = V();
                    if (r36Var.a.m) {
                        str = am8.C(T().toString(), -1).toString();
                    }
                    throw new q46(am8.z(n, -1, V, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", str));
                }
            }
        }
    }

    @Override // defpackage.a2, defpackage.yq2
    public final fx1 t(o9a o9aVar) {
        String str;
        o9aVar.getClass();
        o9a o9aVar2 = this.g;
        if (o9aVar == o9aVar2) {
            k46 G = G();
            String a = o9aVar2.a();
            boolean z = G instanceof d56;
            r36 r36Var = this.c;
            if (!z) {
                String str2 = "Expected " + cm9.a(d56.class).g() + ", but had " + cm9.a(G.getClass()).g() + " as the serialized body of " + a;
                String V = V();
                if (r36Var.a.m) {
                    str = am8.C(G.toString(), -1).toString();
                } else {
                    str = null;
                }
                throw new q46(am8.z(str2, -1, V, null, str));
            }
            return new n56(r36Var, (d56) G, this.d, o9aVar2);
        }
        return super.t(o9aVar);
    }

    @Override // defpackage.a2, defpackage.yq2
    public final boolean w() {
        if (!this.i && super.w()) {
            return true;
        }
        return false;
    }

    public /* synthetic */ n56(r36 r36Var, d56 d56Var, String str, int i) {
        this(r36Var, d56Var, (i & 4) != 0 ? null : str, (o9a) null);
    }
}
