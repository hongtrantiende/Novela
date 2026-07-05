package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fab  reason: default package */
/* loaded from: classes.dex */
public final class fab extends n42 {
    public /* synthetic */ Object a;
    public final /* synthetic */ gab b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fab(gab gabVar, m42 m42Var) {
        super(m42Var);
        this.b = gabVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.z(0L, null, this);
    }
}
