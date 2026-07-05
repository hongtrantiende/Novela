package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cab  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class cab implements PointerInputEventHandler, uu4 {
    public final /* synthetic */ lu4 a;

    public cab(lu4 lu4Var) {
        this.a = lu4Var;
    }

    @Override // defpackage.uu4
    public final hu4 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof uu4)) {
            return false;
        }
        return c16.i(a(), ((uu4) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(d19 d19Var, m42 m42Var) {
        return this.a.invoke(d19Var, m42Var);
    }
}
