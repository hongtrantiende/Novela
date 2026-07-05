package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cjb  reason: default package */
/* loaded from: classes3.dex */
public final class cjb extends n42 {
    public int C;
    public String a;
    public String b;
    public String c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ djb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjb(djb djbVar, n42 n42Var) {
        super(n42Var);
        this.f = djbVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return djb.b(this.f, null, null, false, this);
    }
}
