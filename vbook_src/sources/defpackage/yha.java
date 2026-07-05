package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yha  reason: default package */
/* loaded from: classes3.dex */
public final class yha {
    public final boolean a;
    public final pe b;
    public final r13 c;

    public yha(boolean z, boolean z2, r13 r13Var, xt4 xt4Var) {
        pe peVar;
        r13Var.getClass();
        xt4Var.getClass();
        this.a = z2;
        if (z) {
            peVar = new pe(new gda(10), new vt4(this) { // from class: xha
                public final /* synthetic */ yha b;

                {
                    this.b = this;
                }

                @Override // defpackage.vt4
                public final Object invoke() {
                    int i = r2;
                    yha yhaVar = this.b;
                    switch (i) {
                        case 0:
                            r13 r13Var2 = yhaVar.c;
                            if (r13Var2 != null) {
                                return Float.valueOf(r13Var2.L0(400.0f));
                            }
                            vs.m("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?");
                            return null;
                        default:
                            r13 r13Var3 = yhaVar.c;
                            if (r13Var3 != null) {
                                return Float.valueOf(r13Var3.L0(125.0f));
                            }
                            vs.m("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?");
                            return null;
                    }
                }
            }, new arc(256, (mn3) null, 6), xt4Var);
        } else {
            peVar = new pe(new ux9(this, 10), new vt4(this) { // from class: xha
                public final /* synthetic */ yha b;

                {
                    this.b = this;
                }

                @Override // defpackage.vt4
                public final Object invoke() {
                    int i = r2;
                    yha yhaVar = this.b;
                    switch (i) {
                        case 0:
                            r13 r13Var2 = yhaVar.c;
                            if (r13Var2 != null) {
                                return Float.valueOf(r13Var2.L0(400.0f));
                            }
                            vs.m("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?");
                            return null;
                        default:
                            r13 r13Var3 = yhaVar.c;
                            if (r13Var3 != null) {
                                return Float.valueOf(r13Var3.L0(125.0f));
                            }
                            vs.m("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?");
                            return null;
                    }
                }
            }, tte.x(350, 0, new rd2(0.2f, 0.9f, 0.42f, 1.0f), 2), xt4Var);
        }
        this.b = peVar;
        this.c = r13Var;
    }

    public static Object a(yha yhaVar, zha zhaVar, aab aabVar) {
        float h = yhaVar.b.k.h();
        pe peVar = yhaVar.b;
        return peVar.b(zhaVar, jw7.a, new pd(peVar, h, null), aabVar);
    }

    public final zha b() {
        return (zha) this.b.g.getValue();
    }

    public final boolean c() {
        t07 d = this.b.d();
        return d.a.containsKey(zha.c);
    }

    public final zha d() {
        return (zha) this.b.h.getValue();
    }

    public final boolean e() {
        if (this.b.g.getValue() != zha.a) {
            return true;
        }
        return false;
    }

    public final Object f(aab aabVar) {
        if (!this.a) {
            return a(this, zha.c, aabVar);
        }
        vs.k("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        return null;
    }

    public final Object g(float f, aab aabVar) {
        pe peVar = this.b;
        Object value = peVar.g.getValue();
        Object c = peVar.c(peVar.f(), f, value);
        boolean booleanValue = ((Boolean) peVar.d.invoke(c)).booleanValue();
        jw7 jw7Var = jw7.a;
        if (booleanValue) {
            return peVar.b(c, jw7Var, new pd(peVar, f, null), aabVar);
        }
        return peVar.b(value, jw7Var, new pd(peVar, f, null), aabVar);
    }
}
