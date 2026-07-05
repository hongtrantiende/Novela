package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b53  reason: default package */
/* loaded from: classes3.dex */
public final class b53 extends n42 {
    public i53 a;
    public vl6 b;
    public i53 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ c53 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b53(c53 c53Var, m42 m42Var) {
        super(m42Var);
        this.e = c53Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
