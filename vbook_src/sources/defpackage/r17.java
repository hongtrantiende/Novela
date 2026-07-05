package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r17  reason: default package */
/* loaded from: classes.dex */
public final class r17 extends uq7 {
    public final int b;
    public final xk5 c;
    public final float d;

    public r17(int i, xk5 xk5Var, float f) {
        this.b = i;
        this.c = xk5Var;
        this.d = f;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new s17(this.b, this.c, this.d);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(3, "iterations");
        c00Var.b(new Object(), "animationMode");
        c00Var.b(1200, "delayMillis");
        c00Var.b(Integer.valueOf(this.b), "initialDelayMillis");
        c00Var.b(this.c, "spacing");
        c00Var.b(new rg3(this.d), "velocity");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        s17 s17Var = (s17) mq7Var;
        s17Var.R.setValue(this.c);
        s17Var.S.setValue(new Object());
        int i = s17Var.K;
        int i2 = this.b;
        float f = this.d;
        if (i == i2 && rg3.b(s17Var.L, f)) {
            return;
        }
        s17Var.K = i2;
        s17Var.L = f;
        s17Var.I1();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r17) {
                r17 r17Var = (r17) obj;
                if (this.b != r17Var.b || !c16.i(this.c, r17Var.c) || !rg3.b(this.d, r17Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int a = hl5.a(this.b, hl5.a(1200, hl5.a(0, Integer.hashCode(3) * 31, 31), 31), 31);
        return Float.hashCode(this.d) + ((this.c.hashCode() + a) * 31);
    }

    public final String toString() {
        String c = rg3.c(this.d);
        StringBuilder sb = new StringBuilder("MarqueeModifierElement(iterations=3, animationMode=Immediately, delayMillis=1200, initialDelayMillis=");
        sb.append(this.b);
        sb.append(", spacing=");
        sb.append(this.c);
        sb.append(", velocity=");
        return s21.q(sb, c, ")");
    }
}
