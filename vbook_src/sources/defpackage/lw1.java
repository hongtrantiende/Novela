package defpackage;

import android.os.CancellationSignal;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lw1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lw1 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lw1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((iya) obj).cancel(null);
                return;
            case 1:
                gtb gtbVar = (gtb) obj;
                if (gtbVar != null) {
                    ol6 ol6Var = gtbVar.d;
                    if (ol6Var != null) {
                        ol6Var.e(fxb.b);
                    }
                    ol6 ol6Var2 = gtbVar.d;
                    if (ol6Var2 != null) {
                        ol6Var2.f(fxb.b);
                        return;
                    }
                    return;
                }
                return;
            default:
                mkc mkcVar = (mkc) obj;
                dub dubVar = mkcVar.a;
                og0 og0Var = mkcVar.b;
                dubVar.b.a().k();
                frb frbVar = dubVar.b;
                frbVar.E = null;
                mkcVar.o(frbVar);
                dub.a(dubVar, og0Var, true, wrb.a);
                dubVar.f(true);
                return;
        }
    }
}
