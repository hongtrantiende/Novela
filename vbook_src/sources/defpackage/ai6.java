package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ai6  reason: default package */
/* loaded from: classes.dex */
public final class ai6 {
    public final Object a;
    public final bi6 b;
    public int d;
    public ai6 e;
    public boolean f;
    public int c = -1;
    public final hm8 g = yae.z(null);

    public ai6(Object obj, bi6 bi6Var) {
        this.a = obj;
        this.b = bi6Var;
    }

    public final ai6 a() {
        if (this.f) {
            ov5.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.a.add(this);
            ai6 ai6Var = (ai6) this.g.getValue();
            if (ai6Var != null) {
                ai6Var.a();
            } else {
                ai6Var = null;
            }
            this.e = ai6Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (!this.f) {
            if (this.d <= 0) {
                ov5.c("Release should only be called once");
            }
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.b.a.remove(this);
                ai6 ai6Var = this.e;
                if (ai6Var != null) {
                    ai6Var.b();
                }
                this.e = null;
            }
        }
    }
}
