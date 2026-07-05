package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m  reason: default package */
/* loaded from: classes3.dex */
public final class m extends n42 {
    public String a;
    public qw7 b;
    public gw8 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ v e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(v vVar, n42 n42Var) {
        super(n42Var);
        this.e = vVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return v.A(this.e, null, this);
    }
}
