package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b45  reason: default package */
/* loaded from: classes3.dex */
public final class b45 extends w0 {
    public final s76 a;
    public final s76 b;
    public final /* synthetic */ int c;
    public final a45 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b45(s76 s76Var, s76 s76Var2, int i) {
        this(s76Var, s76Var2, (byte) 0);
        this.c = i;
        s76Var.getClass();
        s76Var2.getClass();
        switch (i) {
            case 1:
                this(s76Var, s76Var2, (byte) 0);
                o9a e = s76Var.e();
                o9a e2 = s76Var2.e();
                e.getClass();
                e2.getClass();
                this.d = new a45("kotlin.collections.LinkedHashMap", e, e2);
                return;
            default:
                o9a e3 = s76Var.e();
                o9a e4 = s76Var2.e();
                e3.getClass();
                e4.getClass();
                this.d = new a45("kotlin.collections.HashMap", e3, e4);
                return;
        }
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        i(obj);
        o9a e = e();
        e.getClass();
        jbe k = jbeVar.k(e);
        Iterator h = h(obj);
        int i = 0;
        while (h.hasNext()) {
            Map.Entry entry = (Map.Entry) h.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            k.F(e(), i, this.a, key);
            i += 2;
            k.F(e(), i2, this.b, value);
        }
        k.K(e);
    }

    @Override // defpackage.s76
    public final o9a e() {
        switch (this.c) {
            case 0:
                return this.d;
            default:
                return this.d;
        }
    }

    @Override // defpackage.w0
    public final Object f() {
        switch (this.c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // defpackage.w0
    public final int g(Object obj) {
        int size;
        switch (this.c) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                hashMap.getClass();
                size = hashMap.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // defpackage.w0
    public final Iterator h(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.entrySet().iterator();
        }
    }

    @Override // defpackage.w0
    public final int i(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.size();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.size();
        }
    }

    @Override // defpackage.w0
    public final void k(fx1 fx1Var, int i, Object obj) {
        Object q;
        Map map = (Map) obj;
        map.getClass();
        Object q2 = fx1Var.q(e(), i, this.a, null);
        int f = fx1Var.f(e());
        if (f == i + 1) {
            boolean containsKey = map.containsKey(q2);
            s76 s76Var = this.b;
            if (containsKey && !(s76Var.e().e() instanceof w59)) {
                q = fx1Var.q(e(), f, s76Var, o17.p(q2, map));
            } else {
                q = fx1Var.q(e(), f, s76Var, null);
            }
            map.put(q2, q);
            return;
        }
        p1a.k(rs8.k("Value must follow key in a map, index for key: ", i, f, ", returned index for value: "));
    }

    @Override // defpackage.w0
    public final Object l(Object obj) {
        switch (this.c) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }

    @Override // defpackage.w0
    public final Object m(Object obj) {
        switch (this.c) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                hashMap.getClass();
                return hashMap;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                return linkedHashMap;
        }
    }

    public b45(s76 s76Var, s76 s76Var2, byte b) {
        this.a = s76Var;
        this.b = s76Var2;
    }
}
