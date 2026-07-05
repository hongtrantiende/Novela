package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nr9  reason: default package */
/* loaded from: classes3.dex */
public final class nr9 {
    public final <T> s76 serializer(final s76 s76Var) {
        s76Var.getClass();
        return new rw4() { // from class: mr9
            private final o9a descriptor;

            {
                n09 n09Var = new n09("com.reader.data.community.api.Response", this, 2);
                n09Var.k("code", true);
                n09Var.k("data", false);
                this.descriptor = n09Var;
            }

            @Override // defpackage.s76
            public final void a(jbe jbeVar, Object obj) {
                or9 or9Var = (or9) obj;
                or9Var.getClass();
                int i = or9Var.a;
                o9a o9aVar = this.descriptor;
                jbe k = jbeVar.k(o9aVar);
                if (k.V(o9aVar) || i != 0) {
                    k.z(0, i, o9aVar);
                }
                k.E(o9aVar, 1, s76Var, or9Var.b);
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
                boolean z = true;
                int i = 0;
                int i2 = 0;
                Object obj = null;
                while (z) {
                    int f = t.f(o9aVar);
                    if (f != -1) {
                        if (f != 0) {
                            if (f == 1) {
                                obj = t.x(o9aVar, 1, s76Var, obj);
                                i |= 2;
                            } else {
                                fb4.a(f);
                                return null;
                            }
                        } else {
                            i2 = t.r(o9aVar, 0);
                            i |= 1;
                        }
                    } else {
                        z = false;
                    }
                }
                t.n(o9aVar);
                return new or9(i, obj, i2);
            }

            @Override // defpackage.rw4
            public final s76[] d() {
                return new s76[]{xy5.a, wq9.H(s76Var)};
            }

            @Override // defpackage.s76
            public final o9a e() {
                return this.descriptor;
            }
        };
    }
}
