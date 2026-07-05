package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vi0  reason: default package */
/* loaded from: classes.dex */
public final class vi0 implements xob {
    public final tu1 a;
    public final ow7 b = new ow7();
    public final hm8 c = yae.z(null);

    public vi0(tu1 tu1Var) {
        this.a = tu1Var;
    }

    @Override // defpackage.xob
    public final Object a(oob oobVar, aab aabVar) {
        ge geVar = new ge(this, new ui0(oobVar), null, 4);
        ow7 ow7Var = this.b;
        ow7Var.getClass();
        Object p = k27.p(new xr0(jw7.a, ow7Var, geVar, (m42) null, 13), aabVar);
        if (p == n82.a) {
            return p;
        }
        return pvc.a;
    }

    public final void b(final vt4 vt4Var, rv4 rv4Var, final int i) {
        int i2;
        boolean z;
        final vt4 vt4Var2;
        rv4 rv4Var2;
        rv4Var.g0(723898654);
        if (rv4Var.f(this)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i3 = i2 | i;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            ui0 ui0Var = (ui0) this.c.getValue();
            if (ui0Var == null) {
                ek9 u = rv4Var.u();
                if (u != null) {
                    u.d = new lu4(this, vt4Var, i, 0) { // from class: ti0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ vi0 b;
                        public final /* synthetic */ vt4 c;

                        {
                            this.a = r4;
                            this.b = this;
                        }

                        @Override // defpackage.lu4
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.a;
                            pvc pvcVar = pvc.a;
                            vt4 vt4Var3 = this.c;
                            vi0 vi0Var = this.b;
                            rv4 rv4Var3 = (rv4) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    vi0Var.b(vt4Var3, rv4Var3, xoe.p(7));
                                    return pvcVar;
                                default:
                                    vi0Var.b(vt4Var3, rv4Var3, xoe.p(7));
                                    return pvcVar;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            vt4Var2 = vt4Var;
            rv4Var2 = rv4Var;
            this.a.l(ui0Var, ui0Var.a, vt4Var2, rv4Var2, 384);
        } else {
            vt4Var2 = vt4Var;
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u2 = rv4Var2.u();
        if (u2 != null) {
            u2.d = new lu4(this, vt4Var2, i, 1) { // from class: ti0
                public final /* synthetic */ int a;
                public final /* synthetic */ vi0 b;
                public final /* synthetic */ vt4 c;

                {
                    this.a = r4;
                    this.b = this;
                }

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = this.a;
                    pvc pvcVar = pvc.a;
                    vt4 vt4Var3 = this.c;
                    vi0 vi0Var = this.b;
                    rv4 rv4Var3 = (rv4) obj;
                    ((Integer) obj2).getClass();
                    switch (i4) {
                        case 0:
                            vi0Var.b(vt4Var3, rv4Var3, xoe.p(7));
                            return pvcVar;
                        default:
                            vi0Var.b(vt4Var3, rv4Var3, xoe.p(7));
                            return pvcVar;
                    }
                }
            };
        }
    }
}
