package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m18  reason: default package */
/* loaded from: classes.dex */
public final class m18 extends n42 {
    public zl9 a;
    public zl9 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ p18 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m18(p18 p18Var, m42 m42Var) {
        super(m42Var);
        this.d = p18Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return p18.b(this.d, this);
    }
}
