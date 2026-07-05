package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c1c  reason: default package */
/* loaded from: classes3.dex */
public final class c1c implements PointerInputEventHandler {
    public final /* synthetic */ int C;
    public final /* synthetic */ aw7 D;
    public final /* synthetic */ c5d a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ m82 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ aw7 e;
    public final /* synthetic */ aw7 f;

    public c1c(c5d c5dVar, aw7 aw7Var, m82 m82Var, int i, aw7 aw7Var2, aw7 aw7Var3, int i2, aw7 aw7Var4) {
        this.a = c5dVar;
        this.b = aw7Var;
        this.c = m82Var;
        this.d = i;
        this.e = aw7Var2;
        this.f = aw7Var3;
        this.C = i2;
        this.D = aw7Var4;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d19 d19Var, m42 m42Var) {
        c5d c5dVar = this.a;
        aw7 aw7Var = this.b;
        cn9 cn9Var = new cn9(28, c5dVar, aw7Var);
        m82 m82Var = this.c;
        int i = this.d;
        aw7 aw7Var2 = this.e;
        aw7 aw7Var3 = this.f;
        return mi3.h(d19Var, cn9Var, new b1c(aw7Var, m82Var, i, aw7Var2, aw7Var3), new b1c(m82Var, i, aw7Var2, aw7Var3, aw7Var), new xj7(i, this.C, c5dVar, aw7Var2, aw7Var3, this.D), m42Var);
    }
}
