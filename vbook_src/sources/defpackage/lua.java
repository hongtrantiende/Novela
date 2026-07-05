package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lua  reason: default package */
/* loaded from: classes3.dex */
public final class lua extends n42 {
    public f34 a;
    public cza b;
    public /* synthetic */ Object c;
    public final /* synthetic */ r58 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lua(r58 r58Var, m42 m42Var) {
        super(m42Var);
        this.d = r58Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
