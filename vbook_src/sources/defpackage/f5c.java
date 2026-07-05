package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f5c  reason: default package */
/* loaded from: classes3.dex */
public final class f5c extends n42 {
    public int a;
    public y5c b;
    public /* synthetic */ Object c;
    public final /* synthetic */ y5c d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5c(y5c y5cVar, n42 n42Var) {
        super(n42Var);
        this.d = y5cVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.J0(0, this);
    }
}
