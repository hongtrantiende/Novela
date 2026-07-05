package defpackage;

import android.app.Dialog;
import android.view.View;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u53  reason: default package */
/* loaded from: classes.dex */
public final class u53 extends obe {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ rr4 d;

    public u53(v53 v53Var, u53 u53Var) {
        this.d = v53Var;
    }

    @Override // defpackage.obe
    public final View x(int i) {
        int i2 = this.c;
        rr4 rr4Var = this.d;
        switch (i2) {
            case 0:
                Dialog dialog = ((v53) rr4Var).z0;
                if (dialog != null) {
                    return dialog.findViewById(i);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + rr4Var + " does not have a view");
        }
    }

    @Override // defpackage.obe
    public final boolean z() {
        switch (this.c) {
            case 0:
                return ((v53) this.d).D0;
            default:
                return false;
        }
    }

    public u53(rr4 rr4Var) {
        this.d = rr4Var;
    }
}
