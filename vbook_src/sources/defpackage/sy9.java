package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sy9  reason: default package */
/* loaded from: classes3.dex */
public final class sy9 {
    public final ty9 a;
    public final ak9 b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final u28 c = new u28(5);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public sy9(ty9 ty9Var, ak9 ak9Var) {
        this.a = ty9Var;
        this.b = ak9Var;
    }

    public final void a() {
        ty9 ty9Var = this.a;
        if (ty9Var.k().h == kn6.b) {
            if (!this.e) {
                this.b.invoke();
                ty9Var.k().a(new an9(this, 1));
                this.e = true;
                return;
            }
            vs.k("SavedStateRegistry was already attached.");
            return;
        }
        vs.k("Restarter must be created only during owner's initialization stage");
    }
}
