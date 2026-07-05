package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f93  reason: default package */
/* loaded from: classes3.dex */
public final class f93 extends n42 {
    public f34 a;
    public cza b;
    public /* synthetic */ Object c;
    public final /* synthetic */ c93 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f93(c93 c93Var, m42 m42Var) {
        super(m42Var);
        this.d = c93Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
