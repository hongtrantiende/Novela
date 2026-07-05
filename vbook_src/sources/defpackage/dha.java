package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dha  reason: default package */
/* loaded from: classes.dex */
public final class dha extends n42 {
    public String a;
    public bha b;
    public /* synthetic */ Object c;
    public final /* synthetic */ eha d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dha(eha ehaVar, m42 m42Var) {
        super(m42Var);
        this.d = ehaVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return eha.a(this.d, null, null, this);
    }
}
