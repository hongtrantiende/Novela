package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ota  reason: default package */
/* loaded from: classes3.dex */
public final class ota extends n42 {
    public final /* synthetic */ pta C;
    public int D;
    public String a;
    public String b;
    public Object c;
    public List d;
    public List e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ota(pta ptaVar, n42 n42Var) {
        super(n42Var);
        this.C = ptaVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.l(null, this);
    }
}
