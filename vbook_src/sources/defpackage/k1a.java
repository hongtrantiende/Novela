package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k1a  reason: default package */
/* loaded from: classes3.dex */
public final class k1a extends n42 {
    public b27 C;
    public zm9 D;
    public /* synthetic */ Object E;
    public final /* synthetic */ zm9 F;
    public int G;
    public String a;
    public StringBuilder b;
    public xl9 c;
    public xl9 d;
    public zm9 e;
    public Iterator f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1a(zm9 zm9Var, n42 n42Var) {
        super(n42Var);
        this.F = zm9Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.h(null, this);
    }
}
