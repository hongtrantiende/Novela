package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o89  reason: default package */
/* loaded from: classes3.dex */
public final class o89 {
    public final qv7 a;
    public final String b;

    public o89(qv7 qv7Var, String str) {
        str.getClass();
        this.a = qv7Var;
        this.b = str;
    }

    public final Object a(Object obj) {
        Object obj2 = this.a.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        vs.k(s21.q(new StringBuilder("Field "), this.b, " is not set"));
        return null;
    }

    public final Object b(Object obj, Object obj2) {
        qv7 qv7Var = this.a;
        Object obj3 = qv7Var.get(obj);
        if (obj3 == null) {
            qv7Var.m(obj, obj2);
            return null;
        } else if (obj3.equals(obj2)) {
            return null;
        } else {
            return obj3;
        }
    }

    public /* synthetic */ o89(qv7 qv7Var) {
        this(qv7Var, qv7Var.getName());
    }
}
