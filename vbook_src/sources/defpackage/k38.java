package defpackage;

import java.io.Serializable;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k38  reason: default package */
/* loaded from: classes.dex */
public final class k38 extends m38 {
    public final /* synthetic */ int a = 1;
    public final Serializable b;

    public k38(String str) {
        String lowerCase = d4b.k(str).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.b = lowerCase;
    }

    @Override // defpackage.ex3
    public final int a() {
        switch (this.a) {
            case 0:
                return 6;
            default:
                return 8;
        }
    }

    @Override // defpackage.m38
    public final boolean g(y28 y28Var) {
        String str;
        int i = this.a;
        Serializable serializable = this.b;
        y28Var.getClass();
        switch (i) {
            case 0:
                String v = y28Var.v();
                if (v != null) {
                    str = v.toLowerCase(Locale.ROOT);
                    str.getClass();
                } else {
                    str = "";
                }
                return k4b.V(str, (String) serializable, false);
            default:
                if (gm9.b((gm9) serializable, y28Var.v()) == null) {
                    return false;
                }
                return true;
        }
    }

    public final String toString() {
        int i = this.a;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                return hl5.n(":contains(", (String) serializable, ")");
            default:
                return hl5.n(":matches(", ((gm9) serializable).d(), ")");
        }
    }

    public k38(gm9 gm9Var) {
        this.b = gm9Var;
    }
}
