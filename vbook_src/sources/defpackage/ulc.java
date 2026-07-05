package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ulc  reason: default package */
/* loaded from: classes3.dex */
public final class ulc extends n42 {
    public /* synthetic */ Object C;
    public final /* synthetic */ vlc D;
    public int E;
    public boolean a;
    public boolean b;
    public zlc c;
    public bw7 d;
    public Object e;
    public rlc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ulc(vlc vlcVar, m42 m42Var) {
        super(m42Var);
        this.D = vlcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.a(false, this);
    }
}
