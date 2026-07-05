package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yu0  reason: default package */
/* loaded from: classes.dex */
public final class yu0 extends n42 {
    public int C;
    public rk9 a;
    public Object[] b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ zu0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu0(zu0 zu0Var, n42 n42Var) {
        super(n42Var);
        this.f = zu0Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
