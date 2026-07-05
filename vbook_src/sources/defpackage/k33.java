package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k33  reason: default package */
/* loaded from: classes3.dex */
public final class k33 extends n42 {
    public un2 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ n33 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k33(n33 n33Var, n42 n42Var) {
        super(n42Var);
        this.c = n33Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, null, this);
    }
}
