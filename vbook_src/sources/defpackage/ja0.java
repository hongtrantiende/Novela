package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ja0  reason: default package */
/* loaded from: classes3.dex */
public abstract class ja0 {
    public final /* synthetic */ int a;
    public kj6 b;
    public m82 c;
    public r13 d;
    public final hm8 e;
    public final hm8 f;
    public final hm8 g;
    public final hm8 h;

    public ja0(kj6 kj6Var, m82 m82Var, r13 r13Var, int i) {
        this.a = i;
        kj6Var.getClass();
        switch (i) {
            case 1:
                this.b = kj6Var;
                this.c = m82Var;
                this.d = r13Var;
                Boolean bool = Boolean.FALSE;
                this.e = yae.z(bool);
                this.f = yae.z(bool);
                this.g = yae.z(Float.valueOf((float) nae.e));
                this.h = yae.z(Float.valueOf(1.0f));
                return;
            default:
                this.b = kj6Var;
                this.c = m82Var;
                this.d = r13Var;
                Boolean bool2 = Boolean.FALSE;
                this.e = yae.z(bool2);
                this.f = yae.z(bool2);
                this.g = yae.z(Float.valueOf((float) nae.e));
                this.h = yae.z(Float.valueOf(1.0f));
                return;
        }
    }

    public abstract void a();

    public abstract boolean b();

    public final boolean c() {
        switch (this.a) {
            case 0:
                return ((Boolean) this.f.getValue()).booleanValue();
            default:
                return ((Boolean) this.f.getValue()).booleanValue();
        }
    }

    public abstract boolean d();

    public abstract void e();

    public abstract void f();

    public abstract void g(float f);

    public void h(float f) {
        this.g.setValue(Float.valueOf(f));
    }

    public abstract void i(float f);

    public abstract void j();

    public abstract void k();
}
