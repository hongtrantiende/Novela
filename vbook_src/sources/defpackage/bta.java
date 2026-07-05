package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bta  reason: default package */
/* loaded from: classes3.dex */
public final class bta extends n42 {
    public final /* synthetic */ cta C;
    public int D;
    public List a;
    public List b;
    public List c;
    public Map d;
    public HashMap e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bta(cta ctaVar, n42 n42Var) {
        super(n42Var);
        this.C = ctaVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.D |= Integer.MIN_VALUE;
        return cta.D(this.C, this);
    }
}
