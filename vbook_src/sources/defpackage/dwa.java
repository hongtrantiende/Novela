package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dwa  reason: default package */
/* loaded from: classes.dex */
public final class dwa {
    public final <T> s76 serializer(final s76 s76Var) {
        s76Var.getClass();
        return new rw4() { // from class: cwa
            private final o9a descriptor;

            {
                n09 n09Var = new n09("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
                n09Var.k("keys", false);
                n09Var.k("values", false);
                this.descriptor = n09Var;
            }

            @Override // defpackage.s76
            public final void a(jbe jbeVar, Object obj) {
                ewa ewaVar = (ewa) obj;
                ewaVar.getClass();
                o9a o9aVar = this.descriptor;
                jbe k = jbeVar.k(o9aVar);
                k.F(o9aVar, 0, (s76) ewa.c[0].getValue(), ewaVar.a);
                k.F(o9aVar, 1, new sz(s76Var, 0), ewaVar.b);
                k.K(o9aVar);
            }

            @Override // defpackage.rw4
            public final s76[] b() {
                return new s76[]{s76Var};
            }

            @Override // defpackage.s76
            public final Object c(yq2 yq2Var) {
                o9a o9aVar = this.descriptor;
                fx1 t = yq2Var.t(o9aVar);
                ye6[] ye6VarArr = ewa.c;
                boolean z = true;
                int i = 0;
                List list = null;
                List list2 = null;
                while (z) {
                    int f = t.f(o9aVar);
                    if (f != -1) {
                        if (f != 0) {
                            if (f == 1) {
                                list2 = (List) t.q(o9aVar, 1, new sz(s76Var, 0), list2);
                                i |= 2;
                            } else {
                                fb4.a(f);
                                return null;
                            }
                        } else {
                            list = (List) t.q(o9aVar, 0, (s76) ye6VarArr[0].getValue(), list);
                            i |= 1;
                        }
                    } else {
                        z = false;
                    }
                }
                t.n(o9aVar);
                return new ewa(i, list, list2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.rw4
            public final s76[] d() {
                return new s76[]{ewa.c[0].getValue(), new sz(s76Var, 0)};
            }

            @Override // defpackage.s76
            public final o9a e() {
                return this.descriptor;
            }
        };
    }
}
