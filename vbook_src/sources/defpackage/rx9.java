package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rx9  reason: default package */
/* loaded from: classes.dex */
public final class rx9 implements bn9 {
    public final ak9 C = new ak9(this, 6);
    public xy9 a;
    public xx9 b;
    public String c;
    public Object d;
    public Object[] e;
    public wx9 f;

    public rx9(xy9 xy9Var, xx9 xx9Var, String str, Object obj, Object[] objArr) {
        this.a = xy9Var;
        this.b = xx9Var;
        this.c = str;
        this.d = obj;
        this.e = objArr;
    }

    @Override // defpackage.bn9
    public final void a() {
        wx9 wx9Var = this.f;
        if (wx9Var != null) {
            ((yx9) wx9Var).o();
        }
    }

    @Override // defpackage.bn9
    public final void b() {
        wx9 wx9Var = this.f;
        if (wx9Var != null) {
            ((yx9) wx9Var).o();
        }
    }

    @Override // defpackage.bn9
    public final void c() {
        d();
    }

    public final void d() {
        String h;
        xx9 xx9Var = this.b;
        wx9 wx9Var = this.f;
        if (wx9Var == null) {
            if (xx9Var != null) {
                ak9 ak9Var = this.C;
                Object invoke = ak9Var.invoke();
                if (invoke != null && !xx9Var.c(invoke)) {
                    if (invoke instanceof ira) {
                        ira iraVar = (ira) invoke;
                        if (iraVar.d() != r0f.J && iraVar.d() != zj1.G && iraVar.d() != r0f.L) {
                            h = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                        } else {
                            h = "MutableState containing " + iraVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                        }
                    } else {
                        h = zpe.h(invoke);
                    }
                    throw new IllegalArgumentException(h);
                }
                this.f = xx9Var.a(this.c, ak9Var);
                return;
            }
            return;
        }
        hfd.h(wx9Var, ") is not null", "entry(");
    }
}
