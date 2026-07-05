package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ch2  reason: default package */
/* loaded from: classes.dex */
public final class ch2 extends n42 {
    public final /* synthetic */ gh2 C;
    public int D;
    public boolean a;
    public Object b;
    public zl9 c;
    public Serializable d;
    public int e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch2(gh2 gh2Var, n42 n42Var) {
        super(n42Var);
        this.C = gh2Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.D |= Integer.MIN_VALUE;
        return gh2.g(this.C, false, this);
    }
}
