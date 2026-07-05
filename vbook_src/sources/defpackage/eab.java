package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eab  reason: default package */
/* loaded from: classes.dex */
public final class eab extends n42 {
    public iya a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gab c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eab(gab gabVar, hh0 hh0Var) {
        super(hh0Var);
        this.c = gabVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.t(0L, null, this);
    }
}
