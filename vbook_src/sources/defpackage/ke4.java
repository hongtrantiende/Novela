package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ke4  reason: default package */
/* loaded from: classes.dex */
public final class ke4 extends n42 {
    public Object a;
    public Object b;
    public xe4 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ le4 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke4(le4 le4Var, n42 n42Var) {
        super(n42Var);
        this.e = le4Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(null, this);
    }
}
