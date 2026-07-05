package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ri3  reason: default package */
/* loaded from: classes.dex */
public final class ri3 extends n42 {
    public th3 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ti3 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri3(ti3 ti3Var, n42 n42Var) {
        super(n42Var);
        this.c = ti3Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return ti3.M1(this.c, null, this);
    }
}
