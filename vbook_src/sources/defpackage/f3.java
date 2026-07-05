package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f3  reason: default package */
/* loaded from: classes3.dex */
public abstract class f3 implements s76 {
    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        obj.getClass();
        s76 O = b16.O(this, jbeVar, obj);
        o9a e = e();
        jbe k = jbeVar.k(e);
        k.J(e(), 0, O.e().a());
        k.F(e(), 1, O, obj);
        k.K(e);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a e = e();
        fx1 t = yq2Var.t(e);
        Object obj = null;
        String str = null;
        while (true) {
            int f = t.f(e());
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb.append(str);
                        sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb.append(f);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (str != null) {
                        obj = t.q(e(), f, b16.N(this, t, str), null);
                    } else {
                        vs.m("Cannot read polymorphic value before its type token");
                        return null;
                    }
                } else {
                    str = t.k(e(), f);
                }
            } else if (obj != null) {
                t.n(e);
                return obj;
            } else {
                p1a.k(s21.m("Polymorphic value has not been read for class ", str));
                return null;
            }
        }
    }

    public s76 f(fx1 fx1Var, String str) {
        s76 s76Var;
        xt4 xt4Var;
        wf2 o = fx1Var.o();
        gi1 h = h();
        o.getClass();
        h.getClass();
        Map map = (Map) ((Map) o.e).get(h);
        if (map != null) {
            s76Var = (s76) map.get(str);
        } else {
            s76Var = null;
        }
        if (!(s76Var instanceof s76)) {
            s76Var = null;
        }
        if (s76Var != null) {
            return s76Var;
        }
        Object obj = ((Map) o.f).get(h);
        if (jsc.G(1, obj)) {
            xt4Var = (xt4) obj;
        } else {
            xt4Var = null;
        }
        if (xt4Var == null) {
            return null;
        }
        return (s76) xt4Var.invoke(str);
    }

    public s76 g(jbe jbeVar, Object obj) {
        s76 s76Var;
        s76 s76Var2;
        xt4 xt4Var;
        obj.getClass();
        wf2 T = jbeVar.T();
        gi1 h = h();
        T.getClass();
        h.getClass();
        if (h.h(obj)) {
            Map map = (Map) ((Map) T.c).get(h);
            if (map != null) {
                s76Var = (s76) map.get(cm9.a(obj.getClass()));
            } else {
                s76Var = null;
            }
            if (s76Var instanceof s76) {
                s76Var2 = s76Var;
            } else {
                s76Var2 = null;
            }
            if (s76Var2 != null) {
                return s76Var2;
            }
            Object obj2 = ((Map) T.d).get(h);
            if (jsc.G(1, obj2)) {
                xt4Var = (xt4) obj2;
            } else {
                xt4Var = null;
            }
            if (xt4Var != null) {
                return (s76) xt4Var.invoke(obj);
            }
        }
        return null;
    }

    public abstract gi1 h();
}
