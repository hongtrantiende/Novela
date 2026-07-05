package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vy0  reason: default package */
/* loaded from: classes3.dex */
public final class vy0 extends n42 {
    public /* synthetic */ Object a;
    public final /* synthetic */ xy0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy0(xy0 xy0Var, n42 n42Var) {
        super(n42Var);
        this.b = xy0Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object M = xy0.M(this.b, this);
        if (M == n82.a) {
            return M;
        }
        return new jb1(M);
    }
}
