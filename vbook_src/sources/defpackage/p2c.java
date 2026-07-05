package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p2c  reason: default package */
/* loaded from: classes3.dex */
public final class p2c extends n42 {
    public int C;
    public boolean D;
    public /* synthetic */ Object E;
    public final /* synthetic */ l2c F;
    public int G;
    public String a;
    public vl6 b;
    public ls3 c;
    public Serializable d;
    public yk8[] e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2c(l2c l2cVar, m42 m42Var) {
        super(m42Var);
        this.F = l2cVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(null, this);
    }
}
