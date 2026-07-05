package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tk4  reason: default package */
/* loaded from: classes3.dex */
public final class tk4 extends n42 {
    public /* synthetic */ Object a;
    public final /* synthetic */ uk4 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk4(uk4 uk4Var, m42 m42Var) {
        super(m42Var);
        this.b = uk4Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
