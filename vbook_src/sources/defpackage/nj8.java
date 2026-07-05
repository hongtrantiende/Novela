package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nj8  reason: default package */
/* loaded from: classes.dex */
public final class nj8 extends n42 {
    public int a;
    public gxa b;
    public /* synthetic */ Object c;
    public final /* synthetic */ rj8 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj8(rj8 rj8Var, m42 m42Var) {
        super(m42Var);
        this.d = rj8Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(0, null, this);
    }
}
