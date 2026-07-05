package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qv0  reason: default package */
/* loaded from: classes3.dex */
public final class qv0 extends n42 {
    public Iterator a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tv0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv0(tv0 tv0Var, n42 n42Var) {
        super(n42Var);
        this.c = tv0Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
