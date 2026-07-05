package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vfb  reason: default package */
/* loaded from: classes.dex */
public final class vfb {
    public final rm a;

    public vfb(rm rmVar) {
        this.a = rmVar;
    }

    public final void a(tfb tfbVar) {
        qm qmVar;
        rm m = hud.m(this);
        if (m != null) {
            int ordinal = tfbVar.ordinal();
            int i = 2;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        qmVar = qm.c;
                    } else {
                        xk5.o();
                        return;
                    }
                } else {
                    qmVar = qm.b;
                }
            } else {
                qmVar = qm.a;
            }
            bp9 bp9Var = m.c;
            if (bp9Var != null) {
                int ordinal2 = qmVar.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            xk5.o();
                            return;
                        }
                    } else {
                        i = 1;
                    }
                } else {
                    i = 519;
                }
                ((kwe) bp9Var.b).G(i);
            }
        }
    }

    public final void b(rfb rfbVar) {
        om omVar;
        rm m = hud.m(this);
        if (m != null) {
            int ordinal = rfbVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    omVar = om.b;
                } else {
                    xk5.o();
                    return;
                }
            } else {
                omVar = om.a;
            }
            m.c(omVar);
        }
    }

    public final void c(sfb sfbVar) {
        rm m = hud.m(this);
        if (m != null) {
            m.a(qm.c, new pm(Integer.valueOf(sve.x(sfbVar.a)), sfbVar.b));
        }
    }

    public final void d(sfb sfbVar) {
        rm m = hud.m(this);
        if (m != null) {
            m.a(qm.b, new pm(Integer.valueOf(sve.x(sfbVar.a)), sfbVar.b));
        }
    }

    public final void e(tfb tfbVar) {
        qm qmVar;
        rm m = hud.m(this);
        if (m != null) {
            int ordinal = tfbVar.ordinal();
            int i = 2;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        qmVar = qm.c;
                    } else {
                        xk5.o();
                        return;
                    }
                } else {
                    qmVar = qm.b;
                }
            } else {
                qmVar = qm.a;
            }
            bp9 bp9Var = m.c;
            if (bp9Var != null) {
                int ordinal2 = qmVar.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            xk5.o();
                            return;
                        }
                    } else {
                        i = 1;
                    }
                } else {
                    i = 519;
                }
                ((kwe) bp9Var.b).Q(i);
            }
        }
    }
}
