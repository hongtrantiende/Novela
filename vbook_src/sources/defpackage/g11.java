package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g11  reason: default package */
/* loaded from: classes3.dex */
public final class g11 extends n42 {
    public i11 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ i11 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g11(i11 i11Var, n42 n42Var) {
        super(n42Var);
        this.d = i11Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
