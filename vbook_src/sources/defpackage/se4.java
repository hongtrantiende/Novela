package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: se4  reason: default package */
/* loaded from: classes3.dex */
public final class se4 extends n42 {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ue4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se4(ue4 ue4Var, n42 n42Var) {
        super(n42Var);
        this.c = ue4Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return ue4.q(this.c, null, this);
    }
}
