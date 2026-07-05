package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h5c  reason: default package */
/* loaded from: classes3.dex */
public final class h5c extends n42 {
    public int C;
    public int a;
    public cp3 b;
    public Iterator c;
    public cp3 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ y5c f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5c(y5c y5cVar, n42 n42Var) {
        super(n42Var);
        this.f = y5cVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return this.f.K0(0, this, null);
    }
}
