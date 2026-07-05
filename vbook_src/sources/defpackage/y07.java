package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y07  reason: default package */
/* loaded from: classes3.dex */
public final class y07 implements s76 {
    public final s76 a;
    public final s76 b;
    public final /* synthetic */ int c;
    public final q9a d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y07(s76 s76Var, s76 s76Var2, int i) {
        this(s76Var, s76Var2, (byte) 0);
        this.c = i;
        switch (i) {
            case 1:
                this(s76Var, s76Var2, (byte) 0);
                o9a[] o9aVarArr = new o9a[0];
                if (!k4b.j0("kotlin.Pair")) {
                    hi1 hi1Var = new hi1("kotlin.Pair");
                    hi1Var.a("first", s76Var.e());
                    hi1Var.a("second", s76Var2.e());
                    this.d = new q9a("kotlin.Pair", a5b.f, hi1Var.c.size(), b00.D0(o9aVarArr), hi1Var);
                    return;
                }
                vs.m("Blank serial names are prohibited");
                throw null;
            default:
                this.d = aze.n("kotlin.collections.Map.Entry", a5b.h, new o9a[0], new j34(24, s76Var, s76Var2));
                return;
        }
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        Object key;
        Object value;
        jbe k = jbeVar.k(e());
        o9a e = e();
        s76 s76Var = this.a;
        int i = this.c;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                key = entry.getKey();
                break;
            default:
                yk8 yk8Var = (yk8) obj;
                yk8Var.getClass();
                key = yk8Var.a;
                break;
        }
        k.F(e, 0, s76Var, key);
        o9a e2 = e();
        s76 s76Var2 = this.b;
        switch (i) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                value = entry2.getValue();
                break;
            default:
                yk8 yk8Var2 = (yk8) obj;
                yk8Var2.getClass();
                value = yk8Var2.b;
                break;
        }
        k.F(e2, 1, s76Var2, value);
        k.K(e());
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        Object x07Var;
        o9a e = e();
        fx1 t = yq2Var.t(e);
        Object obj = sze.c;
        Object obj2 = obj;
        Object obj3 = obj2;
        while (true) {
            int f = t.f(e());
            if (f != -1) {
                if (f != 0) {
                    if (f == 1) {
                        obj3 = t.q(e(), 1, this.b, null);
                    } else {
                        throw new IllegalArgumentException(a82.j(f, "Invalid index: "));
                    }
                } else {
                    obj2 = t.q(e(), 0, this.a, null);
                }
            } else if (obj2 != obj) {
                if (obj3 != obj) {
                    switch (this.c) {
                        case 0:
                            x07Var = new x07(obj2, obj3);
                            break;
                        default:
                            x07Var = new yk8(obj2, obj3);
                            break;
                    }
                    t.n(e);
                    return x07Var;
                }
                throw new IllegalArgumentException("Element 'value' is missing");
            } else {
                throw new IllegalArgumentException("Element 'key' is missing");
            }
        }
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

    public y07(s76 s76Var, s76 s76Var2, byte b) {
        this.a = s76Var;
        this.b = s76Var2;
    }
}
