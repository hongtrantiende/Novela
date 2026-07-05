package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j3c  reason: default package */
/* loaded from: classes3.dex */
public final class j3c implements PointerInputEventHandler {
    public final /* synthetic */ int C;
    public final /* synthetic */ mu4 D;
    public final /* synthetic */ cyb a;
    public final /* synthetic */ kj6 b;
    public final /* synthetic */ kob c;
    public final /* synthetic */ aw7 d;
    public final /* synthetic */ aw7 e;
    public final /* synthetic */ aw7 f;

    public j3c(cyb cybVar, kj6 kj6Var, kob kobVar, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, int i, mu4 mu4Var) {
        this.a = cybVar;
        this.b = kj6Var;
        this.c = kobVar;
        this.d = aw7Var;
        this.e = aw7Var2;
        this.f = aw7Var3;
        this.C = i;
        this.D = mu4Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d19 d19Var, m42 m42Var) {
        p7a d = this.a.d();
        aw7 aw7Var = this.f;
        aw7 aw7Var2 = this.e;
        aw7 aw7Var3 = this.d;
        p7a p7aVar = p7a.a;
        cyb cybVar = this.a;
        kj6 kj6Var = this.b;
        if (d != p7aVar) {
            return ukb.e(d19Var, null, null, null, new hm0(cybVar, kj6Var, this.c, aw7Var3, aw7Var2, aw7Var, 10), m42Var, 7);
        }
        Object p = k27.p(new koa(d19Var, new i3c(cybVar, kj6Var, this.c, d19Var, this.C, this.D, aw7Var3, aw7Var2, aw7Var), null, 27), m42Var);
        if (p == n82.a) {
            return p;
        }
        return pvc.a;
    }
}
