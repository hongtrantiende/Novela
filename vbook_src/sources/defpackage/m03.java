package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m03  reason: default package */
/* loaded from: classes.dex */
public abstract class m03 extends mq7 {
    public final int K = o38.e(this);
    public mq7 L;

    @Override // defpackage.mq7
    public final void C1() {
        super.C1();
        for (mq7 mq7Var = this.L; mq7Var != null; mq7Var = mq7Var.f) {
            mq7Var.C1();
        }
    }

    @Override // defpackage.mq7
    public final void D1() {
        for (mq7 mq7Var = this.L; mq7Var != null; mq7Var = mq7Var.f) {
            mq7Var.D1();
        }
        super.D1();
    }

    @Override // defpackage.mq7
    public final void E1() {
        super.E1();
        for (mq7 mq7Var = this.L; mq7Var != null; mq7Var = mq7Var.f) {
            mq7Var.E1();
        }
    }

    @Override // defpackage.mq7
    public final void F1(mq7 mq7Var) {
        this.a = mq7Var;
        for (mq7 mq7Var2 = this.L; mq7Var2 != null; mq7Var2 = mq7Var2.f) {
            mq7Var2.F1(mq7Var);
        }
    }

    @Override // defpackage.mq7
    public final void G1(i38 i38Var) {
        this.D = i38Var;
        for (mq7 mq7Var = this.L; mq7Var != null; mq7Var = mq7Var.f) {
            mq7Var.G1(i38Var);
        }
    }

    public final f03 H1(f03 f03Var) {
        mq7 mq7Var;
        mq7 mq7Var2;
        mq7 mq7Var3 = ((mq7) f03Var).a;
        if (mq7Var3 != f03Var) {
            if (f03Var instanceof mq7) {
                mq7Var = (mq7) f03Var;
            } else {
                mq7Var = null;
            }
            if (mq7Var != null) {
                mq7Var2 = mq7Var.e;
            } else {
                mq7Var2 = null;
            }
            if (mq7Var3 != this.a || !c16.i(mq7Var2, this)) {
                vs.k("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (mq7Var3.J) {
                lv5.c("Cannot delegate to an already attached node");
            }
            mq7Var3.F1(this.a);
            int i = this.c;
            int f = o38.f(mq7Var3);
            mq7Var3.c = f;
            int i2 = this.c;
            int i3 = f & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof fd6)) {
                lv5.c("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + mq7Var3);
            }
            mq7Var3.f = this.L;
            this.L = mq7Var3;
            mq7Var3.e = this;
            J1(f | this.c, false);
            if (this.J) {
                if (i3 != 0 && (i & 2) == 0) {
                    kn knVar = voe.v(this).c0;
                    this.a.G1(null);
                    knVar.m();
                } else {
                    G1(this.D);
                }
                mq7Var3.x1();
                mq7Var3.D1();
                if (!mq7Var3.J) {
                    lv5.c("autoInvalidateInsertedNode called on unattached node");
                }
                o38.a(mq7Var3, -1, 1);
            }
        }
        return f03Var;
    }

    public final void I1(f03 f03Var) {
        mq7 mq7Var = null;
        for (mq7 mq7Var2 = this.L; mq7Var2 != null; mq7Var2 = mq7Var2.f) {
            if (mq7Var2 == f03Var) {
                boolean z = mq7Var2.J;
                if (z) {
                    gv7 gv7Var = o38.a;
                    if (!z) {
                        lv5.c("autoInvalidateRemovedNode called on unattached node");
                    }
                    o38.a(mq7Var2, -1, 2);
                    mq7Var2.E1();
                    mq7Var2.y1();
                }
                mq7Var2.F1(mq7Var2);
                mq7Var2.d = 0;
                mq7 mq7Var3 = mq7Var2.f;
                if (mq7Var == null) {
                    this.L = mq7Var3;
                } else {
                    mq7Var.f = mq7Var3;
                }
                mq7Var2.f = null;
                mq7Var2.e = null;
                int i = this.c;
                int f = o38.f(this);
                J1(f, true);
                if (this.J && (i & 2) != 0 && (f & 2) == 0) {
                    kn knVar = voe.v(this).c0;
                    this.a.G1(null);
                    knVar.m();
                    return;
                }
                return;
            }
            mq7Var = mq7Var2;
        }
        xk5.p(f03Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [mq7] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final void J1(int i, boolean z) {
        int i2;
        mq7 mq7Var;
        int i3 = this.c;
        this.c = i;
        if (i3 != i) {
            mq7 mq7Var2 = this.a;
            if (mq7Var2 == this) {
                this.d = i;
            }
            boolean z2 = this.J;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.c;
                    r2.c = i;
                    if (r2 == mq7Var2) {
                        break;
                    }
                    r2 = r2.e;
                }
                if (z && r2 == mq7Var2) {
                    i = o38.f(mq7Var2);
                    mq7Var2.c = i;
                }
                if (r2 != 0 && (mq7Var = r2.f) != null) {
                    i2 = mq7Var.d;
                } else {
                    i2 = 0;
                }
                int i4 = i | i2;
                for (mq7 mq7Var3 = r2; mq7Var3 != null; mq7Var3 = mq7Var3.e) {
                    i4 |= mq7Var3.c;
                    mq7Var3.d = i4;
                }
            }
        }
    }

    @Override // defpackage.mq7
    public final void x1() {
        super.x1();
        for (mq7 mq7Var = this.L; mq7Var != null; mq7Var = mq7Var.f) {
            mq7Var.G1(this.D);
            if (!mq7Var.J) {
                mq7Var.x1();
            }
        }
    }

    @Override // defpackage.mq7
    public final void y1() {
        for (mq7 mq7Var = this.L; mq7Var != null; mq7Var = mq7Var.f) {
            mq7Var.y1();
        }
        super.y1();
    }
}
