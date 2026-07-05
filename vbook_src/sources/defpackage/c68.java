package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c68  reason: default package */
/* loaded from: classes3.dex */
public final class c68 extends n42 {
    public String C;
    public p40 D;
    public /* synthetic */ Object E;
    public final /* synthetic */ h68 F;
    public int G;
    public String a;
    public Iterator b;
    public cp3 c;
    public String d;
    public h68 e;
    public String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c68(h68 h68Var, n42 n42Var) {
        super(n42Var);
        this.F = h68Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.o(null, null, this);
    }
}
