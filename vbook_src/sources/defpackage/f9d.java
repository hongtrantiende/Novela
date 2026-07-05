package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f9d  reason: default package */
/* loaded from: classes3.dex */
public final class f9d implements PointerInputEventHandler {
    public final /* synthetic */ xt4 C;
    public final /* synthetic */ aw7 D;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ dx4 b;
    public final /* synthetic */ vt4 c;
    public final /* synthetic */ vt4 d;
    public final /* synthetic */ aw7 e;
    public final /* synthetic */ xt4 f;

    public f9d(boolean z, dx4 dx4Var, vt4 vt4Var, vt4 vt4Var2, aw7 aw7Var, xt4 xt4Var, xt4 xt4Var2, aw7 aw7Var2) {
        this.a = z;
        this.b = dx4Var;
        this.c = vt4Var;
        this.d = vt4Var2;
        this.e = aw7Var;
        this.f = xt4Var;
        this.C = xt4Var2;
        this.D = aw7Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d19 d19Var, m42 m42Var) {
        if (!this.a) {
            return pvc.a;
        }
        return yae.h(d19Var, new e9d(this.b, this.c, this.d, this.e, this.f, this.C, this.D, (m42) null), m42Var);
    }
}
