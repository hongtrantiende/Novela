package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s39  reason: default package */
/* loaded from: classes.dex */
public final class s39 implements PointerInputEventHandler {
    public final /* synthetic */ ws2 C;
    public final /* synthetic */ mu4 D;
    public final /* synthetic */ vt4 E;
    public final /* synthetic */ vt4 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public s39(vt4 vt4Var, boolean z, float f, boolean z2, float f2, float f3, ws2 ws2Var, mu4 mu4Var, vt4 vt4Var2) {
        this.a = vt4Var;
        this.b = z;
        this.c = f;
        this.d = z2;
        this.e = f2;
        this.f = f3;
        this.C = ws2Var;
        this.D = mu4Var;
        this.E = vt4Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d19 d19Var, m42 m42Var) {
        return yae.h(d19Var, new r39(this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, null), m42Var);
    }
}
