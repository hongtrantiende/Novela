package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g5c  reason: default package */
/* loaded from: classes3.dex */
public final class g5c extends n42 {
    public final /* synthetic */ y5c C;
    public int D;
    public ps a;
    public List b;
    public int c;
    public int d;
    public int e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5c(y5c y5cVar, n42 n42Var) {
        super(n42Var);
        this.C = y5cVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.D |= Integer.MIN_VALUE;
        return y5c.K(this.C, null, null, this);
    }
}
