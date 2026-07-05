package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: noc  reason: default package */
/* loaded from: classes3.dex */
public final class noc implements s76 {
    public final s76 a;
    public final s76 b;
    public final s76 c;
    public final q9a d = aze.l("kotlin.Triple", new o9a[0], new zub(this, 6));

    public noc(s76 s76Var, s76 s76Var2, s76 s76Var3) {
        this.a = s76Var;
        this.b = s76Var2;
        this.c = s76Var3;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        moc mocVar = (moc) obj;
        mocVar.getClass();
        q9a q9aVar = this.d;
        jbe k = jbeVar.k(q9aVar);
        k.F(q9aVar, 0, this.a, mocVar.a);
        k.F(q9aVar, 1, this.b, mocVar.b);
        k.F(q9aVar, 2, this.c, mocVar.c);
        k.K(q9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        q9a q9aVar = this.d;
        fx1 t = yq2Var.t(q9aVar);
        Object obj = sze.c;
        Object obj2 = obj;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int f = t.f(q9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f == 2) {
                            obj4 = t.q(q9aVar, 2, this.c, null);
                        } else {
                            throw new IllegalArgumentException(a82.j(f, "Unexpected index "));
                        }
                    } else {
                        obj3 = t.q(q9aVar, 1, this.b, null);
                    }
                } else {
                    obj2 = t.q(q9aVar, 0, this.a, null);
                }
            } else {
                t.n(q9aVar);
                if (obj2 != obj) {
                    if (obj3 != obj) {
                        if (obj4 != obj) {
                            return new moc(obj2, obj3, obj4);
                        }
                        throw new IllegalArgumentException("Element 'third' is missing");
                    }
                    throw new IllegalArgumentException("Element 'second' is missing");
                }
                throw new IllegalArgumentException("Element 'first' is missing");
            }
        }
    }

    @Override // defpackage.s76
    public final o9a e() {
        return this.d;
    }
}
