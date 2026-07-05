package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oc5  reason: default package */
/* loaded from: classes.dex */
public final class oc5 {
    public static final oc5 g;
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final List e;
    public final qc5 f;

    static {
        qc5 qc5Var = qc5.a;
        g = new oc5(sx2.c, o17.s(new yk8(cm9.a(en0.class), zpe.b), new yk8(cm9.a(cn0.class), zpe.c), new yk8(cm9.a(fn0.class), zpe.d), new yk8(cm9.a(an0.class), zpe.e), new yk8(cm9.a(bn0.class), zpe.f)), ls3.a, o17.s(new yk8(cm9.a(hva.class), jqe.f), new yk8(cm9.a(ova.class), jqe.g), new yk8(cm9.a(rva.class), jqe.h), new yk8(cm9.a(qva.class), jqe.i), new yk8(cm9.a(lva.class), jqe.j), new yk8(cm9.a(pva.class), jqe.k), new yk8(cm9.a(jva.class), jqe.l), new yk8(cm9.a(iva.class), jqe.q), new yk8(cm9.a(mva.class), jqe.m), new yk8(cm9.a(sva.class), jqe.n), new yk8(cm9.a(nva.class), jqe.o), new yk8(cm9.a(kva.class), jqe.p)), tl1.A(new Object()), qc5.a);
    }

    public oc5(Map map, Map map2, Map map3, Map map4, List list, qc5 qc5Var) {
        map.getClass();
        map3.getClass();
        qc5Var.getClass();
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = map4;
        this.e = list;
        this.f = qc5Var;
    }

    public static oc5 a(oc5 oc5Var, Map map, Map map2, int i) {
        if ((i & 1) != 0) {
            map = oc5Var.a;
        }
        Map map3 = map;
        Map map4 = oc5Var.b;
        if ((i & 4) != 0) {
            map2 = oc5Var.c;
        }
        Map map5 = oc5Var.d;
        oc5Var.getClass();
        List list = oc5Var.e;
        oc5Var.getClass();
        oc5Var.getClass();
        oc5Var.getClass();
        oc5Var.getClass();
        oc5Var.getClass();
        oc5Var.getClass();
        qc5 qc5Var = oc5Var.f;
        oc5Var.getClass();
        return new oc5(map3, map4, map2, map5, list, qc5Var);
    }

    public final oc5 b(String str, ckb ckbVar) {
        Map map;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        Map map2 = this.a;
        map2.getClass();
        if (map2.isEmpty()) {
            map = Collections.singletonMap(lowerCase, ckbVar);
            map.getClass();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
            linkedHashMap.put(lowerCase, ckbVar);
            map = linkedHashMap;
        }
        return a(this, map, null, 8190);
    }
}
