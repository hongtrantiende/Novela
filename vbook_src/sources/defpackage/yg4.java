package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yg4  reason: default package */
/* loaded from: classes.dex */
public final class yg4 implements na4 {
    public final /* synthetic */ int a = 1;
    public final j99 b;
    public final nt2 c;

    public yg4(j99 j99Var, nt2 nt2Var) {
        this.b = j99Var;
        this.c = nt2Var;
    }

    @Override // defpackage.k99
    public final Object get() {
        int i = this.a;
        nt2 nt2Var = this.c;
        j99 j99Var = this.b;
        switch (i) {
            case 0:
                Context context = (Context) nt2Var.a;
                d82 d82Var = (d82) j99Var.get();
                context.getClass();
                d82Var.getClass();
                return wg4.a(tn3.H, new bp9(new dw3(27), 0), k27.a(d82Var), new vg4(context, 0));
            default:
                return new nn9((ky) j99Var.get(), (d82) nt2Var.a);
        }
    }

    public yg4(nt2 nt2Var, j99 j99Var) {
        this.c = nt2Var;
        this.b = j99Var;
    }
}
