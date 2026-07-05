package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bp3  reason: default package */
/* loaded from: classes.dex */
public final class bp3 implements t38 {
    public final /* synthetic */ int a;
    public final StringBuilder b;

    public bp3(int i, StringBuilder sb) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = sb;
                return;
            default:
                sb.getClass();
                this.b = sb;
                return;
        }
    }

    @Override // defpackage.t38
    public void a(y28 y28Var, int i) {
        if (y28Var instanceof cp3) {
            y28 t = y28Var.t();
            if ((((cp3) y28Var).e.d & 4) == 0) {
                return;
            }
            if (!(t instanceof fwb) && (!(t instanceof cp3) || (((cp3) t).e.d & 4) != 0)) {
                return;
            }
            int i2 = fwb.e;
            StringBuilder sb = this.b;
            if (!tye.k(sb)) {
                sb.append(' ');
            }
        }
    }

    public bp3 b(char c) {
        this.b.append(c);
        return this;
    }

    public bp3 c(String str) {
        this.b.append((CharSequence) str);
        return this;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return this.b.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.t38
    public void v(y28 y28Var, int i) {
        boolean z = y28Var instanceof fwb;
        StringBuilder sb = this.b;
        if (z) {
            ap3 ap3Var = cp3.E;
            cne.d(sb, (fwb) y28Var);
        } else if ((y28Var instanceof cp3) && sb.length() > 0) {
            if ((((cp3) y28Var).e.d & 4) != 0 || y28Var.r("br")) {
                int i2 = fwb.e;
                if (!tye.k(sb)) {
                    sb.append(' ');
                }
            }
        }
    }
}
