package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f11  reason: default package */
/* loaded from: classes3.dex */
public final class f11 extends n42 {
    public int a;
    public int b;
    public i11 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ i11 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f11(i11 i11Var, n42 n42Var) {
        super(n42Var);
        this.e = i11Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.e(0, this);
    }
}
