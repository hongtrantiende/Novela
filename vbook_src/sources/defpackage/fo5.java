package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fo5  reason: default package */
/* loaded from: classes3.dex */
public final class fo5 extends n42 {
    public vp5 a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ho5 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo5(ho5 ho5Var, n42 n42Var) {
        super(n42Var);
        this.d = ho5Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, null, this);
    }
}
