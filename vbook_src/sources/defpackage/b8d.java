package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b8d  reason: default package */
/* loaded from: classes3.dex */
public final class b8d extends n42 {
    public aw7 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ db1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8d(db1 db1Var, m42 m42Var) {
        super(m42Var);
        this.c = db1Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
