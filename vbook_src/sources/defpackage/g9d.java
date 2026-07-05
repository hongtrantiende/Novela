package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g9d  reason: default package */
/* loaded from: classes.dex */
public final class g9d extends n42 {
    public oad a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bm1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9d(bm1 bm1Var, n42 n42Var) {
        super(n42Var);
        this.d = bm1Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.p(null, null, this);
    }
}
