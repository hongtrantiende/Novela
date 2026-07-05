package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n18  reason: default package */
/* loaded from: classes.dex */
public final class n18 extends n42 {
    public my0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ p18 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n18(p18 p18Var, n42 n42Var) {
        super(n42Var);
        this.c = p18Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return p18.c(this.c, null, this);
    }
}
