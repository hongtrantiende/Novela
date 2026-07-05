package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s00  reason: default package */
/* loaded from: classes3.dex */
public final class s00 extends n42 {
    public t00 a;
    public qw7 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ t00 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s00(t00 t00Var, n42 n42Var) {
        super(n42Var);
        this.e = t00Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.j(0, this);
    }
}
