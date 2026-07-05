package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xe9  reason: default package */
/* loaded from: classes3.dex */
public final class xe9 extends n42 {
    public String a;
    public sw7 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ze9 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe9(ze9 ze9Var, n42 n42Var) {
        super(n42Var);
        this.e = ze9Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.u(0, this, null);
    }
}
