package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xl4  reason: default package */
/* loaded from: classes3.dex */
public final class xl4 extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public tj4 c;
    public final /* synthetic */ nr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl4(nr nrVar, m42 m42Var) {
        super(m42Var);
        this.d = nrVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
