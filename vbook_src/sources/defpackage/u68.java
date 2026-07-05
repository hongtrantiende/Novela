package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u68  reason: default package */
/* loaded from: classes3.dex */
public final class u68 extends c41 {
    public final /* synthetic */ int c = 1;
    public final h49 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u68(h49 h49Var, String str, s76 s76Var) {
        super(str, 3);
        h49Var.getClass();
        s76Var.getClass();
        this.d = h49Var;
        this.e = s76Var;
    }

    @Override // defpackage.c41
    public final Object d(String str) {
        Object gs9Var;
        int i = this.c;
        Object obj = this.e;
        h49 h49Var = this.d;
        switch (i) {
            case 0:
                str.getClass();
                try {
                    h49Var.getClass();
                    gs9Var = v46.a.a((s76) obj, h49Var.e(str, ""));
                } catch (Throwable th) {
                    gs9Var = new gs9(th);
                }
                if (gs9Var instanceof gs9) {
                    return null;
                }
                return gs9Var;
            default:
                str.getClass();
                h49Var.getClass();
                return h49Var.e(str, (String) obj);
        }
    }

    @Override // defpackage.c41
    public final void f(Object obj, String str) {
        int i = this.c;
        h49 h49Var = this.d;
        switch (i) {
            case 0:
                str.getClass();
                if (obj == null) {
                    h49Var.getClass();
                    sn0 d = h49Var.d();
                    d.getClass();
                    z87.B(new on0(d, str, null, 4));
                    return;
                }
                zve.i(h49Var, str, v46.a.b((s76) this.e, obj));
                return;
            default:
                String str2 = (String) obj;
                str.getClass();
                str2.getClass();
                zve.i(h49Var, str, str2);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u68(h49 h49Var, String str, String str2) {
        super(str, 3);
        h49Var.getClass();
        this.d = h49Var;
        this.e = str2;
    }
}
