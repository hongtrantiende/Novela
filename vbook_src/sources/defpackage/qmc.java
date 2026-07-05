package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qmc  reason: default package */
/* loaded from: classes3.dex */
public final class qmc extends n42 {
    public Map a;
    public rmc b;
    public Map c;
    public /* synthetic */ Object d;
    public final /* synthetic */ rmc e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmc(rmc rmcVar, n42 n42Var) {
        super(n42Var);
        this.e = rmcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.C(null, this);
    }
}
