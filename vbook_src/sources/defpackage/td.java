package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: td  reason: default package */
/* loaded from: classes3.dex */
public final class td extends n42 {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ vd c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td(vd vdVar, m42 m42Var) {
        super(m42Var);
        this.c = vdVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
