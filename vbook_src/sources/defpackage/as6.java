package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: as6  reason: default package */
/* loaded from: classes.dex */
public abstract class as6 {
    public final q78 a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ zu7 d;

    public as6(zu7 zu7Var, q78 q78Var) {
        this.d = zu7Var;
        this.a = q78Var;
    }

    public final void a(boolean z) {
        int i;
        boolean z2;
        boolean z3;
        if (z != this.b) {
            this.b = z;
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            zu7 zu7Var = this.d;
            int i2 = zu7Var.c;
            zu7Var.c = i + i2;
            if (!zu7Var.d) {
                zu7Var.d = true;
                while (true) {
                    try {
                        int i3 = zu7Var.c;
                        if (i2 == i3) {
                            break;
                        }
                        if (i2 == 0 && i3 > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i2 > 0 && i3 == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2) {
                            zu7Var.e();
                        } else if (z3) {
                            zu7Var.f();
                        }
                        i2 = i3;
                    } catch (Throwable th) {
                        zu7Var.d = false;
                        throw th;
                    }
                }
                zu7Var.d = false;
            }
            if (this.b) {
                zu7Var.c(this);
            }
        }
    }

    public boolean c(un6 un6Var) {
        return false;
    }

    public abstract boolean d();

    public void b() {
    }
}
