package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bv  reason: default package */
/* loaded from: classes3.dex */
public final class bv extends n42 {
    public /* synthetic */ Object C;
    public final /* synthetic */ ev D;
    public int E;
    public w8a a;
    public gh5 b;
    public te5 c;
    public String d;
    public byte[] e;
    public qw7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv(ev evVar, n42 n42Var) {
        super(n42Var);
        this.D = evVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return ev.a(this.D, null, null, null, this);
    }
}
