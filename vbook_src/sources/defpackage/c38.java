package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c38  reason: default package */
/* loaded from: classes.dex */
public final class c38 implements e38 {
    @Override // defpackage.e38
    public final boolean a(mq7 mq7Var) {
        gw7 gw7Var = null;
        while (mq7Var != null) {
            if (mq7Var instanceof c19) {
                ((c19) mq7Var).w0();
            } else if ((mq7Var.c & 16) != 0 && (mq7Var instanceof m03)) {
                int i = 0;
                for (mq7 mq7Var2 = ((m03) mq7Var).L; mq7Var2 != null; mq7Var2 = mq7Var2.f) {
                    if ((mq7Var2.c & 16) != 0) {
                        i++;
                        if (i == 1) {
                            mq7Var = mq7Var2;
                        } else {
                            if (gw7Var == null) {
                                gw7Var = new gw7(new mq7[16], 0);
                            }
                            if (mq7Var != null) {
                                gw7Var.b(mq7Var);
                                mq7Var = null;
                            }
                            gw7Var.b(mq7Var2);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            mq7Var = voe.h(gw7Var);
        }
        return false;
    }

    @Override // defpackage.e38
    public final int b() {
        return 16;
    }

    @Override // defpackage.e38
    public final void e(od6 od6Var, long j, a75 a75Var, int i, boolean z) {
        od6Var.A(j, a75Var, i, z);
    }

    @Override // defpackage.e38
    public final boolean f(a75 a75Var, od6 od6Var) {
        i38 i38Var = (i38) od6Var.c0.e;
        i38Var.getClass();
        mq7 G1 = i38Var.G1(o38.g(16));
        if (G1 != null && G1.J) {
            if (!G1.a.J) {
                lv5.c("visitLocalDescendants called on an unattached node");
            }
            mq7 mq7Var = G1.a;
            if ((mq7Var.d & 16) != 0) {
                while (mq7Var != null) {
                    if ((mq7Var.c & 16) != 0) {
                        mq7 mq7Var2 = mq7Var;
                        gw7 gw7Var = null;
                        while (mq7Var2 != null) {
                            if (mq7Var2 instanceof c19) {
                                if (((c19) mq7Var2).d1()) {
                                    a75Var.c = a75Var.a.b - 1;
                                    return true;
                                }
                            } else if ((mq7Var2.c & 16) != 0 && (mq7Var2 instanceof m03)) {
                                int i = 0;
                                for (mq7 mq7Var3 = ((m03) mq7Var2).L; mq7Var3 != null; mq7Var3 = mq7Var3.f) {
                                    if ((mq7Var3.c & 16) != 0) {
                                        i++;
                                        if (i == 1) {
                                            mq7Var2 = mq7Var3;
                                        } else {
                                            if (gw7Var == null) {
                                                gw7Var = new gw7(new mq7[16], 0);
                                            }
                                            if (mq7Var2 != null) {
                                                gw7Var.b(mq7Var2);
                                                mq7Var2 = null;
                                            }
                                            gw7Var.b(mq7Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            mq7Var2 = voe.h(gw7Var);
                        }
                        continue;
                    }
                    mq7Var = mq7Var.f;
                }
            }
        }
        return false;
    }

    @Override // defpackage.e38
    public final boolean h(od6 od6Var) {
        return true;
    }
}
