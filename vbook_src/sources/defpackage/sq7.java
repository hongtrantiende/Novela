package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sq7  reason: default package */
/* loaded from: classes.dex */
public interface sq7 extends f03 {
    default xpe E0() {
        return ms3.f;
    }

    default Object f0(g99 g99Var) {
        kn knVar;
        mq7 mq7Var = (mq7) this;
        if (!mq7Var.a.J) {
            lv5.a("ModifierLocal accessed from an unattached node");
        }
        if (!mq7Var.a.J) {
            lv5.c("visitAncestors called on an unattached node");
        }
        mq7 mq7Var2 = mq7Var.a.e;
        od6 v = voe.v(this);
        while (v != null) {
            if ((((mq7) v.c0.C).d & 32) != 0) {
                while (mq7Var2 != null) {
                    if ((mq7Var2.c & 32) != 0) {
                        mq7 mq7Var3 = mq7Var2;
                        gw7 gw7Var = null;
                        while (mq7Var3 != null) {
                            if (mq7Var3 instanceof sq7) {
                                sq7 sq7Var = (sq7) mq7Var3;
                                if (sq7Var.E0().e(g99Var)) {
                                    return sq7Var.E0().g(g99Var);
                                }
                            } else if ((mq7Var3.c & 32) != 0 && (mq7Var3 instanceof m03)) {
                                int i = 0;
                                for (mq7 mq7Var4 = ((m03) mq7Var3).L; mq7Var4 != null; mq7Var4 = mq7Var4.f) {
                                    if ((mq7Var4.c & 32) != 0) {
                                        i++;
                                        if (i == 1) {
                                            mq7Var3 = mq7Var4;
                                        } else {
                                            if (gw7Var == null) {
                                                gw7Var = new gw7(new mq7[16], 0);
                                            }
                                            if (mq7Var3 != null) {
                                                gw7Var.b(mq7Var3);
                                                mq7Var3 = null;
                                            }
                                            gw7Var.b(mq7Var4);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            mq7Var3 = voe.h(gw7Var);
                        }
                        continue;
                    }
                    mq7Var2 = mq7Var2.e;
                }
            }
            v = v.v();
            if (v != null && (knVar = v.c0) != null) {
                mq7Var2 = (hkb) knVar.f;
            } else {
                mq7Var2 = null;
            }
        }
        return ((vt4) g99Var.b).invoke();
    }
}
