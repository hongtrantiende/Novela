package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nt  reason: default package */
/* loaded from: classes3.dex */
public final class nt extends n42 {
    public long a;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ fz4 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt(fz4 fz4Var, n42 n42Var) {
        super(n42Var);
        this.e = fz4Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.y(0L, 0, 0, this);
    }
}
