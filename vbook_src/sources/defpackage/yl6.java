package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yl6  reason: default package */
/* loaded from: classes3.dex */
public final class yl6 extends n42 {
    public long a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bn6 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl6(bn6 bn6Var, n42 n42Var) {
        super(n42Var);
        this.d = bn6Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g(0L, this);
    }
}
