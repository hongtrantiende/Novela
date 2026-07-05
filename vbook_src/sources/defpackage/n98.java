package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n98  reason: default package */
/* loaded from: classes.dex */
public final class n98 extends n42 {
    public x56 a;
    public x56 b;
    public lj9 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ o98 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n98(o98 o98Var, n42 n42Var) {
        super(n42Var);
        this.e = o98Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(this, null);
    }
}
