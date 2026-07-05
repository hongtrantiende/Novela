package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jo0  reason: default package */
/* loaded from: classes3.dex */
public final class jo0 implements rb4 {
    public final /* synthetic */ int a;
    public final re5 b;

    public /* synthetic */ jo0(int i, re5 re5Var) {
        this.a = i;
        this.b = re5Var;
    }

    @Override // defpackage.rb4
    public final sb4 a(Object obj, xe8 xe8Var, io5 io5Var) {
        int i = this.a;
        re5 re5Var = this.b;
        switch (i) {
            case 0:
                ho0 ho0Var = (ho0) obj;
                ho0Var.getClass();
                xe8Var.getClass();
                io5Var.getClass();
                return new lo0(ho0Var, re5Var, xe8Var, new mfb(new io0(io5Var, 0)));
            default:
                rq0 rq0Var = (rq0) obj;
                rq0Var.getClass();
                xe8Var.getClass();
                io5Var.getClass();
                return new lo0(rq0Var, re5Var, xe8Var, new mfb(new io0(io5Var, 1)));
        }
    }
}
