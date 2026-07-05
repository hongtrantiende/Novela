package defpackage;

import android.os.Bundle;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: by9  reason: default package */
/* loaded from: classes.dex */
public final class by9 implements xx9, ty9 {
    public final /* synthetic */ zx9 a;
    public xn6 b;
    public eb5 c;

    public by9(zx9 zx9Var) {
        Bundle bundle;
        this.a = zx9Var;
        Object e = zx9Var.e("androidx.savedstate.SavedStateRegistry");
        if (e instanceof Bundle) {
            bundle = (Bundle) e;
        } else {
            bundle = null;
        }
        if (bundle != null && this.c == null) {
            eb5 eb5Var = new eb5(new sy9(this, new ak9(this, 9)));
            this.c = eb5Var;
            eb5Var.s(bundle);
        }
        zx9Var.a("androidx.savedstate.SavedStateRegistry", new ak9(this, 7));
    }

    @Override // defpackage.xx9
    public final wx9 a(String str, vt4 vt4Var) {
        return this.a.a(str, vt4Var);
    }

    @Override // defpackage.xx9
    public final boolean c(Object obj) {
        return this.a.c(obj);
    }

    @Override // defpackage.xx9
    public final Map d() {
        return this.a.d();
    }

    @Override // defpackage.xx9
    public final Object e(String str) {
        return this.a.e(str);
    }

    @Override // defpackage.ty9
    public final s26 j() {
        eb5 eb5Var = this.c;
        if (eb5Var == null) {
            eb5 eb5Var2 = new eb5(new sy9(this, new ak9(this, 9)));
            this.c = eb5Var2;
            eb5Var2.s(null);
            eb5Var = eb5Var2;
        }
        return (s26) eb5Var.c;
    }

    @Override // defpackage.un6
    public final xn6 k() {
        xn6 xn6Var = this.b;
        if (xn6Var == null) {
            xn6 xn6Var2 = new xn6(this, false);
            this.b = xn6Var2;
            return xn6Var2;
        }
        return xn6Var;
    }
}
