package defpackage;

import android.view.WindowInsets;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dp  reason: default package */
/* loaded from: classes.dex */
public final class dp extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wcd b;
    public final /* synthetic */ od6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dp(wcd wcdVar, od6 od6Var, int i) {
        super(1);
        this.a = i;
        this.b = wcdVar;
        this.c = od6Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        rg rgVar;
        WindowInsets b;
        int i = this.a;
        pvc pvcVar = pvc.a;
        od6 od6Var = this.c;
        wcd wcdVar = this.b;
        switch (i) {
            case 0:
                wg8 wg8Var = (wg8) obj;
                if (wg8Var instanceof rg) {
                    rgVar = (rg) wg8Var;
                } else {
                    rgVar = null;
                }
                if (rgVar != null) {
                    qp qpVar = rgVar.l0;
                    if (qpVar == null) {
                        qpVar = new qp(rgVar.getContext());
                        rgVar.addView(qpVar, -1);
                        rgVar.requestLayout();
                        rgVar.l0 = qpVar;
                    }
                    qpVar.getHolderToLayoutNode().put(wcdVar, od6Var);
                    qpVar.addView(wcdVar);
                    qpVar.getLayoutNodeToHolder().put(od6Var, wcdVar);
                    wcdVar.setImportantForAccessibility(1);
                    rcd.c(wcdVar, new fg(rgVar, od6Var, rgVar, qpVar));
                }
                if (wcdVar.getView().getParent() != wcdVar) {
                    wcdVar.addView(wcdVar.getView());
                }
                return pvcVar;
            case 1:
                lw8 lw8Var = (lw8) obj;
                yf2.p(wcdVar, od6Var);
                return pvcVar;
            default:
                yf2.p(wcdVar, od6Var);
                ((rg) wcdVar.c).b0 = true;
                int[] iArr = wcdVar.J;
                int i2 = iArr[0];
                int i3 = iArr[1];
                wcdVar.getView().getLocationOnScreen(iArr);
                long j = wcdVar.K;
                long a = ((sc6) obj).a();
                wcdVar.K = a;
                tjd tjdVar = wcdVar.L;
                if (tjdVar != null && ((i2 != iArr[0] || i3 != iArr[1] || !zy5.b(j, a)) && (b = wcdVar.n(tjdVar).b()) != null)) {
                    wcdVar.getView().dispatchApplyWindowInsets(b);
                }
                return pvcVar;
        }
    }
}
