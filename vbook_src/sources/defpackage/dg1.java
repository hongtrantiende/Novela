package defpackage;

import java.util.List;
/* renamed from: dg1  reason: default package */
/* loaded from: classes3.dex */
public final class dg1 extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ bb c;
    public wzc d;
    public List e;
    public j62 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg1(bb bbVar, m42 m42Var) {
        super(m42Var);
        this.c = bbVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.d(null, this);
    }
}
