package defpackage;

import java.util.Collection;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t4c  reason: default package */
/* loaded from: classes3.dex */
public final class t4c extends n42 {
    public String a;
    public Collection b;
    public /* synthetic */ Object c;
    public final /* synthetic */ y5c d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4c(y5c y5cVar, n42 n42Var) {
        super(n42Var);
        this.d = y5cVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f0(null, this);
    }
}
